FROM gradle:8-jdk21 AS build
WORKDIR /app
COPY . .
RUN gradle build -x test

FROM eclipse-temurin:21-jdk-alpine
WORKDIR /app
COPY --from=build /app/build/libs/baseproject.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]