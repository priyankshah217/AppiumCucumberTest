package com.test.steps;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by priyankp.shah on 5/3/16.
 */
@Component
@Scope("cucumber-glue")
public class NotificationSteps extends AbstractSteps {
    public void getIncomingMessageNotificationScreen() {
        notificationScreen.clickOnIncomingMessageLable();
    }
}
