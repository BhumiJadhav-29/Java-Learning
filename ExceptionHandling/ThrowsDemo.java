package ExceptionHandling;

public class ThrowsDemo {
	public static void withdraw(int balance) throws Exception{
		if(balance<500) {
			throw new Exception("Insufficient Balance");
		}else {
			System.out.println("sufficient Balance");
		}
	}
	public static void main(String[]args) {
		
			try {
				withdraw(250);
			} catch (Exception e) {
				System.out.println(e.getMessage());
				
			}
		
		
	}
}
