package model;

import java.sql.CallableStatement;
import java.sql.Connection;


public class TestProcedimiento1 {
    public static void main(String args[])throws Exception{
        Conexion c=new Conexion();
        Connection con=c.conectarse();
     CallableStatement datos=con.prepareCall("{call GUARDAR_PELICULA(?,?,?)}");
        datos.registerOutParameter(1,java.sql.Types.INTEGER);
        datos.setString(2,"IT");
        datos.setString(3,"El payaso terrorifico ");
      
        datos.execute();
        int pk=datos.getInt(1);
        System.out.println("El id ingresado es:"+pk);
    }
    
}
