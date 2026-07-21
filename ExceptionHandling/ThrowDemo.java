package ExceptionHandling;

public class ThrowDemo {
public static void main(String[]args) {
	int marks = 30;
	try {
		
		if(marks<35){
			throw new ArithmeticException("Failed");
		}else {
			System.out.println("Passed");
		}
	}catch(ArithmeticException e) {
		System.out.println(e.getMessage());
	}
	
}

}
