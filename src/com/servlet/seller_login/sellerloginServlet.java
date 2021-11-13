package com.servlet.seller_login;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.seller.SellerD;
import com.dao.seller.SellerDI;
import com.util.index.IndexUI;
import com.util.index.IndexUtil;
import com.vo.SellerAccount;

/**
 * Servlet implementation class sellerloginServlet
 */
@WebServlet("/sellerloginServlet")
public class sellerloginServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String account=request.getParameter("selleracnumber");
		String pwd=request.getParameter("sellerpwd");
		SellerAccount sa = new SellerAccount(account,pwd,1);  //���λ�û�й���Ա������ѡ��û��status�Ĺ��췽������
		IndexUtil iu = new IndexUI();
		HttpSession session=request.getSession();
		String flag1="True";
			if(iu.checkLogin(account, pwd, "seller")) {
				session.setAttribute("selleruser", sa);
				response.sendRedirect("authentication/seller_login/seller_login_success.jsp");
			}else {
				flag1="False";
				session.setAttribute("flag1", flag1);
				response.sendRedirect("authentication/seller_login/seller_login.jsp");
			}
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}