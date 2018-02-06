package com.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

/**
 * Request包装类，用于防御Xss攻击
 * 
 * @author lei.niu
 *
 */
public class XssHttpServletRequestWrapper extends HttpServletRequestWrapper {

	public XssHttpServletRequestWrapper(HttpServletRequest servletRequest) {
		super(servletRequest);
	}

	public String[] getParameterValues(String parameter) {
		String[] values = super.getParameterValues(parameter);
		if (values == null) {
			return null;
		}
		int count = values.length;
		String[] encodedValues = new String[count];
		for (int i = 0; i < count; i++) {
			encodedValues[i] = cleanXSS(values[i]);
		}
		return encodedValues;
	}

	public String getParameter(String parameter) {
		String value = super.getParameter(parameter);
		if (value == null) {
			return null;
		}
		return cleanXSS(value);
	}

	public String getHeader(String name) {
		String value = super.getHeader(name);
		if (value == null)
			return null;
		return cleanXSS(value);
	}

	private String cleanXSS(String value) {
		value = value.replaceAll("<|PA==", "& lt;").replaceAll(">|Pg==", "& gt;");
		value = value.replaceAll("\\(|XCg=|XFwo", "& #40;").replaceAll("\\)|XCk=|XFwp", "& #41;");
		value = value.replaceAll("'|Jw==", "& #39;");
		value = value.replaceAll("eval\\((.*)\\)|ZXZhbFwoKC4qKVwp|ZXZhbFxcKCguKilcXCk=", "");
		value = value.replaceAll("[\\\"\\\'][\\s]*javascript:(.*)[\\\"\\\']|W1wiXCddW1xzXSpqYXZhc2NyaXB0OiguKilbXCJcJ10=|W1xcXCJcXFwnXVtcXHNdKmphdmFzY3JpcHQ6KC4qKVtcXFwiXFxcJ10=","\"\"");
		value = value.replaceAll("(?i)script|c2NyaXB0", "");
		value = value.replace("`", "");
		return value;
	}
}
