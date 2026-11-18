import java.util.Scanner;
	public class TaskTwo{
	public static void main(String[] args){ 
	Scanner input = new Scanner(System.in); 
	
	
	System.out.println("Enter First Score: ");
	int Score1 = input.nextInt();
	
	
	System.out.println("Enter Second Score: ");
	int Score2 = input.nextInt();
	
	
	System.out.println("Enter Third Score: ");
	int Score3= input.nextInt();
	
	System.out.println("Enter Fourth Score: ");
	int Score4 = input.nextInt();
	
	System.out.println("Enter Fifth Score: ");
	int Score5 = input.nextInt();
	
	System.out.println("Enter sixth Score: ");
	int Score6 = input.nextInt();
	
	System.out.println("Enter Seventh Score: ");
	int Score7 = input.nextInt();
	
	System.out.println("Enter Eighth Score: ");
	int Score8 = input.nextInt();
	
	System.out.println("Enter Ninth Score: ");
	int Score9 = input.nextInt();
	
	System.out.println("Enter Tenth Score: ");
	int Score10 = input.nextInt();
	
	int Average = (Score1 + Score2 + Score3 + Score4 + Score5 + Score6 + Score7 + Score8 + Score9 + Score10) / 10;
	


System.out.println("The Average Score is: " + Average);
	
	}
}
	
