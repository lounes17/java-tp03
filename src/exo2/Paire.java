package exo2;

public class Paire {
    int a;
    int b;
    static int nbPaires;
    public Paire(){
        this.a=0;
        this.b=0;
        nbPaires++;
    }
    public Paire(int a, int b){
        this.a=a;
        this.b=b;
        nbPaires++;
    }

    public int max(){
        return (a>b)? this.a :this.b;
    }

    public boolean testant (){
        return ((a%b)==0) ?true:false;
    }
    public int pgcd () {
        int r,t;
        int c=this.a;
        int g=this.b;
        if ( g>c) {
            t = c;
            c = g;
            g = t;
        }
        do {
            r = c % g;
            c = g;
            g = r;
        } while(r !=0);
        return c ;
    }
    public int puissance (){

        return (int)Math.pow(this.a ,this.b);
    }
    public static int getNbPaires(){
        return nbPaires;
    }
}