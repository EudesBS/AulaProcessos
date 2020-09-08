package view;
import controller.ProcessosController;

public class Principal {
	public static void main(String[] args) throws Exception {
		
//		ProcessosController op = new ProcessosController();
//		String os = op.os();
//		System.out.println(os);
		
		ProcessosController procController = new ProcessosController();
		
//		String process = "//usr//bin//libreoffice";
		
//		procController.callProcess(process);
		
//		String process = "ps aux";
//		String process = "ifconfig";
//		procController.readProcess(process);
		
		String param = "bash";
		procController.killProcess(param);
	}
}
