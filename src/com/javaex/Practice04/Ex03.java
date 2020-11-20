package com.javaex.Practice04;

public class Ex03 {

	public static void main(String[] args) {
		int[] intA ={3,6,9};
		
		int[] intB;
		intB =intA; 
		intB[0] =20;
		intB[2] =10;
		//b의 경우에는 a의 주소를 가지고 온것이기 때문에 b의 값이 바뀐다면은
		//a의 값도 바뀌게 된다. 그러므로0번방은 20이고 2번방은10이다
		
		for (int i = 0; i < intA.length; i++) {
			System.out.println(intA[i]);
		}
	}

}
