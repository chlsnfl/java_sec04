package sec04_ch02;

public class exam05 {

	public static void main(String[] args) {
		double a = Math.random() * 5 + 8;
		int b = (int)a;
		System.out.println(b);
		switch(b) {
		case 8 : System.out.println("출근을 합니다.");
		break;
		case 9 : System.out.println("회의를 합니다.");
		break;
		case 10 : System.out.println("업무를 봅니다.");
		break;
		default : System.out.println("외근을 나갑니다.");
		
		}

	}

}
