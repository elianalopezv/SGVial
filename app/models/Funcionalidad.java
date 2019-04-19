package models;

import javax.persistence.*;
import io.ebean.*;

import java.util.List;


@Entity
public class Funcionalidad extends Model {

    @Id
    public int id;

    public String funcionalidad;

    @OneToMany(mappedBy = "funcionalidad")
    public List<Calzada> calzadas;


    public static final Finder<Long, Funcionalidad> find = new Finder<>(Funcionalidad.class);
}