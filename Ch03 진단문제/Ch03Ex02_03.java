import java.util.Scanner;
public class Ch03Ex02_03 {
	public static void main(String [] args) {
	Scanner scan1 = new Scanner(System.in);
	int input1 = scan1.nextInt();
	int input2 = scan1.nextInt();

	System.out.printf("%d %d\n",++input1,input2--);
	System.out.printf("%d %d",input1,input2);
	
	}
}
