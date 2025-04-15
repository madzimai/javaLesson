package TutorialPrac;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    @Test
    public void testPerson() {
        Person person = new Person();
        assertEquals("Hello World", person.helloPerson2());
    }

    @Test
    public void shouldReturnMarcus(){
        Person person = new Person();
        assertEquals("Hello Marcus", person.helloPerson("Marcus"));
    }
    @Test
    public void shouldReturnNumberOfPersonsInLoop(){
        Person person;
     for(int i = 0; i < 4; i++) {
       person = new Person();
     }
     assertEquals(4, Person.numberOfPersons());
    }

}
