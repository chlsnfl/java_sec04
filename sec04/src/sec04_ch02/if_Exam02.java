package sec04_ch02;
import java.util.*;
public class if_Exam02 {

	public static void main(String[] args) {
		Scanner score = new Scanner(System.in);
		System.out.println("점수를 입력하세요.");
		int num = score.nextInt();
		if(num >= 90) {
			System.out.println("A");
		}else if(num >= 80 & num < 90) {
			System.out.println("B");
		}else if(num >= 70 & num <80) {
			System.out.println("C");
		}else if(num >= 60 & num < 70) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}

	}

}
