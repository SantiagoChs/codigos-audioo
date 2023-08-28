

package estudiante;

public class Estudiante {
private  String nombrea_pellido;
private  String universidad;
private  int codigouniversitario;

   

    public Estudiante(){
      nombrea_pellido = "Ivan Chaves";
        universidad = "Uniagustiniana";
         codigouniversitario = 22202369;
    }
    public Estudiante (String nombre_apellido,String universidad, int codigouniversitario ){
    this.nombrea_pellido = nombre_apellido;
     this.universidad = universidad;
        this.codigouniversitario = codigouniversitario;
    }
 
    
    public String getNombrea_apellido(){
       return nombrea_pellido;   
    }
    public void setNombrea_apellido(String nombrea_apellido){
        this.nombrea_pellido = nombrea_apellido;
    }
    public String getUniversidad(){
       return universidad;   
    }
    public void setUniversidad(String nombrea_apellido){
        this.universidad  = universidad;
    }
      public int getcodigouniversitario(){
       return codigouniversitario;
      }
     public void setcodigouniversitario(int codigouniversitario){
        this.codigouniversitario = codigouniversitario; 
}
       public static void main (String[] argas){
        estudiante Estudiante = new estudiante ();
        universidad universidad = new Universidad();
        system.out.println("Nombre del estuduante:"+universidad1.getnombre);
        system.out.println("Cedula del estudiante."+universidad1.getcedula);
        system.out.println("nombrea_pellido:"+Estudiante1.getNombrea_apellido);
        system.out.println("universidad:"+Estudiante1.getUniversidad);
        system.out.println("codigo universitario);"+Estudiante1.getcodigouniversitario);
    }  
     
     
}