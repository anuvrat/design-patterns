/**
 * 
 */
package com.singhanuvrat.pba.patterns.singleton;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

/**
 * @author anuvrat
 *
 */
@ToString(includeFieldNames = true)
@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
public class PrinterSpooler {
	private static PrinterSpooler printerSpooler;
	
	@Getter @NonNull private final long creationTime;
	@Getter @NonNull private final String name;
	
	/**
	 * Get an instance of the {@link PrinterSpooler}.
	 * @return An instance of the {@link PrinterSpooler}.
	 */
	public static PrinterSpooler getInstance() {
		if(printerSpooler == null) {
			printerSpooler = new PrinterSpooler(System.nanoTime(), "PrinterSpooler");
		}
		
		return printerSpooler;
	}
}
