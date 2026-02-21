package servlets;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/FirstServlet")
public class FirstServlet implements Servlet {

    private ServletConfig servletCfg;

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        this.servletCfg = servletConfig;
        System.out.println("Initializing Servlet");
    }

    @Override
    public ServletConfig getServletConfig() {
        return servletCfg;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

        System.out.println("Service Request");

        servletResponse.setContentType("text/html");
        PrintWriter out = servletResponse.getWriter();

        out.println("<html><body>");
        out.println("<h1>Servlet is working!</h1>");
        out.println("</body></html>");
    }

    @Override
    public String getServletInfo() {
        return "FirstServlet implemented using Servlet interface";
    }

    @Override
    public void destroy() {
        System.out.println("Destroying Servlet");
    }
}
