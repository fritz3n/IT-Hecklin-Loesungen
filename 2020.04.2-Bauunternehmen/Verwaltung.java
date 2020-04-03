
/**
 * Write a description of class Verwaltung here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Verwaltung
{
    public static void bauen1(){
        Siedlung siedlung = new Siedlung(10000, 100);
        siedlung.makeInventur();
    }

    public static void bauen2(){
        Siedlung modell1 = new Siedlung(10000, 100);
        Siedlung modell2 = new Siedlung(10000, 100);

        int wert1 = modell1.getGesamtWert();
        int wert2 = modell2.getGesamtWert();

        if(wert1 > wert2){
            modell1.makeInventur();
            System.out.println("Gewinn: " + (wert1 - wert2));
        }else{
            modell2.makeInventur();
            System.out.println("Gewinn: " + (wert2 - wert1));
        }
    }

    public static void bauen3(){
        Siedlung modell1 = new Siedlung(10000, 100);
        Siedlung modell2 = new Siedlung(10000, 100);
        Siedlung modell3 = new Siedlung(10000, 100);

        int wert1 = modell1.getGesamtWert();
        int wert2 = modell2.getGesamtWert();
        int wert3 = modell2.getGesamtWert();

        if(wert1 > wert2){
            if(wert1 > wert3){
                modell1.makeInventur();
            }else{
                modell3.makeInventur();
            }
        }else{
            if(wert2 > wert3){
                modell2.makeInventur();
            }else{
                modell3.makeInventur();
            }
        }
    }
}
