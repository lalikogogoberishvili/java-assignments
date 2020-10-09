package com.company;

import java.util.Scanner;

public class C {
    int a,b,c;

    public void function_1 () {
        Scanner sc;
        sc= new Scanner(System.in);
        System.out.print("enter value of a: ");
        a=sc.nextInt();
        System.out.print("enter value of b: ");
        b=sc.nextInt();
        System.out.print("enter value of c: ");
        c=sc.nextInt();
    }

    public int function_2 () {
        return a%10;
    }

    public int function_3 () {
        while(b>=10){
            b=b/10;
        }
        return b;
    }

    public int function_4 () {
        int z=0;
        while (c>0) {
            int m=c%10;
            z=z+m;
            c=c/10;
        }
        return z;
    }

    public int function_5 () {
        return  (a%10)*b;
    }

    public int function_6 () {
        return b+((a%10)*b);
    }
}




