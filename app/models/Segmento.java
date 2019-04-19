package models;

import javax.persistence.*;
import io.ebean.*;

import java.util.List;


@Entity
public class Segmento extends Model {

    @Id
    public int id;

    public float longitud;
    public String tipo_via;
    public int estrato;

    @OneToOne(mappedBy = "segmento")
    public Nomenclatura nomenclatura;

    @OneToMany(mappedBy = "segmento")
    public List<Calzada> calzadas;

    @OneToMany(mappedBy = "segmento")
    public List<Bordillo> bordillos;





    public static final Finder<Long, Segmento> find = new Finder<>(Segmento.class);
}