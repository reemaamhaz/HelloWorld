/*
    This program prints "Hello, ____!" using the command line arguments.

    Author: Reema Amhaz
*/

import java.io.*;
import java.lang.*;

public class HelloWorld
{
    public static void main(String[] args)
    {
       System.out.printf("Hello, %s!\n", args[0]);
    }
}