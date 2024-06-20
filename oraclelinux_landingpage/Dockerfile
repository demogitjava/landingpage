FROM jgsoftwares/oraclelinuxgraalvm:11


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


ADD /root/landingpage/landingpage.war /root/landingpage.war 

# optional debug option 
# with port 5005
#ENV JAVA_TOOL_OPTIONS -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=*:5005

ENTRYPOINT ["java" "-jar" "/root/landingpage.war"]