import org.junit.Assert;
import org.junit.Test;
import ru.netology.service.CashbackHackService;


public class CashbackHackServiceTest {



    @org.junit.Test
    public void testFunctionCheck() {
        CashbackHackService cashback = new CashbackHackService();
        int actual = cashback.remain (999);
        int expected = 1;

        Assert.assertEquals(actual , expected);
    }

    @org.junit.Test
    public void testFunctionCheck2() {
        CashbackHackService cashback = new CashbackHackService();
        int actual = cashback.remain (1001);
        int expected = 999;

        Assert.assertEquals(actual , expected);
    }
    @Test
    public void checkingForNegativeValue() {
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            CashbackHackService cashback = new CashbackHackService();
            cashback.remain (-1);
        });
    }

    @org.junit.Test
    public void checkForMultipleOfThousand() {
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            CashbackHackService cashback = new CashbackHackService();
            cashback.remain (1000);
        });
    }

    @org.junit.Test
    public void testFunctionCheckAtZero() {
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            CashbackHackService cashback = new CashbackHackService();
            cashback.remain (0);
        });
    }


}