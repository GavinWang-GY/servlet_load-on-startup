package com.imooc.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

/**
 * �ڶ���servlet���������ݿ�
 * @author Administrator
 *
 */
public class ImportServlet extends HttpServlet{

	@Override
	public void init() throws ServletException {
		System.out.println("���ڵ������ݿ⡣");
	}
}
