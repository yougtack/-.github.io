package asd;
class MyMath2{	
	long a,b;
		
	long add() {return a+b;}
	long sub() {return a-b;}	
	long mul() {return a*b;}
	double divide() {return a/b;}
		
	static long add(int a,int b) {return a+b;}
	static long sub(int a,int b) {return a-b;}
	static long mul(int a,int b) {return a*b;}
	static double divide(int a,int b) {return a/b;}
}

public class Day_2019_3_24_Ex3 {
	public static void main(String[] args) {
		System.out.println(MyMath2.add (200L,100L));
		System.out.println(MyMath2.sum(200L,100L));
		System.out.println(MyMath2.mul(200L,100L));
		System.out.println(MyMath2.divide(200.0,100.0));
		
		MyMath2 mm = new MyMath2();
		mm.a=200L;
		mm.b=100L;
		
		System.out.println(mm.add());
		System.out.println(mm.sub());
		System.out.println(mm.mul());
		System.out.println(mm.divide());
	}
}
