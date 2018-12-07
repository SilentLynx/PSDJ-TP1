package UniversalCalculatorModel;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

public class TimeZone 
{    
    public static String calcular(Date o, LocalTime t, int offsetFrom, int offsetTo, boolean check)
    {
        
          LocalDateTime ldt;
          
          ldt = LocalDateTime.ofInstant(o.toInstant(), ZoneId.systemDefault()).with(t);
          
          if(check == true)
          {
              ldt = ldt.plusHours(offsetTo - (ZoneId.systemDefault().getRules().getOffset(Instant.now()).getTotalSeconds() / 3600));//odt.withOffsetSameInstant(ZoneOffset.ofHours(offsetTo)).toLocalDateTime();
          }
          else 
          { 
              ldt = ldt.plusHours(offsetTo - offsetFrom);
          }
          
          StringBuilder sb = new StringBuilder();
          sb.append(ldt.toLocalTime().toString());
          sb.append(" do dia ");
          sb.append(ldt.getDayOfMonth()).append("/");
          sb.append(ldt.getMonthValue()).append("/");
          sb.append(ldt.getYear());
          
          return sb.toString();
    }   
}