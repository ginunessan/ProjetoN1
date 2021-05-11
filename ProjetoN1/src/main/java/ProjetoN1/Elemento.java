
package ProjetoN1;


public class Elemento {
    
    private String elemento;
    

    public Elemento(String elemento) {
        this.elemento = elemento;
        
    }

    public String getElemento() {
        return elemento;
    }

    public void setElemento(String elemento) {
        this.elemento = elemento;
    }

    
    
    public void Fogo(String elemento){
    
        this.elemento = "Fogo";
        
    }
    
    public void Agua(String elemento){
    
        this.elemento = "Agua";
        
    }
    
    public void Grama(String elemento){
    
        this.elemento = "Grama";
        
    }
    
    
}




