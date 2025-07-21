public class Perro {
    // Atributos
    String nombre;
    String color;
    int vidas; // Los perros tienen vidas
    String raza; // Bull Terrier, Chihuahua, Pastor alemán
    String personalidad; // juguetones, protectores, violentos
    double velocidad; // En km/h
    int nivelExtroversion; // En una escala de 1-10, donde 10 es Más introvertido
    Perro(String nombre, String color, int vidas, String raza, String personalidad, double velocidad, int nivelExtroversion) {
        this.nombre=nombre;
        this.color=color;
        this.vidas=vidas;
        this.raza=raza;
        this.personalidad=personalidad;
        this.velocidad=velocidad;
        this.nivelExtroversion=nivelExtroversion;
    }

    // Métodos (o Acciones)

    // 1. Ladrar
    public void ladrar() {
        System.out.println(nombre + " Dice Guau Guau");
    }

    // 2. Perder Vida
    public void perderVida() {
        if (vidas > 0) {
            vidas=vidas-1;
            System.out.println(nombre + " perdió una vida. Vidas restantes: " + vidas);
        } else {
            System.out.println(nombre + " ya no tiene vidas. :(");
        }
    }

    // 2. Perder Vida sobrecarga
    public void perderVida(int a) {
        if (vidas > 0) {
            vidas=vidas-a;
            System.out.println(nombre + " perdió " + a + ". Vidas restantes: " + vidas);
        } else {
            System.out.println(nombre + " ya no tiene vidas. :(");
        }
    }

    // 3. Jugar: Juega por rondas y cada cierta iteracion, hace una acción de jugar diferente
    public void jugar() {
        System.out.println(nombre + " Esta preparado para jugar");
        int rondasDeJuego = 0;
        int maxRondas = 2;

        while (rondasDeJuego < maxRondas) {
            System.out.println(nombre + " comienza la ronda de juego #" + (rondasDeJuego + 1));
            for (int i = 0; i < 3; i++) {
                System.out.println(nombre + " salta y corre.");
            }
            System.out.println(nombre + " toma un descanso.");
            rondasDeJuego=rondasDeJuego+1;
        }
        System.out.println(nombre + " ha terminado de jugar");
    }

    // 4. Moverse: Aquí se mueve en una dirección y distancia específicas, la distancia en Km
    public void moverse(String direccion, double distanciaKm) {
        System.out.println(nombre + " se mueve hacia el " + direccion + " recorriendo " + distanciaKm + " km a una velocidad de " + velocidad + " km/h.");
        // Al moverse la extroversión del perro va a aumentar
        if (nivelExtroversion < 10) {
            nivelExtroversion=nivelExtroversion+1;
            System.out.println("El nivel de extroversión de " + nombre + " ha aumentado a " + nivelExtroversion + ".");
        } else {
            System.out.println(nombre + " ya es lo más extrovertido posible.");
        }
    }
    // 5. Olfatear
    public void Olfatear() {
        System.out.println(nombre + " Inspecciona el lugar con su olfato");
    }

    // 6. Saludar
    public void saludar() {
        System.out.println(nombre + " mueve la cola con fuerza y saluda amigablemente con la pata");
    }

    // 7. Muestra los atributos actuales que tiene el gatito
    public void mostrarEstado() {
        System.out.println("ESTADO DE " + nombre + " ---");
        System.out.println("Color: " + color);
        System.out.println("Vidas: " + vidas);
        System.out.println("Raza: " + raza);
        System.out.println("Personalidad: " + personalidad);
        System.out.println("Velocidad: " + velocidad + " km/h");
        System.out.println("Nivel de Extroversión: " + nivelExtroversion + "/10");
        System.out.println("--------------------");
    }
}