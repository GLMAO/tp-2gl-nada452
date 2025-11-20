package com.polytech;

import com.polytech.tp.Cours;
import com.polytech.tp.CoursBuilder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Cours cours = new CoursBuilder()
                .setMatiere("Mathématiques")
                .setEnseignant("Dr. Mazari")
                .setSalle("inf6")
                .build();
        System.out.println("cours cree :"+ cours.getDescription());
        System.out.println("Matière : " + cours.getMatiere());
        System.out.println("Enseignant : " + cours.getEnseignant());

    }

}
