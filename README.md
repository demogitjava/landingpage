# Demo Landingpage with Spring Boot + Theamleaf + Grapesjs
============================================================


to edit the text in the demo application
copy the segment and 
paste it with the editor to save
the "text edit" for your
language.


in class contact_service.java
edit password and username for your smtp account -- hard coded in the moment





https://github.com/demogitjava/demodatabase
watch about the databases in your user directory that
/root/shopdb.mv.db and usw. are available.



the login for the database over jdbc is
</br>
`admin
jj78mvpr52k1`

the application url // port is
url: https:// "your domain " /

port: 80

if h2 web-console is not available 
start a docker terminal with command to
enable connect
`java -jar h2-1.4.199.jar -webAllowOthers -tcpAllowOthers`
</br>
to edit the landingpage type 
https://"your domain "/lpagewebbuilder




For jdbc client connect you can user
the integreadted jdbc viewer from netbeans or
SQuirreL SQL Client.




To compile this application install maven.
maven https://downloads.apache.org/maven/maven-3/3.8.2/binaries/apache-maven-3.8.2-bin.zip

make sure that java is correctly installed and the "JAVA_HOME" path is set.
<br>

You can get the java jdk from here:
used jdk: **GraalVM Community ** https://www.graalvm.org/downloads/

<br>


# For Docker
============================================================
<br/>
To build the image type:

docker build -f Dockerfile -t landingpage .

<br/>
docker for windows are available on https://www.docker.com/products/docker-desktop


networkconfig
run options
============================================================

`--rm -d --network 192.200.100.254/24`
after the network is scuessfully created
type your run command to deploy your container 
to the network 



backup 
load / save
============================================================

docker save -o landingpage.tar jgsoftwares/jgsoftwares

to load your image to docker desktop type:


docker load --input landingpage.tar


The images are available
dropbox:
https://www.dropbox.com/s/ku2r5hz8koj9y7d/landingpage.tar?dl=0
<br/>
ports
your ip :80:80
your ip :5005:5005

mount directory into docker container:

/root/.m2:/root/.m2  
/root/IdeaProjects/landingpage:/root/IdeaProjects/landingpage  
/usr/lib/jvm/graalvm-ce-java11-22.0.0.2:/usr/lib/jvm/graalvm-ce-java11-22.0.0.2  
/root/IdeaProjects/demodatabase:/root/







