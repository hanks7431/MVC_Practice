import java.util.Scanner;

public class GawibawiboMain {
    public static void main(String[] args) {
        GawibawiboModel model = new GawibawiboModel();
        GawibawiboView view = new GawibawiboView(model);
        GawibawiboController controller = new GawibawiboController(model, view);

        // 재게임 기능없이 단순 1회 실행하려면 바로 아래 코드 실행
        // controller.playGame();

        // 아래는 재게임할건지 확인을 추가함
        boolean playAgain = true;
        Scanner scanner = new Scanner(System.in);

        while (playAgain) { // 재게임 할건지 확인
            controller.playGame();

            System.out.print("게임을 다시 플레이하시겠습니까? (Y/N): ");
            String input = scanner.nextLine();
            playAgain = input.equalsIgnoreCase("Y");
        }

        System.out.println("게임을 종료합니다.");
        scanner.close();
    }
}