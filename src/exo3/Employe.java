package exo3;

public class Employe {
    private String nom;
    private int numero;
    private String prenom;
    private double salaireDeBase;
    private static int nbresEmploye;
    public Employe(){}

    public Employe(int numero, String nom,String prenom, double salaireDeBase)
    {
        this.numero=numero;
        this.nom=nom;
        this.prenom=prenom;
        this.salaireDeBase = salaireDeBase;
        nbresEmploye++;

    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setSalaireDeBase(double salaireDeBase) {
        this.salaireDeBase = salaireDeBase;
    }

    public int getNumero() {
        return numero;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public double getSalaireDeBase() {
        return salaireDeBase;
    }

    public String afficher (){
        return this.nom+" "+this.prenom+" son numero est "+this.numero+" sont salaire de base est "+this.salaireDeBase;
    }

    public static int getNbresEmploye(){
        return nbresEmploye;
    }
}
