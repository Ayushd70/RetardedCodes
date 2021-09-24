//Java program to open Notepad: Notepad, a text editor is installed in Windows operating system. It is used for creating and editing text files

import java.io.IOException;

class Notepad {
    public static void main(String[] args) {
        Runtime rs = Runtime.getRuntime();

        try {
            rs.exec("notepad");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
