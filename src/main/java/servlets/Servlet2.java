package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/servlet2")
public class Servlet2 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req,
                         HttpServletResponse res)
            throws ServletException, IOException {

        Cookie[] cookies = req.getCookies();

        res.setContentType("text/html");
        PrintWriter writer = res.getWriter();

        boolean found = false;

        if (cookies != null) {
            for (Cookie c : cookies) {
                if ("username".equals(c.getName())) {
                    found = true;
                    writer.println("<h1>Username: " + c.getValue() + "</h1>");
                    break;
                }
            }
        }

        if (!found) {
            writer.println("<h1>User Not Authenticated!</h1>");
        }
    }
}
