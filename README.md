integral-springbootcamel-template
=================================

Template to be used when creating new Spring Boot + Camel Projects.
Depends on integral-springbootcamel-parent

## Configuration

The application is based on [spring-boot](https://projects.spring.io/spring-boot/).
The default properties file `application.properties` is loaded at startup. 
Use the properties file `application-dev.properties` for local development, as it is included in.gitignore.
Se the file `application.properties.in` for a template which can be used in your `application-dev.properties`

### Logging

Logging is used using the standard spring-boot logging mechanism. Bunyan logging is not enabled by default,
set the spring profile `bunyan` to enable it.

## Development

The application is a spring-boot application and can be run from maven as `mvn spring-boot:run`

Set the version in all components with `mvn versions:set` from project root.

### Building

Create a Jenkins job using the included `Jenkinsfile`.
