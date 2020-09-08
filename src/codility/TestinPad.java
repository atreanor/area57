package codility;

public class TestinPad {

	public static void main(String[] args) {
		int K = 5;
		int[] A = {1,1,1,2,3,4,5};
        int n = A.length;
        for (int i = 0; i < n - 1; i++) {
        	System.out.println(A[i] + 1);
        	System.out.println(A[i + 1]);
            if (A[i] + 1 < A[i + 1])
                System.out.println("false");
        }
        if (A[0] != 1 && A[n - 1] != K)
            System.out.println("false");
        else
            System.out.println("true");
    }

}
