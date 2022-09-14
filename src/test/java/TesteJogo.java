
import br.com.bmoises.jogo8.No;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TesteJogo {
    private No tabuleiro;
    private int[][] inicio;
    private int[][] solucao;
    
    @BeforeEach
    public void configuracao() {
        tabuleiro = new No();
        inicio = new int[3][3];
        solucao = new int[3][3];
        
        inicio[0][0] = 1;
        inicio[0][1] = 2;
        inicio[0][2] = 3;
        inicio[1][0] = 4;
        inicio[1][1] = 0;
        inicio[1][2] = 6;
        inicio[2][0] = 7;
        inicio[2][1] = 5;
        inicio[2][2] = 8;
        
        solucao[0][0] = 1;
        solucao[0][1] = 2;
        solucao[0][2] = 3;
        solucao[1][0] = 4;
        solucao[1][1] = 5;
        solucao[1][2] = 6;
        solucao[2][0] = 7;
        solucao[2][1] = 8;
        solucao[2][2] = 0;
        
        tabuleiro.setEstado(inicio);
    }
    
    @Test
    public void moverZero() {
        int btn8 = tabuleiro.getEstado()[2][1];
        int btn5 = tabuleiro.getEstado()[1][1];
        
        inicio[1][1] = btn8;
        inicio[2][1] = btn5;
        
        tabuleiro.setEstado(inicio);
        
        assertEquals(Integer.valueOf(5),tabuleiro.getEstado()[1][1]);
        assertEquals(Integer.valueOf(0),tabuleiro.getEstado()[2][1]);
    }
    
    @Test
    public void ganhar() {
        int btn8 = tabuleiro.getEstado()[2][2];
        int btn5 = tabuleiro.getEstado()[2][1];
        int btn9 = tabuleiro.getEstado()[1][1];
        
        inicio[1][1] = btn5;
        inicio[2][1] = btn8;
        inicio[2][2] = btn9;
        
        tabuleiro.setEstado(inicio);
        
        assertTrue(Arrays.deepEquals(tabuleiro.getEstado(), solucao));
    }
}
