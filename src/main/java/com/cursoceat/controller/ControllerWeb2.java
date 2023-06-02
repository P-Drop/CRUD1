package com.cursoceat.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cursoceat.dao.Datos;

/**
 * Servlet implementation class ControllerWeb2
 */
@WebServlet("/ControllerWeb2")
public class ControllerWeb2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControllerWeb2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String opcion = request.getParameter("opcion");
		String nombre = request.getParameter("nombre");
		if(opcion.equals("eliminar")){
			Datos.eliminar(nombre);
			request.setAttribute("alumnos", Datos.miAcademia.getAlumno());
			request.getRequestDispatcher("eliminar.jsp").forward(request, response);
		}
		if(opcion.equals("modificar")) {
			String nuevoNombre = request.getParameter("nuevoNombre");
			Integer nuevaEdad = Integer.parseInt(request.getParameter("nuevaEdad"));
			Datos.modificar(nombre,nuevoNombre,nuevaEdad);
			request.setAttribute("alumnos", Datos.miAcademia.getAlumno());
			request.getRequestDispatcher("modificar.jsp").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nombre = request.getParameter("nuevoNombre");
		Integer edad = Integer.parseInt(request.getParameter("nuevaEdad"));
		System.out.println(nombre);
		Datos.validar(nombre, edad);
		request.setAttribute("alumnos", Datos.miAcademia.getAlumno());
		request.getRequestDispatcher("modificar.jsp").forward(request, response);		
	}

}
