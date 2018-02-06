package com.interceptor;


import com.util.ParameterUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class PermissionInterceptor extends HandlerInterceptorAdapter{
	
	private final Logger log = LoggerFactory.getLogger(PermissionInterceptor.class);

	@Autowired

	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws ServletException, IOException{
		log.info("开始执行1");
		String redirectUrl = request.getHeader("REFERER");
		log.info("############################## 访问请求的域名！##############################");
		String OumiDomain = ParameterUtil.getOumiDomain();
		log.info("配置文件中取到的域名" + OumiDomain);
		if(redirectUrl != null){
			if(redirectUrl.contains("://")){
				redirectUrl = redirectUrl.substring(redirectUrl.indexOf("://")+3);
			}
			if(redirectUrl.contains("/")){
				redirectUrl = redirectUrl.substring(0, redirectUrl.indexOf("/"));
			}
			log.info("##############################redirectUrl: " + redirectUrl + "##############################");
			if(!redirectUrl.equals(OumiDomain)){
				log.info("############################## 非法域名的请求 ,跳转到login页面！##############################");
				if(null == request.getContextPath() || "".equals(request.getContextPath())){
					response.addHeader("location", "/index/login.do");
				}else{
					response.addHeader("location", request.getContextPath() + "/index/login.do");
				}
				response.setStatus(302);
				return false;
			}
		}
		String requestUri = request.getRequestURI();
		String contextPath = request.getContextPath();
		String url = requestUri.substring(contextPath.length());
		log.info("requestUri：" + requestUri);
		log.info("contextPath ：" + contextPath);
		log.info("url：" + url);
		String loginFlag = (String) request.getSession().getAttribute("loginFlag");
		if(null == loginFlag || "".equals(loginFlag)){
			log.info("##############################Session失效！Interceptor：跳转到login页面！##############################");
			response.sendRedirect("/index/login.do");
			return false;
		}else {
			return true;
		}

	}


	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView){
		log.info("执行开始2");
		if(modelAndView != null){
			modelAndView.addObject("var", "测试postHandle");
		}
	}
	
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex){
		log.info("执行顺序3");
	}
}
