package main.java.com.stackroute.PE4;

import java.util.Scanner;

public class CountOccurences
{
    public static void main(String[] args)
    {
        String str;
        int count=0; int stringLength=0;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string : ");
        str=sc.nextLine();
        stringLength=str.length();
        System.out.println("Enter the character of which the occurences to be counted ");
        String ch=sc.nextLine();

        String s=str.replaceAll(ch,"");
        count=stringLength-s.length();
        System.out.println("Number of Occurences :"+  count);


    }
}
