package com.javaex.Practice04;

public class Ex01 {

	public static void main(String[] args) {
		int[] intArray =new int[5];
		intArray[0] =3;
		intArray[1] =7;
		intArray[2] =12;
		int result = 0;
		for (int i = 0; i <=intArray.length; i++) {
			//크다가 아니라 이상으로 했다 즉 5가 없으므로 오류가남 
			result +=intArray[i];
		}
		System.out.println(result);
		
	}

}
