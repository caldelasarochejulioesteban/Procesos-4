/********************************************************************
 ejercicio: 5a
 Autor:     Caldelas Aroche Julio Esteban
 Fecha:     Diciembre-04-2025

Descripcion de la clase:
     * Método principal (main) del programa.
     *
     * Este método actúa como punto de entrada de la aplicación. Su única
     * responsabilidad es:
     *
     * 1.Declarar una instancia de la clase Logic.
     * 2.Inicializar el objeto Logic.
     * 3.Invocar el método logic1a(), que contiene el flujo principal del programa.
*********************************************************************/

//inicio de la clase
public class App{

    public static void main(String[] args)
    {
        // Crear y ejecutar la lógica principal del programa.
        Logic controller = new Logic(); // Instancia de la clase que orquesta el flujo.
        controller.logic1a();            // Ejecuta el procesamiento principal.
    }
}//Fin de la clase
