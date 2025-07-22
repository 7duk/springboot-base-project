# springboot-base-project
Create a simple Springboot base project using monolithic architecture

```________                   ________             ________           _____
___  __ )_____ _______________  __ \__________________(_)____________  /_
__  __  |  __ `/_  ___/  _ \_  /_/ /_  ___/  __ \____  /_  _ \  ___/  __/
_  /_/ // /_/ /_(__  )/  __/  ____/_  /   / /_/ /___  / /  __/ /__ / /_
/_____/ \__,_/ /____/ \___//_/     /_/    \____/___  /  \___/\___/ \__/
/___/
```
---

## GETTING STARTED
### 1.Prerequisite:
* [Jdk 21](https://www.oracle.com/java/technologies/javase/jdk21-archive-downloads.html)
* Install [Intellj Idea](https://www.jetbrains.com/idea/download/?section=mac) tool
* Install [Docker](https://www.docker.com/get-started/) tool
* Gradle tool

### 2.Technical stack:
* Springboot v5.3.5
* Lombok
* MySQL/PostgreSQL
* Springboot devtool
* Springboot starter actuator
* OpenAPI(Swagger)
* ...
### 3. Build and Run
#### 3.1 Build
```bash
    ./gradlew clean build 
```
#### 3.2 Run
##### 3.2.1 Using Gradle
```bash
    ./gradlew bootRun
```
##### 3.2.2 Using Docker
###### 3.2.2.1. Run with dockerfile
```bash
    docker build -t baseproject:latest
    
    docker run -it -p 8080:8080 baseproject:latest
```
###### 3.2.2.2. Run with docker-compose
```bash
    docker compose up -d
```
### 4. Test
### 4.1 Test with curl
```bash
    curl http://localhost:8080/actuator/health
```
* Result: { "status" : "UP" }