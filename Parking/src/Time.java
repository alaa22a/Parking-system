import java.util.*; 
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Time {
	public String getTime()
	{
		   DateTimeFormatter t = DateTimeFormatter.ofPattern("HH:mm");  
		   LocalDateTime now = LocalDateTime.now();  
		  return t.format(now);  
	}
}
