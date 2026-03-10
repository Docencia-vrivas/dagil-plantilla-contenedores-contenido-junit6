package es.vrivas.dagil;

/**
 * Clase Contenido.
 * Representa un contenido con un identificador y una descripción.
 */
public class Patata {
    /// Identificador.
    private int id;

    /// Un campo de texto, como ejemplo de contenido.
    private String descripcion;

    /// Un campo adicional
    private Double peso;

    

    /**
     * Constructor.
     */
    public Patata() {
        this.id = 0;
        this.descripcion = "";
        this.peso=0.0;
    }

    /**
     * Devuelve el valor de id.
     * @return Atributo id.
     */
    public final int getId() {
        return id;
    }

    /**
     * Devuelve la descripcion.
     * @return Atributo descripcion.
     */
    public final String getDescripcion() {
        return descripcion;
    }

    /**
     * Devuelve el peso
     * @return Atributo peso.
     */
    public final Double getPeso() {
        return peso;
    }

    /**
     * Establece el valor de id.
     * @param valor Valor para id.
     * @exception IllegalArgumentException Si el valor es negativo.
     * @return La propia instancia de Patata.
     */
    public Patata setId(final int valor) throws IllegalArgumentException {
        if (valor < 0) {
            throw new IllegalArgumentException("El id de Patata no puede ser negativo");
        }
        this.id = valor;
        return this;
    }

    /**
     * Establece la descripción.
     * @param valor Valor de descripción.
     * @exception IllegalArgumentException Si la descripción es nula o vacía.
     * @return La propia instancia de Contenido.
     */
    public Patata setDescripcion(final String valor) throws IllegalArgumentException {
        if (valor == null || valor.isEmpty()) {
            throw new IllegalArgumentException("La descripción de Patata no puede ser vacía");
        }
        this.descripcion = valor;
        return this;
    }

     /**
     * Establece el valor de peso.
     * @param valor Valor para peso.
     * @exception IllegalArgumentException Si el valor es negativo.
     * @return La propia instancia de Patata.
     */
    public Patata setPeso(final Double valor) throws IllegalArgumentException {
        if (valor < 0) {
            throw new IllegalArgumentException("El peso de Patata no puede ser negativo");
        }
        this.peso = valor;
        return this;
    }
    
    /**
     * Devuelve los atributos del Contenido en una cadena.
     * @return Cadena con los atributos del contenido en formato JSON.
     */
    public final String toString() {
        return "{id: " + id + ", descripcion: '" + descripcion + "', peso: " + peso + "}";
    }
}
