import com.projeto.validacao.cadeia.CadeiaValidacao;
import com.projeto.validacao.exception.ValidacaoException;
import com.projeto.validacao.model.Usuario;

public class Main {

    public static void main(String[] args) {
        CadeiaValidacao cadeia = new CadeiaValidacao();

        testar(cadeia, new Usuario("", "joao@email.com", "senha123"));
        testar(cadeia, new Usuario("Jo", "joao@email.com", "senha123"));
        testar(cadeia, new Usuario("João", "email-invalido", "senha123"));
        testar(cadeia, new Usuario("João", "joao@email.com", "12345"));
        testar(cadeia, new Usuario("João", "joao@email.com", "senhasemnumero"));
        testar(cadeia, new Usuario("João", "joao@email.com", "senha123"));
    }

    private static void testar(CadeiaValidacao cadeia, Usuario u) {
        try {
            cadeia.validar(u);
            System.out.println("OK   -> " + u.getNome());
        } catch (ValidacaoException e) {
            System.out.println("ERRO -> " + e.getMessage());
        }
    }
}
