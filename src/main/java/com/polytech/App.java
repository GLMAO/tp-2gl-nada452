package com.polytech;

import com.polytech.tp.*;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Exercice 1" );

        Cours cours = new CoursBuilder()
                .setMatiere("GL")
                .setEnseignant("Dr. Mazari")
                .setSalle("inf6")
                .build();
        System.out.println("cours cree :"+ cours.getDescription());
        System.out.println("Matière : " + cours.getMatiere());
        System.out.println("Enseignant : " + cours.getEnseignant());
        System.out.println( "Exercice 2" );

        GestionnaireEmploiDuTemps gestionnaire= new GestionnaireEmploiDuTemps();
        Etudiant etudiant1 = new Etudiant("E1");
        Etudiant etudiant2 = new Etudiant("E2");
        Responsable responsable = new Responsable("Mr. Mazri");
        gestionnaire.attach(etudiant1);
        gestionnaire.attach(etudiant2);
        gestionnaire.attach(responsable);
        System.out.println("\n--- Test ajout de cours ---");
        gestionnaire.ajouterCours(cours);

        System.out.println("\n--- Test modification de cours ---");
        gestionnaire.modifierCours(cours, "Changement de salle pour A205");

        System.out.println("\n--- Test changement général ---");
        gestionnaire.setChangement("Cours annulé pour cause d'une alerte");

        System.out.println("exercice 3");
        CoursEnLigne coursEnLigne = new CoursEnLigne(cours);
        System.out.println("Cours en ligne : " + coursEnLigne.getDescription());
        CoursEnAnglais coursEnAnglais = new CoursEnAnglais(cours);
        System.out.println("Cours en anglais : " + coursEnAnglais.getDescription());
        Magistral coursMagistral = new Magistral(cours);
        System.out.println("\n2. Cours magistral : " + coursMagistral.getDescription());
        CoursEnLigne coursEnLigneEtAnglais = new CoursEnLigne(new CoursEnAnglais(cours));
        System.out.println("Cours combiné : " + coursEnLigneEtAnglais.getDescription());

        gestionnaire.attach(new Etudiant("nada"));
        gestionnaire.ajouterCours(coursEnLigne);
        gestionnaire.ajouterCours(coursEnLigneEtAnglais);



    }

}
