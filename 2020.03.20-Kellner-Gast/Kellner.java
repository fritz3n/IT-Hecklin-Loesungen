

public class Kellner
{
    private Gast[] hans;
    
    public Kellner(){
        hans = new Gast[20];
        
        for(int i= 0; i < 20; i++){
            hans[i] = new Gast((int)(Math.random() * 9 + 1), Math.random() * 10);
        }
    }

    public void makeRechnung(){
        double total = 0;

        for(int i = 0; i < 20; i++){
            total += hans[i].getRech();
            System.out.println("Gast " + i + ": " + hans[i].getRech() + "€");
        }

        System.out.println("Insgesamt: " + total + "€");
    }
}
