# Desafio 1 - Programa de Aceleração Docker - Full Cycle
### (Code Education)

[![Author](https://img.shields.io/badge/author-wmcruz-AD1256?style=flat-square)](https://github.com/wmcruz)
[![Languages](https://img.shields.io/github/languages/count/wmcruz/Desafio1-pfa?color=%23AD1256&style=flat-square)](#)
[![Docker](https://badgen.net/badge/icon/docker?icon=docker&label)](https://https://docker.com/)
[![Maven](https://badgen.net/badge/icon/maven?icon=maven&label)](https://https://maven.apache.org/)
![GitHub stars](https://img.shields.io/github/stars/wmcruz/Desafio1-pfa?style=flat-square)
![GitHub forks](https://img.shields.io/github/forks/wmcruz/Desafio1-pfa?style=flat-square)

# 📘 Descrição desafio 1
```
Crie um programa utilizando sua linguagem de programação favorita que faça uma listagem simples do nome de alguns módulos do curso Full Cycle os trazendo de um banco de dados MySQL. Gere a imagem desse container e a publique no DockerHub.

Gere uma imagem do nginx que seja capaz que receber as solicitações http e encaminhá-las para o container.

Crie um repositório no github com todo o fonte do programa e das imagens geradas.

Crie um arquivo README.md especificando quais comandos precisamos executar para que a aplicação funcione recebendo as solicitações na porta 8080 de nosso computador. Lembrando que NÃO utilizaremos Docker-compose nesse desafio.
```

# 💻 Comandos para executar
1 - Criação da rede
```
docker network create wmcruz/desafio1-pfa
```

2 - Banco de Dados Mysql. 
```
docker run -d --rm -p 3306:3306 --network wmcruz/desafio1-pfa --name wmcruz-desafio1-pfa-mysql wmcruz/desafio1-pfa-mysql
```
3 - App rest em Java
```
docker run -d --rm --network wmcruz/desafio1-pfa --name wmcruz-desafio1-pfa-app wmcruz/desafio1-pfa-app
```
4 - Servidor web de proxy reverso NGINX
```
docker run -d --rm -p 3000:80 --network wmcruz/desafio1-pfa --name wmcruz-desafio1-pfa-nginx wmcruz/desafio1-pfa-nginx
```

# 💻 Visualização
No seu navegador ou em sua ferramenta preferida para requisições de APIs REST solicite o seguinte endereço:
```
http://localhost:3000/modulos
```
Obs.: Caso você rode os containers em algum ambiente cloud, troque o 'localhost' pelo endereço do seu servidor. Não esqueça de adicionar '/modulos' no final do endereço.
