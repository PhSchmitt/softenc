package de.unikl.cs.disco.softenc;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import java.util.BitSet;


public class SoftencActivity extends ActionBarActivity {

    static {
        System.loadLibrary("softenc");
    }
    String testData = "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet.   \n" +
            "\n" +
            "Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim qui blandit praesent luptatum zzril delenit augue duis dolore te feugait nulla facilisi. Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat.   \n" +
            "\n" +
            "Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim qui blandit praesent luptatum zzril delenit augue duis dolore te feugait nulla facilisi.   \n" +
            "\n" +
            "Nam liber tempor cum soluta nobis eleifend option congue nihil imperdiet doming id quod mazim placerat facer possim assum. Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat.   \n" +
            "\n" +
            "Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis.   \n" +
            "\n" +
            "At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, At accusam aliquyam diam diam dolore dolores duo eirmod eos erat, et nonumy sed tempor et et invidunt justo labore Stet clita ea et gubergren, kasd magna no rebum. sanctus sea sed takimata ut vero voluptua. est Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat.   \n" +
            "\n" +
            "Consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus.   \n" +
            "\n" +
            "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet.   \n" +
            "\n" +
            "Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim qui blandit praesent luptatum zzril delenit augue duis dolore te feugait nulla facilisi. Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat.   \n" +
            "\n" +
            "Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim qui blandit praesent luptatum zzril delenit augue duis dolore te feugait nulla facilisi.   \n" +
            "\n" +
            "Nam liber tempor cum soluta nobis eleifend option congue nihil imperdiet doming id quod mazim placerat facer possim assum. Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo";
    String hostname = "mptcpsrv1.philippschmitt.de";
    Integer port = 8080;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_softenc);
        System.loadLibrary("softenc");
        final Button buttonData = (Button) findViewById(R.id.buttonData);

        buttonData.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
//                 Perform action on click
                char[] splittedRawData = splitData(testData);
                char[] encryptedData = new char[splittedRawData.length];
                //TODO: run in parallel if possible
                for (int i = 0; i < splittedRawData.length - 1; i++) {
                    encryptedData[i] = encryptData(splittedRawData[i]);
                }
                char[] aprimes = new char[(splittedRawData.length / 4)+1];
                char[] bprimes = new char[(splittedRawData.length / 4)+1];
                char[] cprimes = new char[(splittedRawData.length / 4)+1];
                char[] dprimes = new char[(splittedRawData.length / 4)+1];
                combineData(aprimes, bprimes, cprimes, dprimes, encryptedData);
                sendData(aprimes.toString(), bprimes.toString(), cprimes.toString(), dprimes.toString());
                buttonData.setText("Data sent");
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_android_ndk1_sample, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private native void helloLog(String logThis);

    private native int sendUrgent(String jurl, int portno, String jdata, boolean jSetUrgentFlag);

    private char[] splitData (String data)
    {
        char[] dataChars = new char[data.length()];
        data.getChars(0,data.length()-1,dataChars,0);
        return dataChars;
    }

    private char encryptData (char rawChar)
    {
        //rawchar=abcd
        char maska = 0xF000;
        char maskb = 0x0F00;
        char maskc = 0x00F0;
        char maskd = 0x000F;
        char a = (char) (rawChar & maska);
        char b = (char) (rawChar & maskb);
        char c = (char) (rawChar & maskc);
        char d = (char) (rawChar & maskd);
        //move bits that only the last 4 bits are used
        a = (char) (a >>12);
        b = (char) (b >>8);
        c = (char) (c >>4);

        //XOR-encryption according to Haniotakis, Tragoudas and Kalapodas
        char aprime = (char) (a ^ c);
        char bprime = (char) (b ^ d);
        char cprime = (char) (c ^ b);
        char dprime = (char) (d ^ a ^b);

        //recombine: result = a'b'c'd'
        aprime = (char) (aprime <<12);
        bprime = (char) (bprime <<8);
        cprime = (char) (cprime <<4);
        char result = (char) (aprime & bprime & cprime & dprime);
        return result;
    }

    /* reads encryptedData, splits it into a'b'c'd' and combines into arrays a' to d' */
    private void combineData (char[] aprimes, char[] bprimes, char[] cprimes, char[] dprimes, char[] encryptedData)
    {
        int j = 0;
        //TODO: run in parallel if possible
        for (int i = 0; i < encryptedData.length-1;i++)
        {
            // aprimes=a'1 a'2 a'3 ... => aprimes[0]a'1a'2a'3a'4 => mask
            char maska = 0xF000;
            char maskb = 0x0F00;
            char maskc = 0x00F0;
            char maskd = 0x000F;
            switch (i%4) {
                case 0:
                    aprimes[j] = (char) ((encryptedData[i] & maska));
                    bprimes[j] = (char) ((encryptedData[i] & maskb)<<4);
                    cprimes[j] = (char) ((encryptedData[i] & maskc)<<8);
                    dprimes[j] = (char) ((encryptedData[i] & maskd)<<12);
                    break;
                case 1:
                    aprimes[j] &= (char) ((encryptedData[i] & maska)>>4);
                    bprimes[j] &= (char) ((encryptedData[i] & maskb));
                    cprimes[j] &= (char) ((encryptedData[i] & maskc)<<4);
                    dprimes[j] &= (char) ((encryptedData[i] & maskd)<<8);
                    break;
                case 2:
                    aprimes[j] &= (char) ((encryptedData[i] & maska)>>8);
                    bprimes[j] &= (char) ((encryptedData[i] & maskb)>>4);
                    cprimes[j] &= (char) ((encryptedData[i] & maskc));
                    dprimes[j] &= (char) ((encryptedData[i] & maskd)<<4);
                    break;
                case 3:
                    aprimes[j] &= (char) ((encryptedData[i] & maska)>>12);
                    bprimes[j] &= (char) ((encryptedData[i] & maskb)>>8);
                    cprimes[j] &= (char) ((encryptedData[i] & maskc)>>4);
                    dprimes[j] &= (char) ((encryptedData[i] & maskd));
                    break;
                }
            if (i%4==0)
            {
                j++;
            }
        }

    }

    private void sendData(String asend, String bsend, String csend, String dsend)
    {
        //TODO pktcntr
        boolean splitPackets = false;
        char dataIdAndPktCntr = 0;
        //only test for asend since len(asend)=len(bsend)=len(csend)=len(dsend)
        if (asend.length()>372)
        {
            splitPackets = true;
        }

        try {
            helloLog("Trying to send data");
            if (splitPackets)
            {
                //TODO
            }
            //set dataId to 00 (=a)
            dataIdAndPktCntr &= 0x3FFF;
            int errorcode = sendUrgent(hostname, port, dataIdAndPktCntr + asend, false);
            if (0 == errorcode) {
                helloLog("data sent");
            } else {
                helloLog("Error in sending data. Error code: " + errorcode);
            }
            helloLog("Trying to send data");
            //set dataId to 01 (=b)
            dataIdAndPktCntr &= 0x3FFF;
            dataIdAndPktCntr |= 0x4000;
            errorcode = sendUrgent(hostname, port, dataIdAndPktCntr + bsend, false);
            if (0 == errorcode) {
                helloLog("data sent");
            } else {
                helloLog("Error in sending data. Error code: " + errorcode);
            }
            helloLog("Trying to send data");
            //set dataId to 10 (=c)
            dataIdAndPktCntr &= 0x3FFF;
            dataIdAndPktCntr |= 0x8000;
            errorcode = sendUrgent(hostname, port,dataIdAndPktCntr + csend, false);
            if (0 == errorcode) {
                helloLog("data sent");
            } else {
                helloLog("Error in sending data. Error code: " + errorcode);
            }
            helloLog("Trying to send data");
            //set dataId to 11 (=d)
            dataIdAndPktCntr &= 0x3FFF;
            dataIdAndPktCntr |= 0xC000;
            errorcode = sendUrgent(hostname, port, dataIdAndPktCntr + dsend, true);
            if (0 == errorcode) {
                helloLog("data sent");
            } else {
                helloLog("Error in sending data. Error code: " + errorcode);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
