public class TestEstudiante {
    static void main() {
        try {
            Estudiante estudiante1 = new Estudiante("Alvaro",20,0);
            System.out.println(estudiante1);
        }catch (IllegalArgumentException e){
            System.out.println("Error: "+e.getMessage());
        }

        try {
            Estudiante estudiante2 = new Estudiante("Juan",22,10);
            System.out.println(estudiante2);
        }catch (IllegalArgumentException e){
            System.out.println("Error: "+e.getMessage());
        }

        try {
            Estudiante estudiante3 = new Estudiante("Lucia",2,-1);
            System.out.println(estudiante3);
        }catch (IllegalArgumentException e){
            System.out.println("Error: "+e.getMessage());
        }

        try {
            Estudiante estudiante4 = new Estudiante("Martinez",89,10.5);
            System.out.println(estudiante4);
        }catch (IllegalArgumentException e){
            System.out.println("Error: "+e.getMessage());
        }

        System.out.println(Estudiante.getTotalEstudiantes());
    }
}
