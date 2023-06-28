package activities.messageApp;

import controls.Button;
import controls.Label;
import controls.TextBox;
import org.openqa.selenium.By;

public class MessageActivity {
    public TextBox messageBox = new TextBox(By.id("com.google.android.apps.messaging:id/compose_message_text"));
    public Button sendButton = new Button(By.id("com.google.android.apps.messaging:id/send_message_button_container"));
    public Label recentMessage;
    public void setRecentMessage(String mssg){
        recentMessage = new Label(By.xpath("//android.widget.TextView[@text=('"+mssg+"')]"));
    }

}
