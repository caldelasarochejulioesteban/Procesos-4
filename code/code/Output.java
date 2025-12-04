/********************************************************************
 ejercicio: 5a
 Autor:     Caldelas Aroche Julio Esteban
 Fecha:     Diciembre-04-2025

Descripcion de la clase:
     * Proporciona un método para escribir texto en un archivo externo.
     * Encapsula las operaciones de manejo de flujos de salida, siguiendo
     * una estructura clara y controlada.

*********************************************************************/

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Output
{

    public void writeData(String outFile, String outText) 
    {
        // Se usa try-with-resources para asegurar cierre del recurso.
        try (PrintWriter writer = new PrintWriter(new FileWriter(outFile))) 
        {
            writer.print(outText); // Escribe el contenido tal cual.
        } 
        catch (IOException e) // Captura problemas de IO.
        {
            System.err.println("Error al escribir archivo de salida: " + e.getMessage());
        }
    }
}
