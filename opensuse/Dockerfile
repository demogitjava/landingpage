FROM opensuse/tumbleweed:latest




RUN zypper install xrdp
RUN systemctl set-default multi-user.target
RUN systemctl set-default graphical.target
RUN systemctl get-default
RUN systemctl isolate multi-user.target

RUN systemctl enable xrdp
RUN systemctl start xrdp

ENTRYPOINT [ "systemctl start xrdp" ]