package com.darwinsys.util;

/** Utilities for debugging
 * @author	Ian Darwin, http://www.darwinsys.com/
 * @version	$Id: Debug.java,v 1.8 2004/01/31 01:26:06 ian Exp $
 */
public class Debug {
	/** Static method to see if a given category of debugging is enabled.
	 * Enable by setting e.g., -Ddebug.fileio to debug file I/O operations.
	 * For example:<br/>
	 * if (Debug.isEnabled("fileio"))<br/>
	 * 	System.out.println("Starting to read file " + fileName);
	 */
	public static boolean isEnabled(String category) {
		return System.getProperty("debug." + category) != null;
	}

	/** Static method to println a given message if the
	 * given category is enabled for debugging, as reported by isEnabled.
	 */
	public static void println(String category, String msg) {
		if (isEnabled(category))
			System.out.println(msg);
	}
	/** Static method to println an arbitrary Objecct if the given
	 * category is enabled for debugging, as reported by isEnabled.
	 */
	public static void println(String category, Object stuff) {
		println(category, stuff.toString());
	}
}
