public class ClockB
{
String time;
DigitB hour;
DigitB mintues;
DigitB seconds;

DigitB Alarmhour;
DigitB Alarmmin;
DigitB Alarmsec; 

 MusicOrganizer music = new MusicOrganizer();


  public ClockB()
  { 
	  hour=new DigitB(24); 
	  mintues=new DigitB(60);
	  seconds=new DigitB(60); 
	  
	  time=hour.display()+":"+mintues.display()+ ":" +seconds.display();
	  
	  Alarmhour=new DigitB(24); 
	  Alarmmin=new DigitB(60);
	  Alarmsec=new DigitB(60);
  }
 


 public ClockB(int h, int m, int s)
{
	hour=new DigitB(24);	
	mintues=new DigitB(60);
	seconds=new DigitB(60);
	setTime(h,m,s);
	time=hour.display()+":"+mintues.display()+ ":" +seconds.display();
	
	Alarmhour=new DigitB(24); 
	Alarmmin=new DigitB(60);
	Alarmsec=new DigitB(60); 
 }
 
 public void setAlarm(int h, int m)
{
	Alarmhour.setValue(h);
	Alarmmin.setValue(m);
	Alarmsec.setValue(00);
}
public void setTime(int h, int m, int s)
{
	hour.setValue(h);
	mintues.setValue(m);
	seconds.setValue(s);
	time=hour.display()+":"+mintues.display()+":"+seconds.display();
	
	
}


public void tick()
{
	seconds.increment();
	if(seconds.getValue()==0)
	{
		mintues.increment();
		if(mintues.getValue()==0)
			{
				hour.increment();
			}
	}		
time= hour.display() + ":" + mintues.display() + ":" +seconds.display();

	 if(Alarmhour.getValue()==hour.getValue())
	{
		if(Alarmmin.getValue()==mintues.getValue())
		{
			if(Alarmsec.getValue()==seconds.getValue())
			{
				music.playTrack(0);
				System.out.println("Playing Alarm Tune. . .");
			}
			else{
				music.stopPlaying();
			}
		}
	}
}

public void ClockDisplay()
{
System.out.println(time);
}
}