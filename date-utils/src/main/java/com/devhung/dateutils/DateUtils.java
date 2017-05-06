package com.devhung.dateutils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by hungdo on 5/6/17.
 */

public class DateUtils {
    public static String getTime(Date date) {
        SimpleDateFormat timeFormatter = new SimpleDateFormat("kk:mm");
        return timeFormatter.format(date);
    }
}
