FROM openjdk:8-jdk-alpine
MAINTAINER swapnil.narvekar
COPY target/employee-registration-1.0-SNAPSHOT.jar spring-boot-employee-registration.jar
ENTRYPOINT ["java","-jar","spring-boot-cancellation.jar"]