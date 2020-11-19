package com.javaex.Practice04;

public class Ex06 {

	public static void main(String[] args) {
		char c[] = {'T','h','i','s',' ','i','s',' ','p','e','n','c','i','l'};


		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]);
			if (c[i]==' ') {
				c[i] =',';
			}
		}
			System.out.println("");
			for(int x=0; x<c.length; x++) {
				
				System.out.print(c[x]);
				
			}
			System.out.println("");
			
		}
	}


