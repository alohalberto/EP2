package uoc.ei.tads;
/**
 * Clase que implementa la excepci�n que se genera cuando se pasa como
 * par�metro una posici�n inv�lida.
 *
 * Es una extensi�n de las excepciones en tiempo de ejecuci�n gestionadas por el
 * propio compilador.
 *
 * @author  Jordi �lvarez Canal
 * @author  Esteve Marin� Gallis�.
 *          Estructura de la Informaci�n,
 *          Universitat Oberta de Catalunya (UOC)
 * @version 2.0.0
 */
public class ExcepcionPosicionInvalida  extends ExcepcionTADs
{
   /** Atributo que en Java 1.5 determina la compatibilidad entre objetos
    * serialitzables de la misma clase. El identificador se calcula
    * mediante un m�todo de la clase Utilidades. */
   private static final long serialVersionUID = Utilidades.getSerialVersionUID();
	
	
   /** Constructor sin par�metros. */
   public ExcepcionPosicionInvalida() { super(); }

   /**
    * Constructor con un par�metro.
    * @param mensaje  mensaje con el error que ha generado la excepci�n
    */
   public ExcepcionPosicionInvalida(String mensaje) { super(mensaje); }
}
