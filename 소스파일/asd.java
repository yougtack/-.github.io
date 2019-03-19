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

			Tv t;
			t= new Tv();
			t.channel=7;
			t.channelDown();
			System.out.printf("현재 채널은 %d 입니다. ",t.channel);		
	}
}
