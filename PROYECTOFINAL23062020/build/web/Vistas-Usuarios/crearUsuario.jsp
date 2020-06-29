<%-- 
    Document   : crearUsuario
    Created on : 06-26-2020, 12:39:15 PM
    Author     : alex
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:useBean id="usuario" scope="session" class="Model.Usuario" />
<%
    String id_u = "";
    String nombre_u = "";
    String apellido_u = "";
    String correo_u = "";
    String clave_u = "";
    String tipo_u = "";
    String estado_u = "";
    String pregunta_u = "";
    String respuesta_u = "";
    if(request.getParameter("senal")!=null){
        /*String id = request.getParameter("id_c");
        String nombre_cat = request.getParameter("nombre_c");
        String estado_cat = request.getParameter("estado_c");*/
        id_u = request.getParameter("id_u");
        nombre_u = request.getParameter("nombre_u");
        apellido_u = request.getParameter("apellido_u");
        correo_u = request.getParameter("correo_u");
        clave_u = request.getParameter("clave_u");
        tipo_u= request.getParameter("estado_c");
        estado_u = request.getParameter("estado_u");
        pregunta_u = request.getParameter("respuesta_u");
        respuesta_u = request.getParameter("respuesta_u");
    }else{
        id_u = String.valueOf(usuario.getId());    //Id predeterminado cero definido en el constructor
        nombre_u = usuario.getNombre();
        apellido_u= usuario.getApellido();
        correo_u= usuario.getCorreo();
        clave_u = usuario.getClave();
        tipo_u = String.valueOf(usuario.getTipo());
        estado_u= String.valueOf(usuario.getEstado());
        pregunta_u= usuario.getPregunta();
        respuesta_u = usuario.getRespuesta();
    }
%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
           <%@include file="../WEB-INF/Vistas-Parciales/css-js.jspf" %>
        
        <script type="text/javascript">
            //Función para el botón regresar.
            function regresar(url){
                location.href = url;
            }
        </script>
        <title>JSP Page</title>
    </head>
    <body>
         <%@include file="../WEB-INF/Vistas-Parciales/encabezado.jspf" %>
           
        <h3>Mantenimiento Categorias</h3>
        <form class="form-horizontal" id="frmCategoria" name="frmusuario" action="<%= request.getContextPath() %>/usuarios" method="post">
            <input type="hidden" name="id" value="<%= usuario %>" >
            
            <div class="form-group">
                <label for="txtNomUsuario" class="col-sm-2 control-label">Nombre:</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" name="txtNomUsuario" value="<%= nombre_u %>" required>
                </div>
            </div>
                
           <div class="form-group">
                <label for="txtApellidoUsuario" class="col-sm-2 control-label">Apellido:</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" name="txtApellidoUsuario" value="<%= apellido_u %>" required>
                </div>
            </div>
           
          <div class="form-group">
                <label for="txtCorreoUsuario" class="col-sm-2 control-label">Correo:</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" name="txtCorreoUsuario" value="<%= correo_u %>" required>
                </div>
            </div> 
                
             <div class="form-group">
                <label for="txtClaveUsuario" class="col-sm-2 control-label">Clave:</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" name="txtClaveUsuario" value="<%= clave_u %>" required>
                </div>
            </div>  
             <div class="form-group">
                <label for="txtTipoUsuario" class="col-sm-2 control-label">Tipo:</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" name="txtTipoUsuario" value="<%= tipo_u %>" required>
                </div>
            </div>  
             <div class="form-group">
                <label for="txtEstadoUsuario" class="col-sm-2 control-label">Estado:</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" name="txtEstadoUsuario" value="<%= estado_u %>" required>
                </div>
               </div>   
             <div class="form-group">
                <label for="txtPreguntaUsuario" class="col-sm-2 control-label">Pregunta:</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" name="txtPreguntaUsuario" value="<%= pregunta_u %>" required>
                </div>
            </div>   
                
                <div class="form-group">
                <label for="txtRespuestaUsuario" class="col-sm-2 control-label">Respuesta:</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" name="txtRespuestaUsuario" value="<%= respuesta_u %>" required>
                </div>
            </div>
                
                
             
                
            <div class="form-group">
                <div class="col-sm-offset-2 col-sm-10">
                    <%
                        if(request.getParameter("senal")!=null){
                    %>
                    <input type="submit" class="btn btn-default btn-sm" name="btnModificar" value="Actualizar" />
                    <%
                        }else{   
                    %>    
                    <input type="submit" class="btn btn-success btn-sm" name="btnGuardar" value="Guardar" />
                    <%
                        }  
                    %> 
                    <input type="button" class="btn btn-info btn-sm" onclick="regresar('<%= request.getContextPath() %>/Usuarios?opcion=listar')" 
                           name="btnRegresar" value="Regresar" />
                </div>
            </div>   
        </form>

         <%@include file="../WEB-INF/Vistas-Parciales/pie.jspf" %>
    </body>
</html>
