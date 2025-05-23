Projet "LabanquePotable".

Le but premier de ce projet est de m'entrainer à l'implémentation d'une architecture en couche (Onion).

Théoriquement les quatres couches c'est:
I Domain Layer : Entités métier et interfaces.

II Application Layer : Cas d'utilisation (services applicatifs).

III Infrastructure Layer : Accès aux bases de données, API externes, sécurité.

IV Presentation Layer : API REST (Spring Boot) et Frontend (React).

Mon architecure possède actuellent quatres couches :
=> le Model(domain): Représentant les objets métiers purs, Ex : User, Account, Transaction... Aucune logique métier, seulement de la donnée.
=> le Repository(interface): Permet de manipuler les données, Ex: find, save, delete... Il gère la persistence de données, grâce à SpringData cette interface fait le lien entre mon code Java et la base de données.
=> le Service: Contient la logique métier, Ex: créer un compte, le créditer... AccountService(interface) AcountServiceImpl(implémentation)
=> le Infrastructure(Implementation technique) implémente les repository avec Spring Data JPA.

Dépendances:

Spring Web (API REST)

Spring Boot DevTools (rechargement à chaud)

Spring Security (authentification)

Spring Data JPA (persistance)

PostgreSQL Driver (ou un autre SGBD)

Lombok (réduction du code boilerplate)

Schématisation:

Voici le MCD de mon projet:

![The_Bank_Potable](https://github.com/user-attachments/assets/522b057e-c7d0-48fa-8164-623e0067f374)

