package ranks;

import java.util.*;

public class BotSavesPrincess {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int botPositionX = scanner.nextInt();
		int botPositionY = scanner.nextInt();
		int princessX = -1; int princessY = -1;
		
		String[][] grid = new String[n][n];
		
		for (int i = 0; i < n; i++) {
			String currentPosition = scanner.next();
			for (int j = 0; j < n; j++) {
				grid[i][j] = currentPosition.charAt(j) + "";
				if (grid[i][j].equals("p")) {
					princessX = j;
					princessY = i;
				}
			}
		}
		
		scanner.close();
		
		int[] distances = new int[4];
		for (int i = 0; i < 4; i++)
			distances[i] = 999;
		
		if ((botPositionX - 1) >= 0) 
			distances[0] = manhattanDistance
					(botPositionX - 1, botPositionY, princessX, princessY);
		if ((botPositionX + 1) < n)
			distances[1] = manhattanDistance
					(botPositionX + 1, botPositionY, princessX, princessY);
		if ((botPositionY - 1) >= 0)
			distances[2] = manhattanDistance
					(botPositionX, botPositionY - 1, princessX, princessY);
		if ((botPositionY + 1) < n)
			distances[3] = manhattanDistance
					(botPositionX, botPositionY + 1, princessX, princessY);
		
		int[] tmp = distances;
		int min = Arrays.stream(tmp).min().getAsInt();
		
		if (min == distances[0])
			System.out.println("LEFT");
		else if (min == distances[1])
			System.out.println("RIGHT");
		else if (min == distances[2])
			System.out.println("UP");
		else
			System.out.println("DOWN");
		
	}
	
	public static int manhattanDistance(int x1, int y1, int x2, int y2) {
		return Math.abs(x1 - x2) + Math.abs(y1 - y2);
	}
}
