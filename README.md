# Secure App

This is an reference app for implementing secure APIs.

## Overview

Secure RESTful services will include authentication, authorization, and encryption components..

- Only authenticated entities can access the service
- Only authorized entities can invoke specific operations of the service.
- Sensitive data is neither stored nor transmitted in the clear.  All sensitive data is encrypted in data storage and while being transmitted.
- Swagger is used to document the API's

## Details

### Configuration
The configuration class `ServiceSecurityCoinfiguration` is setup to allow anonymous access to the following endpoints:

- `/`
- `/login`
- `/actuator`

The `/person` endpoint is secured and cannot be accessed by an unauthenticated user.

### Validation

This application uses some validation logic to protect against some of the following types of attacks:
- Server-Side Request Forgery (SSRF) attack

### API Documentation

The Swagger/Open API dependency has been updated to use:

```groovy
// https://mvnrepository.com/artifact/io.swagger.core.v3/swagger-jaxrs2-jakarta
implementation group: 'io.swagger.core.v3', name: 'swagger-jaxrs2-jakarta', version: '2.2.20'
```

This version of Swagger is compatable with the Jakarta libraries and does not use the older `javax` libraries.

## Testing

### Integration Testing

WireMock is used as part of the integration testing dependencies.

## References

1. [Spring Security oAuth](https://projects.spring.io/spring-security-oauth/docs/Home.html)
2. [Simple Single Sign-On with Spring Security OAuth2](https://www.baeldung.com/sso-spring-security-oauth2)
3. [Swagger](https://swagger.io/)
4. [Setting Up Swagger 2 with a Spring REST API](https://www.baeldung.com/swagger-2-documentation-for-spring-rest-api)
5. [Springfox Reference Documentation](http://springfox.github.io/springfox/docs/current/)
6. [Spring Security Reference](https://docs.spring.io/spring-security/site/docs/current/reference/html5/#test)
7. [Spring Boot Testing Signed JWT with a mock Authorization Server](https://chancharles.medium.com/spring-boot-testing-signed-jwt-with-a-mock-authorization-server-f2907ec07175)

### User Story Template

**As a** ...

**When** ...

**Then** ...