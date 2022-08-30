FROM openjdk:17 as target
EXPOSE 8080
#COPY /../../target/publisher.jar publisher.jar
#WORKDIR /Publisher
COPY target/publisher.jar publisher.jar
ENTRYPOINT ["java","-jar","/publisher.jar"]