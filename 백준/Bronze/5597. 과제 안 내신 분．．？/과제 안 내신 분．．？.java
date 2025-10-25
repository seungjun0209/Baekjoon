import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] homework = new int[30];
		
		for(int i=0; i<homework.length; i++) {
			homework[i] = 0;
		}
		
		for (int j=1; j<=28; j++) {
			int num = sc.nextInt();
			
			homework[num-1] = 1;
		}
		
		for (int k=1; k<=homework.length; k++) {
			
			if(homework[k-1]==0) {
				System.out.println(k);
			}
			
		}
		
	}

}