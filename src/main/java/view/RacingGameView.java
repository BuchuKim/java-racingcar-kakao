package view;

import java.util.List;
import java.util.Scanner;

public class RacingGameView {
    private final Scanner sc = new Scanner(System.in);

    public String getCarNameInput() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        return sc.nextLine();
    }

    public int getNumberInput() {
        System.out.println("시도할 회수는 몇 회인가요?");
        return sc.nextInt();
    }

    public void printResultMessage() {
        System.out.println("실행 결과");
    }

    public void printCarResult(String carName, int carPosition) {
        System.out.println(carName + " : " + "-".repeat(carPosition));
        System.out.println();
    }

    public void printWinnerMessage(List<String> winnerNames) {
        System.out.println(
            String.join(", ", winnerNames)
            + "가 최종 우승했습니다.");
    }

    public void printErrorMessage(String message) {
        System.out.println("[ERROR]: " + message);
    }
}
