package basic;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "initServlet", urlPatterns = {"/init"},
		initParams = {@WebInitParam(name = "siteName", value = "jpub")})
public class InitServlet extends HttpServlet {
	private String myParam = "";
	
	@Override
	public void init(ServletConfig servletConfig) throws ServletException {
		System.out.println("init call by velmont");
		this.myParam = servletConfig.getInitParameter("siteName");
		System.out.println("입력 사이트명 : " + myParam);
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.getWriter().println("hello");
	}
}
