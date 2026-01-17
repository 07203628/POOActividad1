class Caballo {
    private String nombre;
    private String raza;
    private int edad;

    public Caballo(String nombre, String raza, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
    }

    public String getNombre() { return nombre; }
    public String getRaza() { return raza; }
    public int getEdad() { return edad; }

    public void mostrarDatos(){
        System.out.println("\n Información del caballo");
        System.out.println("Nombre: " + nombre);
        System.out.println("Raza: " + raza);
        System.out.println("Edad: " + edad);        
    }
}
