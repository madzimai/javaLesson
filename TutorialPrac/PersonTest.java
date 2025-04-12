package TutorialPrac;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    @Test
    public void testPerson() {
        Person person = new Person();
        assertEquals("Hello world", person.helloPerson2());
    }

    @Test
    public void shouldReturnMarcus(){
        Person person = new Person();
        assertEquals("Hello world", person.helloPerson("Marcus"));
    }
}
