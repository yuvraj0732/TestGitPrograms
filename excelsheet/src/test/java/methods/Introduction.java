package methods;

public class Introduction {

	public static void main(String[] args) {

		int f = 10;
		int f2 = 12;
		char c = 'a';

		int result = max(f, f2) ;
		System.out.println(result);
		sayHi();

	}

	static int max(int a, int b) {

		return a > b ? a : b;

	}
	static float max(float a, float b) {

		return a > b ? a : b;

	}

	static void sayHi() {
		
		System.out.println("Hi");
	}

}
