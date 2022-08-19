FROM openjdk:11
ARG JAR_FILE=target/*.jar
EXPOSE 9002
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]

