package Plaza.pkg2;
import java.util.Date;

public class Cuenta {
    
    private int Id;
    private double Saldo;
    private double InteresAnual;
    private Date FechaCreacion;
    double retiro;
    double deposito;
    
    public void Cuenta(int id,double saldo,double intan,Date fecre){
        this.Id=id;
        this.Saldo=saldo;
        this.InteresAnual=intan;
        this.FechaCreacion=fecre;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }

    public double getInteresAnual() {
        return InteresAnual*0.045;
    }

    public void setInteresAnual(double InteresAnual) {
        this.InteresAnual = InteresAnual;
    }

    public Date getFechaCreacion() {
        return FechaCreacion;
    }

    public void setFechaCreacion(Date FechaCreacion) {
        this.FechaCreacion = FechaCreacion;
    }
    
    public double getInteresMensual () {
       double valor = this.Saldo * 0.045 ;
       return valor ; 
    }
    private double Retiro () {
       double valor1=0;
       return valor1;
    }
    public double Deposito () {
      
    double valor2 = this.Saldo + deposito ; 
    return valor2;
    }
    
    private double getRetiro() {
        double valor3 = this.Saldo - (retiro + deposito);
        return valor3 ;    
    }
    
    public void Balance (){
        System.out.println("=== ID ===: " +this.getId () );
        System.out.println("====== SALDO ======: " +this.getSaldo());
        System.out.println("====== RETIRO =====: " +this.retiro);
        System.out.println("====== DEPOSITO =====: "+deposito);
        System.out.println("==== SALDO DISPONIBLE ======:" +this.getRetiro());
        System.out.println("== INTERES MENSUAL ==:" +this.getInteresMensual ()); 
        System.out.println("== FECHA DE CRECACION ==:" +getFechaCreacion());
    }
     
    public static void main(String[] args) {
        
        Cuenta per = new Cuenta ();
        per.Id = 1122;
        per.Saldo = 20000;
        per.retiro= 2500;
        per.deposito=3000;
        per.Balance () ;
        
    } 
}
