package com.atom.controller;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.atom.model.DBLogin;
import com.atom.model.User;

public class Controller extends HttpServlet {

	private DBLogin dbLogin;

	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		dbLogin = new DBLogin();
		config.getServletContext().setAttribute("loginDB", dbLogin);
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
	     String name = request.getParameter("userName"); //��login_form ���õ�ֵ
	     String pwd = request.getParameter("userPwd");
	     User user = dbLogin.getUser(name,pwd);
	     if(user != null){//˵�������û�
	     request.getSession().setAttribute("user",user);   //�ŵ�session ����
	     request.getRequestDispatcher(response.encodeURL("/welcome.jsp")).forward(request,response);//�ɹ�ת����welcome.jsp
	     }else{
	       request.getRequestDispatcher(response.encodeURL("/loginFailed.jsp")).forward(request, response);
	     }
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
