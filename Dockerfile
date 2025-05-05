FROM alpine:17-jdk-slim

WORKDIR /app
COPY user-service.jar app.jar

CMD ["java", "-jar", "app.jar"]