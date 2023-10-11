package com.hspedu.outputstream_;

import java.io.PrintStream;

/**
 * @ author WANG CHAO
 * @ version 1.0
 */
public class PrintStream_ {
    public static void main(String[] args) {
        PrintStream out = System.out;
        out.print("john, hello");
        out.close();
    }
}
