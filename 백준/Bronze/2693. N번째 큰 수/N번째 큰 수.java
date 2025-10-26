import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			
			Integer[] test = new Integer[10];
			
			for(int j=0; j<test.length; j++) {
				test[j] = sc.nextInt();
			}
			
			Arrays.sort(test, Collections.reverseOrder());
			
			System.out.println(test[2]);
		}
		
		
	}

}