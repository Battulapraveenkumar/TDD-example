import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Area_and_PerimeterTest {
    @Test
    void ToReturnAreaandPerimeterofFourandSix()
    {
        Area_and_Perimeter obj = new Area_and_Perimeter(4,6);
        int expectedArea = 24;
        int expectedPerimeter = 20;
        int actualArea = obj.Area();
        int actualPerimeter = obj.Perimeter();
        assertEquals(expectedArea,actualArea);
        assertEquals(expectedPerimeter,actualPerimeter);

    }


}
