FROM kdeneon/all

RUN export DEBIAN_FRONTEND=noninteractive \
    && sudo apt-get update \
    && sudo apt-get install -y xrdp supervisor firefox libgl1-mesa-glx libgl1-mesa-dri\
    && sudo apt-get clean \
    && echo "root:jj78mvpr52k1" | sudo chpasswd \
    && sudo chmod -R 777 /var/log/supervisor/

#COPY .XClients /etc/skel/.XClients
COPY supervisor.conf /etc/supervisor/conf.d/xrdp.conf

# RUN sed -i '/TerminalServerUsers/d' /etc/xrdp/sesman.ini && \
#     sed -i '/TerminalServerAdmins/d' /etc/xrdp/sesman.ini
USER root

EXPOSE 3389
CMD ["supervisord", "-n"]