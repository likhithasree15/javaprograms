package likitha;

	public class PyramidPattern {
		public static void main(String args[]) {
			int n,m,k;
			for(m = 1; m <= 7 ;m++) {
				for(n = 1; n <= 7 - m; n++) {
					System.out.print(" ");
				}
			
				for(k = 1; k <= m*2 - 1; k++) {
					System.out.print("*");
				}
				System.out.println();
			}
			for(m = 6; m >= 1 ; m--) {
				for(n = 7 - m; n >= 1; n--) {
					System.out.print(" ");
				}
			
				for(k = m*2 - 1; k >= 1; k--) {
					System.out.print("*");
				}
				System.out.println();
			}

		}
	}


