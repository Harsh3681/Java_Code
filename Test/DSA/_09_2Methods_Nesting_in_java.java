

class Nesting{
	int a, b;
	
	Nesting(int x, int y){
		a = x;
		b = y;
	}
	
	int larger() {
		if(a>b) {
			return a;
		}
		else {
			return b;
		}
	}
	
	void showLarge() {
		System.out.println("Larger value = "+ larger());		// Here We done an Nesting of the function larger<---
	}
}




public class _09_2Methods_Nesting_in_java {

	public static void main(String[] args) {
		Nesting n1 = new Nesting(8,55);
		n1.showLarge();

	}

}
