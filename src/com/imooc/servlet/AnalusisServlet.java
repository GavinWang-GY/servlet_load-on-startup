package com.imooc.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

// ���Servletͨ��ע��ķ�ʽ��������ʱ����
// ע�⣺ͨ�����ַ�ʽ��������ʱ����ʱ������Ҳ����urlPatterns="/unused"�����urlû��ʵ����;�����������ã�����loadOnStartup=2�᲻��Ч��
@WebServlet(urlPatterns="/unused",loadOnStartup=2)  
public class AnalusisServlet extends HttpServlet{

	@Override
	public void init() throws ServletException {
		System.out.println("���ڷ������ݿ⣡");
	}
}
