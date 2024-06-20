FROM jgsoftwares/alpinelinux_landingpage:edge

ENV LANG=de_DE.ISO-8859-1
ENV LANGUAGE=de_DE:de
ENV LC_ALL=de_DE.ISO-8859-1
ENV TZ=Europe/Berlin


# web port 
EXPOSE 80

# h2
EXPOSE 8082
EXPOSE 9092

# derbydb
EXPOSE 1527

# mysql
EXPOSE 3306

# debug port
EXPOSE 5005

ADD /root/git/landingpage/target/landingpage-0.0.1-SNAPSHOT.jar /root/landingpage.war 

# optional debug option 
# with port 5005
ENV JAVA_TOOL_OPTIONS -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=*:5005

ENTRYPOINT ["java" "-jar" "/root/landingpage.war"]