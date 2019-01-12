import java.util.Scanner;

public class Ch03Ex01_06 {
	public static void main(String [] args) {
		Scanner scan1 = new Scanner(System.in);
		int input1 = scan1.nextInt();
		
		Scanner scan2 = new Scanner(System.in);
		int input2 = scan2.nextInt();
		
		boolean a= input1 == 0;
		boolean b= input2 == 0;
		
		System.out.printf("%b %b",a && b, a || b);
	}


}
