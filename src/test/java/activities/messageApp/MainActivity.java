package activities.messageApp;

import controls.Button;
import controls.Label;
import controls.TextBox;
import org.openqa.selenium.By;

public class MainActivity {
    public Button newMessgButton = new Button(By.id("com.google.android.apps.messaging:id/start_new_conversation_button"));
    public Label selectContactLabel = new Label(By.xpath("//android.widget.TextView[@text='234356']"));

}
