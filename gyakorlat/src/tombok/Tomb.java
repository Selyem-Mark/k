package tombok;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Tomb
{
    public static void main(String[] args)
    {
        int[] tomb = new int[10];
        //tomb[0] = 5;
        Random rnd = new Random();
        //Arrays.fill(tomb,rnd.nextInt(20));
        //Arrays.fill(tomb , 5,7,rnd.nextInt(10));
        for (int i = 0; i < tomb.length; i++)
        {
            tomb[i] = rnd.nextInt(20);
        }
        for (int i = 0; i < tomb.length; i++)
        {
            System.out.print(tomb[i] + "\t");
        }
        System.out.println(tomb);
        System.out.println(Arrays.toString(tomb));

        int[] seged = new int[tomb.length];
        int[] rend = new int[tomb.length];
        int ind = 30;
        for (int i = 0;i < seged.length ; i++)
        {
            seged[i] = tomb[i];
        }
        for (int i = 0;i < seged.length ; i++)
        {
            int min = 21;
            for (int j = 0; j < seged.length ;j++)
            {
                if (seged[j] < min)
                {
                    min = seged[j];
                    ind = j;
                }
            }
            seged[ind] = 22;
            rend[i] = min;
            System.out.print(rend[i] + "\t");
        }

        Arrays.sort(tomb);

        System.out.println("Kérek egy számot:");
        Scanner sc = new Scanner(System.in);
        int be = sc.nextInt();
        System.out.println(Arrays.binarySearch(tomb, be)==-1?"Nincs benne":"Benne van");



    }
}
