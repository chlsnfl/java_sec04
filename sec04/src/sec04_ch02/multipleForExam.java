package sec04_ch02;

public class multipleForExam {

	public static void main(String[] args) {
		for(int m = 2; m <= 99; m++) {
			System.out.println("*** " + m + "단 ***");
			for(int n = 1; n <= 9; n++) {
				System.out.println(m + "X" + n + " = " + (m * n));
			}
		}

	}

}
