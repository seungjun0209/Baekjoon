import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		
		n = n*100;
		
		if(n<m) {
			System.out.println("No");
		}
		else {
			System.out.println("Yes");
		}

		
	}

}