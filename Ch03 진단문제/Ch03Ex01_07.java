import java.util.Scanner;

public class Ch03Ex01_07 {	
	public static void main(String [] args) {
	Scanner scan1 = new Scanner(System.in);
	int input1 = scan1.nextInt();
	
	Scanner scan2 = new Scanner(System.in);
	int input2 = scan2.nextInt();
	
	Scanner scan3 = new Scanner(System.in);
	int input3 = scan3.nextInt();
	
	System.out.printf("%b\t",input1>=input2 && input2>=input3);
	System.out.printf("%b",input1==input2 && input2==input3);	
	}

}
