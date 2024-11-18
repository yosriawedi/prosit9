import java.util.TreeSet;
public class Main {
    public static void main(String[] args) {
        DepartementHashSet gestionDepartements = new DepartementHashSet();

        Departement dep1 = new Departement(1, "Informatique", 58);
        Departement dep2 = new Departement(2, "Finance", 23);
        Departement dep3 = new Departement(3, "Télécom", 12);

        // Ajouter des départements
        gestionDepartements.ajouterDepartement(dep1);
        gestionDepartements.ajouterDepartement(dep2);
        gestionDepartements.ajouterDepartement(dep3);

        // Afficher les départements
        System.out.println("Liste des départements :");
        gestionDepartements.displayDepartement();

        // Rechercher un département par nom
        System.out.println("Recherche par nom : Informatique -> " +
                gestionDepartements.rechercherDepartement("Informatique"));

        // Supprimer un département
        gestionDepartements.supprimerDepartement(dep2);

        // Afficher les départements après suppression
        System.out.println("Liste après suppression :");
        gestionDepartements.displayDepartement();

        // Trier les départements par ID
        System.out.println("Départements triés par ID :");
        TreeSet<Departement> sortedDepartements = gestionDepartements.trierDepartementById();
        for (Departement d : sortedDepartements) {
            System.out.println(d);
        }



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
