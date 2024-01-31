package com.metlife.testsuites;

import com.metlife.data.BookingData;
import com.metlife.pageobjects.rb_resultpage;

import org.testng.annotations.Test;



import static com.metlife.pageobjects.rb_homepage_Objects.*;
import static com.metlife.pageobjects.rb_resultpage.*;
import static com.metlife.utility.rb_WebdriverUtility.*;
        //there should not be a By class in this
public class TS_001 extends rb_SetupTearDown{
    @Test(dataProviderClass = BookingData.class, dataProvider = "bookingData")
    public void Booking(String src, String dest, String mnth) throws InterruptedException {
        type(from,src);
        click(sindhicamp);
        type(destination, dest);
        click(cmbt);
        String month=gettext(rb_resultpage.month);
        while (!month.contains(mnth))
        {
            click(click);
             month = gettext(rb_resultpage.month);

        }
        System.out.println(month);
        click(click2);
        click(submit_btn);
        String Error = gettext(error);
        assertion(Error,"Oops! No buses found.\n" +
                "Oops! No buses found.");
    }
}
