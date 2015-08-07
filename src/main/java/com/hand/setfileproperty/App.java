package com.hand.setfileproperty;

import java.io.File;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        File file = new File("test.txt");
        file.setReadable(true);
        file.setWritable(true);
        file.setReadOnly();
        
    }
}
