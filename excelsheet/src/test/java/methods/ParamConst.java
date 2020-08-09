package methods;

public class ParamConst {
	
	int wheels;
	
	ParamConst(int numberwheels) {
		
		wheels = numberwheels;
		
	}
	
	

	public static void main(String[] args) {
		
		ParamConst p1 = new ParamConst(4);
		System.out.println(p1.wheels);
		

	}

}
