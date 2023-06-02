package com.cursoceat.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cursoceat.dao.Datos;

/**
 * Servlet implementation class ControllerWeb1
 */
@WebServlet("/ControllerWeb1")
public class ControllerWeb1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControllerWeb1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String opcion = request.getParameter("opcion");
		request.setAttribute("alumnos", Datos.miAcademia.getAlumno());
		if(opcion.equals("mostrar")) {
			request.getRequestDispatcher("mostrar.jsp").forward(request, response);
		}
		if(opcion.equals("eliminar")) {
			request.getRequestDispatcher("eliminar.jsp").forward(request, response);
		}
		if(opcion.equals("modificar")) {
			request.getRequestDispatcher("modificar.jsp").forward(request, response);			
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nombre = request.getParameter("nombre");
		Integer edad = Integer.parseInt(request.getParameter("edad"));
		Datos.validar(nombre, edad);
		Datos.crearAlumno(nombre, edad);
		request.setAttribute("msg", "Alumno creado correctamente");
		request.setAttribute("alumnos", Datos.miAcademia.getAlumno());
		request.getRequestDispatcher("index.jsp").forward(request, response);
		System.out.println(Datos.miAcademia.getAlumno());
	}

}
