FROM java:8
VOLUME /tmp
ADD assg35-0.0.1-SNAPSHOT.jar assg35dockerApp.jar
RUN bash -c 'touch /assg35dockerApp.jar'
ENTRYPOINT ["java","-jar","/assg35dockerApp.jar"]