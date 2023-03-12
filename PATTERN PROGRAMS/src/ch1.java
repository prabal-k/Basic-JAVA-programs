public class ch1 {
    static void output(int k,int l)
    {
        int i,j;
        for (i = 1; i <= k; i++)
        {
            for (j = l; j >= i; j--)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }
}
