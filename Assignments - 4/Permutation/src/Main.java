public class Main
{
    public static void main(String[] args)
    {
        int arr[]={5,0,1,2,3,4};
        int arr2[]= calc(arr);
        System.out.println("\nOutput\n");
        for(int i=0;i<arr2.length;i++)
        {
            System.out.print(+arr2[i]+" ");
        }

    }
    static int[] calc(int[] arr)
    {
        int i;
        int length=arr.length;
        int arr2[]=new int[length];
        for(i=0;i<length;i++)
        {
            int z=arr[i];
            arr2[i]=arr[z];
        }
        return arr2;
    }
}