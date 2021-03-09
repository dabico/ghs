package usi.si.seart.gseapp.util.interval;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;
import org.apache.commons.lang3.tuple.Pair;

import java.text.SimpleDateFormat;
import java.util.Date;

@SuperBuilder
@FieldDefaults(level = AccessLevel.PROTECTED)
public class DateInterval extends Interval<Date> {
    public Pair<DateInterval,DateInterval> splitInterval(){
        if (start.equals(end)){ return null; }
        Date median = new Date((start.getTime() + end.getTime())/2);
        DateInterval firstInterval  = DateInterval.builder().start(start).end(median).build();
        DateInterval secondInterval = DateInterval.builder().start(median).end(end).build();
        return Pair.of(firstInterval,secondInterval);
    }

    @Override
    public String toString(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        return dateFormat.format(start) + ".." + dateFormat.format(end);
    }
}
