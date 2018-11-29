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
              odt = o.toInstant().atOffset(ZoneId.systemDefault().getRules().getOffset(Instant.now())).with(t);
              ldt = odt.withOffsetSameInstant(ZoneOffset.ofHours(offsetFrom)).toLocalDateTime();
          }
          else { 
              odt = o.toInstant().atOffset(ZoneOffset.UTC).with(t);
              ldt = odt.withOffsetSameInstant(ZoneOffset.ofHours(offsetTo - offsetFrom)).toLocalDateTime();
          }
          
          return ldt.toString();
    }
}
