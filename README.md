# Big Game Survey 
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/sidneymiranda/big-game-survey/blob/master/LICENSE) 

# Sobre o projeto

https://sds1-sidney.netlify.app/

O Big Game Survey é uma aplicação web e mobile desenvolvida durante a 1ª edição da **Semana DevSuperior**, evento organizado pela [DevSuperior](https://devsuperior.com "Site da DevSuperior").

A aplicação consiste em uma pesquisa de preferência de games, cujos dados são coletados no app mobile, e listados na aplicação web, que apresenta um dashboard com gráficos baseados nestes dados.

## Layout mobile
![Mobile 1](https://github.com/sidneymiranda/assets/blob/main/big-game-survey/mobile1.png) ![Mobile 2](https://github.com/sidneymiranda/assets/blob/main/big-game-survey/mobile2.png)

## Layout web
![Web 1](https://github.com/sidneymiranda/assets/blob/main/big-game-survey/web_tab.png)

![Web 2](https://github.com/sidneymiranda/assets/blob/main/big-game-survey/web_graph.png)

## Modelo conceitual
![Modelo Conceitual](https://github.com/sidneymiranda/assets/blob/main/big-game-survey/modelo-conceitual.png)

# Tecnologias utilizadas
## Back end
- Java
- Spring Boot
- JPA / Hibernate
- Maven
## Front end
- HTML / CSS / JS / TypeScript
- ReactJS
- React Native
- Apex Charts
- Expo
## Implantação em produção
- Back end: Heroku
- Front end web: Netlify
- Banco de dados: Postgresql

# Como executar o projeto

## Back end
Pré-requisitos: Java 11

```bash
# clonar repositório
git clone https://github.com/sidneymiranda/big-game-survey

# entrar na pasta do projeto back end
cd backend

# executar o projeto
./mvnw spring-boot:run
```

## Front end web
Pré-requisitos: npm / yarn

```bash
# clonar repositório
git clone https://github.com/sidneymiranda/big-game-survey

# entrar na pasta do projeto front end web
cd front-web

# instalar dependências
yarn install

# executar o projeto
yarn start
```

# Autor

Sidney Silva Miranda

https://www.linkedin.com/in/sidney-miranda
