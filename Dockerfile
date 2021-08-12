FROM openjdk:11-jre-slim-buster
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} target/app.jar
ENTRYPOINT ["java","-jar", "/target/app.jar"]
