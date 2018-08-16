package la.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import db_dms.DbDmsConnect;


@WebServlet("/SetDeviceNameServlet")
public class SetDeviceNameServlet extends HttpServlet {


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    DbDmsConnect dms = new DbDmsConnect();
	    dms.main();
	    String device_name = request.getParameter("device_name");
	        RequestDispatcher dispatch = request.getRequestDispatcher("/setResult.jsp");
	        dispatch.forward(request, response);
	    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
