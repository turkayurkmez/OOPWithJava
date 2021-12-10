import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.company.FizzBuzzGame;

public class FizzBuzzGameTest {
    @Test
    void Given_5_return_Buzz() {
        FizzBuzzGame fizzBuzzGame = new FizzBuzzGame();
        String word = fizzBuzzGame.GetWord(5);
        Assertions.assertEquals("Buzz",word);
    }

    @Test
    void Given_Multiply_3_return_Fizz() {
        FizzBuzzGame fizzBuzzGame = new FizzBuzzGame();
        //Act:
        String word = fizzBuzzGame.GetWord(9);
        Assertions.assertEquals("Fizz",word);
    }

    @Test
    void Given_3_Return_Fizz() {
        /*
        *   Arrange
        *   Act
        *   Assert
        *
        * */
        //Arrange:
        FizzBuzzGame fizzBuzzGame = new FizzBuzzGame();
        //Act:
        String word = fizzBuzzGame.GetWord(3);
        Assertions.assertEquals("Fizz",word);
    }


}
