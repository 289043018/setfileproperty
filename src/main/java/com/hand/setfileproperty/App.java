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
//        将文件设定为可写
        file.setWritable(true);
//        将文件设定为可读
        file.setReadable(true);
//        将文件设定为只读
        file.setReadOnly();
    }
}
