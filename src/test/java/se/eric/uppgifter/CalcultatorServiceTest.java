package se.eric.uppgifter;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalcultatorServiceTest {

    CalcultatorService calcultatorService = new CalcultatorService();

    //det borde inte att passa in strängar jag vet inte rektigt vad du menar med det

    @DisplayName("Plussa ihop två Number")
    @Test
    void adderaTvåNumber() {
        int number1 = 2;
        int number2 = 2;

        double result = calcultatorService.addera(number1,number2);

        assertEquals(4,result);
    }

    @Test
    void adderaTvåDesimaler(){
        double number1 = 0.1;
        double number2 = 0.2;

        double result = calcultatorService.addera(number1,number2);

        assertEquals(0.3,result);
        //oförventat error resultatet blir 0.30000000000000004 av okänd andledning
    }

    @Test
    void subtraheraTvåNumber() {
        int number1 = 4;
        int number2 = 2;

        int result = calcultatorService.subtrahera(number1,number2);

        assertEquals(2,result);
    }

    @Test
    void subtraheraTvåNumberTillNegatift(){
        int number1 = 2;
        int number2 = 4;

        int result = calcultatorService.subtrahera(number1,number2);

        assertEquals(-2,result);

    }

    @Test
    void divideraTvåNumber() {
        double number1 = 2;
        double number2 = 4;

        double result = calcultatorService.dividera(number1,number2);

        assertEquals(0.5,result);
    }

    @Test
    void divideraMedNoll(){
        double number1 = 2;
        double number2 = 0;

        double result = calcultatorService.dividera(number1,number2);

        assertEquals(Double.POSITIVE_INFINITY,result);
        /* Dividera på noll ger infinity i java jag skulle kuna göra kod som blockar det
        *  men det är tekniskt set är det möjligt att divider på noll och få ett
        *  fungerande test. Jag tycket det va roligare
        */
    }

    @DisplayName("Multipeer ihop två Number")
    @Test
    void multipleraTvåNumber() {
        int number1 = 2;
        int number2 = 4;

        int result = calcultatorService.multiplera(number1,number2);

        assertEquals(8,result);
    }

    //skipping tuff nut for now
}
