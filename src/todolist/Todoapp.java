 
package todolist;
//importa las clases nesesarias para leeer datos desde la consola 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author jesus
 */
// nombre de la clase
public class Todoapp {
  //para que inicie le prigrama
    public static void main(String[] args) throws IOException {
        //crea una instamcia del servidor quee maneja las operaciones sobre las tareas  
        ServicioTarea serviceTask = new ServicioTarea();
        //crea u  lector para cpaturar la entrada del usuario desde el teclado 
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        //variable para almacenar la opcion del menu seleccionada por el usuario 
        int opcionSeleccionada = 0;
     
        do {    
            System.out.println("Aplicacion ToDo List");
            System.out.println("----MENU DE TAREAS----   ");
            System.out.println("Selecciona una opcion");
            System.out.println("1.- Crear Tarea");
            System.out.println("2.- Mostrar Tareas");
            System.out.println("3.- Completar Tarea");
            System.out.println("4.- Eliminar Tarea");
            System.out.println("5.- Salir");
               
            
            opcionSeleccionada = Integer.parseInt(leer.readLine());
            switch (opcionSeleccionada) {
                case 1:

                    System.out.println("ingresa la tarea");
                    System.out.println("> ");
                    serviceTask.crear(leer.readLine());

                    break;
                case 2:

                    serviceTask.mostrarTareas();

                    break;
                case 3:
                    serviceTask.listartareas();
                    System.out.println("selecciona la tarea a marcar");
                    int indicetarea = Integer.parseInt(leer.readLine());
                    Tarea _tarea = serviceTask.obtener(indicetarea);
                    serviceTask.marcar(_tarea);

                    break;
                case 4:
                    serviceTask.listartareas();
                    System.out.println("selecciona la tarea a marcar");

                    int indicetareaa = Integer.parseInt(leer.readLine());
                    Tarea _tareaa = serviceTask.obtener(indicetareaa);
                    serviceTask.eliminarTarea(_tareaa);
                    break;
                case 5:
                    break;
                default:

            }

        } while (opcionSeleccionada != 5);
    }

}

    

