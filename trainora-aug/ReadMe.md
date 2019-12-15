Resources

Docker hub repo: https://cloud.docker.com/repository/docker/rajeshgheware

Github Repo (Main): https://github.com/rajeshgheware?tab=repositories

Jenkins docker:  

docker run -d -v jenkins_home:/var/jenkins_home -p 8080:8080 -p 50000:50000 jenkins/jenkins:lts


Ref:


https://www.digitalocean.com/community/tutorials/how-to-configure-the-linux-firewall-for-docker-swarm-on-ubuntu-16-04


swarm manager join

docker swarm join --token SWMTKN-1-3bfjs4nqr84yj06jlcwo5o81jdsgqf6ay24ip5mo8afe2d07i8-abm5moqimnq6yp1b0nuiat10o 13.235.185.103:2377
