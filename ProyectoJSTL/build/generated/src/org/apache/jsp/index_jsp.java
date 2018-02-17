package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action=\"siguiente.jsp\" method=\"post\">\n");
      out.write("            <center><h1>Adivine Bandas</h1></center>\n");
      out.write("            <center><p>Ingrese su nombre: <input type=\"text\" name=\"nombre\"/></p></center>\n");
      out.write("            <br>\n");
      out.write("            <center><p>Ingrese su apellido: <input type=\"text\" name=\"apellido\"/></p></center>\n");
      out.write("            <br>\n");
      out.write("            \n");
      out.write("            <p>\n");
      out.write("            <div align=\"center\"><img src=\"img/img1.jpg\" width=\"250\" height=\"150\"/></div>\n");
      out.write("            </p>\n");
      out.write("            <p>\n");
      out.write("            <div align=\"center\"><input type=\"text\" name=\"banda1\"></p>\n");
      out.write("                \n");
      out.write("            <p>\n");
      out.write("            <div align=\"center\"><img src=\"img/img2.jpg\" width=\"250\" height=\"150\"/></div>\n");
      out.write("            </p>\n");
      out.write("            <p>\n");
      out.write("            <div align=\"center\"><input type=\"text\" name=\"banda2\"></p>\n");
      out.write("      \n");
      out.write("            <p>\n");
      out.write("            <div align=\"center\"><input type=\"submit\" value=\"enviar\"/></p>\n");
      out.write("        </form>\n");
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
