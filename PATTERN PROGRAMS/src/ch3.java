public class ch3 {
    static void output(int k,int l)
    {
        int i,j,m = 0,z=0;
        //System.out.println("\t\t");
        for (i = 1; i <= (k/2)+1; i++)
        {
            for (m=i;m<=(k/2);m++)
            {
                System.out.print(" ");
            }
            for(j=1;j<=2*i-1;j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        for (i = 1; i <= (k/2); i++)
        {
            for(m=1;m<=i;m++)
            {
                System.out.print(" ");
            }
            for (j =l-2 ; j >=2* i-1; j--)
            {
                System.out.print("*");
            }
            z=z+2;
            System.out.print("\n");
        }
    }
}
