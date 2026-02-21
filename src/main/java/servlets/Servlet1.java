package servlets;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/servlet1")
public class Servlet1 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        // For entire application
        ServletContext ctx = getServletContext();
        ctx.setAttribute("globalVariable","globalName");
        ctx.setAttribute("appName","Netlify");

        // Servlet Specific
        ServletConfig ctf = getServletConfig();



        String username = "Garvit";

        Cookie cookie = new Cookie("username", username);
        cookie.setMaxAge(10 * 60); // 10 minutes
        res.addCookie(cookie);

        HttpSession session = req.getSession();
        session.setAttribute("id",1190);
        session.setMaxInactiveInterval(10*60);

        res.setContentType("text/html");
        res.getWriter().println("<h1>Cookie set successfully</h1>");
        res.getWriter().println("<a href='servlet2'>Go to Servlet2</a>");
    }
}
