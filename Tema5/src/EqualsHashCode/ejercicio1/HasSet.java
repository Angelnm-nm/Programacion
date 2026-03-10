package EqualsHashCode.ejercicio1;

import java.util.HashSet;

public class HasSet {
    static void main(String[] args) {
        HashSet<String> invitados = new HashSet<>();
        invitados.add("Marta");
        invitados.add("Ana");
        invitados.add("Luis");
        invitados.add("Ana");
        invitados.add("Luis");
        System.out.println(invitados.size());
        System.out.println(invitados);
    }
}