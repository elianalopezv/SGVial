package models;

import javax.persistence.*;
import io.ebean.*;



@Entity
public class Bordillo extends Model {

    @Id
    public int id;

    public float longitud;
    public int orden;
    public float indice_condicion;

    @ManyToOne(optional = false)
    public Segmento segmento;

    @ManyToOne
    public Estado estado;


    public static final Finder<Long, Bordillo> find = new Finder<>(Bordillo.class);
}