package com.bizcontrol;

import java.util.Random;

public class If_02 {
	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		int num1 = rnd.nextInt(100) + 1; 
		int num2 = rnd.nextInt(100) + 1;
		
		if(((num1 + num2) % 2) ==0) {
			System.out.printf("%d + %d = %d : ¦��\n",num1,num2,num1+num2);
		}
		
		if(((num1 + num2) % 2) ==0) {
			System.out.printf("%d - %d = %d : ¦��\n",num1,num2,num1-num2);
		}

		if(((num1 + num2) % 2) ==0) {
			System.out.printf("%d * %d = %d : ¦��\n",num1,num2,num1*num2);
		}

		if(((num1 + num2) % 2) ==0) {
			System.out.printf("%d / %d = %d : ¦��\n",num1,num2,num1/num2);
		}

		
		
	}

}
