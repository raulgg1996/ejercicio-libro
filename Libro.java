public class Libro
{
    private String titulo;
    private String autor;
    
    public Libro(String tit,String aut)
    {
        titulo=tit;
        autor=aut;
    }
   
    public String dimeAutor()
    {
        return autor;
    }
    
    public String dimeTitulo()
    {
        return titulo;
    }
}  