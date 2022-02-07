# ZupLink -  Projeto Final Estrelas Fora Da Caixa (Turma 4)

Uma API que tem o propósito de ser um acumulador de sugestões de estudos para alunos de desenvolvimento do programa da Zup Innovation, Estrelas Fora da Caixa(Formação Backend - JAVA).  

O objetivo do sistema é concentrar em um único lugar links para os estudos e desenvolvimento de cada aluno. O propósito do sistema é que o usuário possa compartilhar com os colegas links para estudo e pesquisa assim como conseguir consumir estes links também de forma mais objetiva. Os links podem ser de qualquer tipo, vídeo, artigos, documentação, imagens e etc. 
O problema a ser resolvido foi pensado de estrelas fora da caixa para estrelas fora da caixa.

## Regras de Negócio

- O cadastro poderá ser feito por qualquer pessoa que tenha um e mail corporativo;
- Não pode ser cadastrado o Usuário com email repetido;
- O email precisa ser válido(conter “@” e o domínio ser “zup.com.br”);
- O usuário cadastrado terá uma página de login que deverá solicitar o e-mail e senha deste usuário;
- Apenas os usuários logados podem  exibir  a lista de Usuários;
- As rotas públicas são: cadastrar usuário e exibir postagens, todas as demais é necessária a autenticação via token;
- Somente o usuário poderá atualizar seus dados;
- Ao atualizar a postagem o usuário não poderá alterar o link original, podendo atualizar somente o  e-mail, senha e nome;
- Apenas o usuário poderá deletar o próprio cadastro;
-Apenas usuários autenticados poderão fazer postagens;
- Não poderão existir postagens com links iguais;
- As postagens terão filtros de busca (tipo, tema, área, mais curtidas, por autor da postagem, por data de postagem);
-Apenas o autor da postagem poderá editá-la, nos seguintes campos: título, descrição, tema e área;
-Somente usuários logados poderão curtir as postagens;
-Apenas o autor poderá excluir a própria postagem.

## Como Rodar a API localmente

> Pré-requisitos:

- JAVA JDK
- Maven
- MariaDB/MySQL

[Link para instalar o Maven](https://maven.apache.org/download.cgi)

Após instalar as dependencias através do terminal na pasta do projeto voce deve agora ser capaz de iniciar a aplicaçao na IDE. 

Será possível testar a aplicaçao em: localhost:8080/

## Tecnologias utilizadas

- JAVA 11
- Springboot
- Spring Security
- JWT
- JPA
- Hibernate
- Swagger
- Maven
- Junit

## SERVIÇOS

Funcionalidades documentadas via Swagger e Postman Collection.

- Swagger: http://localhost:8080/swagger-ui/index.html#/

-Postman collection:




