package oops;

public class Navdeep extends Ajay{
	
	@Override
	public void speed() {
		System.out.println("60kmph");
	}
	
	public static void main(String[] args) {
		Navdeep n = new Navdeep();
		n.speed();
		
		Ajay a = new Ajay();
		a.speed();
	}

}
