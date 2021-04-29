FROM openjdk:8u212-jre-alpine3.9

ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} desafio1-pfa.jar

ENTRYPOINT ["java","-jar","/desafio1-pfa.jar"]