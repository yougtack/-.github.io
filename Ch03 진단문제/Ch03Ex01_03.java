import java.util.Scanner;
public class Ch03Ex01_03 {
	public static void main(String [] args) {
	Scanner scan1 = new Scanner(System.in);
	int input1 = scan1.nextInt();
	
	Scanner scan2 = new Scanner(System.in);
	int input2 = scan2.nextInt();
	
	int tmp = input1;
	++input1;
	
	System.out.printf("%d %d %d",input1,--input2,tmp*input2);	
	
	}
}
