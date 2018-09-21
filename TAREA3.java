import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author LADH_1809024
 */
@WebServlet(urlPatterns = {"/Practica_3"})
public class Practica_3 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<style type=\"text/css\">\n" +
                        "  	#null {\n" +
                        "		position:relative;\n" +
                        "		width:940px;\n" +
                        "		height:380px;\n" +
                        "               left: 320px;\n" +
                        "		background-color: green;\n" +
                        "		font-size:20px;\n" +
                        "		text-align: center;\n" +
                        "		font-family: \"Times New Roman\";\n" +
                        "\n" +
                        "		}\n" +
                        "</style>");
            out.println("<title>Servlet Practica_3</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<div id=null>");
            out.println("<form action=\"Practica_3\" method=\"Post\">\n" +
                        "  <fieldset>\n" +
                        "    <legend>Informacion Personal:</legend>\n" +
                        "    Nombre:<br>\n" +
                        "    <input size=\"50\" type=\"text\" nombre=\"nombre\">\n" +
                        "    <br>\n" +
                        "    Primer Apellido:<br>\n" +
                        "    <input size=\"50\" type=\"text\" nombre=\"apellido1\">\n" +
                        "    <br>\n" +
                        "    Segundo Apellido:<br>\n" +
                        "    <input size=\"50\" type=\"text\" nombre=\"apellido2\">\n" +
                        "    <br>\n" +
                        "    Fecha de Nacimiento:<br>\n" +
                        "    <input size=\"50\" type=\"date\" nombre=\"cumpleaños\">\n" +
                        "    <br>\n" +
                        "    Correo:<br>\n" +
                        "    <input size=\"50\" type=\"email\" nombre=\"correo\">\n" +
                        "    <br>\n" +
                        "    Contraseña:<br>\n" +
                        "    <input size=\"50\" type=\"password\" nombre=\"contraseña\">\n" +
                        "    <br>\n" +
                        "    <br>\n" +
                        "    <input type=\"submit\" value=\"Registrar\">\n" +
                        "  </fieldset>\n" +
                        "</form></div>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                PrintWriter out = response.getWriter();
                String name = request.getParameter("nombre");
                String ap1 = request.getParameter("apellido1");
                String ap2 = request.getParameter("apellido2");
                String cumple = request.getParameter("cumpleaños");
                String correo = request.getParameter("correo");
                String pass = request.getParameter("contraseña");

                out.println("<html>");
                out.println("<head><title>Copia</title></head>");
                out.println("<body>");
                out.println("<fieldset><h2>Copia de Registro</h2>");
                out.println("Su nombre completo: <strong>" + nombre + apellido1 + apellido2 + "</strong><br>");
                out.println("Su fecha de nacimiento: <strong>" + cumpleaños + "</strong><br>");
                out.println("Su correo: <strong>" + correo + "</strong><br>");
                out.println("Su contraseña: <strong>" + contraseña + "</strong><br>");
                out.println("</body></html>");
    }
    


	private void response(HttpServletResponse resp)
			throws IOException {
            
	}
}