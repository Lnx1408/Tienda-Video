package tienda_video;

public class Pelicula extends Video{
private boolean Original;
private int Emision;

// ------------------- constructores ----------------------------------

public Pelicula(){}
public Pelicula(String Titulo, String Codigo, String Genero, float Precio,boolean Original,int Emision){
    super(Titulo, Codigo, Genero, Precio);
    this.Original = Original;
    this.Emision = Emision;
}

@Override
public double CalcularPrecio(){
    if (Original == true){
        Precio+=1.90;
    }else{
        Precio+=0.50;
    }
    return 0;
} 

@Override
public void PedirDatos(){
    System.out.println("-------------------- Ingrese los datos de la Pelicula --------------------\n");
    super.PedirDatos();
    System.out.println("Es original: ");
    Original = ingresar.nextBoolean();
    System.out.println("Año de Emision: ");
    Emision = ingresar.nextInt();
    System.out.println("---------------------------------------------------------------------------\n");
}

    @Override
    public void MostrarDatos() {
            System.out.println("-------------------- Detalles de compra: Pelicula --------------------");
        super.MostrarDatos();
        if(Original==true){
            System.out.println("Original: Si");
        }else{
            System.out.println("Original: No");
        }
        System.out.println("Emision " + Emision+"\nPrecio: "+Precio);
        Precio =3.00f;
        System.out.println("---------------------------------------------------------------------------");
        
    }

}
