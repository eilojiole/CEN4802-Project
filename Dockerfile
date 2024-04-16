FROM openjdk
EXPOSE 8080
ADD target/CEN4802-Project.jar CEN4802-Project.jar
ENTRYPOINT ["java","-jar","/CEN4802-Project.jar"]