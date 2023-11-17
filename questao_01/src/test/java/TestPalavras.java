import br.inatel.NumeroPalavras;
import br.inatel.NumeroPalavrasMaiusculas;
import br.inatel.NumeroPalavrasPares;
import br.inatel.Frases;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestPalavras {
    private String frase = "O Flamengo é o maior clube do Brasil!";

    @Test
    public void testNumeroPalavras() {

        Frases observavel = new Frases();
        observavel.registraObservador(new NumeroPalavras());
        observavel.notificaObservadores(frase);
        assertEquals(5, observavel.getObservadores().get(0).getNumPalavras());

    }

    @Test
    public void testNumeroPalavrasPares() {

        Frases observavel = new Frases();
        observavel.registraObservador(new NumeroPalavrasPares());
        observavel.notificaObservadores(frase);
        assertEquals(2, observavel.getObservadores().get(0).getNumPalavras());

    }

    @Test
    public void testNumeroPalavrasMaiusculas() {

        Frases observavel = new Frases();
        observavel.registraObservador(new NumeroPalavrasMaiusculas());
        observavel.notificaObservadores(frase);
        assertEquals(2, observavel.getObservadores().get(0).getNumPalavras());

    }

    @Test
    public void testObservadorVazio() {
        Frases observavel = new Frases();
        assertTrue(observavel.getObservadores().isEmpty());
    }

}
