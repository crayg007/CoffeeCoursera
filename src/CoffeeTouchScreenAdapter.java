
public class CoffeeTouchScreenAdapter implements CoffeeMachineInterface {

	private OldCoffeeMachine machine;
	
	public CoffeeTouchScreenAdapter(OldCoffeeMachine machine) {
		// TODO Auto-generated constructor stub
		this.machine = machine;
	}
	
	@Override
	public void chooseFirstSelection() {
		// TODO Auto-generated method stub
		machine.selectA();
	}

	@Override
	public void chooseSecondSelection() {
		// TODO Auto-generated method stub
		machine.selectB();
	}

}