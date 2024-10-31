import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Persona Juan = new Persona();

        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Carlos", 14));
        personas.add(new Persona("Pepe", 21));
        personas.add(new Persona("Junior", 18));
        personas.add(new Persona("Marco", 4000));
        personas.add(new Persona("Abathur", 13));
        System.out.println(personas);

        List<Persona> mayores = Persona.MayoresDeEdad(personas);
        System.out.println(mayores);
        System.out.println("Lista de las personas mayores de edad que mandaron su solicitud: ");

        for (Persona persona: mayores){
            System.out.println(persona.getNombre() + " su edad es " + persona.getEdad() );
        }

    }

}