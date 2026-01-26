package PersonaEx;

public class MainPersonaEx {
    static void main() {
        Person person = new Person("Pedro", 41, true,"bueno");
        System.out.println(person.calcularImporteSeguro());
        Person person2 = new Person("Gema", 40, true,"regular");
        System.out.println(person2.calcularImporteSeguro());
    }
}
