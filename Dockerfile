FROM openjdk

COPY build/libs/alsg-0.0.1-SNAPSHOT.jar alsg-docker.jar
#ENTRYPOINT SIRVE PARA EJECUTAR UN ARCHIVO
#CMD SIRVE PARA EJECUTAR UN COMANDO
ENTRYPOINT  ["java", "-jar", "/example.jar"]