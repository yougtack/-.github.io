import java.util.Scanner;

public class Ch03Ex01_04 {
	public static void main(String [] args) {
		Scanner scan1 = new Scanner(System.in);
		int input1 = scan1.nextInt();
		
		Scanner scan2 = new Scanner(System.in);
		int input2 = scan2.nextInt();
		
		System.out.println(input1==input2);
		System.out.println(!(input1==input2));
		
	}

}
