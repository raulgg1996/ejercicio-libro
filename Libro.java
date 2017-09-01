/**
 * @author Raul Gonzalez Gonzalez
 * @version 4.1.0
 */

public class Libro
{
    private String titulo;
    private String autor;
    private int paginas;
    private String noReferencia;
    private int prestamos;
    
    public Libro(String tit,String aut,int pag)
    {
        titulo=tit;
        autor=aut;
        paginas=pag;
        noReferencia="";
        prestamos=0;
        
    }
   /**
    * metodo que muestra al usuario el autor del libro.
    */
    public String dimeAutor()
    {
        return autor;
    }
    /**
     *metodo que permite mostrar al usuario el titulo del libro 
     */
    public String dimeTitulo()
    {
        return titulo;
    }
    /**
     * metodo que permite mostrar al usuario el numero de paginas del libro
     */
    public int dimePaginas()
    {
       
        return paginas;
        
    } 
    /**
     * metodo que permite mostrar el numero de referencia del Libro.
     * @return devuelve el numero de referencia del libro.
     */
    public String dimeNoRef()
    {
        return noReferencia;
    }
    
    /**
     * metodo que muestra la cantidad de prestamos del libro.
     * @return regresa la cantidad de prestamos del libro,
     */
    public int dimePrestamos()
    {
        return prestamos;
    }
    /**
     * metodo que permite mostrar todos los detalles de un libro .
     * @return regresa una cadena,la cual contiene todos los detalles del lbro.
     */
    public String dimeDetalles()
    {
        String cadResultado="";
        cadResultado=cadResultado+"Titulo";
        cadResultado=cadResultado+": ";
        cadResultado=cadResultado+titulo;
        cadResultado=cadResultado+"Autor";
        cadResultado=cadResultado+": ";
        cadResultado=cadResultado+autor;
        cadResultado=cadResultado+"Páginas";
        cadResultado=cadResultado+": ";
        cadResultado=cadResultado+paginas;
        cadResultado+=",";
        cadResultado+="Numero de Referencia: ";
        cadResultado+=noReferencia;
        cadResultado+=", ";
        cadResultado+="Numero de prestamos: ";
        cadResultado+=prestamos;
        return cadResultado;
    }
    
    /**
     * metodo que permite cambiar el numero de referencia del libro.
     * @param recibe como parametro el numero de referencia del libro.
     */
    public void cambiaNoRef(String noRef)
    {
        if(noRef.length()>2)
        {
            noReferencia=noRef;
        }
        else
        {
            noReferencia=noReferencia;
        }
    }
    
    
    
    /**
     * metodo que permite aumentar la cantidad de prestamos en 1.
     */
    public void prestar()
    {
        prestamos+=1;
    }
  
}  