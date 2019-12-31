package basic.ch3;

public class Employee implements WorkManager {
	@Override
	public String doIt() {
		return "do work";
	}
}
