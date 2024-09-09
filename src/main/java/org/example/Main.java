package org.example;

import java.io.FileReader;
import java.io.IOException;
import java.io.PushbackReader;

public class Main {
    enum TOKEN { NUM, PLUS, EOF }
    public static TOKEN scan() {

        return TOKEN.EOF;
    }


    public static TOKEN main(String[] args) {

        TOKEN nextToken;

        try {
            PushbackReader pushbackReader = new PushbackReader(new FileReader("input.txt"));

            nextToken = scan();
            while (nextToken != TOKEN.EOF) {
                nextToken = scan();
                }


            System.out.println(nextToken);


            int c = pushbackReader.read();

            //Keep reading until eof
            while (c != -1) {
                System.out.println((char) c);

                if (Character.isDigit(c))
                    System.out.println("num");

                else if (c == '+')
                    return TOKEN.PLUS;

                c = pushbackReader.read();

        }

    } catch (IOException e) {
            throw new RuntimeException(e);
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }


        return nextToken;
    }
}