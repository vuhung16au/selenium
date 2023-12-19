# Insall Wordpress on local 

## Install docker desktop 

https://docs.docker.com/desktop/install/mac-install/

## Install Wordpress on docker 

``` 
mkdir 05Selenium-docker-wordpress
``` 
``` 
cd 05Selenium-docker-wordpress
``` 

```
touch docker-compose.yaml
``` 

``` 
docker compose up -d
``` 

Wordpress should on port 8000. 


## Configure Wordpress 

Open http://localhost:8000/ and follow the installation wizard.
Set the admin user and password.
