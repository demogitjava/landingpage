package de.jgsoftware.landingpage;




import java.net.InetAddress;
import java.util.Date;
import org.apache.commons.net.ntp.NTPUDPClient; 
import org.apache.commons.net.ntp.TimeInfo;
import org.apache.commons.net.ntp.TimeStamp;



/**
 *
 * @author hoscho
 */
public class NtpClient4 {
  private static final String SERVER_NAME = "3.openwrt.pool.ntp.org";

  private volatile TimeInfo timeInfo;
  private volatile Long offset;

  public NtpClient4() throws Exception {

    NTPUDPClient client = new NTPUDPClient();
    // We want to timeout if a response takes longer than 10 seconds
    client.setDefaultTimeout(10_000);

    InetAddress inetAddress = InetAddress.getByName(SERVER_NAME);
    TimeInfo timeInfo = client.getTime(inetAddress);
    timeInfo.computeDetails();
    if (timeInfo.getOffset() != null) {
        this.timeInfo = timeInfo;
        this.offset = timeInfo.getOffset();
    }

    // This system NTP time
    TimeStamp systemNtpTime = TimeStamp.getCurrentTime();
    System.out.println("System time:\t" + systemNtpTime + "  " + systemNtpTime.toDateString());

   
  }

  public boolean isComputed()
  {
    return timeInfo != null && offset != null;
  }
}
