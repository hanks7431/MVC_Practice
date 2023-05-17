import java.util.Scanner;

public class GawibawiboView {
    private GawibawiboModel model;
    private Scanner scanner;

    public GawibawiboView(GawibawiboModel model) {
        this.model = model;
        this.scanner = new Scanner(System.in);
    }

    public void startGame() {
        System.out.println("가위바위보 게임을 시작합니다.");
        System.out.println("가위, 바위, 보 중에서 선택하세요.");
        System.out.print("선택: ");
        String choice = scanner.nextLine();
        model.setPlayerChoice(choice);

        String computerChoice = model.getComputerChoice();
        System.out.println("컴퓨터의 선택: " + computerChoice);

        model.calculateResult();
        String result = model.getResult();
        System.out.println("결과: " + result);
    }
}
