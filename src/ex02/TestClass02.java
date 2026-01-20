package ex02;

import java.util.Scanner;

public class TestClass02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int k=0,e=0,m=0;
		int sum;
		sum = k + e + m;
		int num;
		String name;
		System.out.println("당신의 이름은 무엇입니까?");
		name = input.next();
		System.out.println(name+"님의 국어점수");
		k = input.nextInt();
		System.out.println(name+"님의 영어점수");
		e = input.nextInt();
		System.out.println(name+"님의 수학점수");
		m = input.nextInt();
		
		System.out.println("================");
		System.out.println("이름 : "+name);
		System.out.println("================");
		System.out.println("국어 : "+k);
		System.out.println("영어 : "+e);
		System.out.println("수학 : "+m);
		System.out.println("================");
		System.out.println("합계 : "+(k+e+m));
		System.out.println("================");
	}
	public static void main02(String[] args) {
		//System.out.println("실행?");
		char ch = 0;
		double dou = 0;
		String str = null;

		int number = 0;
		
		int k=0,e=0,m=0;
		System.out.println(k);
		int sum;
		sum = k + e + m;
		System.out.println("합 : " + sum);
	}
	public static void main01(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		String name;
		System.out.println("이름 입력 : ");
		name = input.next();
		
		System.out.print("수 입력 : ");
		num = input.nextInt();
		
		System.out.println("이름 : " + name);
		System.out.println("수 : " + num);
	}
}
