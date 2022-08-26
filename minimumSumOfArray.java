import java.util.*;
class minimumSumOfArray  
{
   public static void main(String args[])
   {
       Scanner in = new Scanner(System.in);
       int n = in.nextInt();
       int a[] = new int[n];
       int b[] = new int[n];
       int c[] = new int[n];
       int sum = 0;
       int temp;
       for(int i=0; i<n; i++)
       {
           a[i] = in.nextInt();
       }
       for(int i=0; i<n; i++)
       {
           b[i] = in.nextInt();
       }
       for(int i=0; i<n; i++)
       {
        for(int j=i+1; j<n; j++)
        {
            if(a[i]>a[j])
            {
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
       }
       for(int i=0; i<n; i++)
       {
        for(int j=i+1; j<n; j++)
        {
            if(b[i]<b[j])
            {
                temp = b[i];
                b[i] = b[j];
                b[j] = temp;
            }
        }
       }
       for(int i=0; i<n; i++)
       {
          c[i] = a[i]*b[i];
          sum = sum + c[i];
       }
       System.out.println();
       System.out.println(sum);
   }
}
