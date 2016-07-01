/**
 * Copyright (c) CI Wise Inc.  All rights reserved.  http://www.ciwise.com
 * The software in this package is published under the terms of the Apache
 * version 2.0 license, a copy of which has been included with this distribution 
 * in the LICENSE.md file.
 * 
 */ 

package org.ciwise.notification;

import java.io.FileWriter;
import java.io.IOException;

/**
 * This class provides console output utilities for use in command-line Java applications
 *  @author <a href="mailto:david@ciwise.com">David L. Whitehurst</a>
 *
 */
public class ConsoleNotifier {

    /**
     * The singleton instance
     */
    private static ConsoleNotifier instance = null;
    
    /**
     * No default constructor
     */
    private ConsoleNotifier() {}
    
    /**
     * Static method to obtain singleton instance.
     * @return a ConsoleNotifier instance
     */
    public static ConsoleNotifier getInstance() {
        if (instance == null) {
            instance = new ConsoleNotifier();
           
        }
        return instance;
    }
    
    /**
     * This method outputs a header begin message, including the text label given.
     * @param label
     */
    public void header(final String label) {
        System.out.println("================== " + "Begin - " + label + " ==================");
      }
    
    /**
     *This method outputs a footer end message, including the text label given.
     * @param label
     */
    public void footer(final String label) {
        System.out.println();
        System.out.println("================== " + "End - " + label + " ====================");
        System.out.println();
      }

    /**
     * This method outputs a wait message.
     */
    public void beginProcess() {
        System.out.println();
        System.out.println("  ... PLEASE WAIT FOR PROCESS TO COMPLETE ...");
        
    }
    
    public static void main (String[] args) {
        
        final String process1 = "Google Drive Upload (JIRA)";
        
        // begin console java task example
        ConsoleNotifier.getInstance().header(process1);
        ConsoleNotifier.getInstance().beginProcess();

        /**
         *  create a thread to output periods across the screen to let you know
         *  the process is running.
         */
        ConsoleCharRunner r = new ConsoleCharRunner();
        // optional (default ...)
        r.strChar = "+";
        Thread t = new Thread(r);
        t.start();
        int j = 0; // no. of periods
        for (int x =0 ; x < 30000 ; x++){

            // run some process
            FileWriter fw;

            try {
                fw = new FileWriter("c:/temp/x.out", true);
                fw.write(j++);
                fw.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
          }
        
        // tell thread to stop printing periods
        r.running = false;

        ConsoleNotifier.getInstance().footer(process1);
    }
}
