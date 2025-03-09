# Manipulation de HDFS avec une Application Java

Ce projet vise à manipuler **Hadoop Distributed File System (HDFS)** en utilisant **Java**. Il permet d'effectuer diverses opérations sur HDFS telles que la lecture, l'écriture, la gestion des fichiers et des répertoires.

## Objectifs
- Comprendre et manipuler **HDFS** à l'aide d'une application Java.
- Lire et écrire des fichiers sur **HDFS**.
- Effectuer diverses opérations comme la création, le déplacement et la suppression de fichiers HDFS.
- Gérer des fichiers **CSV** pour le stockage de données.

## Prérequis
Avant d'exécuter ce projet, assurez-vous d'avoir :
- **Hadoop** installé et configuré sur votre machine.
- Un environnement de développement **Java** (JDK 8 ou supérieur).
- Un gestionnaire de dépendances comme **Maven** (si nécessaire).
- Un accès à **HDFS** avec un cluster Hadoop en fonctionnement.

## Structure du projet
Le projet contient deux classes principales :

- **App1.java** : Lecture d'un fichier sur HDFS.
- **App2.java** : Écriture d'un fichier sur HDFS.
- **HDFSOperations.java** : Contient plusieurs méthodes pour manipuler HDFS, telles que :
    - Création de répertoires et de fichiers.
    - Écriture et lecture de fichiers.
    - Copie, suppression et renommage de fichiers.
    - Lecture et écriture de fichiers CSV.

## Commandes utilisées
### Créer un répertoire dans HDFS
hdfs dfs -mkdir -p /user/hadoop/appData

### Lister tous les fichiers et répertoires dans HDFS
hdfs dfs -ls /user/hadoop/appData

### Créer un fichier et y écrire du texte
echo "Bienvenue sur HDFS avec Java." | hdfs dfs -put - /user/hadoop/appData/data.txt

### Lire le contenu du fichier
hdfs dfs -cat /user/hadoop/appData/data.txt

### Copier un fichier local vers HDFS
hdfs dfs -put test.txt /user/hadoop/appData/test.txt

### Télécharger un fichier depuis HDFS vers le système local
hdfs dfs -get /user/hadoop/appData/test.txt .

### Renommer un fichier dans HDFS
hdfs dfs -mv /user/hadoop/appData/data.txt /user/hadoop/appData/data_v1.txt

### Supprimer un fichier dans HDFS
hdfs dfs -rm /user/hadoop/appData/data_v1.txt

### Afficher les métadonnées d’un fichier
hdfs dfs -stat "%n - Taille: %b octets, Modifié: %y" /user/hadoop/appData/test.txt

### Vérifier l’espace disponible dans HDFS
hdfs dfs -df -h

### Déplacer un fichier vers un sous-répertoire
hdfs dfs -mkdir /user/hadoop/archive
hdfs dfs -mv /user/hadoop/appData/test.txt /user/hadoop/archive/

### Créer et écrire un fichier CSV dans HDFS
echo "ID,Nom,Prix" > products.csv
echo "1,Ordinateur,700" >> products.csv
echo "2,Smartphone,500" >> products.csv
echo "3,Tablette,300" >> products.csv
hdfs dfs -put products.csv /user/hadoop/appData/products.csv

### Lire un fichier CSV depuis HDFS
hdfs dfs -cat /user/hadoop/appData/products.csv
