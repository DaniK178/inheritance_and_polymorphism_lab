import Craft.Pottery;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PotteryTest {

    private Pottery pottery;

    @BeforeEach
    public void setUp() {
        pottery = new Pottery("Wildflower", 4.5, "clay", "Stoneware");
    }

    @Test
    public void objectTypeBowls(){
        assertThat(Pottery.makeObject).isEqualTo("A pottery Object will be made");
    }


}
