package mVirtual.instrucciones.pila;


import mVirtual.MaquinaVirtual;
import mVirtual.instrucciones.ExcepcionEnEjecucion;
import mVirtual.instrucciones.Instruccion;
/**
 * 
 * Esta clase implementa la ejecuci�n en la pila de la instrucci�n apila de la m�quina virtual
 *
 */
public class InstruccionApila implements Instruccion {

	/**
	 *Los datos que debe apilar 
	 */
	private String datos;
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return this.getClass().getSimpleName()+"("+datos+")";
	}
	
	/* (non-Javadoc)
	 * @see maquinaVirtual.repertorio.Instruccion#Ejecutar(java.util.Stack, java.util.Hashtable)
	 */
	public void Ejecutar() throws ExcepcionEnEjecucion {
		try{
			MaquinaVirtual.obtenerInstancia().getPila().push(datos);
			}catch (Exception e){
				throw new ExcepcionEnEjecucion("Error de acceso a memoria");
			} 

	}

	/* (non-Javadoc)
	 * @see maquinaVirtual.repertorio.Instruccion#getDatos()
	 */
	public String getDatos() {
		return datos;
	}

	/* (non-Javadoc)
	 * @see maquinaVirtual.repertorio.Instruccion#setDatos(java.lang.String)
	 */
	public void setDatos(String datos) {
		this.datos=datos;
	}

}
