package com.model.control;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.bean.MemberBean;
import com.model.dao.MemberDAO;

/**
 * Servlet implementation class proc
 */
@WebServlet("/proc.do")
public class MemberLoginProc extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqPro(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqPro(request, response);
	}

	protected void reqPro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("???");
		request.setCharacterEncoding("euc-kr");
		MemberBean bean = new MemberBean();
		bean.setId(request.getParameter("id"));
		String pass1 = request.getParameter("pass1");
		String pass2 = request.getParameter("pass2");
		bean.setPassword(pass1);
		bean.setPassword2(pass2);
		bean.setEmail(request.getParameter("email"));
		bean.setTel(request.getParameter("tel"));
		
		String[] arr = request.getParameterValues("hobby");
		String hobby = "";
		for (int i = 0; i < arr.length; i++) {
			hobby+=arr[i]+" ";
		}
		bean.setHobby(hobby);
		bean.setJob(request.getParameter("job"));
		bean.setAge(request.getParameter("age"));
		bean.setInfo(request.getParameter("info"));
		
		// 패스워드 일치 여부
		if(pass1.equals(pass2)) {
			MemberDAO dao = new MemberDAO();
			try {
				dao.insertMember(bean);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			// 
			RequestDispatcher rd = request.getRequestDispatcher("MemberListCon.do");
			rd.forward(request, response);
			
		}else {
			request.setAttribute("msg", "패스워드가 일치하지 않습니다.");
			RequestDispatcher rd = request.getRequestDispatcher("LoginError.jsp");
			rd.forward(request, response);
		}
	}
}
