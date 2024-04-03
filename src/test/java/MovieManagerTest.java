import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {

    @Test
    public void test() {
        MovieManager manager = new MovieManager();
        String[] expected = {};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void test2() {
        MovieManager manager = new MovieManager();
        manager.addMovie("1");
        String[] expected = {"1"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test3() {
        MovieManager manager = new MovieManager();
        manager.addMovie("1");
        manager.addMovie("2");
        manager.addMovie("3");
        String[] expected = {"1", "2", "3"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test4() {
        MovieManager manager = new MovieManager();
        manager.addMovie("4");
        manager.addMovie("5");
        manager.addMovie("1");
        manager.addMovie("2");
        String[] expected = {"2", "1", "5", "4"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}

