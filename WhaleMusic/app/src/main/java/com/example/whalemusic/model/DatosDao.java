package com.example.whalemusic.model;

import com.example.whalemusic.R;
import com.example.whalemusic.ResultListener;

import java.util.ArrayList;
import java.util.List;

public class DatosDao {

    public void traerArtistas(ResultListener<List<Artista>> listenerDelControllerArtista){
        List<Artista> artistas= new ArrayList<>();
        artistas.add(new Artista("Foo Fighters", R.drawable.foofighters,"Foo Fighters es una banda estadounidense de rock alternativo formada en la ciudad de Seattle en 1994 por Dave Grohl, exbaterista de Nirvana, Scream y Queens of the Stone Age."));
        artistas.add(new Artista("Pearl Jam", R.drawable.pearljam,"Pearl Jam es un grupo de grunge y rock alternativo formado en Seattle, Estados Unidos, en el año 1990, con integrantes de las bandas Mother Love Bone y Temple Of The Dog."));
        artistas.add(new Artista("Stick Figure", R.drawable.stickfigure,"Stick Figure Stick Figure es una banda estadounidense de reggae y dub fundada en 2006 y con sede en el norte de California. El grupo ha lanzado siete álbumes de larga duración y un álbum instrumental, todos los cuales fueron escritos y producidos por el líder y multiinstrumentalista autodidacta Scott Woodruff."));
        artistas.add(new Artista("Eminem", R.drawable.eminem,"Marshall Bruce Mathers III, conocido por su nombre artístico Eminem  y también por su álter ego Slim Shady, es un rapero, productor discográfico y actor estadounidense. Su nombre artístico proviene de la unión de las iniciales de Marshall Mathers: M&M («Em and Em», estilizándose como Eminem)."));
        artistas.add(new Artista("The Streets", R.drawable.thestreets,"The Streets es un grupo inglés de hip hop alternativo y un proyecto de UK Garage de Birmingham, liderado por el vocalista y multi-instrumentalista Mike Skiner y que ha incluido bastantes otros contribuyentes, como el baterista Johnny Drum Machine, el vocalista Kevin Mark Trail y el beatmaker italo-estadounidense Leroy."));
        artistas.add(new Artista("Luis Fonsi", R.drawable.luisfonsi,"Luis Alfonso Rodríguez López-Cepero, conocido artísticamente como Luis Fonsi, es un cantante, compositor, actor y músico puertorriqueño."));
        artistas.add(new Artista("Ramones", R.drawable.ramones,"Ramones fue una banda de punk formada en Forest Hills, en el distrito de Queens (Nueva York, Estados Unidos) en 1974, y disuelta veintidós años más tarde, en 1996. Pioneros y líderes del naciente punk, cimentaron las bases de este género musical con composiciones simples, minimalistas, repetitivas y letras muy simples o incluso sin sentido, en clara oposición a la pomposidad y la fastuosidad de las bandas que triunfaban en el mercado de los años 1970: con sus largos solos de guitarra, las complejas canciones de rock progresivo y sus enigmáticas letras."));
        artistas.add(new Artista("The Clash", R.drawable.theclash,"The Clash fue una banda británica de punk que estuvo activa entre 1976 y 1986. El grupo fue uno de los más importantes e icónicos de la primera ola del punk originada a fines de los años 70 y, a diferencia de la mayoría de las bandas punk que se caracterizaban por su simplicidad musical,[cita requerida] incorporó reggae, rock, rockabilly, ska, jazz, funk y dub entre otros variados estilos en su repertorio. The Clash llegó a ser una banda muy influyente en la música mundial."));
        artistas.add(new Artista("Pink", R.drawable.pink,"Alecia Beth Moore (Doylestown, Pensilvania, 8 de septiembre de 1979), más conocida por su nombre artístico Pink (estilizado como P!nk), es una cantante, compositora, bailarina, acróbata y actriz estadounidense. Saltó a la fama a principios de la década de 2000 al lanzar el sencillo «There You Go», de su primer álbum R&B, Can't Take Me Home, en abril de 2000 a través de LaFace Records."));
        artistas.add(new Artista("Ricky Martin", R.drawable.rickymartin,"Enrique Martín Morales (San Juan, 24 de diciembre de 1971), conocido por su nombre artístico Ricky Martin, es un cantante, actor y escritor puertorriqueño nacionalizado español. Inició su carrera musical a mediados de la década de los 80, como vocalista de un grupo juvenil llamado Menudo."));
        listenerDelControllerArtista.finish(artistas);
    }


    public void traerGeneros(ResultListener<List<Genero>> listenerDelControllerGenero){
        List<Genero> generos= new ArrayList<>();
        generos.add(new Genero("Rock",R.drawable.rock,"Nirvana, ACDC, Red Hot Chilli Peppers, Queen, The Beatles, Led Zepellin, Queen of the Age Stone"));
        generos.add(new Genero("Pop",R.drawable.pop,"Gwen Stefani, MAdonna, Shakira, BTS, Justin Bieber, Enrique Iglesias, One Direction"));
        generos.add(new Genero("Indie",R.drawable.indie,null));
        generos.add(new Genero("Latinas",R.drawable.latina,null));
        generos.add(new Genero("Reggae",R.drawable.reggae,null));
        generos.add(new Genero("Country",R.drawable.country,null));
        generos.add(new Genero("Folklore",R.drawable.folklore,null));
        generos.add(new Genero("HipHop",R.drawable.hiphop,null));
        generos.add(new Genero("Cumbia Villera",R.drawable.cumbiavillera,null));
        generos.add(new Genero("Psicotrance",R.drawable.psicotrance,null));
        generos.add(new Genero("Punk",R.drawable.punk,null));
        listenerDelControllerGenero.finish(generos);
    }

    public void traerCanciones(ResultListener<List<Cancion>> listenerDelControllerCancion){
        List<Cancion> canciones= new ArrayList<>();
        canciones.add(new Cancion("Goteo","Duki","Goteo",2019));
        canciones.add(new Cancion("Yo x Ti tú x mi","Ozuna, Rosalía","Yo x Ti tú x mi",2019));
        canciones.add(new Cancion("Fresa","Lalo Ebratt, Tini","Fresa",2019));
        canciones.add(new Cancion("Tutu","Camilo, Pedro Capó","Tutu",2019));
        canciones.add(new Cancion("No se me quita","Maluma, Ricky Martin","11:11",2019));
        canciones.add(new Cancion("Señorita","Camila Cabello, Shawn Mendes","Señorita",2019));
        canciones.add(new Cancion("Nothing on you","Ed Sheeran, Dave, Paulo Londra","No. 6 collaborations project",2019));
        canciones.add(new Cancion("Boy with luv","BTS, Halsey","Map of the soul",2019));
        canciones.add(new Cancion("Mi persona favorita","Alejandro Sanz, Camila Cabello","#ELDISCO",2019));
        canciones.add(new Cancion("Circles","Pos Malone","Hollywood's Bleeding",2019));
        canciones.add(new Cancion("Slide away","Miley Cyru","Slide away",2019));
        listenerDelControllerCancion.finish(canciones);
    }


}
