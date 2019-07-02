package site.sahabatdeveloper.sahabatlibrary.helper;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class SahabatHelper {
    static DecimalFormat df= new DecimalFormat("#,##0");
    public static String convertRupiah(int nominal){
        df.setDecimalFormatSymbols(new DecimalFormatSymbols(Locale.ITALY));
        return df.format(Double.valueOf(nominal));
    }

    public static String convertRupiah(String nominal){
        df.setDecimalFormatSymbols(new DecimalFormatSymbols(Locale.ITALY));
        return df.format(Double.valueOf(nominal));
    }

    public static String convertRupiah(double nominal){
        df.setDecimalFormatSymbols(new DecimalFormatSymbols(Locale.ITALY));
        return df.format(nominal);
    }

    public static String convertRupiahDecimal(double nominal){
        DecimalFormat dfd= new DecimalFormat("#,##0.00");
        dfd.setDecimalFormatSymbols(new DecimalFormatSymbols(Locale.ITALY));
        return dfd.format(nominal);
    }
}
