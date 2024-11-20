FROM oraclelinux:9



RUN (yum install -y chrony;)


RUN (systemctl enable chronyd;)
RUN (systemctl start chronyd;)


EXPOSE 123/udp
# systemctl enable --now chronyd.service
