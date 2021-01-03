package com.imooc.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

// 这个Servlet通过注解的方式设置启动时加载
// 注意：通过这种方式设置启动时加载时，必须也设置urlPatterns="/unused"，这个url没有实际用途，但必须设置，否则loadOnStartup=2会不生效！
@WebServlet(urlPatterns="/unused",loadOnStartup=2)  
public class AnalusisServlet extends HttpServlet{

	@Override
	public void init() throws ServletException {
		System.out.println("正在分析数据库！");
	}
}
