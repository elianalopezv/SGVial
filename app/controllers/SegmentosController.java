package controllers;

import models.Segmento;
import play.mvc.*;
import play.db.ebean.Transactional;

import java.util.List;

public class SegmentosController extends Controller {

    @Transactional
    public Result segmentos() {

        List<Segmento> segmentos = Segmento.find.all();
        return ok(views.html.segmentos.render(segmentos));
    }
    public Result detalle(int id) {

        return ok(views.html.detalle.render(id));
    }

}
