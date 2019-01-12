import java.util.Scanner;
public class Ch03Ex02_04 {
	public static void main(String [] args) {
		Scanner scan1 = new Scanner(System.in);
		int input1 = scan1.nextInt();
		int input2 = scan1.nextInt();
		
		Scanner scan2 = new Scanner(System.in);
		int input3 = scan2.nextInt();
		int input4 = scan2.nextInt();
		
		boolean a= input1>input3 && input2>input4;
		System.out.println((a==true) ? 1 : 0);
		
	}

}
