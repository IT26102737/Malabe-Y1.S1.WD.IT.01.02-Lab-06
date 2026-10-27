import java.util.Scanner;
public class IT26102737Lab6Q2B{
	
	public static void main(String[] args){
	
		Scanner output = new Scanner(System.in);		
		
		int[] number = new int [11];
		
		int i = 0;
		
		while (i < 10){
			
			System.out.print("Enter the number " + (i+1) + ":");
			number[i] = output.nextInt();
			i++;
		}
		System.out.println("The numbers you enterd are :");
		
		i = 0;
		while(i < 10){
			System.out.print( number[i] + " ");
			i++;
		}
	}	
}		