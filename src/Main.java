
public class Main {
	public static void main(String[] args) {
		demonstration();
	}

	public static void demonstration() {
		OldCoffeeMachine oldCoffeeMachine = new OldCoffeeMachine();
		CoffeeTouchScreenAdapter adapter = new CoffeeTouchScreenAdapter(oldCoffeeMachine);

		adapter.chooseFirstSelection();
		adapter.chooseSecondSelection();
	}
}