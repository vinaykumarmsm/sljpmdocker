FROM ubuntu:14.04
RUN apt-get update && apt-get install -y firefox
#Replace below details with user / group id you would like to use
RUN export uid=1000 gid=1000 && \
mkdir -p /home/amanral && \
echo "amanral:x:${uid}:${gid}:amanral,,,:/home/amanral:/bin/bash" >> /etc/passwd && \
echo "amanral:x:${uid}:" >> /etc/group && \
echo "amanral ALL=(ALL) NOPASSWD: ALL" > /etc/sudoers.d/amanral && \
chmod 0440 /etc/sudoers.d/amanral && \
chown ${uid}:${gid} -R /home/amanral
USER amanral
ENV HOME /home/amanral
CMD [ "/usr/bin/firefox" ]

