package javaProjectsNew;

public class swaping {

	public static void main(String[] args) {
		int a=10 ;
		int b=20 ;

		System.out.println("the values before swaping is :"+a+" and "+b);
		/*a=a+b;
		b=a-b;
		a=a-b;
		a=a*b;
		b=a/b;
		a=a/b;
		a=a^b;
		b=a^b;
		a=a^b;*/
		b=(a+b)-(a=b);
		System.out.println("the values After swaping is  :"+a+" and "+b);
	}
}
