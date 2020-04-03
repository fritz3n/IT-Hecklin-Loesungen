
public class Gast
{
    private int anzahl;
    private double preis;

    public Gast(int anzahl, double preis){
        this.anzahl = anzahl;
        this.preis = preis;
    }

    public double getRech(){
        return anzahl * preis;
    }
}
