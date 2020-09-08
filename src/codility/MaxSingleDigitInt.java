package codility;

public class MaxSingleDigitInt {
	
    public int solution(int[] A) {
        // write your code in Java SE 8
    	int max = -10;
    	boolean initial = false;
    	for (int i : A) {
    		if (i > -10 && i < 10 ) {
    			if (initial == false) {
    				initial = true;
    				max = i;
    			} else if (i > max) {
    				max = i;
    			}
    			if (max == 9) {
    				break;
    			}
    		}
    	} 
    	
    	return max;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
