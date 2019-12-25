package com.shanbei.util;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//CookieUtil

public class CookieUtil {

	// 写入 cookie
	public static void addCookie(HttpServletResponse response, String name, String value, int maxAge) {
		
		try {
			String valueEncode= URLEncoder.encode(value, "UTF-8");
			Cookie cookie = new Cookie(name, valueEncode);
			cookie.setPath("/");
			if (maxAge > 0) {
				cookie.setMaxAge(maxAge);
			}
			response.addCookie(cookie);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// 从cookie获取值
	public static Cookie getCookieByName(HttpServletRequest request, String name) {
		Cookie[] cookies = request.getCookies();
		if (null != cookies) {
			for (Cookie cookie : cookies) {
				if (cookie.getName().equals(name))
					return cookie;
			}
		}
		return null;
	}
	
}
