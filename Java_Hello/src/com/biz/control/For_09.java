package com.biz.control;

public class For_09 {
	
	public static void main(String[] args) {
		
		for(int i = 0 ; i < 5 ; i++) {
			System.out.println("* * * * *");
		}
		
		//��ø �ݺ���
		for(int i = 0 ; i < 5 ; i++) {
			System.out.println("i �ݺ� ����");
			for(int j = 0 ; j < 5 ; j++) {
				System.out.println("== j �ݺ� ����");
			}
		}
		
		for(int i = 0 ; i < 5 ; i++) {
			for(int j = 0 ; j < 5 ; j++) {
				System.out.print("* ");
			}
			System.out.println();
		} 
		System.out.println("===================");
			for(int i= 0 ; i < 5 ; i++) {
			for(int j = 0 ; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}