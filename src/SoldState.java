
public class SoldState implements State {
	
	GumballMachine gumballMachine;
	
	public SoldState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	public void insertQuarter() {
		System.out.println("Please wait, we're already giveing you a gumball");
		}

	@Override
	public void ejectQuarter() {
		System.out.println("Sorry, you already turned the crank");
		
	}

	@Override
	public void turnCrank() {
		System.out.println("Turning twice doesn't get yo another gumball!");
		
	}

	@Override
	public void dispense() {
		gumballMachine.releaseBall();
		if (gumballMachine.getCount() > 0) {
			gumballMachine.setState(gumballMachine.getNoQuarterState());
		} else {
			System.out.println("Oops, out gumballs!") ; 
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}

	}

}

