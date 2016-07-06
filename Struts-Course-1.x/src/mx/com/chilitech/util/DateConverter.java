package mx.com.chilitech.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import org.apache.commons.beanutils.Converter;

public class DateConverter implements Converter{

    public Object convert(Class c, Object val) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm",Locale.US);
            return sdf.parse(val.toString());
        } catch(ParseException ex) {
            return null;
        }
    }
    
}