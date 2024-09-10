
# Mircroservices-cmpe272

**Microservices Assignment: Setup and Deployment**

This project focused on setting up two microservices using Visual Studio Code, Spring Tool Suite, Docker, and Kubernetes. The services were developed, containerized, and deployed on a local Kubernetes cluster via Minikube.

### Setup and Tools

- **Programming Language & Framework:** Java with Spring Boot.  
- **Tools:** JDK, Maven, Spring Tool Suite 4 IDE.  
- **Version Control:** Git for managing source code.

### Creating Microservices

Starter projects for the "Hello" and "World" microservices were generated using Spring Initializr.

**Hello Service:**
- **Endpoint:** `/hello`
- **Functionality:** Returns the string "Hello."
- **Implementation:** Developed `HelloController.java` with a `hello()` method annotated with `@GetMapping("/hello")`.
- **Testing:** Created JUnit tests in `CheckHTTPResponse.java`.

**World Service:**
- **Endpoint:** `/world`
- **Functionality:** Returns the string "World."
- **Implementation:** Developed `WorldController.java` with a `world()` method annotated with `@GetMapping("/world")`.
- **Testing:** JUnit tests were implemented similarly to the Hello Service.

### Local Testing

Both microservices were compiled and tested locally, running on ports 9095 (Hello) and 8095 (World). The outputs were verified during local testing.

### Docker Containerization

**Docker Setup:**
- Created Dockerfiles for the Hello and World microservices, exposing ports 9095 and 8095.
- Built Docker images using:
  ```bash
  docker build -t hello .
  docker build -t world .
  ```
- Ran the Docker images locally:
  ```bash
  docker run -p 9090:8080 hello:latest
  docker run -p 9091:8081 world:latest
  ```
- Confirmed that each Docker image worked independently on ports 9090 (Hello) and 9091 (World).

### Pushing Images to Docker Hub

Tagged and pushed the Docker images to Docker Hub using:
```bash
docker tag hello:latest <username>/hello
docker tag world:latest <username>/world
docker push <username>/hello
docker push <username>/world
```

### Deploying on Kubernetes

**Google Kubernetes Engine (GKE) Setup:**
- Set up a Google Cloud account and created Kubernetes clusters for the Hello and World microservices.
- Configured deployment files (`k8s-hello.yaml` and `k8s-world.yaml`) for Kubernetes.
- Deployed both services to GKE using:
  ```bash
  kubectl apply -f k8s-hello.yaml
  kubectl apply -f k8s-world.yaml
  ```

### Integrating and Testing HelloWorld Service

**Service Integration:**
- Combined the Hello and World services into a unified service under the Hello microservice.
- Developed `HelloWorldService` with a `/helloworld` endpoint returning "Hello World."

**Configuration:**
- Added a `RestTemplate` bean in the `AppConfig` class to facilitate REST calls between services.
- Set up external service URLs in the `application.properties` file for the Hello microservice.

### Redeployment

- Rebuilt and pushed the updated Docker image to Docker Hub.
- Redeployed the Hello service on GKE.

### Conclusion

This project showcases the deployment of a microservices architecture using Spring Boot, Docker, and Kubernetes. Both Hello and World microservices were containerized and successfully deployed on GKE, demonstrating inter-service communication and cloud-based deployment.




##Link for hello-microservice and world-microservice

https://hub.docker.com/r/ajaykumar17/hello-service

https://hub.docker.com/r/ajaykumar17/world-service

## Docker Images

![image](https://github.com/user-attachments/assets/51dc12ef-4a1c-4df0-bcdc-06a668295baf)
