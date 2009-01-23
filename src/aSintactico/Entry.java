package aSintactico;

import aSintactico.tipos.Tipo;
import java.util.LinkedList;

/**
 * Representa una entrada en la tabla de simbolos
 * Mantiene la informacion para las distintas entidades 
 * del lenguaje: constantes,variables,parametros,funciones,etc
 *
 * @author Agustin Ramone
 * @since jdk 1.5
 * @see aSintactico.EntryTable
 */
public final class Entry {
    
    public static final int DEFAULT_ENTRY   = -1;
    public static final int PROGRAMA        = 1;
    public static final int VARIABLE        = 2;
    public static final int TIPO            = 3;

    
    /** clase de entrada */
    public int clase = DEFAULT_ENTRY;
    
    /** nombre de la entidad */
    public String nombre = null;
    
    /** tipo de datos*/
    public Tipo tipo = null;
    
    /** valor de la entidad*/
    public Object valor = null;
    
    public String valorStr = null;
    
    /** nivel lexico */
    public int nivelLexico;
    
    /** direccion  */
    public int desplazamiento;
    
    /** etiqueta del proc o funcion */
    public String etiqueta = null;
    
    /** 
     * Vale false solo para constantes, procedimientos 
     * o cualquier otra entidad que no se le pueden asignar valores
     */
    public boolean asignable = true;
    
    
    /** Constructor */
    public Entry() { }
        
    /**
     * Constructor
     * @param claseEntrada 
     */
    public Entry(int clase) {
        this.clase = clase;
    }
    
    /**
     * 
     * @param name 
     * @param claseEntrada 
     */
    public Entry(String name, int clase){
        this.nombre = name;
        this.clase = clase;
    }
    
    /**
     * 
     * @param name 
     * @param claseEntrada 
     * @param tipo 
     */
    public Entry(String name, int clase, Tipo tipo){
        this.nombre = name;
        this.clase = clase;
        this.tipo = tipo;
    }
    
    /**
     * 
     * @return true si  la entidad es el programa
     */
    public boolean esPrograma(){
        return clase == PROGRAMA;
    }
    
     /**
     * 
     * @return true si  la entidad es una variable
     */
    public boolean esVariable(){
        return clase == VARIABLE;
    }
    
    /**
     * 
     * @return true si  la entidad es un Tipo
     */
    public boolean esTipo(){
        return clase == TIPO;
    }

}