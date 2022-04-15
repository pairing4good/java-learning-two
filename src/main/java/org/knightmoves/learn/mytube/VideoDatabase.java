package org.knightmoves.learn.mytube;

public class VideoDatabase implements Storable {

    private Loggable logger;

    public VideoDatabase(Loggable logger){
        this.logger = logger;
    }

    @Override
    public void store(Video video) {
        logger.log("Storing video metadata in a SQL database...");
        logger.log("Title: " + video.getTitle());
        logger.log("File Name: " + video.getFileName());
        logger.log("Done!\n");
    }
}
