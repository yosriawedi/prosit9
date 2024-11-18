import java.util.HashSet;
import java.util.TreeSet;

public class DepartementHashSet implements IDepartement<Departement> {
    private HashSet<Departement> departements;

    // Constructeur
    public DepartementHashSet() {
        this.departements = new HashSet<>();
    }

    // Ajouter un département
    @Override
    public void ajouterDepartement(Departement t) {
        if (departements.add(t)) {
            System.out.println("Département ajouté avec succès !");
        } else {
            System.out.println("Département déjà existant.");
        }
    }

    // Rechercher un département par nom
    @Override
    public boolean rechercherDepartement(String nom) {
        for (Departement d : departements) {
            if (d.getNom().equalsIgnoreCase(nom)) {
                return true;
            }
        }
        return false;
    }

    // Rechercher un département par objet
    @Override
    public boolean rechercherDepartement(Departement t) {
        return departements.contains(t);
    }

    // Supprimer un département
    @Override
    public void supprimerDepartement(Departement t) {
        if (departements.remove(t)) {
            System.out.println("Département supprimé avec succès !");
        } else {
            System.out.println("Département introuvable.");
        }
    }

    // Afficher les départements
    @Override
    public void displayDepartement() {
        if (departements.isEmpty()) {
            System.out.println("Aucun département à afficher.");
        } else {
            for (Departement d : departements) {
                System.out.println(d);
            }
        }
    }

    // Trier les départements par ID
    @Override
    public TreeSet<Departement> trierDepartementById() {
        TreeSet<Departement> sortedSet = new TreeSet<>((d1, d2) -> Integer.compare(d1.getId(), d2.getId()));
        sortedSet.addAll(departements);
        return sortedSet;
    }
}
