package oopMostenire;

import org.testng.annotations.Test;

public class MostenireTest {


    @Test

    public void metodaTest(){
        Angajat angajat1 = new Angajat("Popescu", "Ion", 30, "Str. Libertatii 10",
                "Tech Solutions", 4500.50, "Nedeterminat", 20);
        angajat1.informatiiAngajat();
        System.out.println("------------------------------");

        System.out.println(angajat1.getNume());
        System.out.println(angajat1.getVarsta());
        angajat1.setVarsta(35);
        System.out.println(angajat1.getVarsta());
        System.out.println("------------------------------");

        Sportiv sportiv1 = new Sportiv("Ionescu", "Maria", 25, "Str. Independentei 5",
                "Fotbal", "FC Steaua", 10);
        sportiv1.informatiiSportiv();

        System.out.println("------------------------------");

        Student student1 = new Student("Georgescu", "Andrei", 21, "Str. Victoriei 15",
                "Universitatea Politehnica", "Informatica", 3, false);
        student1.infoStudent();
    }
}
