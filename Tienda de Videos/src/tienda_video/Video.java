package tienda_video;
import java.util.Scanner;

public abstract class Video {
    protected String Codigo;
    protected String Titulo;
    protected String Genero;
    protected float Precio = 3.00f;
    Scanner ingresar = new Scanner(System.in);
    

    
    
    
    // --------------------------------- Constructor ------------------------------------------------
    public Video(){}
    
    public Video(String Titulo, String Codigo, String Genero, float Precio){
        this.Titulo = Titulo;
        this.Codigo = Codigo;
        this.Genero = Genero;
        this.Precio = Precio;
    }

    
    public abstract double CalcularPrecio();
    
    public void PedirDatos(){
        System.out.println("Ingresar Titulo:");
        Titulo =ingresar.nextLine();
        System.out.println("Ingresar Codigo:");
        Codigo = ingresar.nextLine();
        System.out.println("Ingresar Genero:");
        Genero = ingresar.nextLine();
    }
    
    public void MostrarDatos() {
        System.out.println("Titulo: " + Titulo +"\nCodigo: " + Codigo + "\nGenero: " + Genero);
    }
}
