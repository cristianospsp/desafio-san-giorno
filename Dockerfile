# Etapa 1: Construção
FROM maven:latest AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

# Etapa 2: Execução
FROM openjdk:17-jdk-slim
WORKDIR /app
COPY --from=build /app/target/seu-arquivo.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
