package es.cic.curso25.proy005;
/*
En este ejemplo si 2 personas ejecutan la misma linea al mismo tiempo,
uno pisaria a otro creando 2 instancias
*/
public class Dodo {
    private static Dodo instancia;

    private Dodo() {

    }

    public static Dodo getInstancia() {
        if (instancia == null) {
            instancia = new Dodo();
        }
        return instancia;
    }

}
