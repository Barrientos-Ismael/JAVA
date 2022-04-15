public class Automovil {

    private int id;
    private String fabricante;
    private String modelo;
    private Color color = Color.GRIS;
    private double cilindrada;
    private int capacidadTanque = 40;

    private static Color colorPatente = Color.NARANJA;
    private static int capacidadTanqueEstatico = 30;
    private static int ultimoId;

    public static final Integer VELOCIDAD_MAX_CARRETERA = 120;
    public static final Integer VELOCIDAD_MAX_CIUDAD = 60;

    public static final String COLOR_ROJO = "Rojo";
    public static final String COLOR_AMARILLO = "Amarillo";
    public static final String COLOR_AZUL = "Azul";
    public static final String COLOR_BLANCO = "Blanco";
    public static final String COLOR_GRIS = "Gris Oscuro";



    public Automovil(){
        this.id = ++ultimoId;
    }

    public Automovil(String fabricante, String modelo){
        this();
        this.setFabricante(fabricante);
        this.setModelo(modelo);
    }

    public Automovil(String fabricante, String modelo, Color color){
        this(fabricante,modelo);
        this.setColor(color);
    }

    public Automovil(String fabricante, String modelo, Color color, double cilindrada) {
        this(fabricante,modelo,color);
        this.cilindrada = cilindrada;
    }

    public Automovil(String fabricante, String modelo, Color color, double cilindrada, int capacidadTanque) {
        this(fabricante,modelo,color,cilindrada);
        this.capacidadTanque = capacidadTanque;
    }

    public String getFabricante() {
        return this.fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Color getColor() {
        return this.color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getCilindrada() {
        return this.cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getCapacidadTanque() {
        return this.capacidadTanque;
    }

    public void setCapacidadTanque(int capacidadTanque) {
        this.capacidadTanque = capacidadTanque;
    }

    public static Color getColorPatente(){
        return colorPatente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static void setColorPatente(Color colorPatente){
        Automovil.colorPatente = colorPatente;
    }
    //No es buena practica imprimir dentro de los metodos

    public String verDetalle(){
        return "Aut.id = " + this.id +
                "\nauto.fabricante = " + this.fabricante +
                "\nauto.modelo = " + this.modelo +
                "\nauto.color = " + this.color.getColor() +
                "\nauto.cilindrada = " + this.cilindrada +
                "\nauto.patenteColor = " + colorPatente.getColor();
    }

    public String acelerar(int rpm){
        return "El auto " + this.fabricante + " acelerando a " + rpm + " rpm";
    }

    public String frenar(){
        return this.fabricante + " " + this.modelo + " frenando!";
    }

    public String acelerarFrenar (int rpm){
        String acelerar = this.acelerar(rpm);
        String frenar = this.frenar();
        return acelerar + "\n" + frenar;
    }

    public float calcularConsumo(int km, float porcentajeBencina){
        return km/(this.capacidadTanque * (porcentajeBencina/100f));
    }

    public static float calcularConsumoEstatico(int km, float porcentajeBencina){
        return km/(capacidadTanqueEstatico * (porcentajeBencina/100f));
    }

    public float calcularConsumo(int km, int porcentajeBencina){
        return km/(this.capacidadTanque * (porcentajeBencina/100f));
    }

    public static int getCapacidadTanqueEstatico() {
        return capacidadTanqueEstatico;
    }

    public static void setCapacidadTanqueEstatico(int capacidadTanqueEstatico) {
        Automovil.capacidadTanqueEstatico = capacidadTanqueEstatico;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(!(obj instanceof Automovil)) return false;
        Automovil a = (Automovil) obj;
        return (this.fabricante != null && this.modelo != null
                    && this.fabricante.equals(a.getFabricante())
                    && this.modelo.equals(a.getModelo()));
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "ID= " + id + '\'' +
                "fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", cilindrada=" + cilindrada +
                ", capacidadTanque=" + capacidadTanque +
                '}';
    }
}
