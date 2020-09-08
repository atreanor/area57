package coderbyte;

import java.util.*; 
import java.io.*;

class Main {

  public static String MissingDigit(String str) {
    // declare variables
	char operator;
	int num1, num2, num3, result;
    int whereIsX = 0;
    int myIndex = 0;
    
    // split string to parse elements
    String [] elements = str.split(" ");
    
    // cast operator string element to char
    operator = elements[1].charAt(0);
    
    // iterate over list to find x, then iterate over string to find index of x
    for (int y=0; y < elements.length; y+=2) {
    	if (!elements[y].contains("x")) {
    		continue;
    	}
    	whereIsX = y;	
    	for (int i=0; i < elements[y].length(); i++){
    		if (elements[y].charAt(i) == 'x') {
    			myIndex = i;
    		}
    	}
    }
    
    // perform calculation
    if (whereIsX == 0) {
    	num2 = Integer.parseInt(elements[2]);
    	num3 = Integer.parseInt(elements[4]);
    	if (operator == '+') {
    		result = num3 - num2;
    	} else if (operator == '-') {
    		result = num2 + num3;
    	} else if (operator == '*') {
    		result = num3 / num2;
    	} else {
    		result = num2 * num3;
    	}
    } else if (whereIsX == 2) {
    	num1 = Integer.parseInt(elements[0]);
    	num3 = Integer.parseInt(elements[4]);
    	if (operator == '+') {
    		result = num3 - num1;
    	} else if (operator == '-') {
    		result = num1 + num3;
    	} else if (operator == '*') {
    		result = num3 / num1;
    	} else {
    		result = num1 / num3;
    	}
    } else {
    	num1 = Integer.parseInt(elements[0]);
    	num2 = Integer.parseInt(elements[2]);
    	if (operator == '+') {
    		result = num1 + num2;
    	} else if (operator == '-') {
    		result = num1 - num2;
    	} else if (operator == '*') {
    		result = num1 * num2;
    	} else {
    		result = num1 / num2;
    	}
    }
    
    // cast result from int to string, 
    String stringResult = Integer.toString(result);
    String myStr = Character.toString(stringResult.charAt(myIndex));
    
    return str;
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(MissingDigit(s.nextLine())); 
  }

}
