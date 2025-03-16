/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.ed.refactoring.Date;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author elena
 */
public class DateTest {

    public DateTest() {
    }

    public class PruebaFechaValida {

        private Date fechaCorrecta = new Date(20, 6, 2008);

        private Date mesMal1 = new Date(21, 0, 3000);

        private Date mesMal2 = new Date(21, 13, 3000);

        private Date diaMal1 = new Date(0, 11, 2000);

        private Date diaMal2 = new Date(32, 11, 2000);

        private Date diaMalNoviembre = new Date(31, 11, 2000);

        private Date diaBienDiciembre = new Date(31, 12, 2000);

        private Date diaMalFebrero = new Date(30, 2, 2008);

        private Date diaBienFebreroBisiesto1 = new Date(29, 2, 2008);

        private Date diaBienFebreroBisiesto2 = new Date(29, 2, 2000);

        private Date diaMalFebreroBisiesto1 = new Date(29, 2, 2007);

        private Date diaMalFebreroBisiesto2 = new Date(29, 2, 1900);

        public void testValida() {

            assertTrue(fechaCorrecta.valida());

            assertFalse(mesMal1.valida());

            assertFalse(mesMal2.valida());

            assertFalse(diaMal1.valida());

            assertFalse(diaMal2.valida());

            assertFalse(diaMalNoviembre.valida());

            assertTrue(diaBienDiciembre.valida());

            assertFalse(diaMalFebrero.valida());

            assertTrue(diaBienFebreroBisiesto1.valida());

            assertTrue(diaBienFebreroBisiesto2.valida());

            assertFalse(diaMalFebreroBisiesto1.valida());

            assertFalse(diaMalFebreroBisiesto2.valida());

        }

    }
    public static void main (String[]args) {
    	
    }
}
