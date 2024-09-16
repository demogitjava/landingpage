package de.jgsoftware.landingpage;




import java.net.InetAddress;
import org.apache.commons.net.ntp.NTPUDPClient; 
import org.apache.commons.net.ntp.TimeInfo;
import org.apache.commons.net.ntp.TimeStamp;



/**
 *
 * @author hoscho
 */
public class NtpClient1 {
  private static final String NTPSERVER_NAME = "0.suse.pool.ntp.org";

  private volatile TimeInfo timeInfo;
  private volatile Long offset;

  public NtpClient1() {

    try
    {
        NTPUDPClient client = new NTPUDPClient();
        // We want to timeout if a response takes longer than 10 seconds
        client.setDefaultTimeout(10_000);

        InetAddress inetAddress = InetAddress.getByName(NTPSERVER_NAME);
        TimeInfo timeInfo = client.getTime(inetAddress);
        timeInfo.computeDetails();
        if (timeInfo.getOffset() != null) {
            this.timeInfo = timeInfo;
            this.offset = timeInfo.getOffset();
        }

        // This system NTP time
        TimeStamp systemNtpTime = TimeStamp.getCurrentTime();
        System.out.println("System time:" + "\t" + systemNtpTime.toDateString() + "  " + systemNtpTime.toDateString());
    } catch(Exception e)
    {
        System.out.print("Fehler " + e);
    }
   
  }

  public boolean isComputed()
  {
    return timeInfo != null && offset != null;
  }


  /*

     return the ntp server name
  */
  public String getNtpServername()
  {

     return NTPSERVER_NAME;
  }
}
