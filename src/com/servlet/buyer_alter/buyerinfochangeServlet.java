package com.servlet.buyer_alter;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.util.buyer.BuyerUI;
import com.util.buyer.BuyerUtil;
import com.vo.BuyerAccount;


@WebServlet("/buyerinfochangeServlet")
public class buyerinfochangeServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		HttpSession session = request.getSession();
		BuyerAccount bac = (BuyerAccount)session.getAttribute("buyeruser");
		String b_acc = bac.getB_act();
		int b_tele = Integer.parseInt(request.getParameter("newtel"));
		String b_ads = request.getParameter("newadd");
		BuyerUtil bu = new BuyerUI();
		bu.changeInfo(b_acc, b_tele, b_ads); 
		response.sendRedirect("authentication/buyer_alter/buyer_changeinfo_success.jsp");	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
