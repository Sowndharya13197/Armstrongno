import java.io.*;
import java.util.Scanner;
public class Armstrong {
    public static void main(String args[])
    {
        int n,count=1,ss=1,m;
        double sum=0;
        String str;
        Scanner s=new Scanner(System.in);
        str=s.nextLine();
        int n1=Integer.parseInt(str);
        char p[]=str.toCharArray();
        
        for(int i=0;i<str.length();i++)
        {
            n=Character.getNumericValue(p[i]);
              double st=Math.pow(n,str.length());
              sum=sum+st;
             
               
                  }System.out.println(sum);
                if(sum==n1)
                {
                    System.out.println("armstrong");
                }else
                {System.out.println("no");
                }
    }
    
}
