package pattern;

public class pattern6 {

	

	public static void main(String[] args) {
		
		int n=5;
	    int p = 0;
		
		for(int i=1; i<=n; i++, p+=2) {
			
			for(int j=1; j<=i; j++) {
				
				System.out.print(p + " ");
			}
			System.out.println();
		}
	}
}
