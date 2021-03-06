package com.ecommerce.controller.admin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ecommerce.service.UserService;
import com.ecommerce.service.impl.UserServiceImpl;
/**
 * @overview UserDeleteServlet is a servlet used to handle the use-case of 
 * 				deleting a user from database
 * @author Tus
 *
 */
@WebServlet("/admin/user/delete")
public class UserDeleteServlet extends HttpServlet {
	UserService userService = new UserServiceImpl();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		userService.deleteUser(Integer.parseInt(id));
		
		resp.sendRedirect(req.getContextPath() + "/admin/user/list");
	}
}
