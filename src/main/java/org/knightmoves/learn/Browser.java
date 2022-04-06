package org.knightmoves.learn;

public class Browser {
    public String navigate(String address){
        String ip = findIpAddress(address, true);
        String html = sendHttpRequest(ip);
        return html;
    }

    private String sendHttpRequest(String ip) {
        return "<html></html>";
    }

    private String findIpAddress(String address, boolean cache) {
        return "127.0.0.1";
    }
}
