import Craft.Pottery;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class PotteryTest {

    private Pottery pottery;

    @BeforeEach
    public void setUp() {
        pottery = new Pottery("Wildflower", 4.5, "clay", "Stoneware");
    }

    @Test
    public void objectType() {
        assert (Pottery.makeObject()).isEqualTo("A pottery Object will be made");
    }

    public void objectTypeBowls() {
        Pottery kilm = new Pottery("wildflower", 3.5,"clay","earthware"),.makeObject();
        String expected = Pottery.makeObject("Bowls");
        String actual = "Yes we can make Bowls, however, it will take longer";
        assertEquals(expected, actual);
    }

    public void objectTypeCutlery() {
        assert (Pottery.makeObject("Cutlery")).isEqualTo("Please specify the cutlery type and quantity in the form");
    }






}
