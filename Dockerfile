#
FROM openjdk:11-jre-slim-buster
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} app.jar/
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar", "app.jar"]
