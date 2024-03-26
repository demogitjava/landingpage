FROM jgsoftwares/rockylinux_devssh AS BUILDER


# sshd
RUN dnf -y install openssh-server openssh-clients; \
    sed -i 's/^\(UsePAM yes\)/# \1/' /etc/ssh/sshd_config; \
    ssh-keygen -q -t rsa -b 2048 -f /etc/ssh/ssh_host_rsa_key -N '' && \
    ssh-keygen -q -t ecdsa -f /etc/ssh/ssh_host_ecdsa_key -N '' && \
    ssh-keygen -t dsa -f /etc/ssh/ssh_host_ed25519_key  -N ''; \
    sed -i 's/^#\(PermitRootLogin\) .*/\1 yes/' /etc/ssh/sshd_config; \
    rm -f /run/nologin; \
    dnf clean all;

ENV TIMEZONE Europe/Berlin

ENV ROOT_PASSWORD jj78mvpr52k1

EXPOSE 22
EXPOSE 1527
EXPOSE 3306
EXPOSE 80
EXPOSE 443

CMD ["/usr/sbin/sshd", "-D", "-e"]
