import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Area_and_PerimeterTest {

    @Test
    void ToReturnAreaandPerimeterofminustenandminustwenty()
    {
        Area_and_Perimeter obj = new Area_and_Perimeter(-10,-20);
        int expectedArea = 200;
        int expectedPerimeter = -60;
        int actualArea = obj.Area();
        int actualPerimeter = obj.Perimeter();
        assertEquals(expectedArea,actualArea);
        assertEquals(expectedPerimeter,actualPerimeter);

    }
}
