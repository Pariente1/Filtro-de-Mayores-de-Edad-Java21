import java.util.ArrayList;
import java.util.List;

public class Persona {
    String nombre;
    int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public static List <Persona> MayoresDeEdad(List<Persona> personas){
        List<Persona> Mayores = new ArrayList<>();

        for(Persona persona: personas){
            if (persona.getEdad() >= 18){
                Mayores.add(persona);
            }

        }
        return Mayores;
    }
}


