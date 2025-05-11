FROM openjdk:11
MAINTAINER swapnil.narvekar
COPY target/employee-registration-1.0-SNAPSHOT.jar spring-boot-employee-registration.jar
ENTRYPOINT ["java","-jar","spring-boot-employee-registration.jar"]