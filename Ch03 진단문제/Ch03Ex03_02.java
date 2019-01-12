import java.util.Scanner;
public class Ch03Ex03_02 {
public static void main(String []args ) {
	Scanner scan1 = new Scanner(System.in); //같은 라인에 정수형으로 입력 받기 위한 입력문 선언
	int input1 = scan1.nextInt(); 
	int input2 = scan1.nextInt();
	
	System.out.printf("%d ",input1/input2);	//input1와input2를 나눈 값을 알기위해 /(나누기연산자)사용
	System.out.printf("%.2f",(double)input1/input2);//input1의 값을 실수형으로 변환한다음 input2와 나누기를 하면 3.6666666~ 이 나온다. 근데 문제에서 
													//소수점 2째짜리 까지 출력을 원하니 .2f를 해서 둘째 짜리 까지 출력해준다.
	
	}
}
