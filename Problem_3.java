
import java.util.*;
class Problem_3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int a=sc.nextInt();
        int s=0;
        int n=0;
        if(a%2==0)
        {
            s=a-1;
        }
        else{
            s=a;
        }
        for(int i=0;i<s;i++)
        {
            
            int m=2*i+1;
            if(i==s-1)
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