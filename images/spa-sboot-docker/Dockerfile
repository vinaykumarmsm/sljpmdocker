FROM openjdk:8-jre-alpine

MAINTAINER Rajesh G 
VOLUME /tmp
VOLUME /logs

ARG JAR_FILE
ADD ${JAR_FILE} app.jar

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar", "/app.jar"]
