package inherit;

public class D {
	
	private D () {
		
		
	}

	private static D obj = new D();
	
	public static D getInstance() {
		
		return obj;
	}
	
}
