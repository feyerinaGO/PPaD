package test;
import main.ru.hw1.shapes.*;

import org.junit.*;

import static org.junit.Assert.*;

public class JUnitShapesTest {
    @Test
    public void testCircle() {
        assertEquals(new Circle(0).getArea(), 0, 0);
        assertEquals(new Circle(1).getArea(), Math.PI, 0);
        assertEquals(new Circle(10).getArea(), Math.PI * 100, 0);
        assertThrows(IllegalArgumentException.class, () -> new Circle(-1));
    }

    @Test
    public void testSquare() {
        assertEquals(new Square(0).getArea(), 0, 0);
        assertEquals(new Square(1).getArea(), 1, 0);
        assertEquals(new Square(10).getArea(), 100, 0);
        assertThrows(IllegalArgumentException.class, () -> new Square(-1));
    }

    @Test
    public void testRectangle() {
        assertEquals(new Rectangle(0, 0).getArea(), 0, 0);
        assertEquals(new Rectangle(1, 1).getArea(), 1, 0);
        assertEquals(new Rectangle(0, 1).getArea(), 0, 0);
        assertEquals(new Rectangle(1, 0).getArea(), 0, 0);
        assertEquals(new Rectangle(2, 3).getArea(), 6, 0);
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(-1, 2));
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(1, -2));
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(-1, -2));
    }
}
