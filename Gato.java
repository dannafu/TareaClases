import java.util.Random;
public class Gato{
    // Atributos
    String nombre;
    String color;
    int vidas; // Los gatos pierden vidas ante perros, pero las recuperan con pollitos
    String raza;
    String habilidadEspecial; //Sigiloso, ágil y veloz
    boolean estaEscondido;
    int nivelIntroversion; // En una escala de 1-10, donde 10 es Más introvertido
    Gato(String nombre, String color, int vidas, String raza, String habilidadEspecial, boolean estaEscondido, int nivelIntroversion) {
        this.nombre=nombre;
        this.color=color;
        this.vidas=vidas;
        this.raza=raza;
        this.habilidadEspecial=habilidadEspecial;
        this.estaEscondido=estaEscondido;
        this.nivelIntroversion=nivelIntroversion;
    }

    // Métodos (Acciones)

    // 1. Esconderse: Los gatos se esconden para evitar a los perros
    public void esconderse(){
        if (estaEscondido = false) {
            estaEscondido = true;
            System.out.println(nombre + " Se ha escondido para evitar a los perros.");
        } else {
            System.out.println(nombre + " ya está escondido.");
        }
    }

    // 2. Buscar Pollito: Los gatos recuperan vidas al encontrar pollitos
    public void buscarPollito() {
        Random pollito = new Random(); //Para obtener valores random
        int pollitosEncontrados = 0;
        for (int i = 0; i < 3; i++) { // Intenta buscar 2 veces
            if (pollito.nextBoolean()) { // 50% de probabilidad de encontrar un pollito porque puede ser False o True
                vidas=vidas+1;
                pollitosEncontrados=pollitosEncontrados+1;
                System.out.println(nombre + " encontró un pollito y recuperó una vida. Vidas actuales: " + vidas);
            }
        }
        if (pollitosEncontrados == 0) {
            System.out.println(nombre + " Buscó, pero no encontró ningún pollito.");
        }
    }

    // 3. Maullar
    public void maullar() {
        System.out.println(nombre + " dice Miau");
    }

    // 4. Perder Vida
    public void perderVida() {
        if (vidas > 0) {
            vidas=vidas-1;
            System.out.println(nombre + " perdió una vida. Vidas restantes: " + vidas);
        } else {
            System.out.println(nombre + " ya no tiene vidas. :(");
        }
    }

    // 4. Perder Vida sobrecarga
    public void perderVida(int a) {
        if (vidas > 0) {
            vidas=vidas-a;
            System.out.println(nombre + " perdió " + a + ". Vidas restantes: " + vidas);
        } else {
            System.out.println(nombre + " ya no tiene vidas. :(");
        }
    }

    // 5. Relajarse
    public void relajarse() {
        int tiempoRelajado = 0;
        int tiempoParaVida = 10; // Para recuperar una vida, el gato necesita relajarse 10 veces
        System.out.println(nombre + " Esta relajandose");
        while (tiempoRelajado < tiempoParaVida) {
            System.out.println(nombre + " Esta relajandose. (Se ha relajado: " + (tiempoRelajado + 1) + "/" + tiempoParaVida + ")");
            tiempoRelajado=tiempoRelajado+1;
        }

        if (tiempoRelajado == tiempoParaVida) {
            vidas=vidas+1;
            System.out.println(nombre + " se ha relajado completamente y recuperó una vida. Vidas actuales: " + vidas);
        } else {
            System.out.println(nombre + " dejó de relajarse antes de recuperar una vida.");
        }
    }

     // 6. Observar
    public void observar(){
        System.out.println(nombre + " Esta observando su entorno para buscar un lugar en donde esconderse");
        // Cada vez que observa, su introversión disminuye en uno
        if (nivelIntroversion > 1) {
            nivelIntroversion=nivelIntroversion-1;
            System.out.println("El nivel de introversión de " + nombre + " ha disminuido a " + nivelIntroversion + ".");
        } else {
            System.out.println(this.nombre + " ya es lo menos introvertido posible.");
        }
    }

    // 7. Muestra los atributos actuales que tiene el gatito
    public void mostrarEstado() {
        System.out.println("ESTADO DE " + nombre);
        System.out.println("Color: " + color);
        System.out.println("Vidas: " + vidas);
        System.out.println("Raza: " + raza);
        System.out.println("Habilidad Especial: " + habilidadEspecial);
        System.out.println("¿Está Escondido?: " + (estaEscondido ? "Sí" : "No"));
        System.out.println("Nivel de Introversión: " + nivelIntroversion + "/10");
        System.out.println("--------------------");
    }
}
