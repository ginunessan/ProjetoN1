
package ProjetoN1;


public class Golpe {
    
    private String nome;
    private int poder;
    private Elemento elemento;

    public Golpe(String nome, int poder, Elemento elemento) {
        this.nome = nome;
        this.poder = poder;
        this.elemento = elemento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    public Elemento getElemento() {
        return elemento;
    }

    public void setElemento(Elemento elemento) {
        this.elemento = elemento;
    }

    public void TempestadeDeFogo (String nome, int poder, Elemento elemento){
        this.nome = "Tempestade de Fogo";
        this.poder = 5;
        elemento.getFogo();
}
    public void ExplosaoSolar (String nome, int poder, Elemento elemento){
        this.nome = "Explosao Solar";
        this.poder = 7;
        elemento.getFogo();
}
    public void Tsuname (String nome, int poder, Elemento elemento){
        this.nome = "Tsuname";
        this.poder = 2;
        elemento.getAgua();
}
    public void AtaqueGelo (String nome, int poder, Elemento elemento){
        this.nome = "Ataque de Gelo";
        this.poder = 4;
        elemento.getAgua();
}
    public void BolaDeFolhas (String nome, int poder, Elemento elemento){
        this.nome = "Bola de Folhas";
        this.poder = 3;
        elemento.getGrama();
}
    public void Mordida (String nome, int poder, Elemento elemento){
        this.nome = "Mordida";
        this.poder = 2;
        elemento.getGrama();
}
    public void LancaChamas (String nome, int poder, Elemento elemento){
        this.nome = "Lanca Chamas";
        this.poder = 8;
        elemento.getFogo();
}
    public void Vulcanismo (String nome, int poder, Elemento elemento){
        this.nome = "Vulcanismo";
        this.poder = 9;
        elemento.getFogo();
}
    public void CanhaoAgua (String nome, int poder, Elemento elemento){
        this.nome = "Canhao de Agua";
        this.poder = 2;
        elemento.getAgua();
}
    public void ExplosaoAgua (String nome, int poder, Elemento elemento){
        this.nome = "Explosao de Agua";
        this.poder = 6;
        elemento.getAgua();
}
    public void PoderVentos (String nome, int poder, Elemento elemento){
        this.nome = "Poder dos Ventos";
        this.poder = 4;
        elemento.getGrama();
}
    public void RajadaGrama (String nome, int poder, Elemento elemento){
        this.nome = "Rajada de Grama";
        this.poder = 5;
        elemento.getGrama();
}
    
    
    
}
