package org.knightmoves.learn;

public interface Resizable {
    void resize(int size);
    void resize(int x, int y);
    void resizeTo(UserInterfaceWidget widget);
}
