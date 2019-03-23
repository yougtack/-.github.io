package asd;

public class Day_2019_3_23 {
	public static void main(String [] args) {
		System.out.println("Card.width = "+ Card.width);
		System.out.println("Card.heigth = "+ Card.heigth);

		Card c1= new Card();
		c1.kind="Heart";
		c1.number=7;
		
		Card c2= new Card();
		c2.kind="Spade";	
		c2.number=4;            //인스턴스변수의 값을 변경한다.
		
		System.out.println("c1은"+c1.kind+","+c1.number+"이며, 크기는 ("+c1.width+","+c1.heigth+")");
		System.out.println("c2은"+c2.kind+","+c2.number+"이며, 크기는 ("+c2.width+","+c2.heigth+")");
		System.out.println("c1의 width와 heigth를 각각 50, 80로 변경합니다.");
		c1.width=50;	
		c1.heigth=80;			//클래스변수의 값을 변경한다. 
		
		System.out.println("c1은"+c1.kind+","+c1.number+"이며, 크기는 ("+c1.width+","+c1.heigth+")");
		System.out.println("c2은"+c2.kind+","+c2.number+"이며, 크기는 ("+c2.width+","+c2.heigth+")");	
	}
}

class Card{
	String kind;
	int number;
	static int width=100;
	static int heigth=250;
}
