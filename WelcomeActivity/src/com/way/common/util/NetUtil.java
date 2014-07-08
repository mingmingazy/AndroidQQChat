package com.way.common.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * 
 * @author LuoYi
 *
 */
public class NetUtil {
	public static boolean isNetConnected(Context context) {
		boolean isNetConnected;
		// 获得网络连接服务
		ConnectivityManager connManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
		NetworkInfo info = connManager.getActiveNetworkInfo();
		if (info != null && info.isAvailable()) {
			// String name = info.getTypeName();
			// L.i("当前网络名称：" + name);
			isNetConnected = true;
		} else {
			L.i("没有可用网络");
			isNetConnected = false;
		}
		return isNetConnected;
	}
}
