# Read Me First

Para subir a infra da aplicaçãozinha, é necessario ter instalado:

<li>"docker"</li>
<li>docker-compose</li>
<li>java 17</li>
<li>maven</li>


<li>Para subir nossa mini-infra:</li>
"dentro da pasta que o docke-compose foi criado"

<li>docker-compose up -d</li>
{ Isso iniciará o contêiner do PostgreSQL e criará o banco de dados com as configurações especificadas }

<li>docker ps</li>
{ Isso deve mostrar o contêiner san-giorno-db em execução}

<li>docker volume ls</li>
Listar volumes do Docker

<li>docker volume inspect postgres_data</li>
Inspecionar o volume para ver o local exato


PARA ENTRAR NO CONTEINER DO POSTGRES:
<li>docker exec -it san-giorno-db bash</li>

Acesse o PostgreSQL:
<li>psql -U san-giorno -d san-giorno</li>

Sair do PostGres
<li>\q </li>

