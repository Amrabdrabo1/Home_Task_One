package Tasks;

public class Task_two {
	
	    public static void main(String[] args) {
	        int nValues = 50;

	        GoToOuterLoop: for (int i = 2; i <= nValues; i++) {
	            
	            for (int j = 2; j <= Math.sqrt(i); j++) {
	                if (i % j == 0) {
	                    
	                    continue GoToOuterLoop;
	                }
	            }
	            System.out.println(i);
	        }
	    }
}
