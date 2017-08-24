public class Libro
{
    private String titulo;
    private String autor;
    private int paginas;
    
    public Libro(String tit,String aut,int pag)
    {
        titulo=tit;
        autor=aut;
        paginas=pag;
    }
   
    public String dimeAutor()
    {
        return autor;
    }
    
    public String dimeTitulo()
    {
        return titulo;
    }
    public int dimePaginas()
    {
       
        return paginas;
        
    } 
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
        
        return cadResultado;
        
    }
}  