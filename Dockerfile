FROM eclipse-temurin:21-jdk-alpine

ARG APP_JAR=build/libs/baseproject.jar

COPY ${APP_JAR} app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]

EXPOSE 8080