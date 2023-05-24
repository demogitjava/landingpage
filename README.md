# Demo Landingpage with Spring Boot + Thymeleaf + Grapesjs + Bootstrap/Bootflat ui kit



|  |  |
|--|--|
| [mirror 1 -> landingpage.jar](https://c.gmx.net/@628889413098673643/B7eMGuYjQPy7Agors4qo7g) |  2023 05 24|
|  [mirror 2 -> landingpage.jar](https://www.dropbox.com/s/cvhaj3tih2892jd/landingpage.jar?dl=0)| 2023 05 24 |
|  |  |




the used timezone is -> UTC Europe/Berlin

The used IDE was Apache Netbeans17
[download netbeans](https://netbeans.apache.org/download/index.html)

The used maven 3.9.1 version
[download maven](https://maven.apache.org/download.cgi)

![enter image description here](https://raw.githubusercontent.com/demogitjava/demodatabase/master/landingapge.png)


H2-CONSOLE
used db -> shopdb
available with  -**>your-ip/h2-console**

    username admin
    password jj78mvpr52k1


to edit the text in the demo application
copy the segment and
paste it with the editor to save
the "text edit" for your
language.

*FOR EMAIL*
**in class contact_service.java
edit password and username for your smtp account -- hard coded in the moment
-> testet with gmx.**



The login for the database over jdbc is
`admin
jj78mvpr52k1`

the application url // port is
url: https:// "your domain " /

to edit the port of the tomcat server
look at the application.properties
**server.port=80**



# For Docker
============================================================
<br/>
start docker container with 
line 


to build the image type:

-p 0.0.0.0:80:80 --dns 208.67.222.222 --dns 208.67.220.220 --dns 208.67.220.222 --dns 208.67.222.220 --dns-search demogitjava --name de_landingpage --network 192.168.178.0 -it --cpus="4"


docker build -f Dockerfile -t landingpage .

<br/>
docker for windows are available on https://www.docker.com/products/docker-desktop


networkconfig
run options
============================================================

for bridge network -> 254 Containers

`docker network create --driver=bridge --subnet=192.168.178.0/24 --ip-range=192.168.178.0/24 --gateway=192.168.178.1 192.168.178.0`



for ip

`--rm -d --network 192.200.100.254/24`
after the network is successfuly created
type your run command to deploy your container
to the network





backup
load / save
============================================================

docker save -o landingpage.tar jgsoftwares/jgsoftwares

to load your image to docker desktop type:


docker load --input landingpage.tar




-> for manual setup // Dockerfile ssh server - jetbrains gateway
----------------------------------------
mount directory into docker container:

/root/.m2:/root/.m2  
/root/IdeaProjects/landingpage:/root/IdeaProjects/landingpage  
/usr/lib/jvm/graalvm-ce-java11-22.0.0.2:/usr/lib/jvm/graalvm-ce-java11-22.0.0.2  
/root/IdeaProjects/demodatabase:/root/

