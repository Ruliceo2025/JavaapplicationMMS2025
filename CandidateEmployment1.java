import java.util.Scanner;

public class CandidateEmployment1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter Full Name: ");
		String fullName = Scan.nextln();
		
		System.out.print("Enter English Score: ");
		int English = Scan.nextln();
		
		System.out.print("Enter Maths Score: ");
		int Maths = Scan.nextln();
		
		System.out.print("Enter ICT Score: ");
		int ICT = Scan.nextln();
		
		double average = (English + Maths + ICT)/3;
		
		if (English > 75 && Average >= 80){
			System.out.println("Employment GRANTED");
		} 
		else {
			System.out.println("Employment REJECTED");
		}
	}
}