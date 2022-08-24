import Craft.WoodWork;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WoodWorkTest {

    private WoodWork woodWork;


    @BeforeEach
    public void setUp(){woodWork = new WoodWork("tree", 6.5, "Wood","Oak", "CrossCut");
    }

    @Test
    public void makeObject(){
        String expected = "I'm making a functional object";
        String actual = woodWork.makeObject();
        assertEquals(expected, actual);
    }

    //public String nails (int numberOfNails){
    //        return String.format("This metal type %s, would require %o of nails",this.metalType
    @Test
    public void numberOfNails(){
        String expected = "This wood type, Oak, would require 42 nails";
        String actual = woodWork.nails(42);
        assertEquals(expected, actual);
    }
}


