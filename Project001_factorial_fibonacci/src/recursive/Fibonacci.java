package recursive;

public class Fibonacci {
	public static void main(String[] args) {
		// teste do programa. Imprime os 30 primeiros termos 
		for (int i = 0; i < 30; i++) {
			System.out.print("(" + i + "):" + Fibonacci.fibo(i) + "\n"); 
		}
	}
	
	
	static long fibo(int n) {
		if (n < 2) { 
			return n; 
		} else { 
			return fibo(n - 1) + fibo(n - 2); 
		} 
	}
}
