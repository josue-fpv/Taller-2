package ejercicio.pkg1;


public class Rectangulo {
    
    double Ancho=1;
    double Altura=1;
    
    public Rectangulo(double ancho,double altura){     
        this.Ancho=ancho;
        this.Altura=altura;   
    }

    public double getAncho() {
        return Ancho;
    }

    public double getAltura() {
        return Altura;
    }
    
    public void Area_Perimetro(){
        
        System.out.println("==== EL ANCHO ES ====: "+this.getAncho());
        System.out.println("==== LA ALTURA ES ====: "+this.getAltura());
    }
    
    public void Area(){
    double area=Ancho*Altura;
       System.out.println("=== AREA ===: "+area);
    }
    
    public void Perimetro(){
    double perimetro=2*(Ancho+Altura);
       System.out.println("=== PERIMETRO ===: "+perimetro);
    }
    public static void main(String[] args) {
        System.out.println("<:::::: RECTANGULO 1 ::::::> ");
        Rectangulo rect = new Rectangulo(4,40);
        rect.Area_Perimetro();
        rect.Area();
        rect.Perimetro();
        System.out.println("<::::::::::::::::::::::> ");
        
        System.out.println("<:::::: RECTANGULO 2 ::::::> ");
        Rectangulo rect1 = new Rectangulo(3.5,35.9);
        rect1.Area_Perimetro();
        rect1.Area();
        rect1.Perimetro();
        
    }
    
}
