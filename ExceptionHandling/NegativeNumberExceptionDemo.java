package ExceptionHandling;

public class NegativeNumberExceptionDemo {
public static void main(String[]args) {
	try {
	int num=-5;
	if(num<0) {
		throw new ArithmeticException ("Negetive Numbers not Allowed");
	}
	System.out.println("Number is valid");
	}
catch(ArithmeticException e){
	 System.out.println(e.getMessage());
}
}
}