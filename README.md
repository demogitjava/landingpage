# Demo Landingpage with Spring Boot + Theamleaf + Grapesjs

</br>
to edit the text in the demo application
copy the segment and 
paste it with the editor to save
the "text edit" for your
language.
</br>

in class contact_service.java
edit password and username for your smtp account -- hard coded in the moment

</br>

The used database is H2 from here
http://www.h2database.com/html/download.html
</br>

https://github.com/demogitjava/demodatabase
watch about the databases in your user directory that
/root/shopdb.mv.db are available.


</br>

the login for the database over jdbc is
</br>
admin
jj78mvpr52k1
</br>
</br>
</br>
the application url // port is
url: https:// "your domain " /

port: 80

</br>
to edit the landingpage type 
https://"your domain "/lpagewebbuilder




</br>
For jdbc client connect you can user
the integreadted jdbc viewer from netbeans or
SQuirreL SQL Client.

</br>

<br>
<br>

used ide
https://netbeans.apache.org/
<br>


To compile this application install maven.
maven https://downloads.apache.org/maven/maven-3/3.8.2/binaries/apache-maven-3.8.2-bin.zip

make sure that java is correctly installed and the "JAVA_HOME" path is set.
<br>

You can get the java jdk from here:
used jdk: **GraalVM Community ** https://www.graalvm.org/downloads/

<br>


# For Docker

To build the image type:

docker build -f Dockerfile -t landingpage .

Run the application and open ports by create a new container

80   web - servlet

9092 h2 jdbc
8082 h2 web
5005 (optional for debug)

docker for windows are available on https://www.docker.com/products/docker-desktop
for config on an docker image make a backup with

docker save -o landingpage.tar jgsoftwares/jgsoftwares

to load your image to docker desktop type: docker load --input landingpage.tar
<br/>

