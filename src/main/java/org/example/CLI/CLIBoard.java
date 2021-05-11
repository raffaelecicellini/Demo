package org.example;


public class CLIBoard {

    private final int MAX_VERT_TILES = 5; //rows.
    private final int MAX_HORIZ_TILES = 25; //cols.

    private final String tiles[][] = new String[MAX_VERT_TILES][MAX_HORIZ_TILES];



    void fillEmpty() {

        tiles[0][0] = "╔";
        for (int c = 1; c < MAX_HORIZ_TILES - 1; c++) {
            tiles[0][c] = "═";
        }

        tiles[0][MAX_HORIZ_TILES - 1] = "╗";

        for (int r = 1; r < MAX_VERT_TILES - 1; r++) {
            tiles[r][0] = "║";
            for (int c = 1; c < MAX_HORIZ_TILES - 1; c++) {
                tiles[r][c] = " ";
            }
            tiles[r][MAX_HORIZ_TILES-1] = "║";
        }

        tiles[MAX_VERT_TILES - 1][0] = "╚";
        for (int c = 1; c < MAX_HORIZ_TILES - 1; c++) {
            tiles[MAX_VERT_TILES - 1][c] = "═";
        }

        tiles[MAX_VERT_TILES - 1][MAX_HORIZ_TILES - 1] = "╝";

    }


    final void plot() {
        System.out.print( Color.ANSI_GREEN.escape());
        for (int r = 0; r < MAX_VERT_TILES; r++) {
            System.out.println();
            for (int c = 0; c < MAX_HORIZ_TILES; c++) {
                System.out.print(tiles[r][c]);
            }
        }
    }
}
