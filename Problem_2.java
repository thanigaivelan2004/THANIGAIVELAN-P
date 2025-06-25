
import java.util.*;
class Problem_2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int a=sc.nextInt();
        int n=0;
        for(int i=0;i<a;i++)
        {
            int m=2*i+1;
            if(i==a-1)
            {
                System.out.print(m);
            }
            else
            {
                System.out.print(m+", ");
            }
        
        }
    }
    
}