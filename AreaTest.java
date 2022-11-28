import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AreaTest {
    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }


    @Test
    public void testTriangleOne()
    {
        Area() area = new Area();
        double temp = area.triangle(2.0);
        assertEquals(temp, 1.73205);
    }

    @Test 
    public void testTriangleTwo()
    {
        Area() area = new Area();
        double temp = area.triangle(1.0, 4.0, 4.0);
        assertEquals(temp, 30.0);
    }

    @Test 
    public void testSquare()
    {
        Area() area = new Area();
        double temp = area.square(2.0);
        assertEquals(temp, 4.0);
    }

    @Test 
    public void testPentagon()
    {
        Area() area = new Area();
        double temp = area.pentagon(2.0);
        assertEquals(temp, 6.88191);
    }
    @Test 
    public void testHexagon()
    {
        Area() area = new Area();
        double temp = area.hexagon(2.0);
        assertEquals(temp, 10.3923);
    }
    @Test 
    public void testOctagon()
    {
        Area() area = new Area();
        double temp = area.octagon(2.0);
        assertEquals(temp, 19.31371);
    }
    @Test 
    public void testIcosagon()
    {
        Area() area = new Area();
        double temp = area.icosagon(2.0);
        assertEquals(temp, 126.27503);
    }
}
