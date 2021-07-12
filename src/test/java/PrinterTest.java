import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    Printer printer;

    @Before
    public void before(){
        printer = new Printer(50, 25);
    }

    @Test
    public void hasSheets() {
        assertEquals(50, printer.getSheets());
    }

    @Test
    public void hasToner() {
        assertEquals(25, printer.getToner());
    }

    @Test
    public void canPrint() {
        assertEquals(20, printer.print(2, 10));
        assertEquals(30, printer.getSheets());
        assertEquals(5, printer.getToner());
    }
}

//Create a Printer class that has a property for number of sheets of paper left.
//Add a method to print that takes in a number of pages and number of copies.
//The print method will only run if the printer has enough paper. If it runs it will reduce the value of the paper left by number of copies * number of pages.
//Add a toner volume property to the class.
//Modify the printer so that it reduces the toner by 1 for each page printed.