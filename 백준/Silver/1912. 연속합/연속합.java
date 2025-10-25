import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] numbers = new int[n];

		for (int i = 0; i < n; i++) {
			numbers[i] = sc.nextInt();
		}

		// DP 배열 선언
		int[] dp = new int[n];
		dp[0] = numbers[0]; // 첫 번째 원소는 자기 자신
		int max = dp[0]; // 최대값 초기화

		for (int i = 1; i < n; i++) {
			// 이전 합(dp[i-1])에 현재 값(numbers[i])을 더한 값과
			// 현재 값(numbers[i]) 중 더 큰 값을 dp[i]로 설정
			dp[i] = Math.max(numbers[i], dp[i - 1] + numbers[i]);

			// 최대값 갱신
			max = Math.max(max, dp[i]);
		}

		System.out.println(max);
	}

}