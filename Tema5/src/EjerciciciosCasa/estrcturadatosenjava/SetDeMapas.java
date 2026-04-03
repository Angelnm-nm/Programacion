package EjerciciciosCasa.estrcturadatosenjava;

import java.util.*;

public class SetDeMapas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Map<String,Object>> inventario = new HashSet<>();
        HashMap<String,Object> p1 = new HashMap<>();
        p1.put("id", 25);
        p1.put("nombre", "Fairy");
        p1.put("precio", 21.00);

        inventario.add(p1);
        HashMap<String,Object> p2 = new HashMap<>();
        p2.put("id", 26);
        p2.put("nombre", "Ariel");
        p2.put("precio", 51.50);

        inventario.add(p2);
        HashMap<String,Object> p3 = new HashMap<>();
        p3.put("id", 25);
        p3.put("nombre", "Fairy");
        p3.put("precio", 21.00);

        inventario.add(p3);
        System.out.println(inventario);

        // Buscar producto por IF
        System.out.println("dame un id deld pruducto ");
        int idBuscado = sc.nextInt();
        boolean encontrado = false;
        for(Map<String,Object> map : inventario){
            if (map.get("id").equals(idBuscado)){
                System.out.println("se ha encontrado el id deld pruducto ");
                encontrado = true;
            }
        }

        if (!encontrado){
            System.out.println("No se encontro el id deld pruducto ");
        }

        // Eliminar producto por ID
        System.out.println("Dame un id del pruducto a eliminar");
        idBuscado = sc.nextInt();
        Map<String,Object> productoEliminar = null;
        for(Map<String,Object> map : inventario){
            if (map.get("id").equals(idBuscado)){
                productoEliminar = map;
                break;
            }
        }
        if (productoEliminar != null){
            inventario.remove(productoEliminar);
        }
        System.out.println(inventario);
        sc.close();
    }
}
