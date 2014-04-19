package ntp_timeserver;

import java.io.*;
import java.net.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author patje
 */
public class NTP_TimeServer
{
    public static void main(String[] args) throws IOException 
    {
        try (Socket s= new Socket("time-A.timefreq.bldrdoc.gov",13))
        {
            InputStream inStream = s.getInputStream();
            Scanner in = new Scanner(inStream);
            
            while (in.hasNextLine())
            {
                String line = in.nextLine();
                System.out.println(line);
            }
        } catch (IOException ex) {
            Logger.getLogger(NTP_TimeServer.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
