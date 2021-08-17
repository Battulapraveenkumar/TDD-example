import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Area_and_PerimeterTest {
    @Test
    void ToReturnAreaandPerimeterofFourandSix()
    {
        Area_And_Perimeter obj = new Area_And_Perimeter(4,6);
        int expectedArea = 24;
        int expectedPerimeter = 20;
        int actualArea = obj.Area();
        int actualPerimeter = obj.Perimeter();
        assertEquals(expectedArea,actualArea);
        assertEquals(expectedPerimeter,actualPerimeter);

    }
    @Test
    void ToReturnAreaandPerimeteroftenandtwenty()
    {
        Area_And_Perimeter obj = new Area_And_Perimeter(10,20);
        int expectedArea = 200;
        int expectedPerimeter = 60;
        int actualArea = obj.Area();
        int actualPerimeter = obj.Perimeter();
        assertEquals(expectedArea,actualArea);
        assertEquals(expectedPerimeter,actualPerimeter);

    }
    @Test
    void ToReturnAreaandPerimeterofminustenandminustwenty()
    {
        Area_And_Perimeter obj = new Area_And_Perimeter(-10,-20);
        int expectedArea = 200;
        int expectedPerimeter = -60;
        int actualArea = obj.Area();
        int actualPerimeter = obj.Perimeter();
        assertEquals(expectedArea,actualArea);
        assertEquals(expectedPerimeter,actualPerimeter);

    }
}
