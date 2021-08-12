 #!/bin/bash -li
FROM openjdk:11-jre-slim-buster
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} target/app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
