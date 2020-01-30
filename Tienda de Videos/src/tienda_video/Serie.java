package tienda_video;

public class Serie extends Video{
private int NCapitulos;
private int Ntemporadas;
public float PrecioCI;
public float PrecioNI;

//----------------------- Constructores -----------------
public Serie(){}
public Serie(String Titulo, String Codigo, String Genero, float Precio,int NCapitulos,int Ntemporadas){
    super(Titulo,Codigo,Genero,Precio);
    this.NCapitulos = NCapitulos;
    this.Ntemporadas = Ntemporadas;
}


@Override
public double CalcularPrecio(){
            PrecioNI=Precio + 0.25f*NCapitulos;
    return 0;
}


public double CalcularPrecio(float Incremento){
        PrecioCI = (Precio +(0.25f*NCapitulos))+(Precio +(0.25f*NCapitulos))*Incremento;
    return 0;
}


@Override
public void PedirDatos(){
    System.out.println("-------------------- Ingrese los datos de la Serie --------------------");
    super.PedirDatos();
    System.out.println("Numero de capitulos: ");
    NCapitulos = ingresar.nextInt();
    System.out.println("Numero de temporadas ");
    Ntemporadas = ingresar.nextInt();
    System.out.println("---------------------------------------------------------------------------\n");
}

@Override
public void MostrarDatos(){
    System.out.println("-------------------- Detalles de compra: Serie --------------------\n");
    super.MostrarDatos();
    System.out.println("Numero de capitulos: "+NCapitulos+"\nNumero de temporadas "+Ntemporadas+"\nPrecio: "+PrecioNI+"\nPrecio con incremento "+PrecioCI);
        Precio=3.00f;
        PrecioNI=0.00f;
        PrecioCI =0.00f;
        System.out.println("---------------------------------------------------------------------------");
}

}
