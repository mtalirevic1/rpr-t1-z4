package etf.unsa.ba;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void toStringTest() {
        Student s=new Student("Niko","Nikic",987);
        assertEquals("Nikic Niko (987)",s.toString());
    }

    @Test
    void getIme() {
        Student s=new Student("Niko","Nikic",987);
        assertEquals("Niko",s.getIme());
    }

    @Test
    void setIme() {
        Student s=new Student("Niko","Nikic",987);
        s.setIme("Nikola");
        assertEquals("Nikola",s.getIme());
    }

    @Test
    void getPrezime() {
        Student s=new Student("Niko","Nikic",987);
        assertEquals("Nikic",s.getPrezime());
    }

    @Test
    void setPrezime() {
        Student s=new Student("Niko","Nikic",987);
        s.setPrezime("Nekic");
        assertEquals("Nekic",s.getPrezime());
    }

    @Test
    void getBrindeksa() {
        Student s=new Student("Niko","Nikic",987);
        assertEquals(987,s.getBrindeksa());
    }

    @Test
    void setBrindeksa() {
        Student s=new Student("Niko","Nikic",987);
        s.setBrindeksa(789);
        assertEquals(789,s.getBrindeksa());
    }
}