package SecondPackage;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.edge.EdgeDriver;

public class Implementation implements IncommingCall {

	public static void main(String[] args) {
		Implementation obj = new Implementation(); //Class obj = new Class();
		IncommingCall obj2 = new Implementation(); // Interface obj = new Class();
		
											SearchContext driver = new EdgeDriver();

	}

	@Override
	public void Accept() {
		
		System.out.println("Accepted successfully, Call is connected");
	}

	@Override
	public void Reject() {
		
		System.out.println("Reject the call successfully with a message");
	}

}
