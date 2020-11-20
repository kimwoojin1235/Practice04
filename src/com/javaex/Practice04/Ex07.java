package com.javaex.Practice04;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] wonArray = new int[10];
		int[] wonArray1 =new int[10];
		wonArray[0] = 50000;
		wonArray[1] = 10000;
		wonArray[2] = 5000;
		wonArray[3] = 1000;
		wonArray[4] = 500;
		wonArray[5] = 100;
		wonArray[6] = 50;
		wonArray[7] = 10;
		wonArray[8] = 5;
		wonArray[9] = 1;
		
		System.out.print("금액:");
		
		int mo =sc.nextInt();
		
		for(int i=0; i<wonArray.length; i++) {
			 wonArray1[i] = (int)(mo / wonArray[i]);
			 //입력한 값에서 wonArray을 나눈뒤wonArray1의 대입
			 int mon =wonArray1[i]*wonArray[i];
			 //wonArray1의 대입되어진 값과 wonArray의 [0]인 50000을 곱한뒤 mon의 대입
			mo -= mon;
			//그리고 mon의 대입된 값을 mo와 빼고 대입을 시킴
			
		}
		for(int i=0; i<wonArray1.length; i++) {
			System.out.println(wonArray[i]+ "원 : " +wonArray1[i]+ "개");
		}
		
	}

}
