package com.javaex.Practice04;

public class Ex08 {

	public static void main(String[] args) {

			int[] lotto = new int[6];	
			for(int i=0; i<lotto.length; i++) {
				lotto[i] = (int)(Math.random()*45)+1;
				
				for (int j = 0; j < i; j++) {
					if(lotto[i]==lotto[j]) {//i와j가 같으면 들어감
						j--;
						break;
					}
				}
				
			}
			for(int i = 0; i < lotto.length; i++) {
				System.out.println(lotto[i] + " ");
			

	}

	}
}
