package models;

import javax.persistence.*;
import io.ebean.*;



@Entity
public class Nomenclatura extends Model {

    @Id
    public int id;

    public String via_generadora;
    public int n_via_gen;
    public String cruce_desde;
    public String n_cruce_desde;
    public String cruce_hasta;
    public String n_cruce_hasta;


    @OneToOne
    public Segmento segmento;


    public static final Finder<Long, Nomenclatura> find = new Finder<>(Nomenclatura.class);
}