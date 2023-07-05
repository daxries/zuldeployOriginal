package Servlet;

import javax.servlet.RequestDispatcher; 
import java.io.IOException;
import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import DAO.scheduleDao;

/**
 * Servlet implementation class listScheduleController
 */
public class listScheduleController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    //private scheduleDao dao;  
    /**
     * @see HttpServlet#HttpServlet()
     */
    public listScheduleController() {
        super();
      //  dao = new scheduleDao();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//String scheduleId = request.getParameter("scheduleId");
		request.setAttribute("schedules",scheduleDao.getScheduleDetails());
		RequestDispatcher view = request.getRequestDispatcher("res viewSchedule.jsp");
		view.forward(request,  response);
	}



}
