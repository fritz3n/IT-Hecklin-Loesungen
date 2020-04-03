public class Wiese
{
    private Baum[] Bäume = new Baum[20];

    public Wiese(){
        for(int i = 0; i < 20; i++)
            Bäume[i] = new Baum(30 + (int)(Math.random() * 20));
        
    }

    public void inventur(){
        int total = 0;
        for(int i = 0; i < 20; i++){
            total += Bäume[i].getAnz();
            System.out.println("Baum" + i + ": " + Bäume[i].getAnz() + " Äpfel");
        }

        System.out.println("Insgesamt: " + total + " Äpfel");
    }
}