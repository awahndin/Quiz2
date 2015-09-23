import java.util.Scanner;
import org.apache.poi.ss.formula.functions.FinanceLib;

public class Tuition {
	
	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		System.out.println("initial tuition");
		double IT = Input.nextDouble();
		System.out.println("Annual percent increase");
		float APR = Input.nextFloat();
		System.out.println("Loan Intrest Rate");
		float r = Input.nextFloat();
		System.out.println("months to payback Loan:");
		float n = Input.nextFloat();	
		Input.close();
		

		double t2, t3, t4, T;
		t2 = IT*(APR+1);
		t3 = t2*(APR+1);
		t4 =t3*(APR+1);
		T = IT + t2 + t3 + t4;
		System.out.println("your full tuition is:" + T);
		
		double X= 0;
		boolean B =false;
		double PMT = FinanceLib.pmt(r,n,T,X,B);
		
		System.out.println("your monthly payment is:" + (-1)*PMT/12);
	}
	
}
