package Act5;

public class Act5_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		2. Write a Java method to compute the future investment value at a given interest rate for a specified number of years. 
//		Sample data (Monthly compounded) and Output:
//		Input the investment amount: 1000
//		Input the rate of interest: 10
//		Input number of years: 5 
		
		
		int years = 5;
		double roi = 10, investAmount = 1000;
		
		futureValue(years, roi, investAmount);
	}

		public static void futureValue(int years, double roi, double investAmount) {
			System.out.println("Years  FutureValue");
			for(int i = 1; i <= years; i++) {
				double futureValue = investAmount * Math.pow(1+(roi /100 /12), i*12);
				String futureValue1 = String.format("%.2f", futureValue );
				System.out.printf("%-7d %s %n", i, futureValue1);
				}
		}
	}
	
