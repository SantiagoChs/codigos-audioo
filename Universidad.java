
package estudiante;

public class Universidad extends Estudiante implements Info {
private String nombre;
private int cedula;


public Universidad() {
    nombre = "Santiago Chaves";
    cedula =0;
}
public univesidad (String nombre, int Cedula, String nombrea_pellido, String universidad,int codigouniversitario){
    super (nombrea_pellido, universidad, codigouniversitario);
    this.cedula=cedula;
}
  public String getnombre(){
        return nombre;
}
public void setnombre(String nombre){
    this.nombre=nombre;
}
public int getcedula(){
   return edad;
}
public void setcedula(int cedula){
   this.edad=edad;
}
@Override
public String obtenerInformacion(){
return "nombre del estudiante"+nombre+"''\ncedula"+cedula+\""
}
}
