
docker run -d -p 9411:9411 openzipkin/zipkin

docker run -d --name elasticsearch  -p 9200:9200 -p 9300:9300 -e "discovery.type=single-node" elasticsearch:7.3.0


docker run -d --link elasticsearch:elasticsearch -p 5601:5601 docker.elastic.co/kibana/kibana:7.3.0

docker run -d -v jenkins_home:/var/jenkins_home -p 8080:8080 -p 50000:50000 jenkins/jenkins:lts

docker run -it --rm -p 8888:8080 tomcat:8.0

docker run -d --name sonarqube -p 9000:9000 sonarqube

docker run -d --name sonarqube -p 9000:9000  -e sonar.jdbc.username=sonar  -e sonar.jdbc.password=sonar  -e sonar.jdbc.url=jdbc:postgresql://localhost/sonar  sonarqube

docker run --name some-wordpress -e WORDPRESS_DB_HOST=docker  -e WORDPRESS_DB_USER=docker -e WORDPRESS_DB_PASSWORD=docker -d wordpress

