# Build docker image 
./mvnw spring-boot:build-image -Dspring-boot.build-image.imageName=spring-ms-docker-demo2

# Spawn container and verify docker image
docker run --name spring-ms-docker-demo2 -p 8080:8080 spring-ms-docker-demo2

# Push to repository
docker push spring-ms-docker-demo2



