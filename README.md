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

## Installation et Exécution

### 1 **Cloner le projet**
```bash
git clone https://github.com/votre-utilisateur/manipulation-hdfs-java.git
cd manipulation-hdfs-java
