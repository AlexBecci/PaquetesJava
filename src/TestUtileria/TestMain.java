
package TestUtileria;

import arg.com.paginaBecci.Utileria;
//import arg.com.paginaBecci.*;
//import static arg.com.paginaBecci.Utileria.imprimir;

public class TestMain {
    
    public static void main(String[] args) {
        
    Utileria.imprimir("Alex");
       // imprimir("Nombre : x\nimportado con paquete statico ");
       arg.com.paginaBecci.Utileria.imprimir("Ale");//Nombre completamente calificado.No se entiende bien el codigo asi
    }
}
