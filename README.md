# cf-application-logs-tryout

Repository for Cloud Foundry Application logs tryout

A sample java application is build to push the application logs to cloud foundry and inturn sends the logs to ELK with the help of
[SAP CF java logging support](https://github.com/SAP/cf-java-logging-support)

The SAP CF java logging support helps with the following more details can be found in the referred link

- It provides means to emit structured application log messages,
- Instruments parts of your application stack to collect request metrics
- Java clients for producing custom metrics.

This is a REST based application built using Spring Boot. For REST the `spring-web-starter` is used and this by default the uses [`logback`](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#boot-features-logging) for logging. In order get more control over the view of logs logback has been extended using the [`logback-spring.xml`](demo/src/main/resources/logback-spring.xml)

For instrumenting the logs to ELK above mentioned SAP CF Java logging is used with tailored provisioning for logback.

Another component from SAP CF Java logging is included for request-filter to exhibit the `correlation-Id` for every HTTP Requests.

For publishing the logs to ELK, [`STDOUT-JSON`](demo/src/main/resources/logback-spring.xml) with JSON encoder is used. But for local testing purpose the standard `STDOUT` can be switched from the spring [`application.properties`](demo/src/main/resources/application.properties) file.

For logging and filtering, we use `Logger` & `Markers` from `SLF4J`.
