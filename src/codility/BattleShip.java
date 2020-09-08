package codility;

import java.util.Arrays;

public class BattleShip {
	
    public String solution(int N, String S, String T) {
        // write your code in Java SE 8
    	char[][] board = new char[N][N];
    	String[] ships = S.split(",");
    	String[] bombs = T.split(",");
    	int[][] shipCoord = new int[ships.length][4];
    	for (int i=0; i<ships.length; i++) {
    		String hold = ships[i];

    		shipCoord[i][0] = hold.charAt(0)-49;
    		shipCoord[i][1] = hold.charAt(1)-65;
    		shipCoord[i][2] = hold.charAt(3)-49;
    		shipCoord[i][3] = hold.charAt(4)-65;
    		System.out.println(Arrays.deepToString(shipCoord));
    		for (int[] ship : shipCoord) {
    			
    		}
    	}
    	return "Game over!";
    }
    	
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BattleShip test = new BattleShip();
		test.solution(4, "1B 2C,2D 4D", "");
	}
	

}
