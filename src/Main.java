public class Main {
    public static void main(String[] args) {
        // Création d'une société
        SocieteArrayList societe = new SocieteArrayList();

        // Ajout d'employés
        Employé employé1 = new Employé(1, "yosri", "awedi", "Informatique", 3);
        Employé employé2 = new Employé(2, "iheb", "bach", "Directeur", 2);
        societe.ajouterEmploye(employé1);
        societe.ajouterEmploye(employé2);

        // Affichage des employés
        System.out.println("Liste des employés : ");
        societe.displayEmploye();

        // Recherche d'un employé
        System.out.println("Recherche de l'employé 'Dupont' : " + societe.rechercherEmploye("Dupont"));

        // Trier les employés par ID
        societe.trierEmployeParId();
        System.out.println("Liste des employés triés par ID : ");
        societe.displayEmploye();

        // Trier les employés par nom, département et grade
        societe.trierEmployeParNomDepartementEtGrade();
        System.out.println("Liste des employés triés par nom, département et grade : ");
        societe.displayEmploye();

        // Suppression d'un employé
        societe.supprimerEmploye(employé1);
        System.out.println("Liste après suppression de 'Jean Dupont' : ");
        societe.displayEmploye();
    }
}
