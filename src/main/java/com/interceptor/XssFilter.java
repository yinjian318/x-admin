package com.interceptor;

import com.web.XssHttpServletRequestWrapper;
import org.apache.commons.lang.StringUtils;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * 防御跨站脚本攻击[XSS]filter
 * @author lei.niu
 *
 */
public class XssFilter implements Filter {
	protected static final String REFERER = "Referer";
	protected static final String LOGINURL_PARAM = "loginurl";
	protected static final String INCLUDES_PARAM = "includes";
	
    FilterConfig filterConfig = null;

    public void init(FilterConfig filterConfig) throws ServletException {
        this.filterConfig = filterConfig;
    }

    public void destroy() {
        this.filterConfig = null;
    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse,
            FilterChain chain) throws IOException, ServletException {
    	HttpServletRequest request = (HttpServletRequest)servletRequest;
		HttpServletResponse response = (HttpServletResponse)servletResponse;
		String includes = filterConfig.getInitParameter(INCLUDES_PARAM);
		String loginurl = filterConfig.getInitParameter(LOGINURL_PARAM);
		String referer=request.getHeader(REFERER);
		
		if(isCheckDomianName(includes,loginurl,referer)) {
			chain.doFilter(new XssHttpServletRequestWrapper(request), response);
		}else{
			//域名检查失败，返回登录页
			response.sendRedirect(loginurl);
		}
    }
    
	/**
	 * 检查请求来源合法是否合法？
	 * (防Referer攻击）
	 * @return 合法:true  非法:false
	 */
    private boolean isCheckDomianName(String includes,String loginurl,String referer){
		if(StringUtils.isEmpty(includes) || StringUtils.isEmpty(loginurl)) return true;//当includes参数为空不进行拦截
		if(StringUtils.isEmpty(referer)) return true;	//当referer参数为空不进行拦截
		if(loginurl.contains("127.0.0.1")){
			referer = referer.replace("localhost","127.0.0.1");
		}
		String[] incluedsArray = includes.split("\\|");
		if(incluedsArray.length>0){
			for(int i=0;i<incluedsArray.length;i++){
				if(referer.equals(incluedsArray[i]) || referer.startsWith(incluedsArray[i])){
					return true;
				}
			}
		}else{
			return true;
		}
    	return false;
    }
}