## Problem Statement : Deploy a Springboot Microservice on AKS

**In this Exercise, you will practice with Deploying your SpringBoot Microservice application in AKS**

This exercise contains following files in k8s folder:

- userservice.yml- To create the API deployment and a service of type NodePort to expose the deployed springboot application
- mongodb.yml - To create MongoDB deployment in k8s cluster

  
This exercise contains user-service, a RESTful Spring Boot application. For this exercise perform the following steps:

	1. Build the Docker image for the Spring Boot application.
	2. Tag the docker image.
	3. Push the image to Docker Hub.


Understand and perform the following steps to complete this exercise:

	1. Create a cluster on AKS using Azure cli.
	2. change local context of kubectl to point to AKS cluster.
	3. Follow the instructions given in the `mongodb.yml` file and create deployment and service.
	4. Follow the instructions given in the `userservice.yml` file and create deployment.
    5. Deploy all resources in AKS using `az cli`.
	6. Test your deployment using Postman.


## Important Notes

This boilerplate contains the code for Spring boot microservice which is using local instance of MongoDB. You need to use MongoDB running in kubernetes cluster.


### Tech Stack

    Azure AKS
