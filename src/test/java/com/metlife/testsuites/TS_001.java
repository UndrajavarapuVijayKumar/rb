package com.metlife.testsuites;

import com.metlife.pageobjects.rb_resultpage;

import org.testng.annotations.Test;
import java.io.IOException;


import static com.metlife.pageobjects.rb_homepage_Objects.*;
import static com.metlife.pageobjects.rb_resultpage.*;
import static com.metlife.utility.rb_WebdriverUtility.*;
        //there should not be a By class in this
public class TS_001 extends rb_SetupTearDown{
    @Test
    public void Booking() throws InterruptedException, IOException {
        type(from,"jaipur (Rajasthan)");
        click(sindhicamp);
        type(destination, "chennai");
        click(cmbt);
        String month=gettext(rb_resultpage.month);
        while (!month.contains("Apr 2024"))
        {
            click(click);
             month = gettext(rb_resultpage.month);

        }
        System.out.println(month);
        click(click2);
        click(submit_btn);
        String Error = gettext(submit_btn);
        assertion(Error,"Oops! No buses found.\n" +
                "Oops! No buses found.");
    }
}
