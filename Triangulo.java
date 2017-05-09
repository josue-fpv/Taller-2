package Josue_Plaza.pkg3;


public class Triangulo {
    double lado_1=1.0;
    double lado_2=1.0;
    double lado_3=1.0;
    
    double base;
    double altura;

    public Triangulo(double lado_1, double lado_2, double lado_3, double bas,double al) {
        this.lado_1 = lado_1;
        this.lado_2 = lado_2;
        this.lado_3 = lado_3;
        
        this.base=bas;
        this.altura=al;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLado_1() {
        return lado_1;
    }

    public void setLado_1(double lado_1) {
        this.lado_1 = lado_1;
    }

    public double getLado_2() {
        return lado_2;
    }

    public void setLado_2(double lado_2) {
        this.lado_2 = lado_2;
    }

    public double getLado_3() {
        return lado_3;
    }

    public void setLado_3(double lado_3) {
        this.lado_3 = lado_3;
    }
    
    public void Area(){
    double area=(base*altura)/2;
       System.out.println("=== AREA ===: "+area);
    }
    
    public void Perimetro(){
    double perimetro=this.lado_1+this.lado_2+this.lado_3;
       System.out.println("=== PERIMETRO ===: "+perimetro);
    }
    
    
   
    public static void main(String[] args) {
        
        System.out.println("<:::::: Triangulo 1 ::::::> ");
        Triangulo tri = new Triangulo(1,1.5,1,4,8);
        tri.Area();
        tri.Perimetro();
        System.out.println("<::::::::::::::::::::::> ");
        
    }
}
