package Tema4;


public class Comanda {
    private final int mesa;
    private final int comensales;
    private final Plato[] platos;
    private int totalPlatos;

    public Comanda(int mesa, int comensales, int maxPlatos) {
        this.mesa = mesa;
        this.comensales = comensales;
        platos = new Plato[maxPlatos];
        totalPlatos = 0;
    }

    public void addPlato(Plato p) {
        if (totalPlatos < platos.length) {
            platos[totalPlatos++] = p;
        }
    }

    public double coste() {
        double total = 0;
        for (int i = 0; i < totalPlatos; i++) {
            total += platos[i].getPrecio();
        }
        return total;
    }

    public boolean hayDiabeticosEnLaMesa() {
        for (int i = 0; i < totalPlatos; i++) {
            if (platos[i] instanceof Postre p) {
                if (p.isSinAzucar()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        String texto = "Mesa " + mesa + " comensales: " + comensales + "\n";
        for (int i = 0; i < totalPlatos; i++) {
            texto += "- " + platos[i] + "\n";
        }
        texto += "TOTAL: " + coste() + "€";
        return texto;
    }
}



