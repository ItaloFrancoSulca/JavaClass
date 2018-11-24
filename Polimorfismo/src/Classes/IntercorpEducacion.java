package Classes;

/**
 *
 * @author Administrador
 */
public class IntercorpEducacion {

    /**
     * @return the cantidadDocentes
     */
    public int getCantidadDocentes() {
        return cantidadDocentes;
    }

    /**
     * @param cantidadDocentes the cantidadDocentes to set
     */
    public void setCantidadDocentes(int cantidadDocentes) {
        this.cantidadDocentes = cantidadDocentes;
    }

    /**
     * @return the cantidadAlumnos
     */
    public int getCantidadAlumnos() {
        return cantidadAlumnos;
    }

    /**
     * @param cantidadAlumnos the cantidadAlumnos to set
     */
    public void setCantidadAlumnos(int cantidadAlumnos) {
        this.cantidadAlumnos = cantidadAlumnos;
    }

    /**
     * @return the nombreCentroEducativo
     */
    public String getNombreCentroEducativo() {
        return nombreCentroEducativo;
    }

    /**
     * @param nombreCentroEducativo the nombreCentroEducativo to set
     */
    public void setNombreCentroEducativo(String nombreCentroEducativo) {
        this.nombreCentroEducativo = nombreCentroEducativo;
    }

private int cantidadDocentes;
private int cantidadAlumnos;
private String nombreCentroEducativo;

public void MatricularAlumno (){

    System.out.println("Alumno Matriculado");
    
}

public void CobrarPension (){
    System.out.println("Aceptar Medios Pago: Visa / Mastercard");
    System.out.println("Atención BANCA MOVIL");
    System.out.println("Cobrar PENSION MENSUAL");
}


    
}
