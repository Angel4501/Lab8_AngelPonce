package lab8_angelponce;

public class Personas {
    
    private String nombre, apellido, edad, nacionalidad, 
    residencia, sexo; 
    private int numerocuenta; //Talento humano (como llave primaria),
    private String profesion, lugartrabajo;// (si lo tiene) 
    private String facultad; //a la que pertenece y tipo de persona
    private String tipo; //(estudiante, docente, administrativo, ejecutivo o decano)

    public Personas() {
    }

    public Personas(String nombre, String apellido, String edad, 
            String nacionalidad, String residencia, String sexo, 
            int numerocuenta, String profesion, String lugartrabajo, String facultad, String tipo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        this.residencia = residencia;
        this.sexo = sexo;
        this.numerocuenta = numerocuenta;
        this.profesion = profesion;
        this.lugartrabajo = lugartrabajo;
        this.facultad = facultad;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getResidencia() {
        return residencia;
    }

    public void setResidencia(String residencia) {
        this.residencia = residencia;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getNumerocuenta() {
        return numerocuenta;
    }

    public void setNumerocuenta(int numerocuenta) {
        this.numerocuenta = numerocuenta;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getLugartrabajo() {
        return lugartrabajo;
    }

    public void setLugartrabajo(String lugartrabajo) {
        this.lugartrabajo = lugartrabajo;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Nombre= " + nombre + ", apellido= " + apellido 
                + ", edad= " + edad + ", nacionalidad= " + nacionalidad 
                + ", residencia= " + residencia 
                + ", sexo= " + sexo 
                + ", número de cuenta= " + numerocuenta 
                + ", profesion= " + profesion 
                + ", lugartrabajo= " + lugartrabajo 
                + ", facultad= " + facultad 
                + ", tipo= " + tipo;
    }
    
    
    
}
