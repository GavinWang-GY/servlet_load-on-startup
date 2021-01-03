package com.imooc.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

/**
 * 第一个servlet,创建数据库
 * @author Administrator
 *
 */
public class CreateServlet extends HttpServlet{

	@Override
	public void init() throws ServletException {
		System.out.println("正在创建数据库");
	}
}
