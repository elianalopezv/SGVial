package controllers;

import models.Nomenclatura;
import models.Segmento;
import play.mvc.*;

import java.util.List;

public class SegmentosController extends Controller {

    public Result segmentos() {

        List<Segmento> segmentos = Segmento.find.all();
        return ok(views.html.segmentos.render(segmentos));
    }
    public Result detalle(int id) {

        Segmento segmento = Segmento.find.byId((long) id);
        Nomenclatura nomenclatura = Nomenclatura.find.query().where().eq("segmento", segmento).findOne();
        return ok(views.html.detalle.render(id,segmento,nomenclatura));
    }

}
