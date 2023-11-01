package sakk;

public class sakk
{
    public static void main(String[] args)
    {
        String[][] figura = new String[8][8];
        System.out.println("    A   B   C   D   E   F   G   H");
        for (int i = 0; i < 8; i++)
        {
            System.out.println("  +---+---+---+---+---+---+---+---+");
            System.out.println(i+1 + " |   |   |   |   |   |   |   |   | " + i+1);
        }
        System.out.println("    A   B   C   D   E   F   G   H");
    }
}
