the project is learned by another project piggymetrics,is a good choice to know about microservices,the git project ishttps://github.com/sqshq/piggymetrics.git

## to deployment project
at least 4g RAM\
need to install `docker and docker-compose mave`n in linux,linux is a good choice to deployment\
at root directory to run:\
### `mvn package [-DskipTests]` 
to make jar package.
at root directory to run:\
### `docker-compose -f docker-compose.yml -f docker-compose.dev.yml up`

open localhost,and you can see the login page.
