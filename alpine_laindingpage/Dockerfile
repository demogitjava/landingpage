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

ADD /root/git/landingpage/target/landingpage-0.0.1-SNAPSHOT.jar /root/landingpage.war 

ENTRYPOINT ["java" "-jar" "/root/landingpage.war"]