import java.util.Scanner;

public class Ch03Ex03_01 {
	public static void main(String [] args) {
		Scanner scan1 = new Scanner(System.in);  //같은 라인에 입력할 수 있게 더블형으로 
		double input1 = scan1.nextDouble();		 //입력문 선언 
		double input2 = scan1.nextDouble();		
	
		System.out.printf("%d ",(int)(input1*input2)); //값은 정수형으로 출력해야 하지만 출력예제를  보면 소수점까지 곱한 값이 나으므로 실수형을곱한다 정수형으로 변
		System.out.printf("%d",(int)input1*(int)input2); //정수형으로 바로 바꾼다음 곱하기때문에 형변환을 해줌

		

	}
}
