package la.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/TransitionServlet")
public class TransitionServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

try{
String action = request.getParameter("action");
if(action.equals("list")){
		RequestDispatcher dispatch = request.getRequestDispatcher("/list.jsp");
        dispatch.forward(request, response);
}else if(action.equals("setting")){
    RequestDispatcher dispatch = request.getRequestDispatcher("/setting.jsp");
    dispatch.forward(request, response);
}
}catch(Exception e){
    RequestDispatcher dispatch = request.getRequestDispatcher("/error.jsp");
    dispatch.forward(request, response);
}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
