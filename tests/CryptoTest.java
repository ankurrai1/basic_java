import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CryptoTest {

    @Test
    void normalizeText() {
        
        Crypto crypto = new Crypto();
        assertEquals("ANKURKUMARRAI",crypto.normalizeText("anku r kumar ! \"rai\" "));
        assertEquals("",crypto.normalizeText("\"\" "));
        assertEquals("",crypto.normalizeText("! \"\" "));
        assertEquals("ANKUR",crypto.normalizeText("anku r    \"    \" "));
        assertEquals("",crypto.normalizeText(""));

    }
    @Test
    void shiftAlphabet() {
        
        Crypto crypto = new Crypto();
        assertEquals("CDEFGHIJKLMNOPQRSTUVWXYZAB",crypto.shiftAlphabet(2));
        assertEquals("GHIJKLMNOPQRSTUVWXYZABCDEF",crypto.shiftAlphabet(6));
        assertEquals("EFGHIJKLMNOPQRSTUVWXYZABCD",crypto.shiftAlphabet(4));
        assertEquals("ABCDEFGHIJKLMNOPQRSTUVWXYZ",crypto.shiftAlphabet(0));
        assertEquals("YZABCDEFGHIJKLMNOPQRSTUVWX",crypto.shiftAlphabet(-2));
    }

    @Test
    void caesarify() {
        
        Crypto crypto = new Crypto();
        assertEquals("BOLVSLVNBSSBJ",crypto.caesarify("ANKURKUMARRAI",1));
        assertEquals("ANKURKUMARRAI",crypto.caesarify("ANKURKUMARRAI",0));
        assertEquals("ZMJTQJTLZQQZH",crypto.caesarify("ANKURKUMARRAI",-1));
        assertEquals("",crypto.caesarify("",3));
        assertEquals("A",crypto.caesarify("T",7));
    }

    @Test
    void groupify() {
        
        Crypto crypto = new Crypto();
        assertEquals("ANK URK UMA RRA Ixx ",crypto.groupify("ANKURKUMARRAI",3));
        assertEquals("ANK URK ",crypto.groupify("ANKURK",3));
        assertEquals("",crypto.groupify("",3));
        assertEquals("ANK ",crypto.groupify("ANK",3));
        assertEquals("A N K U R K U M A R R A I ",crypto.groupify("ANKURKUMARRAI",1));
    }
}
