/**   
 * @Title: XssHttpServletResponseWrapper.java 
 * @Package com.pcitc.common.web.wrapper 
 * @Description: TODO 
 * @author lixiaofei  
 * @date 2016-7-19 下午2:55:47 
 * @version V1.0   
 */
package com.web;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;
import java.io.*;

/**
 * <p>Title:XssHttpServletResponseWrapper </p>
 * <p>Description:拦截response解析返回前台数据</p>
 * <p>Company: htty</p> 
 * @author lixiaofei
 * @date 2016-7-20下午2:12:22
 */
public class ReturnHttpServletResponseWrapper extends HttpServletResponseWrapper {
	private ByteArrayOutputStream buffer = null;
	private ServletOutputStream out = null;
	private PrintWriter writer = null;

	public ReturnHttpServletResponseWrapper(HttpServletResponse resp) throws IOException {
		super(resp);
		// 真正存储数据的流
		buffer = new ByteArrayOutputStream();
		out = new WapperedOutputStream(buffer);
		writer = new PrintWriter(new OutputStreamWriter(buffer, this.getCharacterEncoding()));
	}

	//重载父类获取outputstream的方法
	@Override
	public ServletOutputStream getOutputStream() throws IOException {
		return out;
	}

	//重载父类获取writer的方法
	@Override
	public PrintWriter getWriter() throws UnsupportedEncodingException {
		return writer;
	}

	//重载父类获取flushBuffer的方法 
	@Override
	public void flushBuffer() throws IOException {
		if (out != null) {
			out.flush();
		}
		if (writer != null) {
			writer.flush();
		}
	}

	@Override
	public void reset() {
		buffer.reset();
	}

	// 将out、writer中的数据强制输出到WapperedResponse的buffer里面，否则取不到数据 
	public byte[] getResponseData() throws IOException {
		flushBuffer();
		return buffer.toByteArray();
	}

	//内部类，对ServletOutputStream进行包装 
	private class WapperedOutputStream extends ServletOutputStream {
		private ByteArrayOutputStream bos = null;

		public WapperedOutputStream(ByteArrayOutputStream stream)
				throws IOException {
			bos = stream;
		}

		@Override
		public void write(int b) throws IOException {
			bos.write(b);
		}

		@Override
		public void write(byte[] b) throws IOException {
			bos.write(b, 0, b.length);
		}
	}

}
