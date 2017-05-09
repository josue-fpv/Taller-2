
package ejercicio4;


public class Persona {
    
    private String Nombre;
    private String Direccion;
    private int telefono;
    private String Email;

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    
    @Override
    public String toString(){
        return this.Nombre+" "+this.Direccion+"  "+this.telefono;
    }
}
    

    
    
    
    