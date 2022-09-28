public class Main {
    public static void main(String[] args) {
    Persona persona2 = new Persona();
    persona2.setNombre("Jonathan");
    persona2.setTelefono(584644646);
    persona2.setEdad(39);
    System.out.println(persona2.getNombre());
    System.out.println(persona2.getTelefono());
    System.out.println(persona2.getEdad());
    }
}

class Persona {
    private String nombre;
    private int telefono;
    private int edad;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return this.nombre;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public int getTelefono() {
        return this.telefono;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getEdad() {
        return this.edad;
    }
}