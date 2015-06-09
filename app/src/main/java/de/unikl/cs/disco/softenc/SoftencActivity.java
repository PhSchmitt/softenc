package de.unikl.cs.disco.softenc;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import java.util.Arrays;

import static de.unikl.cs.disco.softenc.SoftencActivity.Direction.*;
import static de.unikl.cs.disco.softenc.SoftencActivity.Operation.*;


public class SoftencActivity extends ActionBarActivity {

    static {
        System.loadLibrary("softenc");
    }
//    String testData = "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet.   \n" +
//            "\n" +
//            "Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim qui blandit praesent luptatum zzril delenit augue duis dolore te feugait nulla facilisi. Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat.   \n" +
//            "\n" +
//            "Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim qui blandit praesent luptatum zzril delenit augue duis dolore te feugait nulla facilisi.   \n" +
//            "\n" +
//            "Nam liber tempor cum soluta nobis eleifend option congue nihil imperdiet doming id quod mazim placerat facer possim assum. Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat.   \n" +
//            "\n" +
//            "Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis.   \n" +
//            "\n" +
//            "At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, At accusam aliquyam diam diam dolore dolores duo eirmod eos erat, et nonumy sed tempor et et invidunt justo labore Stet clita ea et gubergren, kasd magna no rebum. sanctus sea sed takimata ut vero voluptua. est Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat.   \n" +
//            "\n" +
//            "Consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus.   \n" +
//            "\n" +
//            "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet.   \n" +
//            "\n" +
//            "Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim qui blandit praesent luptatum zzril delenit augue duis dolore te feugait nulla facilisi. Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat.   \n" +
//            "\n" +
//            "Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim qui blandit praesent luptatum zzril delenit augue duis dolore te feugait nulla facilisi.   \n" +
//            "\n" +
//            "Nam liber tempor cum soluta nobis eleifend option congue nihil imperdiet doming id quod mazim placerat facer possim assum. Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo";
    String testData = "123456789";
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
                char[] splittedRawData = testData.toCharArray();
                char[] encryptedData = new char[splittedRawData.length];
                //TODO: run in parallel if possible
                for (int i = 0; i < splittedRawData.length - 1; i++) {
                    encryptedData[i] = encryptData(splittedRawData[i]);
                }
                //+1 in case of not by 4 dividable
                char[] aprimes = new char[(splittedRawData.length / 4) + 1];
                char[] bprimes = new char[(splittedRawData.length / 4) + 1];
                char[] cprimes = new char[(splittedRawData.length / 4) + 1];
                char[] dprimes = new char[(splittedRawData.length / 4) + 1];
                combineData(aprimes, bprimes, cprimes, dprimes, encryptedData);
                sendData(new String(aprimes), new String(bprimes), new String(cprimes), new String(dprimes));
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

    private char encryptData (char rawChar)
    {
        //rawchar=abcd
        char maska = 0xF000;
        char maskb = 0x0F00;
        char maskc = 0x00F0;
        char maskd = 0x000F;
        char a = maskChar(rawChar,maska,and);
        char b = maskChar(rawChar,maskb,and);
        char c = maskChar(rawChar,maskc,and);
        char d = maskChar(rawChar,maskd,and);
        //move bits that only the last 4 bits are used
        a = shiftBits(a,12,right);
        b = shiftBits(b,8,right);
        c = shiftBits(c,4,right);
        d = shiftBits(d,0,noDirection);

        //XOR-encryption according to Haniotakis, Tragoudas and Kalapodas
        char aprime = (char) (a ^ c);
        char bprime = (char) (b ^ d);
        char cprime = (char) (c ^ b);
        char dprime = (char) (d ^ a ^b);

        //recombine: result = a'b'c'd'
        aprime = shiftBits(aprime,12,left);
        bprime = shiftBits(bprime,8,left);
        cprime = shiftBits(cprime,4,left);
        dprime = shiftBits(dprime,0,noDirection);

        return (char) (aprime | bprime | cprime | dprime);
    }

    /* reads encryptedData, splits it into a'b'c'd' and combines into arrays a' to d' */
    private void combineData (char[] aprimes, char[] bprimes, char[] cprimes, char[] dprimes, char[] encryptedData)
    {
        int j = 0;
        //ensure, that the arrays are empty
        Arrays.fill(aprimes, (char) 0);
        Arrays.fill(bprimes, (char) 0);
        Arrays.fill(cprimes, (char) 0);
        Arrays.fill(dprimes, (char) 0);

        //TODO: run in parallel if possible
        for (int i = 0; i < encryptedData.length-1;i++)
        {
            // aprimes=a'1 a'2 a'3 ... => aprimes[0]a'1a'2a'3a'4 => mask
            char maska = 0xF000;
            char maskb = 0x0F00;
            char maskc = 0x00F0;
            char maskd = 0x000F;
            //TODO: explain what's happening here
            switch (i%4) {
                case 0:
                    aprimes[j] = shiftBits(maskChar(encryptedData[i],maska,or),0, noDirection);
                    bprimes[j] = shiftBits(maskChar(encryptedData[i],maskb,or),4,left);
                    cprimes[j] = shiftBits(maskChar(encryptedData[i],maskc,or),8,left);
                    dprimes[j] = shiftBits(maskChar(encryptedData[i],maskd,or),12,left);
                    break;
                case 1:
                    aprimes[j] = shiftBits(maskChar(encryptedData[i],maska,or),4,right);
                    bprimes[j] = shiftBits(maskChar(encryptedData[i],maskb,or),0,noDirection);
                    cprimes[j] = shiftBits(maskChar(encryptedData[i],maskc,or),4,left);
                    dprimes[j] = shiftBits(maskChar(encryptedData[i],maskd,or),8,left);
                    break;
                case 2:
                    aprimes[j] = shiftBits(maskChar(encryptedData[i],maska,or),8,right);
                    bprimes[j] = shiftBits(maskChar(encryptedData[i],maskb,or),4,right);
                    cprimes[j] = shiftBits(maskChar(encryptedData[i],maskc,or),0,noDirection);
                    dprimes[j] = shiftBits(maskChar(encryptedData[i],maskd,or),4,left);
                    break;
                case 3:
                    aprimes[j] = shiftBits(maskChar(encryptedData[i],maska,or),12,right);
                    bprimes[j] = shiftBits(maskChar(encryptedData[i],maskb,or),8,right);
                    cprimes[j] = shiftBits(maskChar(encryptedData[i],maskc,or),4,right);
                    dprimes[j] = shiftBits(maskChar(encryptedData[i],maskd,or),0,noDirection);
                    //iterated 4 times => one char filled - get to next one
                    j++;
                    break;
                }
        }

    }

    public enum Direction
    {
        left,
        right,
        noDirection
    }
    public char shiftBits(char toShift, int shiftcount, Direction direction)
    {
        char tmp = toShift;
        switch (direction) {
            case left:
                tmp <<= shiftcount;
                break;
            case right:
                tmp >>>= shiftcount;
                break;
            case noDirection:
                break;
        }
        return tmp;
    }

    public enum Operation
    {
        and,
        or,
        xor,
        noOperation
    }
    public char maskChar (char toMask, char mask, Operation operation)
    {
        char tmp = toMask;
        switch (operation) {
            case and:
                tmp &= mask;
                break;
            case or:
                tmp |= mask;
                break;
            case xor:
                tmp ^= mask;
                break;
            case noOperation:
                break;
        }
        return tmp;
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
            // is same to cleared
            char maskToClearDataId = 0x3fff;
            dataIdAndPktCntr = maskChar(dataIdAndPktCntr,maskToClearDataId,and);
            Log.w("String a' send: ",asend);
            Log.w("String a' len: ", ""+asend.length());
            String toSend = new String (dataIdAndPktCntr + asend);
            Log.w("String a'to send: ",toSend);
            Log.w("String a'to len: ", ""+toSend.length());
            int errorcode = sendUrgent(hostname, port, toSend, false);
            if (0 == errorcode) {
                helloLog("data sent");
            } else {
                helloLog("Error in sending data. Error code: " + errorcode);
            }
            Thread.sleep(100);
            helloLog("Trying to send data");
            //set dataId to 01 (=b)
            dataIdAndPktCntr = maskChar(dataIdAndPktCntr,maskToClearDataId,and);
            char maskBprimeStream = 0x4000;
            dataIdAndPktCntr = maskChar(dataIdAndPktCntr,maskBprimeStream,or);
            Log.w("String b' send: ", bsend);
            Log.w("String b' len: ", "" + bsend.length());
            toSend = new String (dataIdAndPktCntr + bsend);
            Log.w("String b'to send: ",toSend);
            Log.w("String b'to len: ", ""+toSend.length());
            errorcode = sendUrgent(hostname, port, toSend, false);
            if (0 == errorcode) {
                helloLog("data sent");
            } else {
                helloLog("Error in sending data. Error code: " + errorcode);
            }
            Thread.sleep(100);
            helloLog("Trying to send data");
            //set dataId to 10 (=c)
            dataIdAndPktCntr = maskChar(dataIdAndPktCntr,maskToClearDataId,and);
            char maskCprimeStream = 0x8000;
            dataIdAndPktCntr = maskChar(dataIdAndPktCntr,maskCprimeStream,or);
            Log.w("String c' send: ", csend);
            Log.w("String c' len: ", "" + csend.length());
            toSend = new String (dataIdAndPktCntr + csend);
            Log.w("String c'to send: ",toSend);
            Log.w("String c'to len: ", ""+toSend.length());
            errorcode = sendUrgent(hostname, port,toSend, false);
            if (0 == errorcode) {
                helloLog("data sent");
            } else {
                helloLog("Error in sending data. Error code: " + errorcode);
            }
            Thread.sleep(100);
            helloLog("Trying to send data");
            //set dataId to 11 (=d)
            dataIdAndPktCntr = maskChar(dataIdAndPktCntr,maskToClearDataId,and);
            char maskDprimeStream = 0xC000;
            dataIdAndPktCntr = maskChar(dataIdAndPktCntr,maskDprimeStream,or);
            Log.w("String d' send: ",dsend);
            Log.w("String d' len: ", "" + dsend.length());
            toSend = new String (dataIdAndPktCntr + dsend);
            Log.w("String d'to send: ",toSend);
            Log.w("String d'to len: ", ""+toSend.length());
            errorcode = sendUrgent(hostname, port, toSend, true);
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
