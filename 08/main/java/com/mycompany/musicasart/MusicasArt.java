package com.mycompany.musicasart;

import classe.Album;
import classe.Artista;
import classe.Gerenciador;
import classe.Musica;

public class MusicasArt {

    public static void main(String[] args) {
        
        Artista art1 = new Artista("Leonardo");
        Album album1 = new Album("Estrela", 2020);
        Album album2 = new Album("Viver", 2021);

        art1.addAlbum(album1);
        art1.addAlbum(album2);

        Musica music1 = new Musica("Moleca", 3.30);
        Musica music2 = new Musica("Sapequinha", 4.00);

        art1.addMusica("Estrela", music1);
        art1.addMusica("Estrela", music2); 

        Gerenciador gerenciador = new Gerenciador();

        gerenciador.adicionarArtista(art1);

        Artista artistaComMaisAlbuns = gerenciador.artistaMaisAlbuns();

        System.out.println("Artista com mais álbuns: " + artistaComMaisAlbuns.getNomeArt());

        Album albumComMaisMusicas = gerenciador.albunMaisMusica();

        System.out.println("Álbum com mais músicas: " + albumComMaisMusicas.getNomeAlbum());
    }
}
    


