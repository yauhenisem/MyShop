package com.jdbc;

import com.jdbc.dao.UserDaoImp;
import com.jdbc.entity.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/user")
public class GetUserByIdServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id =Integer.parseInt(req.getParameter("id"));
        UserDaoImp userDaoImp = new UserDaoImp();
        User user = userDaoImp.getUseById(id);
        PrintWriter printWriter = resp.getWriter();
        printWriter.println(user.toString());
    }
}
