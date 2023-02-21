package pattern;

public class pattern7 {

	public static void main(String[] args) {
		
		int n=5;
		int p=1;
		
		for(int i=1; i<=n; i++, p++) {
			
			for(int j=1; j<=i; j++) {
				
				System.out.print(p + " ");
			}
			System.out.println();
		}
	}
}
