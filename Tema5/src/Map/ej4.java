package Map;

import java.util.TreeMap;

public class ej4 {
    static void main() {

        TreeMap<String, String> extensiones = new TreeMap<>();
        extensiones.put(".txt", " Archivo de texto");
        extensiones.put(".pdf", " Archivo de acrobat reader");
        extensiones.put(".java", " Archivo de codigo fuente java");
        extensiones.put(".mp3", " Archivo de musica");

        System.out.println(extensiones);
    }
}
