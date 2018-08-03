package AccountApp;
import org.json.JSONObject;


public class App {

	public static void main(String[] args) {
		
		HelloWorld.Print();
		
		Service s = new Service();
		AccountManagement r = new AccountManagement("Royston", "Pinnock",10);
		AccountManagement t = new AccountManagement("Chi", "Zhang",20);

		s.addAccount(r); 
		s.addAccount(t);

		//r.getaccountNumber();
		System.out.println(s.MaptoJson());
		
		s.Itername(""); 

	}

}
