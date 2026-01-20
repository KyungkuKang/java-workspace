package ex03;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = 0;
		num = input.nextInt();
		if( num % 2 == 0 ) {
			System.out.println(num+" = 짝수");
		}
		if( num % 3 == 1 ) {
			System.out.println(num+" = 3의 배수가 아니다");
		}
		int num1 = 0, num2 = 0;
		num1 = input.nextInt();
		num2 = input.nextInt();
		System.out.print("num1 : "+num1+",");
		System.out.println("num2 : "+num2);
		String result = (num1 > num2) ? "num1이 num2보다크다" : "num2가 num1보다 크다";
			System.out.println(result);
	}
}
