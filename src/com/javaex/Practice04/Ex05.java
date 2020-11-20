package com.javaex.Practice04;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("");
		int[] num = new int[5];
		for (int i = 0; i < num.length; i++) {
			num [i] = sc.nextInt();
			sum+=num[i];
		}
		{
			System.out.println("평균은"+sum/num.length+"입니다.");
		}
	}

}
