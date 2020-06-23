/*
    This program prints "Hello, ____!" using the command line arguments.

    Author: Reema Amhaz
*/

import java.io.*;
import java.lang.*;

public class HelloWorld
{
    /*
        This function prints the statement and name using the command line argument.
        Parameters: args - the command line arguments
        Returns: nothing (void)
    */
    public static void main(String[] args)
    {
       System.out.printf("Hello, %s!\n", args[0]);
    }
}
