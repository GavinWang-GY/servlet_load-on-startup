package com.imooc.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

/**
 * 第二个servlet，导入数据库
 * @author Administrator
 *
 */
public class ImportServlet extends HttpServlet{

	@Override
	public void init() throws ServletException {
		System.out.println("正在导入数据库。");
	}
}
