package ExceptionHandling;

public class EligibilityDemo {
	 public static void main (String[]args) {

		try {
			int age = 15;
			if(age>=18) {
				System.out.println(" Eligible");
				
			}	
			throw new ArithmeticException("Not Eligible");
		}
		catch(ArithmeticException e){
			System.out.println("Not Eligible");
			
		}
		
			}
		
	}
	

