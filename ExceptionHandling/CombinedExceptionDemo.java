package ExceptionHandling;

public class CombinedExceptionDemo {
	public static void checkNumber(int num) throws Exception{
		if(num<0) {
			throw new Exception("Negative Number");
		}
			System.out.println("Positive Number");
		
	}
	public static void main(String[] args) {
		try {
			checkNumber(-5);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("Done");
		}
	}
}
