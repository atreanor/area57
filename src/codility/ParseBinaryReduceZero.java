package codility;

public class ParseBinaryReduceZero {
	public int solution(String S) {
		int operations = 0;
		String binStr = S;
		int len = binStr.length();
		long decimal = 0L;
		int power = 0;
		// convert binary to decimal
        for (int i = (binStr.length()-1); i > -1; i--) {
            if (binStr.charAt(i)=='1'){
            	decimal += (Math.pow(2,  (len - i - 1)));
            	//decimal += (Math.pow(2, i));
            }
        }
		/*
		 * for (int i = binStr.length()-1; i >= 0; i--) { decimal = (long)(decimal +
		 * (binStr.charAt(i) - 48) * ((Math.pow(2, power))));
		 * System.out.println("Incremental decimal : " + decimal); power++; }
		 */
		System.out.println("Final decimal : " + decimal);
		// calculate number of operations to reduce to zero
		while (true) {
			operations++;
			if (decimal % 2 != 0) {
				decimal -= 1;
			} else {
				decimal /= 2;
			}
			if (decimal < 1) {
				break;
			}
		}
		System.out.println("Operations : " + operations);
		return operations;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "1111111111111111111111111111111";
		ParseBinaryReduceZero alan = new ParseBinaryReduceZero();
		alan.solution(a);
		

	}

}
