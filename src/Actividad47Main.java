import java.util.Random;

public class Actividad47Main {
    public static void main(String[] args) {
        // Declaramos un Array de enteros, cuyo contenido será los nombres de los compañeros de clase
        String[] alumnos={"John", "Jorge", "Victor", "David", "Jonathan", "Pablo", "Juan Manuel Saborido", "Julián", "José", "Juan Maria","Adrian", "Juan Manuel Herrera", "Jossie", "Diego", "Antonio Tellez", "Ricardo", "Daniel Alfonso"};
        Boolean[] repetido=new Boolean[alumnos.length];
        alumnoAleatorio(alumnos,repetido);

        // Podríamos hacer un array de valores boooleanos
    }
    public static void alumnoAleatorio (String[] a, Boolean[] b){
        Random aleatorio=new Random();
        int alumnoRandom=aleatorio.nextInt(a.length);
        b[alumnoRandom]=true;
        System.out.println("Alumno seleccionado= "+a[alumnoRandom]);



    }


}