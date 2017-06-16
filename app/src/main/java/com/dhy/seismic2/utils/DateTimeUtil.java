package com.dhy.seismic2.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * @Author SunnyCoffee
 * @Date 2014-1-28
 * @version 1.0
 * @Desc 工具类
 */

public class DateTimeUtil {

	/**
	 * 获取当前系统时间（按指定格式）
	 * @param format
	 * @return
	 */
	public static String getCurrentTime(String format) {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat(format, Locale.getDefault());
		String currentTime = sdf.format(date);
		return currentTime;
	}

	/**
	 * 获取当前系统时间（默认格式：yyyy-MM-dd HH:mm:ss）
	 * @return
	 */
	public static String getCurrentTime() {
		return getCurrentTime("yyyy-MM-dd HH:mm:ss");
	}
}
