package asd;
class Data {int x;}
public class Day_2019_3_24_Ex2 {
	
	public static void main(String [] args) {
		
		Data d= new Data();
		d.x=10;
		System.out.printf("main():x = %d\n",d.x);
			
		Change(d);
		System.out.printf("After change(d.x)\n");
		System.out.printf("main():x = %d\n",d.x);
	}

	static void Change(Data d) {
		d.x=1000;
		System.out.printf("main():x = %d\n",d.x);
	}
}
