import java.util.Scanner;
public class Ch03Ex03_04 {
	public static void main(String [] args){
			Scanner scan1 = new Scanner(System.in);//실수형인 입력문 3개를 같은 라인에 입력할 수 있게 선언 해주었다.
			double input1 = scan1.nextDouble();
			double input2 = scan1.nextDouble();
			double input3 = scan1.nextDouble();
			
			System.out.printf("sum %d\navg %d",(int)(input1+input2+input3),(int)(input1+input2+input3)/3);
			//프린트를 두번쓰기 싫어서 프린트하나에다가 썻다. 우리에게 보이는 큰따음표 사이에 제어문자인\n을 사용하여 라인을 하나 띄었다.
			//그리고 문제 읽어보면 '실수의 평균을 구한뒤 정수부분만 출력하는'보고 더하기랑 평균구하는 것 먼저 실수형으로 다 한다음에 마지막에 정수형으로 바꿔주면 되는구나!
			//라는 생각이 들었다.
	}

}
