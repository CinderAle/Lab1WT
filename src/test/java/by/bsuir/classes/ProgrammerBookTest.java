package by.bsuir.classes;

import org.junit.Assert;
import org.junit.Test;

public class ProgrammerBookTest {

    @Test
    public void testClone() {
        ProgrammerBook pb = new ProgrammerBook("Title", "Author", 42, "Language", 0);
        Assert.assertEquals(pb, pb.clone());
    }
}