FROM openjdk:11
WORKDIR /myapp 
COPY target/JenkinsDocker.jar /myapp
ENTRYPOINT [ "java","-jar","JenkinsDocker.jar" ]
EXPOSE 8000