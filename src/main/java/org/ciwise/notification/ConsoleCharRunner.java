/**
 * Copyright (c) CI Wise Inc.  All rights reserved.  http://www.ciwise.com
 * The software in this package is published under the terms of the Apache
 * version 2.0 license, a copy of which has been included with this distribution 
 * in the LICENSE.md file.
 * 
 */ 

package org.ciwise.notification;

/**
 * This class simply prints the period (.) character across the console
 * until someone sets <i>running</i> to true.
 * 
 * @author <a href="mailto:david@ciwise.com">David L. Whitehurst</a>
 *
 */
public class ConsoleCharRunner implements Runnable {

    /**
     * A boolean flag for run method.
     */
    boolean running = true;
    
    /**
     * Modifiable run length of characters before newline is 
     * introduced
     */
    int runlength = 45;
    
    /**
     * String value to run across console, defaults to period
     */
    String strChar = ".";

    /**
     * This method inherits from parent Thread.
     */
    public void run() {
        int x = 0;
        while (running) {
            System.out.print(strChar);
            x++;
            if (x == 45) {
                System.out.println();
                x=0;
            }
            try {
                Thread.sleep(100);
            } catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
            }    
        }
    }
}
