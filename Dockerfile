FROM openjdk:11
#VOLUME /tmp
EXPOSE 8088
COPY "./target/activoempresarial-0.0.1-SNAPSHOT.jar" "activoempresarial.jar"
ENTRYPOINT ["java","-jar","activoempresarial.jar"]