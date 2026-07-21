package ExceptionHandling;

public class WithdrawDemo {
	public static void divide(int a, int b) throws ArithmeticException{
		
		 System.out.println(a/b);
	}
	public static void main(String[]args) {
		try {
			divide(20, 0);
			
		}catch(ArithmeticException e) {
			System.out.println("Cannot Devide by zero");
		}
	}
}
