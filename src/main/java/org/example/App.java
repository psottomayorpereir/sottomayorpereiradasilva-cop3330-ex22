package org.example;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner sc= new Scanner(System.in);
        int n1=0, n2=0, n3=0, largest=0;
        System.out.print("Enter the first number: ");
        n1=sc.nextInt();
        System.out.print("Enter the second number: ");
        n2=sc.nextInt();
        System.out.print("Enter the third number: ");
        n3=sc.nextInt();

        if(n1==n2 || n1==n3 || n2==n3){
            System.out.print("Exiting the program...");
        }
        else{
            largest=n1;
            if(n1>n2 && n1>n3){
                largest=n1;
            }
            else if(n2>n3){
                largest=n2;
            }
            else{
                largest=n3;
            }
            System.out.printf("The largest number is %d.", largest);
        }
    }
}