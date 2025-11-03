package oopMostenire;

import org.testng.annotations.Test;

public class MostenireTest {


    @Test

    public void metodaTest(){
        Angajat angajat1 = new Angajat("Popescu", "Ion", 30, "Str. Libertatii 10",
                "Tech Solutions", 4500.50, "Nedeterminat", 20);
        angajat1.informatiiAngajat();

        System.out.println("------------------------------");

        Sportiv sportiv1 = new Sportiv("Ionescu", "Maria", 25, "Str. Independentei 5",
                "Fotbal", "FC Steaua", 10);
        sportiv1.informatiiSportiv();
    }
}
