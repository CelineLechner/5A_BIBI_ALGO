
public class Fibonacci {
	
	public static long fibonacci(long number) {
		if ((number == 0) || (number == 1)) 
			return number;
		else
			
			return fibonacci(number - 1) + fibonacci(number - 2);
	}

	public static void main(String[] args) {
		for (int counter = 0; counter <= 50; counter++)
			System.out.printf("Fibonacci von %d ist: %d\n", counter, fibonacci(counter));
	}
}