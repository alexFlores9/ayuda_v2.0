package org.apache.jsp.Vistas_002dUsuarios;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Model.Usuario;

public final class listarUsuarios_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/Vistas-Usuarios/../WEB-INF/Vistas-Parciales/css-js.jspf");
    _jspx_dependants.add("/Vistas-Usuarios/../WEB-INF/Vistas-Parciales/encabezado.jspf");
    _jspx_dependants.add("/Vistas-Usuarios/../WEB-INF/Vistas-Parciales/pie.jspf");
  }

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
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<!-- El id debe ser el mismo que se le colocó de nombre a la sesión en el controlador -->\n");
      java.util.List listaa = null;
      synchronized (session) {
        listaa = (java.util.List) _jspx_page_context.getAttribute("listaa", PageContext.SESSION_SCOPE);
        if (listaa == null){
          try {
            listaa = (java.util.List) java.beans.Beans.instantiate(this.getClass().getClassLoader(), "java.util.List");
          } catch (ClassNotFoundException exc) {
            throw new InstantiationException(exc.getMessage());
          } catch (Exception exc) {
            throw new ServletException("Cannot create bean of class " + "java.util.List", exc);
          }
          _jspx_page_context.setAttribute("listaa", listaa, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Control de Inventario</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("       \n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Estilo personalizado -->\n");
      out.write("<link href=\"bootstrap/css/estilo-base.css\" type=\"text/css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<!-- Estilos bootstrap -->\n");
      out.write("<link href=\"bootstrap/css/bootstrap-theme.css\" type=\"text/css\" rel=\"stylesheet\">\n");
      out.write("<link href=\"bootstrap/css/bootstrap-theme.min.css\" type=\"text/css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<link href=\"bootstrap/css/bootstrap.css\" type=\"text/css\" rel=\"stylesheet\">\n");
      out.write("<link href=\"bootstrap/css/bootstrap.min.css\" type=\"text/css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<!-- Script js de bootstrap -->\n");
      out.write("<script src=\"bootstrap/js/bootstrap.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"bootstrap/js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("<!-- Script librería de jquery -->\n");
      out.write("<script src=\"bootstrap/js/jquery-3.2.1.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"bootstrap/js/jquery-3.2.1.min.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       \n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("  <link href=\"bootstrap/css/propio.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("<div>\n");
      out.write("   \n");
      out.write("      <div class=\"encabezado \" id=\"menu\">\n");
      out.write("       \n");
      out.write("        <!-- Los href aca apuntan a los servlets creados dentro del controlador -->\n");
      out.write("        \n");
      out.write("        <!--<a href=\"categorias\" class=\"btn btn-primary btn-sm\" role=\"button\">Categorias</a>-->\n");
      out.write("   \n");
      out.write("        \n");
      out.write("           \n");
      out.write("           \n");
      out.write("          \n");
      out.write("<ul >\n");
      out.write("    <li><h4> SISTEMA DE CONTROL DE INVENTARIO</h4></li>\n");
      out.write("    <li><a href=\"index1.jsp\"  role=\"button\">Inicio</a> </li>\n");
      out.write("    <li>     <a href=\"categorias?opcion=listar\"  role=\"button\">Categorias</a> </li>\n");
      out.write("       <li>     <a href=\"usuarios\"  role=\"button\">prueba</a> </li>\n");
      out.write("  <li><a href=\"#\">Usuario</a>\n");
      out.write("    <ul>\n");
      out.write("      <li><a href=\"index.jsp?cerrar=true\">Cerrar sesion</a></li>\n");
      out.write("   \n");
      out.write("      \n");
      out.write("    \n");
      out.write("    </ul>\n");
      out.write("  </li>\n");
      out.write("\n");
      out.write("</ul>\n");
      out.write("\n");
      out.write("  \n");
      out.write("       \n");
      out.write("    </div>\n");
      out.write("    <div class=\"contenido\">\n");
      out.write("   <!--Este div no se cierra aquí, se cierra en el pie.jspf -->\n");
      out.write("\n");
      out.write("        \n");
      out.write("        <!-- Todo el contenido de la aplicación -->\n");
      out.write("        \n");
      out.write("        <div style=\"width: 600px;\">\n");
      out.write("            <!--<a href=\"#\" class=\"btn btn-success btn-sm glyphicon glyphicon-pencil\" role=\"button\">Nueva categoria</a>-->\n");
      out.write("        /\n");
      out.write("            <h3>Listado de Categorias Registradas</h3>\n");
      out.write("            <table class=\"table table-striped\">\n");
      out.write("                <tr>\n");
      out.write("                    <th>ID</th><th>NOMBRE</th><th>APELLIDO</th><th>CORREO</th><th>CLAVE</th> <th>TIPO</th><th>ESTADO</th><th>PREGUNTA</th><th>RESPUESTA</th><th>FECHA</th>\n");
      out.write("                </tr>\n");
      out.write("                ");

                    for(int i=0;i < listaa.size(); i++){
                        Usuario usu = new Usuario();
                        usu = (Usuario)listaa.get(i);
                    //}
                
      out.write("\n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                    <td>");
      out.print( usu.getId() );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( usu.getNombre());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( usu.getApellido() );
      out.write("</td>\n");
      out.write("                     <td>");
      out.print( usu.getCorreo());
      out.write("</td>\n");
      out.write("                      <td>");
      out.print( usu.getClave() );
      out.write("</td>\n");
      out.write("                       <td>");
      out.print( usu.getTipo() );
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( usu.getEstado() );
      out.write("</td>\n");
      out.write("                         <td>");
      out.print( usu.getPregunta() );
      out.write("</td>\n");
      out.write("                          <td>");
      out.print( usu.getRespuesta() );
      out.write("</td>\n");
      out.write("                           <td>");
      out.print( usu.getFecha_registro() );
      out.write("</td>\n");
      out.write("                    \n");
      out.write("                    <td>\n");
      out.write("                        <!-- /Vistas-Categorias/crearCategoria.jsp -->\n");
      out.write("                       \n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                ");

                    }
                
      out.write("\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("        <!-- End content -->\n");
      out.write("        <!--Boton para imprimir-->\n");
      out.write("        <form name=\"reporte\" action=\"/PROYECTOFINAL/pdf\" method=\"POST\">\n");
      out.write("            <input type=\"submit\" value=\"IMPRIMIR PDF\" name=\"btnver\" />\n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Aquí se deben cerrar los div abiertos en encabezado.jspf -->\n");
      out.write("\n");
      out.write("    \n");
      out.write("    <div class=\"pie\">\n");
      out.write("        @COPY; ITCA-FEPADE\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
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
