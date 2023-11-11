public class PC {
  
    //Una clase vacía de nada sirve
    //Hay que agregarle estados (atributos) y comportamientos (métodos)
    //A las variables y métodos de una clase se les conoce como miembros de la clase
    //Para aplicar la encapsulacion (ocultamiento de información) se debe usar el modificador de acceso private
  
    private String marca;
    private double cantidadRAM;
    private double velocidadRAM;
    private double velocidadCPU;
    private double almacenamiento;
    private int cantidadDiscos;
    private double tamanoMonitor;
    private boolean tieneTeclado;
    private boolean tieneMouse;
    private boolean estaEncendida;
  
    //Métodos constructores
    public PC(){    /*Método constructor por defecto (sin parámetros)
                    El propósito del método constructor es poder crear objetos*/
        System.out.println("Se creó un objeto utilizando el constructor por defecto");
    }
  
    public PC(String marca){
        this.marca = marca;
        System.out.println("Se creó un objeto utilizando el constructor con parámetro Marca");
    }
  
    public PC(String marca, int cantidadDiscos){
        this.marca = marca;
        this.cantidadDiscos = cantidadDiscos;
        System.out.println("Se creó el objeto PC de marca " + this.marca + ".");
        System.out.println("Esta PC cuenta con " + this.cantidadDiscos + " discos.");
    }
}
