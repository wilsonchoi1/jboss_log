package hkgov.housingauthority.app;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SystemDate
 */
@WebServlet("/system")
public class SystemDate extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(SystemDate.class);

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			System.out.println("--- start: print message");
			logger.error("This is an error message");
			logger.debug("This is a debug message");
			logger.trace("This is trace message");
			logger.warn("This is a warn message");
			logger.info("This is a info message");
			System.out.println("--- end: print message");
			throw new Exception("Testing Error");
		} catch (Exception e) {
			logger.error("exception", e);
		}
		StringBuilder sb = new StringBuilder();
		sb.append("*** Get System Date: " + new Date());
		sb.append("\n");
		sb.append(getServletContext().getRealPath("/"));
		System.out.println(sb.toString());
		response.getWriter().append("Served at: ").append(request.getContextPath() + "\n" + sb.toString());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
