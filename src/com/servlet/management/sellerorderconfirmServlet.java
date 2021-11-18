package com.servlet.management;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.util.management.OrdersManage;


@WebServlet("/sellerorderconfirmServlet")
public class sellerorderconfirmServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		boolean flag;
		int o_id = Integer.parseInt(request.getParameter("o_id"));
		HttpSession session = request.getSession();
		OrdersManage om = new OrdersManage();
		flag = om.sellerChooseBuyer(o_id);
		if(flag){
			response.sendRedirect("management/seller_check/order_confirm_success.jsp");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
