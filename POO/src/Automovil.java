public class Automovil implements Comparable<Automovil>{

    private int id;
    private String fabricante;
    private String modelo;
    private Color color = Color.GRIS;
    private Motor motor;
    private Estanque estanque;
    private Persona conductor;
    private Rueda[] ruedas;
    private int indiceRuedas;

    private TipoAutomovil tipo;

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
        this.ruedas = new Rueda[5];
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

    public Automovil(String fabricante, String modelo, Color color, Motor motor) {
        this(fabricante,modelo,color);
        this.motor = motor;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor, Estanque estanque) {
        this(fabricante,modelo,color,motor);
        this.estanque = estanque;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor, Estanque estanque, Persona conductor, Rueda[] ruedas) {
        this(fabricante,modelo,color,motor,estanque);
        this.conductor = conductor;
        this.ruedas = ruedas;
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

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Estanque getEstanque() {
        if (estanque == null){
            this.estanque = new Estanque();
        }
        return estanque;
    }

    public void setEstanque(Estanque estanque) {
        this.estanque = estanque;
    }

    public Persona getConductor() {
        return conductor;
    }

    public void setConductor(Persona conductor) {
        this.conductor = conductor;
    }

    public Rueda[] getRuedas() {
        return ruedas;
    }

    public void setRuedas(Rueda[] ruedas) {
        this.ruedas = ruedas;
    }

    public Automovil addRueda(Rueda rueda){
        if (indiceRuedas < this.ruedas.length)
            this.ruedas[indiceRuedas++] = rueda;
        return this;
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


    public TipoAutomovil getTipo() {
        return tipo;
    }

    public void setTipo(TipoAutomovil tipo) {
        this.tipo = tipo;
    }

    public String verDetalle(){
        String detalle ="Aut.id = " + this.id +
                "\nauto.fabricante = " + this.fabricante +
                "\nauto.modelo = " + this.modelo;

                if (this.getTipo() != null)
                    detalle += "\nauto.tipo = " + getTipo().getDescripcion();

                detalle += "\nauto.color = " + this.color.getColor() +
                        "\nauto.patenteColor = " + colorPatente.getColor();
                if (this.motor != null)
                    detalle +="\nauto.cilindrada = " + this.motor.getCilindrada();

                detalle += "\nConductor: " + this.getConductor();

                if (getRuedas() != null){
                    detalle += "\nRuedas del Automovil: ";
                    for (Rueda r: this.getRuedas())
                        detalle+= "\n" + r.getMarca() + ", aro: " + r.getAro() + ", ancho: " + r.getAncho();
                }


        return detalle;
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
        return km/(this.getEstanque().getCapacidad() * (porcentajeBencina/100f));
    }

    public static float calcularConsumoEstatico(int km, float porcentajeBencina){
        return km/(capacidadTanqueEstatico * (porcentajeBencina/100f));
    }

    public float calcularConsumo(int km, int porcentajeBencina){
        return km/(this.getEstanque().getCapacidad() * (porcentajeBencina/100f));
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
        return "ID= " + id + ' ' +
                " fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + "\'";
    }

    @Override
    public int compareTo(Automovil a) {
        return this.modelo.compareTo(a.modelo);
    }
}
