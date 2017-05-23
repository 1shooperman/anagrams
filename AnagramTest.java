import org.junit.*;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Collections;

public class AnagramTest {

    @Test
    public void biro() {
       SortedSet<String> expected = new TreeSet<String>(Arrays.asList(
            "biro", "bior", "brio", "broi", "boir", "bori",
            "ibro", "ibor", "irbo", "irob", "iobr", "iorb",
            "rbio", "rboi", "ribo", "riob", "roib", "robi",
            "obir", "obri", "oibr", "oirb", "orbi", "orib"
        ));

        SortedSet<String> actual = new Anagram().answer("biro");

        assertArrayEquals(expected.toArray(), actual.toArray());        
    }
}

