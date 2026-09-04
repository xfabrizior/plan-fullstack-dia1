public class Main
{
    public static void main(String[] args)
    {
        Alumno alumno1 = new Alumno("Fabrizio", "Ingenieria de sistemas", 24);
        alumno1.presentarse();
        alumno1.setEdad(-3);
        alumno1.presentarse();

        //for -> Ya sabes cuantas vueltas dará el bucle
        for(int i=1;i<=5;i++)
        {
            System.out.println(i);
        }

        //while -> No sabes cuantas veces se repetira
        //se repite mientras algo sea cierto
        int i =1;
        while(i<=5)
        {

            System.out.println(i);
            i++;
        }

    }

}