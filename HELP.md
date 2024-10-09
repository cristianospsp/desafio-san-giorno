# Read Me First

Para subir a infra da aplicaçãozinha, é necessario ter instalado:

<li>"docker"</li>
<li>docker-compose</li>
<li>java 17</li>
<li>maven lts</li>

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

<li>PARA ENTRAR NO CONTEINER DO POSTGRES:</li>
<h1>docker exec -it san-giorno psql -U san-giorno -d san-giorno</h1>

Acesse o PostgreSQL:
<li>psql -U san-giorno -d san-giorno</li>

VERIFICAR se o rabbitMq esta funcionando:
<li>http://localhost:15672</li>

Sair do PostGres
<li>\q </li>

EM CASO DE PANICO:

Resolução de Problemas

Logs: Se algum dos serviços não estiver funcionando como esperado, você pode verificar os logs dos contêineres com:

<li>docker-compose logs <'nome-do-servico'/></li>

Por exemplo, para ver os logs do RabbitMQ:

<li>docker-compose logs rabbitmq</li>

Parar os Serviços: Se precisar parar os serviços, você pode usar:

<li>docker-compose down</li>

