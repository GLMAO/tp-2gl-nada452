[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/rGfOobSC)





>>>>>>>>>>>>>>>>>>EOC BELGHINI Nada Grp:RSD <<<<<<<<<<<<<<<<<<<<<<<<<<
 Principes Respectés
1. Principe de Responsabilité Unique (SRP)
Chaque classe possède une responsabilité claire et unique :

CoursBuilder : Seulement la construction d'objets Cours

GestionnaireEmploiDuTemps : Seulement la gestion des cours et des notifications

CoursDecorator et ses sous-classes : Seulement l'ajout de fonctionnalités spécifiques

Etudiant/Responsable : Seulement la réception des notifications

2. Principe Ouvert/Fermé (OCP)
Le système est extensible sans modification du code existant :

Nouveaux décorateurs : Possibilité d'ajouter CoursEnVisio, CoursIntensif sans modifier les classes existantes

Nouveaux observateurs : Ajout de Professeur, Administratif sans changer GestionnaireEmploiDuTemps

Nouvelles fonctionnalités : Extension via composition plutôt que modification

3. Principe de Ségrégation des Interfaces (ISP)
Les interfaces sont spécifiques et cohérentes :

ICours : Uniquement getDescription() et getDuree()

Observer : Uniquement update(String message)

Subject : Uniquement gestion du cycle de vie des observateurs

Aucune interface "grasse" ou surchargée

4. Principe d'Inversion des Dépendances (DIP)
 Dépendances basées sur des abstractions :

GestionnaireEmploiDuTemps dépend de Subject et Observer (interfaces)

CoursDecorator dépend de ICours (interface)

CoursBuilder construit des Cours concrets (seule exception justifiée)

Principes non respectés
1. Principe de Substitution de Liskov (LSP)
 Les décorateurs doivent pouvoir remplacer complètement ICours :
 Les décorateurs implémentent correctement ICours
 Aucun comportement inattendu identifié
