package org.example;


public class MaestriClientCLI {

    static private CLIBoard cliBoard;

    public static void main() {

        cliBoard = new CLIBoard();

        cliBoard.fillEmpty();
        cliBoard.plot();

    }


}
