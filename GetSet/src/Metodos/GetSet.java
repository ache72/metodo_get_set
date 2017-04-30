
package Metodos;

public class GetSet 
    {
    public int ISBN;
    public String nombre;
    public String titulo;
    public int npaginas;
    
    public GetSet(int ISBN, String nombre, int npaginas, String titulo)
        {
        this.ISBN = ISBN;
        this.nombre=nombre;
        this.npaginas=npaginas;
        this.titulo=titulo;
        }
    
        public int getISBN(){
            return ISBN;
        } 
        public void setISBN(int ISBN){
            this.ISBN = ISBN;
        }
        
        public String getNombre(){
            return nombre;
        }
        
        public void setNombre(){
            this.nombre = nombre;
        }
        
        public String getTitulo(){
            return titulo;
        }
        
        public void setTitulo(){
            this.titulo = titulo;
        }
        
        public int getNpaginas(){
            return npaginas;
        }
        
        public void setNpaginas(){
            this.npaginas=npaginas;
        }
        
    }

