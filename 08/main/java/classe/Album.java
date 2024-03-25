package classe;

import java.util.ArrayList;
import java.util.List;


public class Album {
    private String nomeAlbum;
    private int anoLancam;
    private List<Musica> listaMusic = new ArrayList<>();

    public Album(String nomeAlbum, int anoLancam) {
        this.nomeAlbum = nomeAlbum;
        this.anoLancam = anoLancam;
    }
    
     public Album(){
        this.nomeAlbum = "";
        this.anoLancam = 0;
        this.listaMusic = new ArrayList<>();
    }
    
    public void addMusica(Musica music){
        this.listaMusic.add(music);
    } 
    
    public void imprimir(){
        System.out.println(toString());
    }

    public String getNomeAlbum() {
        return nomeAlbum;
    }

    public void setNomeAlbum(String nomeAlbum) {
        this.nomeAlbum = nomeAlbum;
    }

    public int getAnoLancam() {
        return anoLancam;
    }

    public void setAnoLancam(int anoLancam) {
        this.anoLancam = anoLancam;
    }

    public List<Musica> getListaMusic() {
        return listaMusic;
    }

    public void setListaMusic(List<Musica> listaMusic) {
        this.listaMusic = listaMusic;
    }

    @Override
    public String toString() {
        return "Album{" + "nomeAlbum=" + nomeAlbum + ", anoLancam=" + anoLancam + ", listaMusic=" + listaMusic + '}';
    }
   
}
