package io.codelex.enums;

public enum ScissorPaperStone {
    SCISSOR("SCISSOR"),
    PAPER("PAPER"),
    STONE("STONE");
    private final String move;

    ScissorPaperStone(String choice) {
        this.move = choice;
    }

    public String getMove() {
        return move;
    }
}
