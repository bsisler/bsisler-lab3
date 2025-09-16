import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.beans.Transient;

public class Lab3 {

//Starting Numbers Test Cases
//Start with 1 int
@Test
	public void test1() {
		assertEquals(true, AmazonBackend.checkCode("1.Blank 12345"));
    }
//Start with 999 int 
@Test
    public void test2() {
        assertEquals(true, AmazonBackend.checkCode("999.Blank 12345"));
    }
//Start with 365 int    
@Test
    public void test3() {
        assertEquals(true, AmazonBackend.checkCode("365.Blank 12345"));
    }
//Start with 0 + number int 
@Test
    public void test4() {
        assertEquals(false, AmazonBackend.checkCode("012.Blank 12345"));
    }
//Start with 0 int
@Test
    public void test5() {
        assertEquals(false, AmazonBackend.checkCode("0.Blank 12345"));
    }
//Start with 1000 int
@Test
    public void test6() {
        assertEquals(false, AmazonBackend.checkCode("1000.Blank 12345"));
    }

//Period Test Cases
//No period after numbers
@Test
    public void test7() {
        assertEquals(false, AmazonBackend.checkCode("123Blank 12345"));
    }

@Test 
    public void test8() {
        assertEquals(false, AmazonBackend.checkCode("123 Blank 12345"));
    }

@Test
    public void test9() {
        assertEquals(false, AmazonBackend.checkCode("123,Blank 12345"));
    }

//Word Test Cases
//One Word Test Cases
//One word not capitalized
@Test
    public void test10() {
        assertEquals(false, AmazonBackend.checkCode("123.blank 12345"));
    }
//One word no space at the end
@Test
    public void test11() {
        assertEquals(false, AmazonBackend.checkCode("123.Blank12345"));
    }

//More Than One Word Test Cases
//More than one word both capitalized
@Test
    public void test12() {
        assertEquals(true, AmazonBackend.checkCode("123.Blank Blah 12345"));
    }

@Test
    public void test13() {
        assertEquals(true, AmazonBackend.checkCode("123.Blank Blah Bread 12345"));
    }
//More than one word only one capitalized
@Test
    public void test14() {
        assertEquals(false, AmazonBackend.checkCode("123.blank Blah 12345"));
    }

@Test
    public void test15() {
        assertEquals(false, AmazonBackend.checkCode("123.Blank blah 12345"));
    }
//More than one word no capitalizations
@Test
    public void test16() {
        assertEquals(false, AmazonBackend.checkCode("123.blank blah 12345"));
    }

@Test
    public void test17() {
        assertEquals(false, AmazonBackend.checkCode("123.blank blah bread 12345"));
    }
//More than one word no space at the end
@Test
    public void test18() {
        assertEquals(false, AmazonBackend.checkCode("123.Blank Blah12345"));
    }

@Test
    public void test19() {
        assertEquals(false, AmazonBackend.checkCode("123.Blank Blah Bread12345"));
    }

//Five Digit Number Test Cases
//No five digit number
@Test
    public void test20() {
        assertEquals(true, AmazonBackend.checkCode("123.Blank "));
    }

@Test
    public void test21() {
        assertEquals(false, AmazonBackend.checkCode("123.Blank"));
    }
//Not a five digit number at the end
@Test
    public void test22() {
        assertEquals(false, AmazonBackend.checkCode("123.Blank 1234"));
    }

@Test
    public void test23() {
        assertEquals(false, AmazonBackend.checkCode("123.Blank 123456"));
    }

@Test
    public void test24() {
        assertEquals(false, AmazonBackend.checkCode("123.Blank Blah -----"));
    }
//Space Test Cases
//More than one space at the end
@Test
    public void test25() {
        assertEquals(true, AmazonBackend.checkCode("123.Blank  12345"));
    }

@Test
    public void test26() {
        assertEquals(true, AmazonBackend.checkCode("123.Blank   12345"));
    }

@Test
    public void test27() {
        assertEquals(true, AmazonBackend.checkCode("123.Blank  "));
    }
//More than one space between words
@Test
    public void test28() {
        assertEquals(false, AmazonBackend.checkCode("123.Blank  Blah 12345"));
    }
//No space between words
@Test
    public void test29() {
        assertEquals(true, AmazonBackend.checkCode("123.BlankBlah 12345"));
    }

@Test
    public void test30() {
        assertEquals(false, AmazonBackend.checkCode("123.Blank\nBlah 12345"));
    }

@Test
    public void test31() {
        assertEquals(false, AmazonBackend.checkCode("123.Blank \n Blah 12345"));
    }

}
