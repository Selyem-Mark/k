package tombok;

public class ketdimenzios
{
    public static void main(String[] args)
    {
        final int sor = 5;
        final int oszl = 5;
        int[][] ketd = new int[sor][oszl];
        for (int i = 0; i< oszl;i++)
        {
            for (int j = 0; j < sor; j++)
            {
                if (i >= j)
                {
                    ketd[i][j] = 1;
                }
                else
                {
                    ketd[i][j] = 0;
                }
            }
        }
        for (int i = 0; i< oszl;i++)
        {
            for (int j = 0; j < sor; j++)
            {
                System.out.print(ketd[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
