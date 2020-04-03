
/**
 * Write a description of class Siedlung here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Siedlung
{
    private int anzahlBauplätze;
    private int wertProSqm;
    private Bauplatz[] häuser;

    public Siedlung(int fläche, int wertProSqm){
        anzahlBauplätze = 0;
        this.wertProSqm = wertProSqm;
        häuser = new Bauplatz[30];
        
        int genutzeFläche = 0;
        while(true){
            if(anzahlBauplätze == häuser.length){ 
                Bauplatz[] newHäuser = new Bauplatz[anzahlBauplätze + 10]; // Array um 10 Plätze wachsen lassen
                for(int i = 0; i < anzahlBauplätze; i++)
                    newHäuser[i] = häuser[i];
                häuser = newHäuser;
            }

            int länge = (int)(Math.random() * 11 + 20);
            int breite = (int)(Math.random() * 11 + 20);

            if(länge * breite + genutzeFläche > fläche)
                break;

            häuser[anzahlBauplätze++] = new Bauplatz(länge, breite, wertProSqm);

            genutzeFläche += häuser[anzahlBauplätze - 1].getGroesse();
        }
    }

    public void makeInventur(){
        int gesamtWert = 0;

        for(int i= 0; i < anzahlBauplätze; i++){
            int grundStückGrösse = häuser[i].getGroesse();
            int grundstückWert = häuser[i].getWert();
            int hausWert;

            if(grundStückGrösse < 550)
                hausWert = 90000;
            else if (grundStückGrösse < 700)
                hausWert = 150000;
            else 
                hausWert = 250000;

            int gesamt = grundstückWert + hausWert;
            gesamtWert += gesamt;
            
            System.out.println(i + ". BP: " + grundStückGrösse + " qm, GW: " + grundstückWert + " Euro, HW: " + hausWert + " Euro, Gesamt: " + gesamt);
        }

        System.out.println("Anzahl der Bauplätze: " + anzahlBauplätze);
        System.out.println("Gesamtwert der Siedlung: " + gesamtWert);
    }

    public int getGesamtWert(){
        int gesamtWert = 0;

        for(int i= 0; i < anzahlBauplätze; i++){
            int grundStückGrösse = häuser[i].getGroesse();
            int hausWert;

            if(grundStückGrösse < 550)
                hausWert = 90000;
            else if (grundStückGrösse < 700)
                hausWert = 150000;
            else 
                hausWert = 250000;

            gesamtWert += häuser[i].getWert() + hausWert;
        }
        return gesamtWert;
    }
}
