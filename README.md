此项目借鉴于微服务项目piggymetrics,是入门微服务的好选择,项目源地址为https://github.com/sqshq/piggymetrics.git

至少需要4G内存
打包与部署,linux环境部署，需要安装docker与docker-compose,maven,
在根目录运行`mvn package [-DskipTests]`对项目打包,
在根目录运行'docker-compose -f docker-compose.yml -f docker-compose.dev.yml up' 
打开本地localhost即可看到登陆页面