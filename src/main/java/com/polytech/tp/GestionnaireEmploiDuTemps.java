package com.polytech.tp;

import java.util.ArrayList;
import java.util.List;

public class GestionnaireEmploiDuTemps  implements Subject{
    private List<ICours> listeCours = new ArrayList<>();
    private List<Observer> observers = new ArrayList<>();


    public void ajouterCours(ICours cours) {
        this.listeCours.add(cours);
        System.out.println("Nouveau cours ajouté : " + cours.getDescription());
        // TODO: C'est ici qu'il faudrait notifier les étudiants (Observer pattern)
        notifyObservers("nv cours ajouté:" +cours.getDescription());
    }

    public void modifierCours(ICours cours, String message) {
        // Logique de modification...
        System.out.println("Cours modifié : " + message);
        // TODO: Notifier les observateurs ici aussi
        notifyObservers("cours modifie:"+ message);

    }

    public void setChangement(String message) {
        // TODO Auto-generated method stub
        notifyObservers("changement dans l'emploi du temps :"+ message);
    }
    public void attach( Observer o){
        observers.add(o);
    }
    public void detach(Observer o) {
        observers.remove(o);
    }
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

}