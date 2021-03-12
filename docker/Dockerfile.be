FROM markhobson/maven-chrome:jdk-13

COPY target /usr/local/target

WORKDIR /usr/local/

EXPOSE 8080

ENTRYPOINT ["/bin/bash", "-c", "sleep 30 && java -jar target/gse-application-1.1.2.jar"]
