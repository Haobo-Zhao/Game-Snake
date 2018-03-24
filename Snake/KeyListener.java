package Snake;

import java.awt.event.KeyEvent;
import java.util.EventListener;

/**
 * Created by Hao.
 */
public interface KeyListener extends EventListener, java.awt.event.KeyListener {
    public void keyPressed(KeyEvent e);
    public void keyReleased(KeyEvent e);
    public void keyTyped(KeyEvent e);

}
