package ranks;

import java.util.*;

public class CompareTriplets {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = 3;
		int[] a = new int[n];
		int[] b = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = scanner.nextInt();
		for (int i = 0; i < n; i++)
			b[i] = scanner.nextInt();
		int[] c = new int[2];
		for (int i = 0; i < n; i++) {
			if (a[i] == b[i])
				continue;
			if (a[i] > b[i])
				c[0]++;
			else
				c[1]++;
		}
		
		System.out.println(c[0] + " " + c[1]);
	}
}
