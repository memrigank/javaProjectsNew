package javaProjectsNew;

import java.util.Scanner;

public class reversenum {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.println("the given value is                :"+num);

//		int rev=0;
//		while(num!=0) {
//			rev = rev*10+num%10;
//			num=num/10;
//		}
//		System.out.println("the reverse of the given value is :"+rev);55
		
//		StringBuffer rev;
//		StringBuffer sb = new StringBuffer(String.valueOf(num));
//		rev = sb.reverse();
		
		StringBuilder sb = new StringBuilder();
		sb.append(num);
		StringBuilder rev = sb.reverse();
		System.out.println("the reverse of the given value is :"+rev);

	}
}
