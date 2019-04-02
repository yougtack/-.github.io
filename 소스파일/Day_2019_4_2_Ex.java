package asd;

class test{
	int num1=0;
	int num2=0;

	test(){}  // c1 
	
	test(int a, int b){  //c2
		num1=b;
		num2=a;
	}
}
public class Day_2019_4_2_Ex {
	public static void main(String [] args) {
		
		test c1 = new test();
		c1.num1=5;
		c1.num2=10;
		
		test c2 = new test(30, 60);
		
		System.out.printf("c1 = %d, %d\n", c1.num1, c1.num2);
		System.out.printf("c2 = %d, %d", c2.num1, c2.num2);
			
	}
}
