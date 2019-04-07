package asd;

class Car{
	String color;
	String gear;
	int door;
	
	Car(){
		this("white", "auto", 4);
	}
	Car(Car c){   //인스턴스 복사를 위한 생성
		color=c.color;
		gear=c.gear;
		door=c.door;
	}
	Car(String color,String gear,int door){
		this.color=color;
		this.gear=gear;
		this.door=door;
	}
}
public class Day_2019_4_7_Ex {
	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car(c1);
				
		System.out.printf("c1의 color=%s, gear=%s, door=%d\n",c1.color,c1.gear,c1.door);
		System.out.printf("c2의 color=%s, gear=%s, door=%d\n",c2.color,c2.gear,c2.door);
	
		System.out.println();
		
		c1.color="red";
		c2.color="blue";
		System.out.printf("c1의 color=%s, gear=%s, door=%d\n",c1.color,c1.gear,c1.door);
		System.out.printf("c2의 color=%s, gear=%s, door=%d",c2.color,c2.gear,c2.door);
		
	}

}
