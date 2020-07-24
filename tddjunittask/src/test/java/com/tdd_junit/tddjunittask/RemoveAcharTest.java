package com.tdd_junit.tddjunittask;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RemoveAcharTest {
	
	/*TODO
	 * string length    input		 output			has A(in 1st two chars)
	 * 		 0			 ""			   ""			 N
	 * 		 1  		 "A"		   ""			 Y
	 * 		 1			 "B"		   "B"			 N
	 *		 2			 "AA"		   ""			 Y
	 *		 2			 "AB"		   "B"			 Y
	 *		 2			 "BB"		   "BB"		 	 Y
	 *		 3(>2)		 "AAA"		   "A"			 Y
	 *		 3(>2)	     "AAB"		   "B"			 Y
	 *		 3(>2)		 "ABB"		   "BB" 		 Y
	 *		 3(>2)		 "BBB"		   "BBB"         Y
	 *		 3(>2)		 "BBA"		   "BBA"         Y
	 *		 >2			 "ABCD"		   "BCD"		 Y
	 *		 >2			 "XYAAZPQES"	"XYAAZPQES"  N
	 */
	RemoveAchar removeachar;
	@BeforeEach
	void setUp()
	{
		removeachar=new RemoveAchar();
	}
	
	@Test
	void  emptyStringTest()
	{
		assertEquals("",removeachar.removeacharmeth(""));
	}
	
	@Test
	void  strLen1TestHavingA()
	{
		assertEquals("",removeachar.removeacharmeth("A"));
		
	}
	@Test
	void  strLen1TestWithoutA()
	{
		assertEquals("B",removeachar.removeacharmeth("B"));
		
	}
	@Test
	void  strLen2TestHavingA()
	{
		assertEquals("",removeachar.removeacharmeth("AA"));
		assertEquals("B",removeachar.removeacharmeth("AB"));
	}
	@Test
	void  strLen2TestWithoutA()
	{
		assertEquals("BB",removeachar.removeacharmeth("BB"));
	}
	@Test
	void  largeStringTestHavingA()
	{
		assertEquals("A",removeachar.removeacharmeth("AAA"));
		assertEquals("B",removeachar.removeacharmeth("AAB"));
		assertEquals("BB",removeachar.removeacharmeth("ABB"));
	}
	@Test
	void  largeStringTestWithoutA()
	{
		assertEquals("BBB",removeachar.removeacharmeth("BBB"));
		assertEquals("BBA",removeachar.removeacharmeth("BBA"));
		assertEquals("BCD",removeachar.removeacharmeth("ABCD"));
		assertEquals("XYAAZPQES",removeachar.removeacharmeth("XYAAZPQES"));
	}
}
