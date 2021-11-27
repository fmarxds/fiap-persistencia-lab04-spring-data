### Rodar o MySQL em container
```
docker run -d --name mysql \
    -p 3306:3306 \
    -e MYSQL_ROOT_HOST=% \
    -e MYSQL_ROOT_PASSWORD=root \
    mysql/mysql-server:5.7
```