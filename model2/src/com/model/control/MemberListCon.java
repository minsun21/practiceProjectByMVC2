package com.model.control;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.bean.MemberBean;
import com.model.dao.MemberDAO;

/**
 * Servlet implementation class MemberListCon
 */
@WebServlet("/MemberListCon.do")
public class MemberListCon extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		reqPro(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		reqPro(request, response);
	}

	protected void reqPro(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr");
		MemberDAO dao = new MemberDAO();
		try {
			ArrayList<MemberBean> memberList = dao.getAllMemberList();
			request.setAttribute("memberList", memberList);

			RequestDispatcher rd = request.getRequestDispatcher("MemberList.jsp");
			rd.forward(request, response);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
