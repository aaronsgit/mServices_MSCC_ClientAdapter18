package solutions.legatus.mservice.mscc.client.Utils;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by ahou on 5/15/2016.
 */
public class BeanUtils {

    public static Timestamp GetUTCTimestamp(String ts ) {

        ZonedDateTime utc = ZonedDateTime.ofInstant( Instant.parse( ts ), ZoneOffset.UTC );

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS" );

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");

        String asIsoDateTime =utc.format( formatter );

        return Timestamp.valueOf( asIsoDateTime  );

    }
}
