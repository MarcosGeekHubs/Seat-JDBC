# https://platzi.com/tutoriales/1432-docker/3268-como-crear-un-contenedor-con-docker-mysql-y-persistir-la-informacion/

docker-build:
	docker run -d -p 33060:3306 --name mysql-db-seat  -e MYSQL_ROOT_PASSWORD=secret --mount src=mysql-db-seat,dst=/var/lib/mysql mysql
docker-start:
	docker start mysql-db-seat
docker-stop:
	docker stop mysql-db-seat

docker-ssh:
	docker exec -it mysql-db-seat mysql -p

docker-delete-all:
	docker rm -f mysql-db-seat && docker volume prune

docker-create-volume:
	docker volume create mysql-db-seat && docker volume ls






