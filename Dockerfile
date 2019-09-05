FROM openjdk:8
EXPOSE 8080
ADD build/libs/person.jar person.jar
ENTRYPOINT ["java","-jar","/person.jar"]
