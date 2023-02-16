import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ExampTest {
    Examp examp;
    @BeforeEach
    public void before(){
        examp = new Examp();
    }
    @Test
    public void shouldMultiplic(){
        int res = examp.multiplic(2);
        Assertions.assertEquals(20, res);
    }
    @Test
    public void shouldSum(){
        int res = examp.sum(3, 5);
        Assertions.assertEquals(6, res);
    }
    @Test
    public void shouldStringWithNumber(){
        String res = examp.stringWithNumber(5);
        Assertions.assertEquals("number 5", res);
    }
}
