
Demo Landingpage with Spring Boot + Theamleaf + Grapesjs

<br/>
<br/>
<br/>

The used database is H2 from here
http://www.h2database.com/html/download.html
<br/>

the application port is
https://localhost/webbuilder
you can edit the port in the application.properties 
server.port=80



<br/>
<br/>

used ide
https://netbeans.apache.org/
<br/>


To compile this application install maven.
maven https://downloads.apache.org/maven/maven-3/3.8.2/binaries/apache-maven-3.8.2-bin.zip

make sure that java is correctly installed and the "JAVA_HOME" path is set.
<br/>

You can get the java jdk from here:
used jdk: **GraalVM Community ** https://www.graalvm.org/downloads/

<br/>


For Docker

To build the image type:

docker build -f Dockerfile -t landingpage .

and you create a docker image with CentOS runs in a container over port 8442.

Run the application and open ports by create a new container

80

9092
8082
5005 (optional for debug)

docker for windows are available on https://www.docker.com/products/docker-desktop

for config on an docker image make a backup with

docker save -o landingpage.tar jgsoftwares/jgsoftwares

to load your image to docker desktop type: docker load --input landingpage.tar

<br/>


