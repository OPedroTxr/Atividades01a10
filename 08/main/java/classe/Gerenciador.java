package classe;

import java.util.ArrayList;
import java.util.List;

public class Gerenciador {
    
    private List <Artista> artista;
    
    public Gerenciador(){
        this.artista = new ArrayList<>();
    }

    public void adicionarArtista(Artista artista){
        this.artista.add(artista);
    }
    
    public Artista artistaMaisAlbuns(){
        Artista artistaMaisAlbuns = null;
        int maisAlbuns = 0;
        for(Artista a1: artista){
            int numAlbuns = a1.getAlbuns().size();
            if(numAlbuns > maisAlbuns){
                maisAlbuns = numAlbuns;
                artistaMaisAlbuns = a1;
            }
        }
        return artistaMaisAlbuns;
    }
    
 public Album albunMaisMusica() {
    Album albumMaisMusica = null;
    int maisMusica = 0;
    for (Artista a1 : artista) {
        for (Album album : a1.getAlbuns()) {
            int numMusica = album.getListaMusic().size();
            if (numMusica > maisMusica) {
                maisMusica = numMusica;
                albumMaisMusica = album;
            }
        }
    }
    return albumMaisMusica;
}
    
    public List<Artista> getArtista() {
        return artista;
    }

    public void setArtista(List<Artista> artista) {
        this.artista = artista;
    }
   
}
    

