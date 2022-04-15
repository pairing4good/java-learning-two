package org.knightmoves.learn.mytube;

public class EmailService implements Communicatable {

    private Loggable logger;

    public EmailService(Loggable logger){
        this.logger = logger;
    }

    @Override
    public void send(User user) {
        logger.log("Notifying " + user.getEmail() + "...");
        logger.log("Done!\n");
    }
}
