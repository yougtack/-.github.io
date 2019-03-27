package asd;
	public class Day_2019_3_27_Ex {
		public static void main(String [] args) {
			MyMath3 mm =new MyMath3();
			System.out.printf("mm.add(3, 3) 결과:%d\n",mm.add(3,3));     //매개변수로 int 3, int 3 를 넣음  
			System.out.printf("mm.add(3L, 3) 결과:%d\n",mm.add(3L,3));	//매게변수로 long 3, int 3 를 넣음 
			System.out.printf("mm.add(3, 3L) 결과:%d\n",mm.add(3,3L));	//매게변수로 int 3, long  를 넣음
			System.out.printf("mm.add(3L, 3L) 결과:%d\n",mm.add(3L,3L)); //매게변수로 long 3, long 3 를 넣음 
			
			int [] a = {100, 200, 300};
			System.out.printf("mm.add(a) 결과:%d",mm.add(a)); 			//매게변수로 int[] a = {100,200,300} 를 넣음 
		}
}
class MyMath3{
	int add(int a, int b) {
		System.out.printf("int add(int a, int b) - ");
		return a+b;
	}
	
	long add(int a,long b) {
		System.out.printf("int add(int a, long b) - ");
		return a+b;
	}
	
	long add(long a,int b) {
		System.out.printf("int add(long a, int b) - ");
		return a+b;
	}
	
	long add(long a,long b) {
		System.out.printf("int add(long a, long b) - ");
		return a+b;
	}
	
	long add(int[] a) {
		System.out.printf("int add(int[] a) - ");
		int result=0;
		for(int i=0;i<a.length;i++) {
			result+=a[i];
		}
		return result;
	}
}