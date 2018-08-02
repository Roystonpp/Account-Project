package AccountApp;
import org.json.JSONObject;


public class App {

	public static void main(String[] args) {
		
		HelloWorld.Print();
		
		Service s = new Service();
		AccountManagement r = new AccountManagement("Royston", "Pinnock",10);
		s.addAccount(r);
		//r.getaccountNumber();
		System.out.println(s.MaptoJson());

	}

}
