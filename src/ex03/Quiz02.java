package ex03;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		/*
		int num1 = 0, num2 = 0, num3 = 0, num4 = 0, num5 = 0, num6 = 0;
		num1 = input.nextInt();
		if(num1 % 3 == 0) {
			System.out.println(num1+"은 3의배수");
		}
		if( num1 < 100 ) {
			System.out.println("100보다 작은값");
		}else if( num1 > 80 ) {
			System.out.println("80보다 큰값");
		}else {
			System.out.println("그 외의 값");
		}
		num2 = input.nextInt();
		num3 = input.nextInt();
		String result = ( num2 > num3 ) ? num2 + ""
		        : num3 + "";
		System.out.println(result);

		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int max = (a > b) ? a : b;
		max = (max > c) ? max : c;
		System.out.println(max);
		
		int f = input.nextInt();
		int g = input.nextInt();
		
		int max1 = (f > g) ? f : g;
		if (max1 % 2 == 0) {
			System.out.println(max1);
		}
		*/
		int ab = input.nextInt();
		int bc = input.nextInt();
		int sum = ab + bc;
		if (sum % 2 == 0 && sum % 3 == 0) {
			System.out.println(sum);
		}
	}
}
