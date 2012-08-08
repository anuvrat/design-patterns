/**
 * 
 */
package com.singhanuvrat.pba.patterns.singleton;

import junit.framework.Assert;

import org.junit.Test;

/**
 * @author anuvrat
 *
 */
public class PrinterSpoolerTest {

	/**
	 * Test method for {@link com.singhanuvrat.pba.patterns.singleton.PrinterSpooler#getInstance()}.
	 * @throws InterruptedException 
	 */
	@Test
	public void testGetInstance() throws InterruptedException {
		PrinterSpooler ps1 = PrinterSpooler.getInstance();
		Thread.sleep(1000L);
		PrinterSpooler ps2 = PrinterSpooler.getInstance();
		
		Assert.assertEquals(ps1.getCreationTime(), ps2.getCreationTime());
	}

}
