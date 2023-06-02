//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.05.24 a las 09:06:34 AM CEST 
//


package com.cursoceat.xml.schema;

import java.util.ArrayList;
import java.util.Collection;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="alumno"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="edad" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "alumno"
})
@XmlRootElement(name = "centro")
public class Centro {

    @XmlElement(required = true)
    protected Collection<Centro.Alumno> alumnos;

    /**
     * Obtiene el valor de la propiedad alumno.
     * 
     * @return
     *     possible object is
     *     {@link Centro.Alumno }
     *     
     */
    public Collection<Centro.Alumno> getAlumno() {
    	if(alumnos == null) {
    		alumnos = new ArrayList<Centro.Alumno>();
    	}
        return alumnos;
    }

    /**
     * Define el valor de la propiedad alumno.
     * 
     * @param value
     *     allowed object is
     *     {@link Centro.Alumno }
     *     
     */
    public void crearAlumno (String nom, Integer n) {
    	Alumno a = new Alumno(nom, (int) n);
    	alumnos.add(a);
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="edad" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "nombre",
        "edad"
    })
    public static class Alumno {

        @XmlElement(required = true)
        protected String nombre;
        protected int edad;
        protected static int id = 1;

        /**
         * Obtiene el valor de la propiedad nombre.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public Alumno() {}
        public Alumno(String n, int e) {
        	this.nombre = n;
        	this.edad = e;
        }
        public String getNombre() {
            return nombre;
        }

        /**
         * Define el valor de la propiedad nombre.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNombre(String value) {
            this.nombre = value;
        }

        /**
         * Obtiene el valor de la propiedad edad.
         * 
         */
        public int getEdad() {
            return edad;
        }

        /**
         * Define el valor de la propiedad edad.
         * 
         */
        public void setEdad(int value) {
            this.edad = value;
        }
        
        public int getId() {
        	return id;
        }
		@Override
		public String toString() {
			return "Alumno id= "+id+" [nombre=" + nombre + ", edad=" + edad + "]";
		}
        
        

    }

}
