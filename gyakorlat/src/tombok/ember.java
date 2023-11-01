package tombok;

import java.util.Arrays;
import java.util.Scanner;

public class ember
{
    public static void main(String[] args)
    {
        //vezetéknév keresztnév anya neve szül. év

        Emberek[] adatok = new Emberek[2];
        Scanner be = new Scanner(System.in);
        for (int i = 0; i < 2; i++)
        {
            System.out.println("Vezeték név:");
            String vezet = be.nextLine(); //vezeteknev
            System.out.println("Kereszt neve:");
            String kereszt =be.nextLine(); //keresznev
            System.out.println("Anyja neve:");
            String anyja =be.nextLine(); //anyja neve
            System.out.println("Születési év:");
            int szul =be.nextInt(); // eletkora
            be.nextLine();
            System.out.println("Személy igazolvány szám:");
            String szem =be.nextLine(); // személy igazolvány
            adatok[i] = new Emberek(vezet,kereszt,anyja,szul,szem);
            adatok[i].setVezet("Dr. " + adatok[i].getVezet());
        }
        for (var ember: adatok)
        {
//           String[] resz = ember.split(",");
             System.out.println(ember.getVezet() + ", " + ember.getKereszt() + ", " + ember.getAnyja() + ", " + (2023 - ember.getSzulev()) + ", " + "[" + ember.getSzem() + "]");
        }
    }


}
class Emberek
{
    private String vezet;
    private String kereszt;
    private String anyja;
    private int szulev;
    private String szem;

    public String getVezet()
    {
        return this.vezet;
    }
    public String getKereszt()
    {
        return this.kereszt;
    }
    public String getAnyja()
    {
        return this.anyja;
    }
    public int getSzulev()
    {
        return this.szulev;
    }
    public String getSzem()
    {
        return this.szem;
    }

    public void setVezet(String vezet) {
        this.vezet = vezet;
    }

    public void setKereszt(String kereszt) {
        this.kereszt = kereszt;
    }

    public Emberek(String vezet, String kereszt, String anyja, int szulev, String szem)
    {
        this.vezet = vezet;
        this.kereszt = kereszt;
        this.anyja = anyja;
        this.szulev = szulev;
        this.szem = szem;

    }
}
