package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.CreateFormulas;
import model.circleArea;
import model.squareArea;
import model.triangleArea;

/**
 * Servlet implementation class getAreaServlet
 */
@WebServlet("/getAreaServlet")
public class getAreaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getAreaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String shape = request.getParameter("user_shape");
		
		String userLength = request.getParameter("user_length");
		String userWidth = request.getParameter("user_width");
		String userRadius = request.getParameter("user_radius");

		switch (shape) {
		case "circle":
			circleArea circleArea = new circleArea(Double.parseDouble(userRadius));
			request.setAttribute("userArea", circleArea);
			getServletContext().getRequestDispatcher("/results.jsp").forward(request, response);
			break;
		case "square":
			squareArea squareArea = new squareArea(Double.parseDouble(userLength), Double.parseDouble(userWidth));
			request.setAttribute("userArea", squareArea);
			getServletContext().getRequestDispatcher("/results.jsp").forward(request, response);
			break;
		case "triangle":
			triangleArea triangleArea = new triangleArea(Double.parseDouble(userLength), Double.parseDouble(userWidth));
			request.setAttribute("userArea", triangleArea);
			getServletContext().getRequestDispatcher("/results.jsp").forward(request, response);
			break;
		}
	}

}
