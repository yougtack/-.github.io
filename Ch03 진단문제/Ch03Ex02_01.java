import java.util.Scanner;
public class Ch03Ex02_01 {
	public static void main(String [] args) {
		Scanner scan1 = new Scanner(System.in);
		int input1 = scan1.nextInt();
		int input2 = scan1.nextInt();
		
		System.out.printf("%d/%d =%d...%d",input1,input2,input1/input2,input1%input2);
	}
}
