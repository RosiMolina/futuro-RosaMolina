
public class Entornos3 {

    public static void main(String[] args) {

        int modulos = 7, horas_semanales = 16;
        String veredicto= veredicto(Integer.toString(modulos), Integer.toString(horas_semanales));


   System.out.println("Estudiante " + args[0]+ " " + args[1] + ":"); //Aquí muestra el nombre del alumno
   System.out.println("Está matriculado en " + modulos + " módulos y dedica "+ horas_semanales + " horas semanales.");
   System.out.println(veredicto);
    }

    static String veredicto(String modulos, String horas_semanales) {
        if (modulos.equals(horas_semanales)) {
            return "Dedicar una hora por módulo puede no ser suficiente.";
        }
        if (Integer.valueOf(modulos)>Integer.valueOf(horas_semanales)) {
            return "Con este tiempo de estudio no será suficiente para entregar las actividades.";
         }
        return "Muy buen trabajo." ;
    }
}
