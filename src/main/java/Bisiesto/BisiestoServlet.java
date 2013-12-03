package Bisiesto;
import java.io.IOException;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Scanner;
import java.io.PrintWriter;
public class BisiestoServlet extends HttpServlet {
        @Override
        protected void service(HttpServletRequest request, HttpServletResponse response)
                        throws ServletException, IOException {
                String parametro = request.getParameter("anio");
                Bisiesto bs = new Bisiesto();
                int anio = new Integer(parametro);
                boolean esBisiesto = bs.esBisiesto(anio);
                if (esBisiesto==true){
                	response.getWriter().println("Es bisiesto");
            	}else{
            		response.getWriter().println("No es bisiesto");
            	}
        }
}