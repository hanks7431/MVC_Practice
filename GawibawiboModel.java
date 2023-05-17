import java.util.Random;

public class GawibawiboModel {
    private String playerChoice;
    private String computerChoice;
    private String result;

    public void setPlayerChoice(String choice) {
        this.playerChoice = choice;
    }

    public String getComputerChoice() {
        String[] choices = {"가위", "바위", "보"};
        Random random = new Random();
        this.computerChoice = choices[random.nextInt(choices.length)];
        return this.computerChoice;
    }

    public void calculateResult() {
        if (this.playerChoice.equals(this.computerChoice)) {
            this.result = "비겼습니다!";
        } else if ((this.playerChoice.equals("가위") && this.computerChoice.equals("보"))
                || (this.playerChoice.equals("바위") && this.computerChoice.equals("가위"))
                || (this.playerChoice.equals("보") && this.computerChoice.equals("바위"))) {
            this.result = "이겼습니다!";
        } else {
            this.result = "졌습니다!";
        }
    }

    public String getResult() {
        return this.result;
    }
}
