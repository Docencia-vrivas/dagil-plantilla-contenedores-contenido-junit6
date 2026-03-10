package es.vrivas.dagil;

public interface ContenedorInterface<Contenido> {
    /**
     * Devuelve el número de objetos que hay en el contenedor.
     * @return Número de objetos contenidos en el contenedor.
     */
    public int getNumObjetosContenidos();

    /**
     * Devuelve el objeto que que hay en la posición indicada.
     * @param posicion Posición del objeto a devolver.
     * @return El objeto que hay en la posición indicada.
     * @exception IllegalArgumentException Si la posición no es válida.
     */
    public Contenido getPorPosicion(final int posicion) throws IllegalArgumentException;

    /**
     * Devuelve el objeto que tiene el id indicado.
     * @param id Id del objeto a devolver.
     * @return El objeto que tiene el id indicado o null si no existe.
    */
    public Contenido getPorId(final int id);

    /**
     * Devuelve el conjunto de objetos que hay en el contenedor en forma de string.
     * @return Cadena con el conjunto de objetos que hay en el contenedor en formato JSON.
     */
    public String toString();

    /**
     * Añade un objeto al contenedor.
     * @param objeto Objeto a añadir.
     * @exception IllegalArgumentException Si el objeto ya está en el contenedor.
     * @exception IllegalArgumentException Si ya hay un objeto con el mismo id en el contenedor.
     * @exception IllegalArgumentException Si el objeto es NULL.
     * @return La propia instancia de Contenedor.
     */
    public ContenedorInterface<Contenido> add(final Contenido objeto) throws IllegalArgumentException;

    /**
     * Elimina un objeto del contenedor.
     * @param objeto Objeto a eliminar del contenedor.
     * @exception IllegalArgumentException Si el objeto no está en el contenedor.
     * @exception IllegalArgumentException Si el objeto es NULL.
     * @return La propia instancia de Contenedor.
     */
    public ContenedorInterface<Contenido> remove(final Contenido objeto) throws IllegalArgumentException;
}

