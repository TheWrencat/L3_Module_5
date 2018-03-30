package algorithms;

public class Fibonacci {

	public static void main(String[] args) {
		Fibonacci sequence = new Fibonacci();
		sequence.fib();
	}
	
	static void fib () {
		int a = 1;
		System.out.println(a);
		int b = 1;
		System.out.println(b);
		for(int i = 0; i<10; i++) {
		a = a+b;
		System.out.println(a);
		b = a+b;
		System.out.println(b);
		}
	}
}
