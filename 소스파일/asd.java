package asd;
import java.util.Scanner;
public class asd {
	public static void main(String[] args) {
	class Tv{
		String color;
		boolean power;
		int channel;
		
		void power() {power=!power;}
		void channelUp() {channel++;}
		void channelDown() {channel--;}
	}

			Tv t;//Tv클래스 타입의 참조 변수를 t의 선언한다.
			t= new Tv();//new에 의해 Tv클래스의 인스턴스가 메모리의 빈공간 생성된다.
			t.channel=7;
			t.channelDown();
			System.out.printf("현재 채널은 %d 입니다. ",t.channel);		
	}
}
