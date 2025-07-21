public class Principal {
    public static void main(String[] args) {
        // Objetos Gatos 
        Gato Pancho = new Gato("Pancho", "Negro", 5, "Siamés", "Sigiloso", true, 9);
        Gato Luna = new Gato("Luna", "Blanco", 4, "Persa", "Ágil", false, 7);
        Gato Ronromeo = new Gato("Ronromeo", "Pardo", 6, "Maine Coon", "Romántico", true, 8);

        // Objetos Perros 
        Perro Bobby = new Perro("Bobby", "Marrón claro", 3, "Pastor alemán", "Jugueton", 15.0, 9);
        Perro Max = new Perro("Max", "Blanco", 4, "Bull Terrier", "Protector", 20.0, 8);
        Perro Copito = new Perro("Copito", "Miel", 3, "Chihuahua", "Violenta", 18.0, 10);
        
        System.out.println("Comienza la simulación");
        System.out.println("Estado inicial de los animales");
        Pancho.mostrarEstado();
        Luna.mostrarEstado();
        Ronromeo.mostrarEstado();
        Bobby.mostrarEstado();
        Max.mostrarEstado();
        Copito.mostrarEstado();

        // Gato observando y afectando introversión
        System.out.println(Pancho.nombre + " antes de observar el nivel de Introversión es " + Pancho.nivelIntroversion);
        Pancho.observar();
        Pancho.mostrarEstado(); 
        Pancho.observar();
        Pancho.observar();
        Pancho.observar();
        Pancho.observar();
        Pancho.observar();
        Pancho.observar();
        Pancho.observar();
        Pancho.observar();
        Pancho.mostrarEstado();

        // Perro moviéndose y afectando extroversión
        System.out.println(Bobby.nombre + " antes de moverse: Nivel Extroversión " + Bobby.nivelExtroversion);
        Bobby.moverse("oeste",5); 
        Bobby.mostrarEstado(); 
        Bobby.moverse("sur", 2.5); 
        Bobby.mostrarEstado();

        
        System.out.println("Ronda 1");
        Pancho.esconderse();
        Luna.buscarPollito();
        Max.jugar(); // Aquí Max juega una vez
        Ronromeo.relajarse();
        Copito.moverse("este",4.5);
        Max.Olfatear();

        System.out.println("Volver a mostrar estado después de la Ronda 1");
        Pancho.mostrarEstado();
        Luna.mostrarEstado();
        Ronromeo.mostrarEstado();
        Bobby.mostrarEstado();
        Max.mostrarEstado();
        Copito.mostrarEstado();


        System.out.println("Ronda 2");
        Pancho.maullar();
        Luna.perderVida(4);
        Max.perderVida(1);
        Ronromeo.buscarPollito();
        Bobby.ladrar();
        Max.jugar(); // Otra vez el perro juega
        Copito.moverse("norte",10);

        System.out.println("Estado final");
        Pancho.mostrarEstado();
        Luna.mostrarEstado();
        Ronromeo.mostrarEstado();
        Bobby.mostrarEstado();
        Max.mostrarEstado();
        Copito.mostrarEstado();
    }
}