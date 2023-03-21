package sec04_ch02;
import java.util.*;
public class Money {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("직책을 입력하세요.");
		String inputData = scan.nextLine();
		switch(inputData) {
		case "부장" :
			System.out.println("600만원!");
			break;
		case "과장" :
			System.out.println("400만원!");
			break;
		default : 
			System.out.println("800만원!");
			break;
		
		}
		

	}

}
