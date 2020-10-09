package com.company;

import java.util.Scanner;

public class A {
    static int x;
    A(){
        System.out.println("Hello");
    }
    public void function_1 () {
        Scanner sc;
        sc= new Scanner(System.in);
        System.out.print("enter value of x: ");
        x=sc.nextInt();
    }

    public int function_2 () {
        return x+12;
    }

    public void function_3 () {
        if (x%2==0) {
            System.out.println("x is even");
        }
        else {
            System.out.println("x is odd");
        }
    }
}
class B extends  A {
    int y;

    public void method_1 () {
        Scanner sc;
        sc= new Scanner(System.in);
        System.out.print("enter value of y: ");
        y=sc.nextInt();
    }

    public int method_2 () {
        return x+y;
    }


}