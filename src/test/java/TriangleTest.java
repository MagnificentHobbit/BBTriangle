import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import triangle.Triangle;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TriangleTest {
    private Triangle triangle;

    private static final int MAX_INT = 2147483647;

    @BeforeEach
    void setUp() {
        this.triangle = new Triangle(1, 1, 1);
    }

    @Test
    void testImpossibleTriangles() {
        triangle.setSideLengths(1000, 10, 10);
        assertEquals("impossible", triangle.classify(), "1000, 10, 10 should be impossible");

        triangle.setSideLengths(10, 10, 1000);
        assertEquals("impossible", triangle.classify(), "10, 10, 1000 should be impossible");

        triangle.setSideLengths(10, 1000, 10);
        assertEquals("impossible", triangle.classify(), "10, 1000, 10 should be impossible");

        triangle.setSideLengths(10, 1000, 1000);
        assertEquals("impossible", triangle.classify(), "10, 1000, 1000 should be impossible");

        triangle.setSideLengths(1000, 10, 1000);
        assertEquals("impossible", triangle.classify(), "1000, 10, 1000 should be impossible");

        triangle.setSideLengths(1000, 1000, 10);
        assertEquals("impossible", triangle.classify(), "1000, 1000, 10 should be impossible");

        triangle.setSideLengths(10, 10, 10);
        assertEquals("impossible", triangle.classify(), "10, 10, 10 should be impossible");

        triangle.setSideLengths(1000, 1000, 1000);
        assertEquals("impossible", triangle.classify(), "1000, 1000, 1000 should be impossible");
    }

    @Test
    void testEquilateralTriangles() {
        triangle.setSideLengths(5, 5, 5);
        assertEquals("equilateral", triangle.classify(), "5, 5, 5 should be equilateral");
    }

    @Test
    void testIsoscelesTriangles() {
        triangle.setSideLengths(5, 4, 4);
        assertEquals("isosceles", triangle.classify(), "5, 4, 4 should be isosceles");

        triangle.setSideLengths(4, 4, 1);
        assertEquals("isosceles", triangle.classify(), "4, 4, 1 should be isosceles");

        triangle.setSideLengths(1, 4, 4);
        assertEquals("isosceles", triangle.classify(), "1, 4, 4 should be isosceles");

        triangle.setSideLengths(4, 1, 4);
        assertEquals("isosceles", triangle.classify(), "4, 1, 4 should be isosceles");
    }

    @Test
    void testRightAngledTriangles() {
        triangle.setSideLengths(5, 4, 3);
        assertEquals("right-angled", triangle.classify(), "5, 4, 3 should be right-angled");

        triangle.setSideLengths(3, 5, 4);
        assertEquals("right-angled", triangle.classify(), "3, 5, 4 should be right-angled");

        triangle.setSideLengths(4, 5, 3);
        assertEquals("right-angled", triangle.classify(), "4, 5, 3 should be right-angled");
    }

    @Test
    void testScaleneTriangles() {
        triangle.setSideLengths(2, 3, 4);
        assertEquals("scalene", triangle.classify(), "2, 3, 4 should be scalene");

        triangle.setSideLengths(4, 3, 2);
        assertEquals("scalene", triangle.classify(), "4, 3, 2 should be scalene");

        triangle.setSideLengths(3, 4, 2);
        assertEquals("scalene", triangle.classify(), "3, 4, 2 should be scalene");
    }

    // Boundary Value Analysis Tests
    @Test
    void testBoundaryValueTriangles() {
        // Minimum values
        triangle.setSideLengths(0, 0, 0);
        assertEquals("impossible", triangle.classify(), "0, 0, 0 should be impossible");

        // Just above the minimum values
        triangle.setSideLengths(1, 0, 0);
        assertEquals("impossible", triangle.classify(), "1, 0, 0 should be impossible");

        triangle.setSideLengths(0, 1, 0);
        assertEquals("impossible", triangle.classify(), "0, 1, 0 should be impossible");

        triangle.setSideLengths(0, 0, 1);
        assertEquals("impossible", triangle.classify(), "0, 0, 1 should be impossible");

        // Maximum values (assuming maxInt is MAX_INT = 2147483647)
        triangle.setSideLengths(MAX_INT, MAX_INT, MAX_INT);
        assertEquals("equilateral", triangle.classify(), "MAX_INT, MAX_INT, MAX_INT should be equilateral");

        triangle.setSideLengths(MAX_INT + 1, MAX_INT + 1, MAX_INT + 1);
        assertEquals("impossible", triangle.classify(), "MAX_INT + 1, MAX_INT + 1, MAX_INT + 1 should be impossible"); // Adjust based on logic in classify()

        // Just above maximum values
        triangle.setSideLengths(MAX_INT + 2, MAX_INT + 2, MAX_INT + 2);
        assertEquals("impossible", triangle.classify(), "1001, 1001, 1001 should be impossible");

        // Mixed Valid/Invalid
        triangle.setSideLengths(0, MAX_INT, 0);
        assertEquals("impossible", triangle.classify(), "0, 1000, 0 should be impossible");

        triangle.setSideLengths(MAX_INT, 0, 0);
        assertEquals("impossible", triangle.classify(), "1000, 0, 0 should be impossible");

        triangle.setSideLengths(MAX_INT, 0, 1);
        assertEquals("impossible", triangle.classify(), "999, 0, 1 should be impossible");

        triangle.setSideLengths(0, MAX_INT, 1);
        assertEquals("impossible", triangle.classify(), "0, 999, 1 should be impossible");
    }
}