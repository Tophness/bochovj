/**
 * Wrapper for wiiRemoteJ
 * 
 * Distributed under artistic license:
 * http://www.opensource.org/licenses/artistic-license-2.0.php
 * 
 */
package bochoVJ.wii;

/**
 * A simple WiiMote handler, just prints the events on console
 * @author bochovj
 *
 */
public class DummyWiiHandler implements IWiiHandler {

    @Override
    public void handleAcc(Acceleration acc) {
	System.out.println("Acceleration: x "+acc.x+" y "+acc.y+" z "+acc.z);

    }

    @Override
    public void handleButton(WiiButton b) {
	System.out.println("Button "+b.toString());
    }
}