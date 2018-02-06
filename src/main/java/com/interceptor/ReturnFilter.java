/**   
 * @Title: ReturnFilter.java 
 * @Package com.pcitc.common.web.filter 
 * @Description: TODO 
 * @author lixiaofei  
 * @date 2016-7-19 下午5:44:37 
 * @version V1.0   
 */
package com.interceptor;



import com.web.ReturnHttpServletResponseWrapper;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**<p>Title:ReturnFilter </p>
 * <p>Description:解析返回值拦截器</p>
 * <p>Company: htty</p> 
 * @author lixiaofei
 * @date 2016-7-19下午5:44:37
 */
public class ReturnFilter implements Filter {
	FilterConfig filterConfig = null;
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		this.filterConfig = filterConfig;
	}

	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse,
            FilterChain chain) throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest)servletRequest;
		HttpServletResponse response = (HttpServletResponse)servletResponse;
		String requestURI = request.getRequestURI();
		if(requestURI.endsWith("do")){  
			ReturnHttpServletResponseWrapper xssHttpServletResponseWrapper = new ReturnHttpServletResponseWrapper(response);
			chain.doFilter(request, xssHttpServletResponseWrapper);
			byte[] data = xssHttpServletResponseWrapper.getResponseData(); 
			String result = new String(data); 
			ServletOutputStream out = response.getOutputStream(); 
			out.write(cleanXSS(result).getBytes()); 
			out.flush(); 
		}else{
			chain.doFilter(request, response);		
		}
    }
    
	@Override
	public void destroy() {
		this.filterConfig = null;
		
	}
	private String cleanXSS(String result) {
		//result = result.replaceAll("& lt;", "<").replaceAll("& gt;", ">");
		result = result.replaceAll("& #40;", "(").replaceAll("& #41;", ")");
		//result = result.replaceAll("& #39;", "'");
		return result;
	}
}
