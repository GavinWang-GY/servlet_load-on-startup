package com.imooc.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

/**
 * ��һ��servlet,�������ݿ�
 * @author Administrator
 *
 */
public class CreateServlet extends HttpServlet{

	@Override
	public void init() throws ServletException {
		System.out.println("���ڴ������ݿ�");
	}
}
