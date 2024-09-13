FROM jgsoftwares/oraclelinux_openjdk:11



#ENV TZ=Europe/Berlin


#ENV LANG de_DE.ISO-8859-1

# web port 
#EXPOSE 80

# h2
#EXPOSE 8082
#EXPOSE 9092

# derbydb
#EXPOSE 1527

# mysql
#EXPOSE 3306



# optional debug option 
# with port 5005
#ENV JAVA_TOOL_OPTIONS -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=*:5005

ENTRYPOINT ["java" "-jar" "/root/landingpage.war"]