package Servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.PatrolmanDAO;

/**
 * Servlet implementation class PatrolmanViewProfileServlet
 */
@WebServlet("/PatrolmanViewProfileServle")
public class PatrolmanViewProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//private ResidentDAO dao;       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PatrolmanViewProfileServlet() {
        super();
       // dao = new ResidentDAO();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String patrolmanUsername = request.getParameter("patrolmanUsername");
		request.setAttribute("patrolman", PatrolmanDAO.getPatrolmanProfile(patrolmanUsername));
		RequestDispatcher view = request.getRequestDispatcher("Pat Profile.jsp");
		view.forward(request, response);
	}


}
