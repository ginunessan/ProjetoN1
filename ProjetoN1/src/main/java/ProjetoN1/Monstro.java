
package ProjetoN1;


public class Monstro {
    
    private String nome;
    private Elemento elemento;
    private int vida;
    private int forca;
    private int defesa;
    private int velocidade;

    public Monstro(String nome, Elemento elemento, int vida, int forca, int defesa, int velocidade) {
        this.nome = nome;
        this.elemento = elemento;
        this.vida = vida;
        this.forca = forca;
        this.defesa = defesa;
        this.velocidade = velocidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Elemento getElemento() {
        return elemento;
    }

    public void setElemento(Elemento elemento) {
        this.elemento = elemento;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
    
    
    
    public void Amon(String nome, Elemento elemento, int vida, int forca, int defesa, int velocidade){
       this.nome = "Amon";
       this.vida = 10;
       this.forca = 10;
       this.defesa = 10;
       this.velocidade = 10;
    }
    
    public void Mut(String nome, Elemento elemento, int vida, int forca, int defesa, int velocidade){
       this.nome = "Mut";
       this.vida = 15;
       this.forca = 15;
       this.defesa = 15;
       this.velocidade = 15;
    }
    
    public void Osiris(String nome, Elemento elemento, int vida, int forca, int defesa, int velocidade){
       this.nome = "Osiris";
       this.vida = 20;
       this.forca = 20;
       this.defesa = 20;
       this.velocidade = 20;
    }
    
    public void Seth(String nome, Elemento elemento, int vida, int forca, int defesa, int velocidade){
       this.nome = "Seth";
       this.vida = 9;
       this.forca = 9;
       this.defesa = 9;
       this.velocidade = 9;
    }
    
    public void Isis(String nome, Elemento elemento, int vida, int forca, int defesa, int velocidade){
       this.nome = "Isis";
       this.vida = 13;
       this.forca = 13;
       this.defesa = 13;
       this.velocidade = 13;
    }
    
    public void Horus(String nome, Elemento elemento, int vida, int forca, int defesa, int velocidade){
       this.nome = "Horus";
       this.vida = 15;
       this.forca = 15;
       this.defesa = 15;
       this.velocidade = 15;
    }
    
    
    
}
