package main.java.com.stackroute.PE4;

import java.util.Scanner;

public class ReverseCharacters
{
    public static void main(String[] args)
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str=sc.nextLine();
        String[] strArr=str.split(" ");
        System.out.println("\n");

        for(int i=0;i<strArr.length;i++)
        {
            System.out.print(reverse(strArr[i])+  " ");
        }


    }

    private static String reverse(String s)
    {
        String st="";
        for(int i=(s.length()-1);i>=0;i--)
        {
            st=st+s.charAt(i);
        }

        return st;
    }
}
