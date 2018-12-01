package UniversalCalculatorModel;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Date;

/**
 *
 * @author danie
 */
public class TimeZone {
    
    public static String calcular(Date o, LocalTime t, int offsetFrom, int offsetTo, boolean check){
          OffsetDateTime odt;
          LocalDateTime ldt;
          
          if(check == true)
          {
              ldt = LocalDateTime.ofInstant(o.toInstant(), ZoneId.systemDefault()).with(t);  //o.toInstant().atOffset(ZoneId.systemDefault().getRules().getOffset(Instant.now())).with(t);
              ldt = ldt.plusHours(offsetTo - (ZoneId.systemDefault().getRules().getOffset(Instant.now()).getTotalSeconds() / 3600));//odt.withOffsetSameInstant(ZoneOffset.ofHours(offsetTo)).toLocalDateTime();
          }
          else { 
              ldt = LocalDateTime.ofInstant(o.toInstant(), ZoneId.systemDefault()).with(t);//odt = o.toInstant().atOffset(ZoneOffset.UTC).with(t);
                                //odt = OffsetDateTime.parse(o.toString() + "T" + t.toString() + String.valueOf(offsetFrom));
              ldt = ldt.plusHours(offsetTo - offsetFrom);//ldt = odt.withOffsetSameInstant(ZoneOffset.ofHours(offsetTo)).toLocalDateTime();
          }
          
          return ldt.toString();
    }
}
