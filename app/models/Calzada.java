package models;

import javax.persistence.*;
import io.ebean.*;



@Entity
public class Calzada extends Model {

    @Id
    public int id;

    public float mdr;
    public float opi;
    public float iri;

    @ManyToOne(optional = false)
    public Segmento segmento;

    @ManyToOne
    public Funcionalidad funcionalidad;

    @ManyToOne
    public Superficie superficie;


    public static final Finder<Long, Calzada> find = new Finder<>(Calzada.class);
}