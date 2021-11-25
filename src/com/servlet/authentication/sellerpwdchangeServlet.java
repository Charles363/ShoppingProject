package com.servlet.authentication;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.users.UserDao;
import com.dao.users.UserDaoImpl;
import com.util.authentication.UserAuthentic;
import com.util.authentication.UserAuthenticaUtil;
import com.vo.UserAccount;


@WebServlet("/sellerpwdchangeServlet")
public class sellerpwdchangeServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String account = request.getParameter("selleracnumber");
		String pwd = request.getParameter("selleroldpwd");
		String newpwd = request.getParameter("sellernewpwd");
		HttpSession session = request.getSession();
		UserAuthenticaUtil userAuthentic = new UserAuthentic();
		UserAccount sAccount = new UserAccount(account, pwd);
			if(userAuthentic.changePwd(sAccount, newpwd)) {
				response.sendRedirect("authentication/seller_alter/sellerpwdchange_success.jsp");
			}else {
				response.sendRedirect("authentication/seller_alter/sellerpwdchange_fail.jsp");
			}
	}			
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
