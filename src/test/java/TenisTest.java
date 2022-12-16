import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TenisTest {

    private final Tenis underTest = new Tenis("Mike", "Juan");

    @ParameterizedTest
    @CsvSource({
            "0,0,Cero Todos",
            "1,1,Quince Todos",
            "2,2,Treinta Todos",
            "3,3,Empate",
            "4,3,Ventaja de Mike",
            "4,5,Ventaja de Juan",
            "4,6,Juego de Juan",
            "6,4,Juego de Mike",
            "0,1,Cero a Quince",
            "1,2,Quince a Treinta",

    }
    )
    public void testTodosCero(int playerOneScore, int playerTwoScore, String expectedScore) {
        for (int i = 0; i < playerOneScore; i++) {
            underTest.playerOnePuntua();
        }
        for (int i = 0; i < playerTwoScore; i++) {
            underTest.playerTwoPuntua();
        }
        Assertions.assertEquals(expectedScore, underTest.getScore());

    }






}