FROM openjdk:17
EXPOSE 8080
COPY target/publisher.jar publisher.jar
#ENTRYPOINT ["java","-jar","/publisher.jar"]
ENTRYPOINT ["sh", "-c", "java ${JAVA_OPTS} -jar publisher.jar"]