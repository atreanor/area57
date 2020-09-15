package codility;

import java.util.ArrayList;
import java.util.Arrays;

public class BattleShip {
	
	String[] shipCoords, bombCoords, ships, bombs;
	int N, hit, sunk;
	public BattleShip(int N, String S, String T) {
		this.shipCoords = S.split(",");
		this.bombCoords = T.split(",");
		this.N = N;
	}
	/**
	 * calculateCoordinates accepts an array of Strings containing coordinates of top left & top right, it parses this input
	 * to create an array of strings with specific coordinates for each point
	 * @param coordinates array of Strings with top left & top right coordinates
	 * @return newCoordinates array of Strings with specific coordinates for each point 
	 */
	public String[] calculateCoordinates(String[] coordinates) {
		String[] newCoordinates = new String[coordinates.length];
		int count = 0;
		for (String  coordinate : coordinates) {
			
    		int one = coordinate.charAt(0)-49;
    		int two = coordinate.charAt(1)-65;
    		int three = coordinate.charAt(3)-49;
    		int four = coordinate.charAt(4)-65;
    		
    		System.out.println(one + " " + two + " " + three + " " + four);
    		
    		if (one == three) {
    			for (int i=0; i<=four-two;i++) {
    				newCoordinates[count] += one + "" + i + " ";
    			}
    		} else if(two == four) {
    			for (int j=0; j<= three-one; j++) {
    				newCoordinates[count] += j + "" + two + " ";
    			}
    		} else if (one != three) { 
    			newCoordinates[count] = one + "" + two + " " + one + "" + four + " " + three + "" + two + " " + three + "" + four;
    		}
    		count++;
		}
		return newCoordinates;
	}
	
	
    public String applyBombsToShips(String[] ships, String[] bombs) {
    	String result;
    	
    	for (String ship : ships) {
    		int hitCapacity = (ship.length() / 2) - 1;
    		for (String bomb : bombs) {
    			String[] holder = bomb.split(" ");
    			int shipSunk = holder.length;
    			int totalHit = 0;
    			for (String hold : holder) {
    				if (ship.contains(hold)) {
    					hit++;
    					totalHit++;
    				}
    			}
    			if (totalHit == hitCapacity) {
    				sunk++;
    			}
    		}
    	}
    	result = hit + "," + sunk;
    	return "result";
    }
    	
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BattleShip test = new BattleShip(4, "1B 2C,2D 4D", "");

	}
	

}
