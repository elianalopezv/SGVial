package models;

import javax.persistence.*;
import io.ebean.*;

import java.util.List;


@Entity
public class Superficie extends Model {

    @Id
    public int id;

    public String superficie;

    @OneToMany(mappedBy = "superficie")
    public List<Calzada> calzadas;


    public static final Finder<Long, Superficie> find = new Finder<>(Superficie.class);
}