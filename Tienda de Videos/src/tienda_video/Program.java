package tienda_video;
import java.util.Scanner;

public class Program {
    public String Confirmar="";
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Program pro = new Program();
        pro.Iteracion();
        
        } 
     public void Validacion(){
        while(!Confirmar.equals("1")&&!Confirmar.equals("2")&&!Confirmar.equals("3")){
         System.out.println("Ingrese una opcion correcta: \n\"1\" = Ingresar serie \n\"2\" = Ingresar Pelicula\n\"3\"= Salir");
         Confirmar = sc.nextLine();
        }
        }
    
    public void Iteracion(){
        Pelicula pelicula = new Pelicula();
       Serie serie = new Serie();
    
       while (!Confirmar.equals("3")) {  
       System.out.println("Seleccione una opcion:      1) Ingresar Serie           2) Ingresar Pelicula            3) Salir");     
       Confirmar = sc.nextLine();
       Validacion();
             if (Confirmar.equals("2")){ 
       pelicula.PedirDatos();
        pelicula.CalcularPrecio();
        pelicula.MostrarDatos();
             }
       
        if(Confirmar.equals("1")){
        serie.PedirDatos();
        serie.CalcularPrecio();
        serie.CalcularPrecio(0.22f);
        serie.MostrarDatos();
        }
        }
        System.out.println("Programa Finalizado");
    }
}
