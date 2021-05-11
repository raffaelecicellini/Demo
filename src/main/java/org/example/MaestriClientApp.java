package org.example;



public class MaestriClientApp
{
    static boolean startAsGUI = false;

    public static void main( String[] args ) {
        processArgs(args);

        startNetwork();

        if (startAsGUI) // we pass args as JavaFx signature wants them..
            MaestriClientGUI.main(args);
        else {
            MaestriClientCLI.main();
        }
    }


    // fake for now:
    static private void  processArgs(String[] args) {
        //TODO: set vars.

        // startAsGUI = true;
    }


     // fake for now:
    static private void  startNetwork(){
        //TODO: set vars.

    }
}
