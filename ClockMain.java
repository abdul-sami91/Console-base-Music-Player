
/* 	Team members:  Abdul Sami(0098-BSCS-20) 
				   Saqib Hussain(0170-BSCS-20)     */

/* 	ClockMain class is used to play Alarm and run a Clock 
	Player class is used to play the songs according to user's choice*/
	
	
import java.util.Scanner;
import java.io.IOException;
public class ClockMain
{
public static void main(String args[]) throws Exception
{
int hour, mint,sec;
Scanner s=new Scanner(System.in);
System.out.print("enter hour: ");
hour=s.nextInt();
System.out.print("enter mintues: ");
mint=s.nextInt();
System.out.print("enter seconds: ");
sec=s.nextInt();

ClockB c=new ClockB(hour, mint, sec);

int i=0;

do{
	c.setAlarm(7,0);
	c.ClockDisplay();
	c.tick();
	i++;
	
	try
	{
		Thread.sleep(1000); 
	}
	catch(Throwable ex)
	{	
	}
	cls();
}while(i<=5);

}
public static void cls() 
 {
	try
	{
		new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}

 }  
}	

/* for (int i=0; i<=5; i++)
{
	c.setAlarm(7,00);
c.ClockDisplay();
Thread.sleep(1000); 
c.tick();

 cls();
}
}
*/
 

