import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssessmentTestTest {

    // Warm up (give this solution to the students)
    @Test
    public void warmUp1() {
        int result = Methods.addThree(5);
        Assertions.assertEquals(8, result);
    }

    // Warm up (give this solution to the students)
    @Test
    public void warmUp2() {
        Assertions.assertEquals(3, Methods.addThree(0));
        Assertions.assertEquals(8, Methods.addThree(5));
        Assertions.assertEquals(13, Methods.addThree(10));
    }

    @Test
    public void testSetAndGetName() {
        Dog dog = new Dog("Fido", 4);
        Assertions.assertEquals("Fido", dog.getName());
    }

    @Test
    public void testBarkMaybeToUppercase() {
        Dog dog = new Dog("Fido", 4);
        Assertions.assertEquals("VOVVOVVOV", dog.bark("vov", 3, true));
        Assertions.assertEquals("barkbark", dog.bark("bark", 2, false));
    }

    @Test
    public void testDescription() {
        Dog dog = new Dog("Pluto", 4);
        Assertions.assertEquals("Pluto is a dog with 4 legs.", dog.description());
    }

    @Test
    public void testDescriptionMaybeExclamation() {
        Dog dog = new Dog("Fido", 3);
        Assertions.assertEquals("Fido is a dog with 3 legs!", dog.description(true));
        Assertions.assertEquals("Fido is a dog with 3 legs.", dog.description(false));
    }
}