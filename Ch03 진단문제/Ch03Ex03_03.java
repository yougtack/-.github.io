import java.util.Scanner;
public class Ch03Ex03_03 {
	public static void main(String [] args ) {
		Scanner scan1 = new Scanner(System.in);//같은 라인에 입력을3개 받기위한 입력문 선
		int input1 = scan1.nextInt();
		int input2 = scan1.nextInt();
		int input3 = scan1.nextInt();
		
		System.out.printf("%.1f",((double)input1+input2+input3)/3); //평균 구하는법 = a+b+c/3, 그냥 계산하면 정수형으로 계산되기 
																	//때문에 제어문자인 %f 와 맞지 않는다. 그러므로 3개의숫자 중에 
																	//하나를 실수형으로 바꿔줘야한다. 
		
	
	}

}
