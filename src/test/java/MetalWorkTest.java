import Craft.MetalWork;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MetalWorkTest {

    private MetalWork metalWork;


    @BeforeEach
    public void setUp(){
        metalWork = new MetalWork("Molten",12.25,"Metal", "Steel");

    }

    @Test
    public void makeObject(){
        String expected = "I'm making a functional object";
        String actual = metalWork.makeObject();
        assertEquals(expected, actual);
    }

    @Test
    public void numberOfNails(){
        String expected = "This metal type, Steel, would require 30 nails";
        String actual = metalWork.nails(30);
        assertEquals(expected, actual);
    }
}
