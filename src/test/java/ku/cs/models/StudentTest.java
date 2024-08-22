package ku.cs.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    @Test
    void testAddScore(){
        Student s1 = new Student("6610402027", "dg");
        s1.addScore(66);
        assertEquals(66, s1.getScore());
        s1.addScore(66);
        assertEquals(66, s1.getScore());
    }

    @Test
    void testCalcuateGrade(){
        Student s1 = new Student("6610402027", "dg");
        s1.addScore(10);
        assertEquals("C", s1.grade());

    }
}