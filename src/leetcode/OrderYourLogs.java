package leetcode;

import java.util.Arrays;

public class OrderYourLogs {
	
    public String[] reorderLogFiles(String[] logs) {
        String[] newLogs = new String[logs.length];
        int start = 0;
        int end = logs.length-1;
        for (String log : logs) {
            String[] breakdown = log.split(" ");
            if (breakdown[1].chars().allMatch(Character::isDigit)) {
            	newLogs[end]=log;
            	end--;
            } else {
            	newLogs[start]=log;
            	start++;
            }
        }
        return newLogs;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] logs = {"digit1 2 3 4", "bob2 was here", "mark3 99 8 2", "alan4 333 443 4", "john2 test text"};
		OrderYourLogs now = new OrderYourLogs();
		String[] result = now.reorderLogFiles(logs);
		System.out.println("result :: " + Arrays.asList(result));
	}

}

