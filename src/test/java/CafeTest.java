import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CafeTest {
    static Cafe cafe;
    @BeforeEach
    public void before(){
        cafe = new Cafe();
    }

    @Test
    public void shouldNewOpeningHours(){
        String res = cafe.newOpeningHours(9, 17);
        Assertions.assertEquals("Новое время работы: 9:00 - 17:00", res);
    }
    @Test
    public void shouldAddWeekend(){
        String res = cafe.addWeekend("Пн - 1-ый день");
        Assertions.assertEquals("Пн - 1-ый день", res);
    }
    @Test
    public void shouldDeleteWeeken(){
        String res = cafe.deleteWeekend("Пн - 1-ый день");
        Assertions.assertFalse(res == "Пн - 1-ый день");
    }
}

