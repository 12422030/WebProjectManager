package com.ischoolbar.programmer.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class liweiServlet extends HttpServlet {

	/**
	 * 李巍信息管理
	 */
	private static final long serialVersionUID = 1L;
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException{
		doPost(request, response);
	}
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException{
		String method=request.getParameter("method");
		if("toLiweiListView".equals(method))
		{
			liweiList(request,response);
		}
	}
	private void liweiList(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		// TODO Auto-generated method stub
		response.getWriter().write("test");
		try {
			request.getRequestDispatcher("view/liwei.jsp").forward(request, response);
		} catch (ServletException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}

