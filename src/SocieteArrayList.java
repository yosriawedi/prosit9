import java.util.ArrayList;
import java.util.Comparator;

public class SocieteArrayList implements IGestion<Employé> {
    private ArrayList<Employé> employes;

    // Constructeur
    public SocieteArrayList() {
        this.employes = new ArrayList<>();
    }

    // Ajouter un employé
    @Override
    public void ajouterEmploye(Employé employe) {
        employes.add(employe);
    }

    // Rechercher un employé par nom
    @Override
    public boolean rechercherEmploye(String nom) {
        for (Employé employe : employes) {
            if (employe.getNom().equalsIgnoreCase(nom)) {
                return true;
            }
        }
        return false;
    }

    // Rechercher un employé par objet
    @Override
    public boolean rechercherEmploye(Employé employe) {
        return employes.contains(employe);
    }

    // Supprimer un employé
    @Override
    public void supprimerEmploye(Employé employe) {
        employes.remove(employe);
    }

    // Afficher les employés
    @Override
    public void displayEmploye() {
        for (Employé employe : employes) {
            System.out.println(employe);
        }
    }

    // Trier les employés par ID (Comparable)
    @Override
    public void trierEmployeParId() {
        employes.sort(Comparator.comparingInt(Employé::getId));
    }

    // Trier les employés par nom, département et grade (Comparator)
    @Override
    public void trierEmployeParNomDepartementEtGrade() {
        employes.sort(Comparator.comparing(Employé::getNom)
                .thenComparing(Employé::getDepartement)
                .thenComparingInt(Employé::getGrade));
    }
}
