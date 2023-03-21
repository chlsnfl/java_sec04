package sec04_ch02;

public class ForEachExam {

	
	public static void main(String[] args) {
		String[] numbers = {"one", "two", "three"};
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		for(String num: numbers) {
			System.out.println(num);
		}
		
		

	}

}
