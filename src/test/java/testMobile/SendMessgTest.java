package testMobile;

import activities.messageApp.MainActivity;
import activities.messageApp.MessageActivity;
import activities.messageApp.SelectContactActivity;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import session.Session;

import java.util.Date;

public class SendMessgTest {
    MainActivity mainActivity = new MainActivity();
    MessageActivity messageActivity = new MessageActivity();
    SelectContactActivity selectContactActivity = new SelectContactActivity();
    @Test
    public void sendMessagTest() throws InterruptedException {
        String message = "Hola" + new Date().getTime();
        mainActivity.selectContactLabel.click();
        Thread.sleep(10000);
        messageActivity.messageBox.setText(message);
        messageActivity.sendButton.click();
        messageActivity.setRecentMessage(message);

        Assertions.assertTrue(messageActivity.recentMessage.isControlDisplayed(), "ERROR, no se mando el mensaje");
    }

    @AfterEach
    public void close() {
        Session.getSession().closeSession();
    }
}
