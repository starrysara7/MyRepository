package ch12.exam03;

public class User2 extends Thread {
	private Calculator calculator;
	
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator; //store to field
		setName("User2");
	}

	@Override
	public void run() {
		calculator.setMemory(50);
	}

}
