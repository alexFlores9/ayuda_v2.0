package Test;
import DAO.*;
import Model.*;
import java.util.List;
/**
 *
 * @author PC
 */
public class PruebaPro {
    public static void main(String[] args) {
        PruebaPro evaluar = new PruebaPro();
        evaluar.guardaProductos();
        evaluar.listarProductos();
        //evaluar.edidarProductos();
        
    }
    
    public void listarProductos(){
        ProductoDAO producto = new ProductoDAOImplementar();
        //Aun no se si funcionará esto XD
        List<Producto> listar = producto.Listar();
         System.out.println("LISTADO DE PRODUCTOS: ");
         
         for(Producto productoListar : listar){
             System.out.println("ID: "+productoListar.getId_producto()+
                                " NOMBRE: "+productoListar.getNom_producto()+
                                " STOCK: "+productoListar.getStock()+
                                " PRECIO: "+productoListar.getPrecio()+
                                " UNIDAD DE MEDIDA: "+productoListar.getUnidad_de_medida()+
                                " ESTADO DEL PRODUCTO:"+productoListar.getEstado_producto()+"\n"+
                                " CATEGORIA: "+productoListar.getCategoria()+
                                " DESCRIPCION DEL PRODUCTO: "+productoListar.getDes_producto()+
                                " FECHA DE ENTRADA: "+productoListar.getFecha_entrada()
                     
             ); 
             
         }
         System.out.println(":/");
    }
    public void edidarProductos(){
        ProductoDAO producto = new ProductoDAOImplementar();
        //CategoriaDAO categoria =new CategoriaDAOImplementar();
        Producto pro_edit = producto.editarPro(2);
       
        System.out.println("PRODUCTOS MODIFICAR: ");
        System.out.println("ID: "+pro_edit.getId_producto()+
                           " NOMBRE: "+pro_edit.getNom_producto()+
                           " STOCK: "+pro_edit.getStock()+
                           " UNIDAD DE MEDIDA: "+pro_edit.getUnidad_de_medida()+
                           " PRECIO:$ "+pro_edit.getPrecio()+
                           " ESTADO DEL PRODUCTO: "+pro_edit.getEstado_producto()+
                           " CATEGORIA: "+pro_edit.getCategoria()+
                           " DESCIRPCION: "+pro_edit.getDes_producto()+
                           " FECHA: "+pro_edit.getFecha_entrada()
                );
                
    }
    
    public void guardaProductos(){
        java.util.Date utilDate = new java.util.Date();
        long InMilisegundos = utilDate.getTime();
        java.sql.Date sqlDate = new java.sql.Date(InMilisegundos);
        java.sql.Timestamp sqlTimestamp = new java.sql.Timestamp(InMilisegundos);
        
        ProductoDAO producto = new ProductoDAOImplementar();
        Producto guarda_pro = new Producto();
        
        guarda_pro.setNom_producto("HOLA MUNDO");
        guarda_pro.setStock(1);
        guarda_pro.setPrecio(1);
        guarda_pro.setUnidad_de_medida("HOLA UNIDAD");
        guarda_pro.setEstado_producto(1);
        guarda_pro.getCategoria();
        guarda_pro.setDes_producto("HOLA DESCIPCION");
        guarda_pro.setFecha_entrada(sqlTimestamp);
        
        producto.guardarPro(guarda_pro);
    }
}
