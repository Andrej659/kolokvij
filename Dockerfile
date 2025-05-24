FROM eclipse-temurin:17-jdk-focal
 
RUN mkdir /app

WORKDIR /app

COPY target/*.jar app.jar

ENTRYPOINT ["java","-jar","app.jar"]
