package sec04_ch02;

public class Zusawi {

	public static void main(String[] args) {
		int i;
		for(i = 0; i < 10; i++) {
		double a = Math.random() * 6 + 1;
		int b = (int)a;
		if(b == 1) {
			System.out.println("1이 나왔어요!");
		}else if(b == 2) {
			System.out.println("2가 나왔어요!");
		}else if(b == 3) {
			System.out.println("3이 나왔어요!");
		}else if(b == 4) {
			System.out.println("4가 나왔어요!");
		}else if(b == 5) {
			System.out.println("5가 나왔어요!");
		}else{
			System.out.println("6이 나왔어요!");
		}
		
	}
			
		
		
		

	}

}
