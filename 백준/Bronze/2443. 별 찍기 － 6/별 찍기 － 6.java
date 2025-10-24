import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		long a;
		
		a = sc.nextInt();
		
		for(int i=1; i<=a; i++) {
			
			for(int j=1; j<=i-1; j++) {
				System.out.print(" ");
			}
			
			for(int k=1; k<=2*a-(2*i-1); k++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		

	}

}