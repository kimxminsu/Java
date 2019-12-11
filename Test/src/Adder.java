import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Adder extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException { 
		String n1=req.getParameter("n1");
		String n2=req.getParameter("n2");
		int total=Integer.parseInt(n1)+Integer.parseInt(n2);
		PrintWriter out=resp.getWriter();
		out.println("Sum = "+total);
	}
}
