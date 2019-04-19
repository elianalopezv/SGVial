package models;

import javax.persistence.*;
import io.ebean.*;

import java.util.List;


@Entity
public class Estado extends Model {

    @Id
    public int id;

    public String estado;

    @OneToMany(mappedBy = "estado")
    public List<Bordillo> bordillos;


    public static final Finder<Long, Estado> find = new Finder<>(Estado.class);
}