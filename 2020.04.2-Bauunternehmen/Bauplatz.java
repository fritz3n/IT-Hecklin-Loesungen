
/**
 * Write a description of class Bauplatz here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bauplatz
{
    private int länge;
    private int breite;
    private int wertProSqm;

    public Bauplatz(int länge, int breite, int wertProSqm) {
        this.länge = länge;
        this.breite = breite;
        this.wertProSqm = wertProSqm;
    }

    public int getWert(){
        return getGroesse() * wertProSqm;
    }
    public int getGroesse(){
        return länge * breite;
    }
}
