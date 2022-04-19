FROM jgsoftwares/jgsoftwares:linuxgraalvmce

#hostname
ENV HOSTNAME landingpage

# locale to german
ENV LANG=de_DE.ISO-8859-1
ENV LANGUAGE de_DE:de
ENV LC_ALL de_DE.ISO-8859-1


# add h2 database to root folder
ADD https://github.com/demogitjava/demodatabase/raw/master/demodb.mv.db /root/demodb.mv.db
ADD https://github.com/demogitjava/demodatabase/raw/master/mawi.mv.db /root/mawi.mv.db
ADD https://github.com/demogitjava/demodatabase/raw/master/shopdb.mv.db /root/shopdb.mv.db


ENV JAVA_TOOL_OPTIONS -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=*:5005


CMD /usr/lib/jvm/graalvm-ce-java11-22.0.0.2/bin/java \
    -XX:TieredStopAtLevel=1 \
    -noverify \
    -Dspring.output.ansi.enabled=always \
    -Dcom.sun.management.jmxremote \
    -Dspring.jmx.enabled=true \
    -Dspring.liveBeansView.mbeanDomain \
    -Dspring.application.admin.enabled=true \
    -Dfile.encoding=ISO-8859-1 \
    -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=*:5005 \
    -classpath \
    /root/IdeaProjects/landingpage/target/test-classes: \
    /root/IdeaProjects/landingpage/target/classes: \
    /root/.m2/repository/org/springframework/boot/spring-boot-starter-data-jpa/ \
    2.1.5.RELEASE/spring-boot-starter-data-jpa-2.1.5.RELEASE.jar: \
    /root/.m2/repository/org/springframework/boot/spring-boot-starter-aop/2.1.5.RELEASE/spring-boot-starter-aop-2.1.5.RELEASE.jar: \
    /root/.m2/repository/org/aspectj/aspectjweaver/1.9.4/aspectjweaver-1.9.4.jar: \
    /root/.m2/repository/org/springframework/boot/spring-boot-starter-jdbc/2.1.5.RELEASE/spring-boot-starter-jdbc-2.1.5.RELEASE.jar: \
    /root/.m2/repository/com/zaxxer/HikariCP/3.2.0/HikariCP-3.2.0.jar: \
    /root/.m2/repository/org/springframework/spring-jdbc/5.1.7.RELEASE/spring-jdbc-5.1.7.RELEASE.jar: \
    /root/.m2/repository/javax/transaction/javax.transaction-api/1.3/javax.transaction-api-1.3.jar: \
    /root/.m2/repository/javax/xml/bind/jaxb-api/2.3.1/jaxb-api-2.3.1.jar: \
    /root/.m2/repository/javax/activation/javax.activation-api/1.2.0/javax.activation-api-1.2.0.jar: \
    /root/.m2/repository/org/hibernate/hibernate-core/5.3.10.Final/hibernate-core-5.3.10.Final.jar: \
    /root/.m2/repository/org/jboss/logging/jboss-logging/3.3.2.Final/jboss-logging-3.3.2.Final.jar: \
    /root/.m2/repository/org/javassist/javassist/3.23.2-GA/javassist-3.23.2-GA.jar: \
    /root/.m2/repository/net/bytebuddy/byte-buddy/1.9.12/byte-buddy-1.9.12.jar: \
    /root/.m2/repository/antlr/antlr/2.7.7/antlr-2.7.7.jar:/root/.m2/repository/org/jboss/jandex/2.0.5.Final/jandex-2.0.5.Final.jar: \
    /root/.m2/repository/com/fasterxml/classmate/1.4.0/classmate-1.4.0.jar: \
    /root/.m2/repository/org/dom4j/dom4j/2.1.1/dom4j-2.1.1.jar: \
    /root/.m2/repository/org/hibernate/common/hibernate-commons-annotations/5.0.4.Final/hibernate-commons-annotations-5.0.4.Final.jar: \
    /root/.m2/repository/org/springframework/data/spring-data-jpa/2.1.8.RELEASE/spring-data-jpa-2.1.8.RELEASE.jar: \
    /root/.m2/repository/org/springframework/data/spring-data-commons/2.1.8.RELEASE/spring-data-commons-2.1.8.RELEASE.jar: \
    /root/.m2/repository/org/springframework/spring-orm/5.1.7.RELEASE/spring-orm-5.1.7.RELEASE.jar: \
    /root/.m2/repository/org/springframework/spring-tx/5.1.7.RELEASE/spring-tx-5.1.7.RELEASE.jar: \
    /root/.m2/repository/org/springframework/spring-aspects/5.1.7.RELEASE/spring-aspects-5.1.7.RELEASE.jar: \
    /root/.m2/repository/org/springframework/boot/spring-boot-starter-security/2.1.5.RELEASE/spring-boot-starter-security-2.1.5.RELEASE.jar: \
    /root/.m2/repository/org/springframework/boot/spring-boot-starter/2.1.5.RELEASE/spring-boot-starter-2.1.5.RELEASE.jar: \
    /root/.m2/repository/org/springframework/boot/spring-boot-starter-logging/2.1.5.RELEASE/spring-boot-starter-logging-2.1.5.RELEASE.jar: \
    /root/.m2/repository/ch/qos/logback/logback-classic/1.2.3/logback-classic-1.2.3.jar: \
    /root/.m2/repository/ch/qos/logback/logback-core/1.2.3/logback-core-1.2.3.jar: \
    /root/.m2/repository/org/apache/logging/log4j/log4j-to-slf4j/2.11.2/log4j-to-slf4j-2.11.2.jar: \
    /root/.m2/repository/org/apache/logging/log4j/log4j-api/2.11.2/log4j-api-2.11.2.jar: \
    /root/.m2/repository/org/slf4j/jul-to-slf4j/1.7.26/jul-to-slf4j-1.7.26.jar: \
    /root/.m2/repository/javax/annotation/javax.annotation-api/1.3.2/javax.annotation-api-1.3.2.jar: \
    /root/.m2/repository/org/yaml/snakeyaml/1.23/snakeyaml-1.23.jar: \
    /root/.m2/repository/org/springframework/spring-aop/5.1.7.RELEASE/spring-aop-5.1.7.RELEASE.jar: \
    /root/.m2/repository/org/springframework/security/spring-security-config/5.1.5.RELEASE/spring-security-config-5.1.5.RELEASE.jar: \
    /root/.m2/repository/org/springframework/security/spring-security-web/5.1.5.RELEASE/spring-security-web-5.1.5.RELEASE.jar: \
    /root/.m2/repository/org/springframework/spring-expression/5.1.7.RELEASE/spring-expression-5.1.7.RELEASE.jar: \
    /root/.m2/repository/org/springframework/boot/spring-boot-starter-thymeleaf/2.1.5.RELEASE/spring-boot-starter-thymeleaf-2.1.5.RELEASE.jar: \
    /root/.m2/repository/org/thymeleaf/thymeleaf-spring5/3.0.11.RELEASE/thymeleaf-spring5-3.0.11.RELEASE.jar: \
    /root/.m2/repository/org/thymeleaf/thymeleaf/3.0.11.RELEASE/thymeleaf-3.0.11.RELEASE.jar: \
    /root/.m2/repository/org/attoparser/attoparser/2.0.5.RELEASE/attoparser-2.0.5.RELEASE.jar: \
    /root/.m2/repository/org/unbescape/unbescape/1.1.6.RELEASE/unbescape-1.1.6.RELEASE.jar: \
    /root/.m2/repository/org/thymeleaf/extras/thymeleaf-extras-java8time/3.0.4.RELEASE/thymeleaf-extras-java8time-3.0.4.RELEASE.jar: \
    /root/.m2/repository/org/springframework/boot/spring-boot-starter-web/2.1.5.RELEASE/spring-boot-starter-web-2.1.5.RELEASE.jar: \
    /root/.m2/repository/org/springframework/boot/spring-boot-starter-json/2.1.5.RELEASE/spring-boot-starter-json-2.1.5.RELEASE.jar: \
    /root/.m2/repository/com/fasterxml/jackson/core/jackson-databind/2.9.8/jackson-databind-2.9.8.jar: \
    /root/.m2/repository/com/fasterxml/jackson/core/jackson-annotations/2.9.0/jackson-annotations-2.9.0.jar: \
    /root/.m2/repository/com/fasterxml/jackson/core/jackson-core/2.9.8/jackson-core-2.9.8.jar: \
    /root/.m2/repository/com/fasterxml/jackson/datatype/jackson-datatype-jdk8/2.9.8/jackson-datatype-jdk8-2.9.8.jar: \
    /root/.m2/repository/com/fasterxml/jackson/datatype/jackson-datatype-jsr310/2.9.8/jackson-datatype-jsr310-2.9.8.jar: \
    /root/.m2/repository/com/fasterxml/jackson/module/jackson-module-parameter-names/2.9.8/jackson-module-parameter-names-2.9.8.jar: \
    /root/.m2/repository/org/springframework/boot/spring-boot-starter-tomcat/2.1.5.RELEASE/spring-boot-starter-tomcat-2.1.5.RELEASE.jar: \
    /root/.m2/repository/org/apache/tomcat/embed/tomcat-embed-core/9.0.19/tomcat-embed-core-9.0.19.jar: \
    /root/.m2/repository/org/apache/tomcat/embed/tomcat-embed-el/9.0.19/tomcat-embed-el-9.0.19.jar: \
    /root/.m2/repository/org/apache/tomcat/embed/tomcat-embed-websocket/9.0.19/tomcat-embed-websocket-9.0.19.jar: \
    /root/.m2/repository/org/hibernate/validator/hibernate-validator/6.0.16.Final/hibernate-validator-6.0.16.Final.jar: \
    /root/.m2/repository/javax/validation/validation-api/2.0.1.Final/validation-api-2.0.1.Final.jar: \
    /root/.m2/repository/org/springframework/spring-web/5.1.7.RELEASE/spring-web-5.1.7.RELEASE.jar: \
    /root/.m2/repository/org/springframework/spring-webmvc/5.1.7.RELEASE/spring-webmvc-5.1.7.RELEASE.jar: \
    /root/.m2/repository/org/springframework/boot/spring-boot-devtools/2.1.5.RELEASE/spring-boot-devtools-2.1.5.RELEASE.jar: \
    /root/.m2/repository/org/thymeleaf/extras/thymeleaf-extras-springsecurity5/3.0.4.RELEASE/thymeleaf-extras-springsecurity5-3.0.4.RELEASE.jar: \
    /root/.m2/repository/org/slf4j/slf4j-api/1.7.26/slf4j-api-1.7.26.jar:/root/.m2/repository/org/springframework/boot/spring-boot-starter-test/2.1.5.RELEASE/spring-boot-starter-test-2.1.5.RELEASE.jar: \
    /root/.m2/repository/org/springframework/boot/spring-boot-test/2.1.5.RELEASE/spring-boot-test-2.1.5.RELEASE.jar: \
    /root/.m2/repository/org/springframework/boot/spring-boot-test-autoconfigure/2.1.5.RELEASE/spring-boot-test-autoconfigure-2.1.5.RELEASE.jar: \
    /root/.m2/repository/com/jayway/jsonpath/json-path/2.4.0/json-path-2.4.0.jar: \
    /root/.m2/repository/net/minidev/json-smart/2.3/json-smart-2.3.jar:/root/.m2/repository/net/minidev/accessors-smart/1.2/accessors-smart-1.2.jar: \
    /root/.m2/repository/org/ow2/asm/asm/5.0.4/asm-5.0.4.jar:/root/.m2/repository/junit/junit/4.12/junit-4.12.jar: \
    /root/.m2/repository/org/assertj/assertj-core/3.11.1/assertj-core-3.11.1.jar:/root/.m2/repository/org/mockito/mockito-core/2.23.4/mockito-core-2.23.4.jar: \
    /root/.m2/repository/net/bytebuddy/byte-buddy-agent/1.9.12/byte-buddy-agent-1.9.12.jar:/root/.m2/repository/org/objenesis/objenesis/2.6/objenesis-2.6.jar: \
    /root/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/root/.m2/repository/org/hamcrest/hamcrest-library/1.3/hamcrest-library-1.3.jar: \
    /root/.m2/repository/org/skyscreamer/jsonassert/1.5.0/jsonassert-1.5.0.jar: \
    /root/.m2/repository/com/vaadin/external/google/android-json/0.0.20131108.vaadin1/android-json-0.0.20131108.vaadin1.jar: \
    /root/.m2/repository/org/springframework/spring-core/5.1.7.RELEASE/spring-core-5.1.7.RELEASE.jar: \
    /root/.m2/repository/org/springframework/spring-jcl/5.1.7.RELEASE/spring-jcl-5.1.7.RELEASE.jar: \
    /root/.m2/repository/org/springframework/spring-test/5.1.7.RELEASE/spring-test-5.1.7.RELEASE.jar: \
    /root/.m2/repository/org/xmlunit/xmlunit-core/2.6.2/xmlunit-core-2.6.2.jar: \
    /root/.m2/repository/org/springframework/security/spring-security-test/5.1.5.RELEASE/spring-security-test-5.1.5.RELEASE.jar: \
    /root/.m2/repository/org/springframework/security/spring-security-core/5.1.5.RELEASE/spring-security-core-5.1.5.RELEASE.jar: \
    /root/.m2/repository/com/h2database/h2/1.4.200/h2-1.4.200.jar:/root/.m2/repository/org/jsoup/jsoup/1.14.3/jsoup-1.14.3.jar: \
    /root/.m2/repository/javax/persistence/javax.persistence-api/2.2/javax.persistence-api-2.2.jar:/root/.m2/repository/org/springframework/boot/spring-boot-autoconfigure/2.1.5.RELEASE/spring-boot-autoconfigure-2.1.5.RELEASE.jar: \
    /root/.m2/repository/org/springframework/boot/spring-boot/2.1.5.RELEASE/spring-boot-2.1.5.RELEASE.jar: \
    /root/.m2/repository/org/springframework/spring-context/5.1.7.RELEASE/spring-context-5.1.7.RELEASE.jar: \
    /root/.m2/repository/org/springframework/boot/spring-boot-starter-mail/2.1.5.RELEASE/spring-boot-starter-mail-2.1.5.RELEASE.jar: \
    /root/.m2/repository/com/sun/mail/javax.mail/1.6.2/javax.mail-1.6.2.jar:/root/.m2/repository/javax/activation/activation/1.1/activation-1.1.jar: \
    /root/.m2/repository/org/springframework/spring-context-support/5.1.7.RELEASE/spring-context-support-5.1.7.RELEASE.jar: \
    /root/.m2/repository/org/springframework/spring-beans/5.1.7.RELEASE/spring-beans-5.1.7.RELEASE.jar \
    de.jgsoftware.landingpage.iDemoLandingPage




