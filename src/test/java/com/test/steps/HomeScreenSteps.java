package com.test.steps;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by priyankp.shah on 5/3/16.
 */
@Component
@Scope("cucumber-glue")
public class HomeScreenSteps extends AbstractSteps {
    public void getAppScreen() {
        homeScreen.clickOnAppLable();
    }
}
