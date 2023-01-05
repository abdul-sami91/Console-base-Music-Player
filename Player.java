import java.util.*;
public class Player

{
	
	public static void main(String strgs[])
	{
		MusicOrganizer mu = new MusicOrganizer();
		
		int choice;
		System.out.println("To play first song enter number 1...");
		System.out.println("To play 2nd song enter number 2...");
		System.out.println("To play Third song enter number 3...");
		
		System.out.println("----------------------------------------------");
		
		System.out.println("Enter any number...");
		
		Scanner s = new Scanner(System.in);
		choice = s.nextInt();
		
		
		
		if(choice==1)
		{
			System.out.println("Playing Song...");
			mu.playTrack(0);
		}
		
		else if(choice==2)
		{
			System.out.println("Playing Song...");
			mu.playTrack(1);
		}
		else if(choice==3)
		{
			System.out.println("Playing Song...");
			mu.playTrack(2);
		}
		
		else if(choice>3)
		{
			System.out.println("Invalid number!!");
		}
	}
	
}
