package main.java.com.stackroute.PE4;

import java.util.Scanner;

public class StringReplace
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string :");
        String str=sc.nextLine();
        str=str.replaceAll("d","f");
        str=str.replaceAll("l","t");
        System.out.println(str);

    }
}
