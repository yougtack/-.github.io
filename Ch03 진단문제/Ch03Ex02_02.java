import java.util.Scanner;
public class Ch03Ex02_02 {
	public static void main(String [] args) {
	Scanner scan1 = new Scanner(System.in);
	int input1 = scan1.nextInt();
	int input2 = scan1.nextInt();
	
	System.out.printf("width = %d\n",(int)input1+5);
	System.out.printf("length =%d\n",input2*2);
	System.out.printf("area = %d ",(input1+5)*(input2*2));
	
	}
}
