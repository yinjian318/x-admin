package com.interceptor;

import javax.servlet.*;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;


public class CookieHttpOnlyFilter implements Filter{
	public void destroy() {
		
	}
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse resp = (HttpServletResponse) response;
		Cookie[] cookies = req.getCookies();
		if (cookies != null) {
			for (Cookie cookie : cookies) {
				cookie.setSecure(true);
				// tomcat7 支持该属性，tomcat6 不支持
				String value = cookie.getValue();
				StringBuilder builder = new StringBuilder();
				//builder.append("JSESSIONID=" + value + "; ");
				builder.append("Secure; ");
				builder.append("HttpOnly; ");
				Calendar cal = Calendar.getInstance();
				cal.add(Calendar.HOUR, 1);
				Date date = cal.getTime();
				Locale locale = Locale.CHINA;
				SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss", locale);
				builder.append("Expires=" + sdf.format(date));
				resp.setHeader("Set-Cookie", builder.toString());
			}
		}
		filterChain.doFilter(request, response);
	}

	public void init(FilterConfig arg0) throws ServletException {

	}
}
