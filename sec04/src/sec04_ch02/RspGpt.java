package sec04_ch02;

import java.util.Random;
import java.util.Scanner;

public class RspGpt {

    private static final int ROCK = 1;
    private static final int SCISSORS = 2;
    private static final int PAPER = 3;
    private static final int EXIT = 4;

    private static final int[] PATTERN = {ROCK, PAPER, SCISSORS}; // 패턴 추가

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rd = new Random();
        boolean game = true;

        while (game) {
            System.out.println("가위바위보 게임을 시작합니다. \n다음 메뉴중 하나를 선택하세요.");
            System.out.println("|1.가위 |2.바위 |3.보| 4.끝");
            int user = scan.nextInt();

            if (user == EXIT) { // 게임 종료 추가
                System.out.println("게임을 종료합니다.");
                game = false;
                break; // 불필요한 코드 실행 방지
            }

            if (user < ROCK || user > PAPER) { // 예외 처리
                System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
                continue;
            }

            int com = generateComChoice(); // 패턴 기반 무작위 선택

            String result = compare(user, com);

            System.out.printf("컴퓨터 : %s\n\n", toWord(com));
            System.out.println(result);
        }
        scan.close();
    }

    private static int generateComChoice() { // 패턴 기반 무작위 선택 메서드 추가
        return PATTERN[new Random().nextInt(PATTERN.length)];
    }

    private static String compare(int user, int com) { // 가위바위보 승패 판단 메서드
        String result = "";
        if (user == com) {
            result = "비겼습니다.";
        } else if ((user == ROCK && com == SCISSORS) || (user == SCISSORS && com == PAPER) || (user == PAPER && com == ROCK)) {
            result = "이겼습니다!";
        } else {
            result = "졌습니다!";
        }
        return result;
    }

    private static String toWord(int choice) { // 숫자 선택을 문자열로 변경하는 메서드 추가
        String word = "";
        switch (choice) {
            case ROCK:
                word = "바위";
                break;
            case SCISSORS:
                word = "가위";
                break;
            case PAPER:
                word = "보";
                break;
        }
        return word;
    }
}