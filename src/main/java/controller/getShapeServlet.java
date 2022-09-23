package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.CreateFormulas;

/**
 * Servlet implementation class getShapeServlet
 */
@WebServlet("/getShapeServlet")
public class getShapeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getShapeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String shape = request.getParameter("user_shape");
		CreateFormulas formula = new CreateFormulas(shape);
		
		request.setAttribute("userShape", formula);
		
		switch (shape) {
		case "circle":
			getServletContext().getRequestDispatcher("/circleFormula.jsp").forward(request, response);
			break;
		case "square":
			getServletContext().getRequestDispatcher("/squareFormula.jsp").forward(request, response);
			break;
		case "triangle":
			getServletContext().getRequestDispatcher("/triangleFormula.jsp").forward(request, response);
			break;
		}
		
		
		
		
		
//		PrintWriter writer = response.getWriter();
//		writer.println(formula.toString());
//		writer.close();

	}

}
