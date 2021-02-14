# Wadge-BackEnd

![Java CI](https://github.com/RomainVacheret/Wadge-BackEnd/workflows/Java%20CI/badge.svg)
![GitHub release (latest by date)](https://img.shields.io/github/v/release/RomainVacheret/Wadge-BackEnd)
[![License](https://img.shields.io/github/license/RomainVacheret/Wadge-BackEnd.svg?style=flat-square)](LICENSE)
[![Code Quality](https://sonarcloud.io/api/project_badges/measure?project=RomainVacheret_Wadge-BackEnd&metric=alert_status)](https://sonarcloud.io/dashboard?id=RomainVacheret_Wadge-BackEnd)
[![Technical Debt](https://sonarcloud.io/api/project_badges/measure?project=RomainVacheret_Wadge-BackEnd&metric=sqale_index)](https://sonarcloud.io/dashboard?id=RomainVacheret_Wadge-BackEnd)
[![Reliability Rating](https://sonarcloud.io/api/project_badges/measure?project=RomainVacheret_Wadge-BackEnd&metric=reliability_rating)](https://sonarcloud.io/dashboard?id=RomainVacheret_Wadge-BackEnd)
[![Maintainability Rating](https://sonarcloud.io/api/project_badges/measure?project=RomainVacheret_Wadge-BackEnd&metric=sqale_rating)](https://sonarcloud.io/dashboard?id=RomainVacheret_Wadge-BackEnd)
[![Coverage Status](https://coveralls.io/repos/github/RomainVacheret/Wadge-BackEnd/badge.svg?branch=master)](https://coveralls.io/github/RomainVacheret/Wadge-BackEnd?branch=master)

# Que faisons nous ?
Une application proposant des recettes de cuisine à partir de fruits et légumes de saison tout en prennant en compte ce que vous possédez déjà dans votre frigo !

# Installation
## Prérequis
* [Télécharger le JDK](https://www.oracle.com/java/technologies/javase-downloads.html)
* [Télécharger Git](https://git-scm.com/downloads)
* [Installer Gradle](https://gradle.org/install/)
* [Créer une clef Google API](https://developers.google.com/maps/documentation/javascript/get-api-key)

Clonez le repository   
Créez un fichier .env à la racine du projet  
Ajoutez la ligne `GOOGLE_API="VOTRE_CLEF_API"`  
Lancez le projet.   

Si vous ne lancez que cette partie de l'application, vous aurez uniquement l'API. Pour utiliser l'interface utilisateur, vous devez également utiliser le front end.
```Bash
git clone https://github.com/RomainVacheret/Wadge-BackEnd.git
cd Wadge-BackEnd
touch .env
chmod a+x ./gradlew
./gradlew bootRun
```

###### Note : La clef Google API n'est pas obligatoire pour faire fonctionner l'application. Seulement les parties impliquées.
# Un projet découpé en deux parties
Ce repository contient la partie back end de notre application web. Vous trouverez le front end à [cette adresse](https://github.com/RomainVacheret/Wadge-FrontEnd).
# Auteurs
* **Fanny Lourioux** - [Github](https://github.com/FannyLourioux) - [LinkedIn](https://www.linkedin.com/in/fanny-lourioux-4744941a0/)
* **Trystan Roches** - [Github](https://github.com/Trystan4) - [LinkedIn](https://www.linkedin.com/in/trystan-roches-4a6ba0171/)
* **Romain Vacheret** - [Github](https://github.com/RomainVacheret) - [LinkedIn](https://www.linkedin.com/in/romain-vacheret-b58270189/)
* **Maodo Laba Sow** - [Github](https://github.com/sowJamng) - [LinkedIn](https://www.linkedin.com/in/maodo-laba-sow-668244184/)

## Plus d'informations sur l'API
Retrouvez notre API via l'interface [d'OpenAPI](http://localhost:8080/swagger-ui.html/)