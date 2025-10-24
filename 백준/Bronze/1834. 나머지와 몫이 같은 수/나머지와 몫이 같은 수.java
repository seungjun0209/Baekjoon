import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		long n;
		long sum = 0;
		
		n = sc.nextInt();
		
		for(int i=1;i<n;i++) {
			long a = n*i+i;
			sum = sum + a;
		}
		
		System.out.println(sum);
		

	}

}