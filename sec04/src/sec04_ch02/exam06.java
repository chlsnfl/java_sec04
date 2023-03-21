package sec04_ch02;
import java.time.LocalTime;
public class exam06 {

	public static void main(String[] args) {
		LocalTime nowTime = LocalTime.now();
		int hour = nowTime.getHour();
		System.out.println(nowTime);
		
		switch(hour) {
		case 9:
			System.out.println("출근 시간입니다.");
			break;
		case 17:
			System.out.println("퇴근시간이 다 되어 갑니다.");
			break;
		case 18:
			System.out.println("퇴근 시간입니다.");
			break;
			default:
				System.out.println("그 외에는 관심 없다!");
		}

	}

}
