package org.knightmoves.learn.mytube;

public class VideoEncoder implements Encodable {

    private Loggable logger;

    public VideoEncoder(Loggable logger){
        this.logger = logger;
    }

    @Override
    public void encode(Video video) {
        logger.log("Encoding video...");
        logger.log("Done!\n");
    }
}
