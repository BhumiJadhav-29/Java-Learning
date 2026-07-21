package ExceptionHandling;

public class CatchBlockDemo {
public static void main(String[]args) {
	try {
		int[] arr = {10, 20, 30};

		int a = 10 / 0;

		System.out.println(arr[5]);
	}catch(ArithmeticException e){
				
		System.out.println("Invalid");
	}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("not found");
	}
}
}
