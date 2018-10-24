package etf.unsa.ba;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PredmetTest {

    @Test
    void upisi() {
        Predmet p=new Predmet("Diskretna matematika",666,10);
        String ime="Ime";String prezime="Prezime" ;int brIndeksa=0;
        for(int i=0; i<10;i++) {
            p.upisi(new Student(ime, prezime, brIndeksa));
            ime+=ime; prezime+=prezime; brIndeksa+=1;
        }
        p.upisi(new Student("Nema","Mjesta",96));

        assertEquals(10,p.getBrojStudenata());

    }

    @Test
    void ispisi() {
        Predmet p=new Predmet("Diskretna matematika",666,10);
        String ime="Ime";String prezime="Prezime" ;int brIndeksa=0;
        Student s=new Student(ime,prezime,brIndeksa);
        for(int i=0; i<5;i++) {
            p.upisi(new Student(ime, prezime, brIndeksa));
            ime+=ime; prezime+=prezime; brIndeksa+=1;
        }
        p.ispisi(s);
        assertEquals(4,p.getBrojStudenata());
    }

    @Test
    void getNaziv() {
        Predmet p=new Predmet("Diskretna matematika",666,10);
        assertEquals("Diskretna matematika",p.getNaziv());
    }

    @Test
    void setNaziv() {
        Predmet p=new Predmet("Diskretna matematika",666,10);
        p.setNaziv("Killing me not so softly");
        assertEquals("Killing me not so softly",p.getNaziv());
    }

    @Test
    void getSifra() {
        Predmet p=new Predmet("Diskretna matematika",666,10);
        assertEquals(666,p.getSifra());
    }

    @Test
    void setSifra() {
        Predmet p=new Predmet("Diskretna matematika",666,10);
        p.setSifra(999);
        assertEquals(999,p.getSifra());
    }

    @Test
    void getMaxbrstudenata() {
        Predmet p=new Predmet("Diskretna matematika",666,10);
        assertEquals(10,p.getMaxbrstudenata());
    }
}