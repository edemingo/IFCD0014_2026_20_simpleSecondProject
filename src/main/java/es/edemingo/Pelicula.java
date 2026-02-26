package es.edemingo;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class Pelicula {
    private String titulo;
    private String director;
    private String genero;
    private int anyo;
}
