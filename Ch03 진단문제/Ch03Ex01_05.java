import java.util.Scanner;
public class Ch03Ex01_05 {
	public static void main(String [] args) {
		Scanner scan1 = new Scanner(System.in);
		int input1 = scan1.nextInt();
		
		Scanner scan2 = new Scanner(System.in);
		int input2 = scan2.nextInt();
		
		System.out.printf("%d>%d ---%b\n",input1,input2,input1>input2);
		System.out.printf("%d<%d ---%b\n",input1,input2,input1<input2);
		System.out.printf("%d>=%d ---%b\n",input1,input2,input1>=input2);
		System.out.printf("%d<=%d ---%b\n",input1,input2,input1<=input2);
		
		
		
	}
}
