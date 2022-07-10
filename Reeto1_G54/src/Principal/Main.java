    package Principal;
import Vistas.*;
import Modelo.*;


public class Main {


    public static void main(String[] args) {
        //1.  Creamos la isntancia de la clase conexion
        Conexion conexion = new Conexion();
        conexion.getConnection();   
        //2. creamos unsa instancia de la vista login
        Login login = new Login();
        //3. Mediante la instacia de la vista llamamos al metodo que la hace visible  
        login.setVisible(true);
    }
    
}
