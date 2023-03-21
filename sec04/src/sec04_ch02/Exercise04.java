package sec04_ch02;

public class Exercise04 {

	public static void main(String[] args) {
		boolean run = true;

		
		while(run) {
		int a = (int)(Math.random() * 6) + 1;
		int b = (int)(Math.random() * 6) + 1;
		System.out.println("("+ a + "," + b + ")");
		int c = a + b;
			if(c == 5) {
				run = false;
			}
			System.out.println("주사위 합은" + c);
		}

	}

}
