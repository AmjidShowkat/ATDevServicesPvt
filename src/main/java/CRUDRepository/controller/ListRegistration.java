package CRUDRepository.controller;

import java.io.IOException;

import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import CRUDRepository.model.DAOService;
import CRUDRepository.model.DAOServiceImpl;


@WebServlet("/listReg")
public class ListRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ListRegistration() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	DAOService dos = new DAOServiceImpl();
	dos.connectDB();
	ResultSet result = dos.listReg();
	request.setAttribute("res", result);
	RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/listRegistration.jsp");
	rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
