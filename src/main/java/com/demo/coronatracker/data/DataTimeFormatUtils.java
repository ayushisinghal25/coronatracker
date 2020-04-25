package com.demo.coronatracker.data;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class DataTimeFormatUtils {

	public static String getDataTimeFormat(String date) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yy HH:mm");
		sdf.setTimeZone(TimeZone.getTimeZone("Asia/Kolkata"));

		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(Long.parseLong(date));

		String formattedDate = sdf.format(calendar.getTime());
		return formattedDate;
	}
}
