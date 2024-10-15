import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleTest {
    private Triangle triangle;

    @BeforeEach
    void setUp() {
        this.triangle = new Triangle(10,10,10);
    }
}
