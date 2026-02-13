import java.util.*;

public class EliminarCuatro {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>(Arrays.asList(
                "sol", "luna", "mar", "algo", "no", "montaña"
        ));

        Iterator<String> it = lista.iterator();

        while (it.hasNext()) {
            if (it.next().length() < 4) {
                it.remove();
            }
        }

        System.out.println(lista);
    }
}
