package codility;


public class BattleShip {
	
	String[] shipCoords, bombCoords, ships, bombs;
	int N, hit, sunk;
	public BattleShip(int N, String S, String T) {
		this.shipCoords = S.split(",");
		this.bombCoords = T.split(",");
		this.N = N;
	}
	/*
	 * calculateCoordinates accepts an array of Strings containing coordinates of top left & top right, it parses this input
	 * to create an array of strings with specific coordinates for each point
	 */
	public String[] calculateCoordinates(String[] coordinates) {
		String[] newCoordinates = new String[coordinates.length];
		int count = 0;
		for (String  coordinate : coordinates) {
			
    		int one = coordinate.charAt(0)-49;
    		int two = coordinate.charAt(1)-65;
    		int three = coordinate.charAt(3)-49;
    		int four = coordinate.charAt(4)-65;

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
	
	/*
	 * applyBombsToShips accepts two arrays of coordinates, one for ships and one for bombs. The bomb coordinates are applied to the ship
	 * coordinates and the method returns a comma separated String of number of ships - hit, sunk.
	 */
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
    	return result;
    }
    	
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BattleShip test = new BattleShip(4, "1B 2C,2D 4D", "1B 2C, 2A 2D");
		test.ships = test.calculateCoordinates(test.shipCoords);
		test.bombs = test.calculateCoordinates(test.bombCoords);
		System.out.println(test.applyBombsToShips(test.ships, test.bombs));
		System.out.println("Game over............");

	}
	

}
