FROM openjdk:11-jre-slim-buster
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} /home/app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
