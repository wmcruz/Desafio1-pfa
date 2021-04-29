docker run --rm -p 3306:3306 --network wmcruz/desafio1-pfa --name wmcruz-desafio1-pfa-mysql wmcruz/desafio1-pfa-mysql

docker run --rm --network wmcruz/desafio1-pfa --name wmcruz-desafio1-pfa-app wmcruz/desafio1-pfa-app

docker run --rm -p 3000:80 --network wmcruz/desafio1-pfa --name wmcruz-desafio1-pfa-nginx wmcruz/desafio1-pfa-nginx