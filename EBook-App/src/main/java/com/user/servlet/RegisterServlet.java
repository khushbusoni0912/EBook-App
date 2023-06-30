package com.user.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entity.User;
import com.DAO.UserDAOImpl;
import com.DB.DBConnect;

import javax.servlet.http.HttpSession;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		try {
			String name = req.getParameter("fname");
			String email = req.getParameter("email");
			String phno = req.getParameter("phno");
			String password = req.getParameter("password");
			String check = req.getParameter("check");

			// System.out.println(name+" "+email+" "+phno+" "+password+" "+check);

			User us = new User();
			us.setName(name);
			us.setEmail(email);
			us.setPhno(phno);
			us.setPassword(password);
			HttpSession session = req.getSession();
			if (check != null)
			{
				UserDAOImpl dao = new UserDAOImpl(DBConnect.getConn());
				boolean f2 = dao.checkUser(email);
				if (f2) {
					boolean f = dao.userRegister(us);
					if (f) {
						// System.out.println("Registration Success");
						session.setAttribute("succMsg", "Registration Success");
						resp.sendRedirect("register.jsp");
					} else {
						// System.out.println("OOPS!Something wrong on Server...");
						session.setAttribute("failedMsg", "OOPS!Something wrong on Server...");
						resp.sendRedirect("register.jsp");
					}
				} else {
					session.setAttribute("failedMsg", "User Already Exist with this Email! Try Another Email ID");
					resp.sendRedirect("register.jsp");
				}
			} else {
				// System.out.println("Please Check Agree Terms & Condition");
				session.setAttribute("failedMsg", "Please Check Agree Terms & Condition");
				resp.sendRedirect("register.jsp");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
