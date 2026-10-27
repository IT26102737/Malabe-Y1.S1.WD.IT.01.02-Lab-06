import java.util.Scanner;
public class IT26102737Lab6Q2C{
	
	public static void main(String[] args){
	
		Scanner output = new Scanner(System.in);		
		
		int[] number = new int [11];
		
		int i = 0;
		int sum = 0;
		double average = 0;
		
		while (i < 10){
			
			System.out.print("Enter the number " + (i+1) + ":");
			number[i] = output.nextInt();
			i++;
			
		}
		System.out.println("The numbers you enterd are :");
		
		i = 0;
		while(i < 10){
			System.out.println( number[i] + " ");
			sum = sum + number[i];
			i++;
			
		}
		
		average = sum / 10;
		System.out.println("Sum of the numbers : " + sum);
		System.out.println("Average of the numbers : " + average);
	
	}	
}		