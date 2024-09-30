# Application de Formulaire Android

Il s'agit d'une application Android simple qui démontre l'utilisation des entrées de formulaire et la navigation entre les activités. L'application permet de collecter des informations utilisateur telles que le nom, l'email, le téléphone, l'adresse et la ville, puis affiche ces informations sur un autre écran.

## Fonctionnalités

- **Entrées de formulaire :** Les utilisateurs peuvent entrer leur nom, email, numéro de téléphone, adresse et sélectionner leur ville à partir d'une liste déroulante (Spinner).
- **Passage de données entre activités :** Les données du formulaire sont transmises de `MainActivity` à `MainActivity2` à l'aide d'un `Intent`.
- **Support Edge-to-Edge :** L'application utilise `EdgeToEdge` pour offrir une expérience utilisateur bord à bord.
- **Barre d'outils personnalisée :** Chaque activité comporte une barre d'outils personnalisée avec un titre.

## Écrans

### MainActivity (Écran de Formulaire)

Cette activité contient un formulaire où l'utilisateur peut saisir :
- Nom complet
- Email
- Numéro de téléphone
- Adresse
- Ville (Spinner)

Lorsque l'utilisateur appuie sur le bouton "Envoyer", l'application navigue vers la deuxième activité et affiche les informations saisies.

### MainActivity2 (Écran d'Affichage)

Cette activité reçoit les données transmises depuis `MainActivity` et les affiche sous forme de texte :
- Nom
- Email
- Téléphone
- Adresse
- Ville
