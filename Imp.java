package SecondPackage;

public class Imp extends ATM {

	public static void main(String[] args) {
	
		Imp obj = new Imp();
		obj.deposite();
		obj.Withdraw();
	}

	@Override
	public void Withdraw() {
		System.out.println("Amount is withdrawn Successfully");	
	}

	@Override
	public void deposite() {
		System.out.println("Amount is deposited Successfully");	
	}

}
