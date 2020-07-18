package exo1;

public class Cercle {
    private int rayon;
    public Cercle(){}
    public Cercle(int rayon){
        if(rayon<0) throw new IllegalArgumentException("le nombre est negative ");
        this.rayon= rayon;
        System.out.println("le constructeur a ete cree");
    }
    public  int getRayon(){
        return rayon;
    }
    public int setRayon(int rayon ){
        if(rayon<0) throw new IllegalArgumentException("le nombre est negative ");
       return this.rayon= rayon;
    }
    public double diametre(){
         return 2*this.rayon;
    }
    public double perimetre(){
        //return 2*this.rayon*Math.PI;
       return Math.floor(2*this.rayon*Math.PI * 100) / 100;
    }
    public double surface(){
        //return this.rayon*this.rayon*Math.PI;
        return Math.floor(this.rayon*this.rayon*Math.PI* 100) / 100;
    }
}
