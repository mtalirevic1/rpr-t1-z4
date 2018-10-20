package etf.unsa.ba;

import java.util.Scanner;

public class Program{

    public static void main(String[] args) {
        Predmet p=new Predmet();
        Student s=new Student();
        for(;;){
            System.out.print("Odaberite zeljenu opciju:\n0 za kraj programa\n1 za kreiranje novog predmeta\n2 za kreiranje novog studenta\n3 za upis studenta na predmet\n4 za ispis studenta sa predmeta\n5 za brisanje studenta\n6 za brisanje predmeta\n7 za ispis spiska studenata na predmetu\nOdabir: ");
            int izbor;
            Scanner ulaz=new Scanner(System.in);
            izbor=ulaz.nextInt();
            if(izbor==0){
                break;
            }
            else if(izbor==1){
                System.out.print("\nUnesite naziv novog predmeta: ");
                ulaz.nextLine();
                String ime=ulaz.nextLine();
                System.out.print("\nUnesite sifru novog predmeta: ");
                int sifra=ulaz.nextInt();
                System.out.print("\nUnesite maksimalan broj studenata novog predmeta: ");
                int br=ulaz.nextInt();
                p=new Predmet(ime,sifra,br);
            }
            else if(izbor==2){
                System.out.print("\nUnesite ime novog studenta: ");
                ulaz.nextLine();
                String ime=ulaz.nextLine();
                System.out.print("\nUnesite prezime novog studenta: ");
                String prezime=ulaz.nextLine();
                System.out.print("\nUnesite broj indeksa novog studenta: ");
                int br=ulaz.nextInt();
                s=new Student(ime,prezime,br);
            }
            else if(izbor==3){
                p.upisi(s);
            }
            else if(izbor==4){
                p.ispisi(s);
            }
            else if(izbor==5){
                s=null;
            }
            else if(izbor==6){
                p=null;
            }
            else if(izbor==7){
                System.out.print("\nStudenti na predmetu "+p.getNaziv()+" su:\n");
                p.ispisiStudente();
            }
        }

    }
}
