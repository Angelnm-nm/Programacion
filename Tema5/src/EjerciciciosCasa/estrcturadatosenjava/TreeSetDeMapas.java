package EjerciciciosCasa.estrcturadatosenjava;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class TreeSetDeMapas {
    public static void main(String[] args) {
        TreeSet < Map<String,Object>> infoCIudades = new TreeSet<>();
        HashMap < String, Object> ciudad1= new HashMap <>();
        ciudad1.put("Madrid" , 1000);
        infoCIudades.add(ciudad1);

        HashMap < String, Object> ciudad2= new HashMap <>();
        ciudad2.put("Alicante" , 2000);

        infoCIudades.add(ciudad2);
        HashMap < String, Object> ciudad3= new HashMap <>();
        ciudad3.put("Murica" , 3000);
        infoCIudades.add(ciudad3);

        HashMap < String, Object> ciudad4= new HashMap <>();
        ciudad4.put("Malaga" , 4000);
        infoCIudades.add(ciudad4);

        HashMap < String, Object> ciudad5= new HashMap <>();
        ciudad5.put("Guadalajara" , 5000);

        infoCIudades.add(ciudad5);

        HashMap < String, Object> ciudad6= new HashMap <>();
        ciudad6.put("Leon" , 6000);
        infoCIudades.add(ciudad6);

        


    }
}
