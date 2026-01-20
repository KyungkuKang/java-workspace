package ex03;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		if(num % 5 == 0) {
			System.out.println("5의 배수입니다.");
		}else {
			System.out.println("5의 배수가 아닙니다.");
		}
		int num1 = input.nextInt();
		if (num1 > 0 && num1 <100) {
			System.out.println("정상");
		}else {
			System.out.println("비정상");
		}
		int num2 = input.nextInt();
		if(num2 % 2 == 0 && num2 % 3 ==0) {
			System.out.println(num2);
		}
		/*
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		if(a<b) {
			int temp =a;
			a = b;
			b = temp;
		}
		if(a<c) {
			int temp =a;
			a = c;
			c = temp;
		}
		if(b<c) {
			int temp = b;
			b = c;
			c = temp;
		}
		System.out.println("가장 큰 수" + a);
		System.out.println("두번째 큰 수" + b);
		System.out.println("마지막 수" + c);
		*/
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int max = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
		int min = (a < b) ? ((a < c) ? a : c) : ((b < c) ? b : c);
		int mid = a + b + c - max - min;
		System.out.println("가장 큰 수"+ max);
		System.out.println("두번째 큰 수"+ mid);
		System.out.println("마지막 수"+ min);
	}
}
