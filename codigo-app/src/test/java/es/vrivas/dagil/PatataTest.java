package es.vrivas.dagil;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.fail;

/**
 * Clase de test para la clase Contenido.
 */
public class PatataTest {

    /**
     * Mensaje indicando que se inician los tests de la clase Contenido.
     */
    @BeforeAll
    public static void setUp() {
        System.out.println("Iniciando test clase Contenido...");
    }

    //---------------------------------------------------------------
    // Tests para el método getId
    //---------------------------------------------------------------

    /**
     * Comprueba que el id inicial es 0.
     */
    @Test
    public void getId_inicia_a_0() {
        assertEquals(0, new Patata().getId());
    }

    /**
     * Comprueba que el id se puede establecer a otro valor.
     */
    @Test
    public void getId_inicia_a_otro_valor() {
        // Comprueba otro id
        Patata objeto = new Patata()
                .setId(1);
        assertEquals(1, objeto.getId());
    }

    //---------------------------------------------------------------
    // Tests para el método getDescripcion
    //---------------------------------------------------------------

    /**
     * Comprueba que la descripción inicial es "".
     */
    @Test
    public void getDescripcion_inicia_vacia() {
        // Comprueba que la descripción inicial es ""
        assertEquals("", new Patata().getDescripcion());
    }

    /**
     * Comprueba que la descripción se puede establecer a otro valor.
     */
    @Test
    public void getDescripcion_inicia_a_otro_valor() {
        // Comprueba otra descripción
        Patata objeto = new Patata();
        String nuevaDescripcion = "Nueva descripción";
        objeto.setDescripcion(nuevaDescripcion);
        assertEquals(nuevaDescripcion, objeto.getDescripcion());

    }

    //---------------------------------------------------------------
    // Tests para el método getPeso
    //---------------------------------------------------------------

    /**
     * Comprueba que el peso inicial es 0.0.
     */
    @Test
    public void getPeso_inicia_vacio() {
        assertEquals(0, new Patata().getPeso(),0.01);
    }

    /**
     * Comprueba que el peso inicial se puede establecer a otro valor.
     */
    @Test
    public void getPeso_inicia_a_otro_valor() {
        // Comprueba otra descripción
        Patata objeto = new Patata();
        Double nuevoValor=32.23;
        objeto.setPeso(nuevoValor);
        assertEquals(nuevoValor, objeto.getPeso(),0.01);

    }
    //---------------------------------------------------------------
    // Tests para el método setId
    //---------------------------------------------------------------

    /**
     * Comprueba que salta una excepción si se intenta establecer un id negativo.
     */
    @Test
    public void setId_excepciones() {
        // Comprueba que no se puede establecer un id negativo
        try {
            new Patata().setId(-1);
            fail();
        } catch (IllegalArgumentException e) {
            System.err.println("Excepción lanzada: " + e.getMessage() + " para id negativo");
        }
    }

    /**
     * Comprueba que se puede establecer un id y que devuelve el propio objeto.
     */
    @Test
    public void setId_asigna_id_y_devuelve_this() {
        // Comprueba que establece el id y que devuelve el propio objeto
        Patata objeto = new Patata();
        assertSame(objeto, objeto.setId(1));
        assertEquals(1, objeto.getId());
    }

    //---------------------------------------------------------------
    // Tests para el método setDescripcion
    //---------------------------------------------------------------

    /**
     * Comprueba que salta una excepción si se intenta establecer una descripción nula o vacía.
     */
    @Test
    public void setDescripcion_excepciones() {
        // Comprueba que no se puede establecer una descripción nula
        Patata objeto = new Patata();
        try {
            objeto.setDescripcion(null);
            fail();
        } catch (IllegalArgumentException e) {
            System.err.println("Excepción lanzada: " + e.getMessage() + " para descripción nula");
        }

        // Comprueba que no se puede establecer una descripción vacía
        try {
            objeto.setDescripcion("");
            fail();
        } catch (IllegalArgumentException e) {
            System.err.println("Excepción lanzada: " + e.getMessage() + " para descripción vacía");
        }
    }

    /**
     * Comprueba que la descripción inicial es "".
     */
    @Test
    public void setDescripcion_descripcion_inicial_es_nula() {
        Patata objeto = new Patata();
        assertEquals("", objeto.getDescripcion());
    }

    /**
     * Comprueba que establece una descripción y que devuelve el mismo objeto.
     */
    @Test
    public void setDescripcion_asigna_descripcion_y_devuelve_this() {
        // Comprueba que establece una descripción y que devuelve el mismo objeto
        Patata objeto = new Patata();
        assertSame(objeto, objeto.setDescripcion("Descripción"));
        assertEquals("Descripción", objeto.getDescripcion());
    }

    //---------------------------------------------------------------
    // Tests para el método setPeso
    //---------------------------------------------------------------

    /**
     * Comprueba que salta una excepción si se intenta establecer un peso negativo.
     */
    @Test
    public void setPeso_excepciones() {
        // Comprueba que no se puede establecer un peso negativo
        try {
            new Patata().setPeso(-1.0);
            fail();
        } catch (IllegalArgumentException e) {
            System.err.println("Excepción lanzada: " + e.getMessage() + " para id negativo");
        }
    }

    /**
     * Comprueba que se puede establecer un peso y que devuelve el propio objeto.
     */
    @Test
    public void setPeso_asigna_peso_y_devuelve_this() {
        // Comprueba que establece el id y que devuelve el propio objeto
        Patata objeto = new Patata();
        Double nuevoPeso=89.98;
        assertSame(objeto, objeto.setPeso(nuevoPeso));
        assertEquals(nuevoPeso, objeto.getPeso(),0.01);
    }
    //---------------------------------------------------------------
    // Tests para el método toString
    //---------------------------------------------------------------
    /**
     * Comprueba que devuelve un string con el objeto en formato JSON para un objeto con id 0 y descripción "".
     */
    @Test
    public void toString_constructor_por_defecto() {
        Patata objeto = new Patata();
        assertEquals("{id: 0, descripcion: '', peso: 0.0}", objeto.toString());
    }

    /**
    * Comprueba que devuelve un string con el objeto en formato JSON.
    */
    @Test
    public void toString_objeto_con_datos() {
        // Comprueba que devuelve un string con el objeto en formato JSON para un objeto con id y descripción
        Patata objeto = new Patata();
        objeto.setId(1);
        objeto.setDescripcion("Descripción para testToString");
        objeto.setPeso(45.54);
        assertEquals("{id: 1, descripcion: 'Descripción para testToString', peso: 45.54}", objeto.toString());
    }

    /**
     * Mensaje indicando que se finalizan los tests de la clase Contenido.
     */
    @AfterAll
    public static void tearDown() {
        System.out.println("Finalizando test clase Contenido...");
    }
}
