package com.company;

import javax.annotation.processing.SupportedSourceVersion;
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
//	C obj_1 = new C();
//	obj_1.function_1();
//	System.out.println(obj_1.function_2());
//	System.out.println(obj_1.function_3());
//	System.out.println(obj_1.function_4());
//	System.out.println(obj_1.function_5());
//	System.out.println(obj_1.function_6());
//
//	///////////////////////////////////////////////////////////////////2///////////////////////////////////////////////////////////////////////////////////
//
//	A obj_2 = new A();
//	obj_2.function_1();
//	System.out.println(obj_2.function_2());
//	obj_2.function_3();
//
//	B obj_3 = new B();
//	obj_3.method_1();
//	System.out.println(obj_3.method_2());


///////////////////////////////////////////////////////////////////////3/////////////////////////////////////////////////////////////////////////////////////

		int  a,b;
		Scanner sc;
		sc=new Scanner(System.in);
		System.out.print("Enter value of a: ");
		a= sc.nextInt();
		System.out.print("Enter value of b: ");
		b=sc.nextInt();

		rndRange(a,b);
    }


	public static void rndRange(int start, int finish){
		Random rand = new Random();
		int evenNum=0;
		int oddNum=0;

		for(int i=0;i<40;i++){
			if(start<finish) {
				int rndint = rand.nextInt(finish + 1 - start) + start;
				System.out.println(rndint);
				if(rndint%2==0){
					evenNum++;
				}
				else{
					oddNum++;
				}

			}
			else if(start>finish){
				int rndint = rand.nextInt(start + 1 - finish) + finish;
				System.out.println(rndint);
				if(rndint%2==0){
					evenNum++;
				}
				else{
					oddNum++;
				}
			}


		}
		System.out.println(evenNum + " even numbers");
		System.out.println(oddNum + " odd numbers");
		System.out.println(evenNum+oddNum);
		for(int x=0;x<5;x++) {
			if (evenNum < oddNum) {
				int oddzz = rand.nextInt(oddNum + 1 - evenNum) + evenNum;
				System.out.println(oddzz);
			} else if (evenNum > oddNum) {
				int evenzz = rand.nextInt(evenNum + 1 - oddNum) + oddNum;
				System.out.println(evenzz);
			}
		}
	}



}


