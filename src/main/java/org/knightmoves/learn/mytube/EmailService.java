package org.knightmoves.learn.mytube;

public class EmailService implements Communicatable {
    @Override
    public void send(User user) {
        System.out.println("Notifying " + user.getEmail() + "...");
        System.out.println("Done!\n");
    }
}
