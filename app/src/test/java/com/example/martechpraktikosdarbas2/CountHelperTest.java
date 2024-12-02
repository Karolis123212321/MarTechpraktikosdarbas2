package com.example.martechpraktikosdarbas2;

import org.junit.Test;
import static org.junit.Assert.*;

public class CountHelperTest {

    private final CountHelper countHelper = new CountHelper();

    // Testas: tuščias tekstas
    @Test
    public void testCountWords_emptyText() {
        String text = "";
        int result = countHelper.countWords(text);
        assertEquals(0, result);
    }

    // Testas: įprastas tekstas
    @Test
    public void testCountWords_normalText() {
        String text = "Hello World!";
        int result = countHelper.countWords(text);
        assertEquals(2, result);
    }

    // Testas: tekstas tik su tarpais
    @Test
    public void testCountWords_spacesOnly() {
        String text = "     ";
        int result = countHelper.countWords(text);
        assertEquals(0, result);
    }

    // Testas: tekstas tik su skirtukais
    @Test
    public void testCountWords_tabsOnly() {
        String text = "\t\t\t";
        int result = countHelper.countWords(text);
        assertEquals(0, result);
    }

    // Testas: rašybos ženklų skaičiavimas - įprastas tekstas
    @Test
    public void testCountCharacters_normalText() {
        String text = "Hello World!";
        int result = countHelper.countCharacters(text);
        assertEquals(12, result);
    }

    // Testas: rašybos ženklų skaičiavimas - tuščias tekstas
    @Test
    public void testCountCharacters_emptyText() {
        String text = "";
        int result = countHelper.countCharacters(text);
        assertEquals(0, result);
    }

    // Testas: rašybos ženklų skaičiavimas - tik tarpai
    @Test
    public void testCountCharacters_spacesOnly() {
        String text = "     ";
        int result = countHelper.countCharacters(text);
        assertEquals(5, result);
    }

    // Testas: rašybos ženklų skaičiavimas - tik skirtukai
    @Test
    public void testCountCharacters_tabsOnly() {
        String text = "\t\t\t";
        int result = countHelper.countCharacters(text);
        assertEquals(3, result);
    }
}