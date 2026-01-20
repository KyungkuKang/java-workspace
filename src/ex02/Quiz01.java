package ex02;

import java.util.Scanner;

public class Quiz01 {
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
}
