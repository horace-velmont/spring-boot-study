package basic.ch3;

public class BasicApp {
	public static void main(String[] args) {
		WorkService workService = new WorkService();
		WorkManager emploee = new Employee();
		WorkManager boss = new Boss();
		
		workService.setWorkManager(emploee);
		workService.askWork();
		
		workService.setWorkManager(boss);
		workService.askWork();
	}
}
