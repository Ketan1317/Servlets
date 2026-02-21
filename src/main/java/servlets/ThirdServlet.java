package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

@WebServlet("/thirdServlet")
public class ThirdServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException {
        System.out.println("Processing the Get Request from Third Servlet");
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        System.out.println("Content Posted By Form");
        String par = req.getParameter("message");
        System.out.println(par);
        res.setContentType("text/html");
        PrintWriter writer = res.getWriter();
        writer.print("<h1>Form Submitted !!</h1>");
        Date date = new Date();
        writer.print("<h1>Date : %s</h1>".formatted(date));
        res.setStatus(401);
//        res.sendRedirect("/SecondServlet"); redirects to second Servlet
    }
}
