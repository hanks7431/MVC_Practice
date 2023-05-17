public class GawibawiboController {
    private GawibawiboModel model;
    private GawibawiboView view;

    public GawibawiboController(GawibawiboModel model, GawibawiboView view) {
        this.model = model;
        this.view = view;
    }

    public void playGame() {
        view.startGame();
    }
}