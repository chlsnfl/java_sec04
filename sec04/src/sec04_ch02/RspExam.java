package sec04_ch02;
import java.util.*;
public class RspExam {

	public static void main(String[] args) throws Exception{
		Scanner scan = new Scanner(System.in);
		Random rd = new Random();
		boolean game = true;
		
		while(game) {
			System.out.println("가위바위보 게임을 시작합니다. \n다음 메뉴중 하나를 선택하세요.");
			System.out.println("|1.가위 |2.바위 |3.보| 4.끝");
			int user = scan.nextInt();
			int com = rd.nextInt(3) + 1;
			
			if(user > 3) {
				System.out.println("게임을 종료합니다.");
				game = false;
			}else if(user < 1) {
				System.out.println("게임을 종료합니다.");
				game = false;
			}else {
				switch(user) {
				case 1:
					if(com == 1) {
						System.out.println("비겼습니다.");
					}else if(com == 2) {
						System.out.println("졌습니다.");
					}else {
						System.out.println("이겼습니다.");
					}
					System.out.println(com);
					break;
				case 2:
				
					if(com == 1) {
						System.out.println("이겼습니다.");
					}else if(com == 2) {
						System.out.println("비겼습니다.");
					}else {
						System.out.println("졌습니다.");
					}
					System.out.println(com);
					break;
				case 3:
				
					if(com == 1) {
						System.out.println("졌습니다.");
					}else if(com == 2) {
						System.out.println("이겼습니다.");
					}else {
						System.out.println("비겼습니다.");
					}
					System.out.println(com);
					break;
					
				}
			}
			
		}
	}

}
