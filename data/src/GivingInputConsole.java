
import java.util.Scanner;


public class GivingInputConsole
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String value= sc.next();
        int count=0;
        for(int i=0;i<=value.length();i++)
        {
        count++;
    }
        System.out.println("the enter string digit count is"+count);
}}

