

package NetworkTools;

import java.io.*;
import java.net.*;


/**
 *
 * @author patje
 */
public class inetAddress
{
    
    
    public static void main(String[] args) throws IOException 
    {
        String NTPaddress = "0.nl.pool.ntp.org";
        if ( !NTPaddress.isEmpty())
        {
            String host = NTPaddress;
            InetAddress[] addresses = InetAddress.getAllByName(host);
            for ( InetAddress a : addresses)
            {
                System.out.println(a);
            }
        }
        
    }
    
}
