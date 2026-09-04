
public class Alumno
{
    private String nombre;
    private String carrera;
    private int edad;

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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad>=0)
        {
            this.edad = edad;
        }
    }
}
