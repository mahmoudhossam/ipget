package IPGet;

import java.net.*;

/**
 *
 * @author mhh91
 */
public class Backend {
    public static InetAddress getAddress(String hostname) throws UnknownHostException{
        InetAddress ip = Inet4Address.getByName(hostname);
        return ip;
    }

}
