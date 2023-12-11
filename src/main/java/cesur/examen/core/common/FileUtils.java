package cesur.examen.core.common;

import cesur.examen.core.worker.Worker;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

/**
 * EXAMEN DE ACCESO A DATOS
 * Diciembre 2023
 *
 * Nombre del alumno:
 * Fecha:
 *
 * No se permite escribir en consola desde las clases DAO, Service y Utils usando System.out.
 * En su lugar, usa log.info(), log.warning() y log.severe() para mostrar información interna
 * o para seguir la traza de ejecución.
 */


public class FileUtils {

    public static void toCSV(String fileName, List<Worker> workers) {
        //Uncomment and implement body method!...

        try (FileWriter escribir =new FileWriter(fileName)) {
            for (Worker worker : workers){
                String linea = String.format("%d,%s,%s,%s", worker.getId(), worker.getName(), worker.getDni(), worker.getFrom());
                escribir.write(linea + System.lineSeparator());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);

        }
    }
}
