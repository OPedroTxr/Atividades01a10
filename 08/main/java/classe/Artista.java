package classe;

import java.util.ArrayList;
import java.util.List;

public class Artista {
    private String nomeArt;
    private List<Album> albuns = new ArrayList<>();

    public Artista(String nomeArt) {
        this.nomeArt = nomeArt;
    }
    
    public Artista(){
        this.nomeArt = "";
        this.albuns = new ArrayList<>();
        
    }
    public void addAlbum(Album album){
        this.albuns.add(album);
    } 
    
    public void addMusica(Musica music, String nomeAlbum){
         this.albuns.forEach(album ->{
            if(album.getNomeAlbum().equals(nomeAlbum))
                album.getListaMusic().add(music);
        });
    }
    
    public void imprimir(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Artista{" + "nomeArt=" + nomeArt + ", albuns=" + albuns + '}';
    }
      

    public String getNomeArt() {
        return nomeArt;
    }

    public void setNomeArt(String nomeArt) {
        this.nomeArt = nomeArt;
    }

    public List<Album> getAlbuns() {
        return albuns;
    }

    public void setAlbuns(List<Album> albuns) {
        this.albuns = albuns;
    }
    
}
