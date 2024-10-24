package diegosuarez.Tarea2DWES24;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

import modelo.Planta;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Scanner in = new Scanner(System.in);
        System.out.println("dame el codigo");
        
        String codigo= in.nextLine().trim().toUpperCase();
        System.out.println("Dam eel nombre");
        String nombrw_comun= in.nextLine();
        System.out.println("Dame el m,bre cientifico");
        String nombre_cientifico= in.nextLine();
        
        Planta nueva = new Planta(codigo, nombre_cientifico, nombrw_comun);
        
        Connection con;
        String url;
        String numero;
        String pass;
        
        try {
        	con = DriverManager.getConnection(url);
        	
        }catch (Exception e) {
			// TODO: handle exception
		}
        
    }
}
