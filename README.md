# Deploying An Application with Skaffold

In this project we have a simple rest endpoint application that we will deploy on a kubernetes
cluster using Skaffold. 

We use JIB plugin to build a docker image and deploy using a Helm chart. All of this is done 
together using a Skaffold pipeline.

Create a pipeline 
```shell
skaffold init
```
To run the skaffold pipeline with portforward and tail on the logs
```shell
 skaffold run --port-forward --tail
```

To run the skaffold pipeline in development mode
```shell
skaffold dev --port-forward --tail
```

You can read about this on my site [http://refactorfirst.com](http://refactorfirst.com/deploy-application-on-kubernetes-with-skaffold-helm-jib)