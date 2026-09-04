
public class Alumno
{
    String nombre;
    String carrera;
    int edad;

    public Alumno(String nombre, String carrera, int edad) {
        this.nombre = nombre;
        this.carrera = carrera;
        this.edad = edad;
    }


    public Alumno(String nombre)
    {
       this("Fabrizio","Sin carrera asignada",0);
    }

    void presentarse()
    {
        System.out.println("Hola, soy "+nombre+", tengo " +edad+" años, y estoy estudiando la carrera de "+carrera+".");
    }
}
