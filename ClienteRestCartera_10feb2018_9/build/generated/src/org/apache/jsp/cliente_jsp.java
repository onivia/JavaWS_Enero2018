package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import wscliente.NewJerseyClient;

public final class cliente_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


    enum Estados {FORMULARIO, RESPUESTA, MENSAJE};

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write('\n');

    NewJerseyClient equipo;
    Estados estado = Estados.FORMULARIO;
    String cuenta = null;
    int saldo = 0;
      
    if(request.getParameter("cuenta") != null){
        cuenta = request.getParameter("cuenta");
        estado = Estados.RESPUESTA;
        saldo = Integer.valueOf(cuenta);
    }

      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Cliente Rest</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Cliente Rest - Cartera</h1>\n");
      out.write("        ");
 if ( estado == Estados.FORMULARIO ){
      out.write("\n");
      out.write("        <form name=\"form1\" method=\"post\" action=\"cliente.jsp\">\n");
      out.write("            <table width=\"354\">\n");
      out.write("                <tr>\n");
      out.write("                    <td width=\"130\">Codigo de Cuenta</td>\n");
      out.write("                    <td width=\"84\"><input type=\"text\" name=\"cuenta\"></td>\n");
      out.write("                    <td width=\"130\">Abono</td>\n");
      out.write("                    <td width=\"84\"><input type=\"text\" name=\"abono\"></td>\n");
      out.write("                    <td width=\"124\"><input type=\"submit\" value=\"Actualizar\"></td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("        ");
}else if( estado == Estados.RESPUESTA){ 
      out.write("\n");
      out.write("        <table width =\"257\">\n");
      out.write("            <tr>\n");
      out.write("                <td width=\"78\">Cuenta</td>\n");
      out.write("                <td width=\"167\">");
      out.print(cuenta);
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Saldo</td>\n");
      out.write("                <td>");
      out.print(saldo);
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("            <p><a href=\"cliente.jsp\">Regresar</a></p>    \n");
      out.write("        ");
}
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
