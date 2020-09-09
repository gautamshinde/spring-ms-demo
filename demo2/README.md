# Build docker image 
./mvnw spring-boot:build-image -Dspring-boot.build-image.imageName=spring-ms-docker-demo2

# Spawn container and verify docker image
docker run --name spring-ms-docker-demo2 -p 8080:8080 spring-ms-docker-demo2

# Push to repository
docker push spring-ms-docker-demo2

# Create K8 deployment and service
kubectl apply -f *.yaml 

watch -n 1 kubectl get all

#The service is assigned a cluster IP, which is only accessible from inside the cluster
#To access the app we can use kubectl port-forward
kubectl port-forward <servicename> 8080:8080


