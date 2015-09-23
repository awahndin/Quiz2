import java.util.Scanner;

public class Tuition {
	
	
	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		System.out.println("initial tuition");
		int IT = Input.nextInt();
		System.out.println("Annual percent increase");
		float APR = Input.nextFloat();
		System.out.println("Loan Intrest Rate");
		float r = Input.nextFloat();
		System.out.println("months to payback Loan:");
		float n = Input.nextFloat();	
		
		//this needs to be turned into a for loop
		double t2, t3, t4, T;
		t2 = IT*APR;
		t3 =t2*APR;
		t4 =t3*APR;
		T = IT + t2 + t3 +t4;
		
		double monthlyPayment = T*(r*(1+r)^n)/((1+r)^n-1);
		
		
		System.out.println("your full tuition is:" + T);
		System.out.println("your monthly payment is:" + monthlyPayment);
	}
	
}
