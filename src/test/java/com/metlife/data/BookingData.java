package com.metlife.data;

import com.metlife.utility.ExcelUtils;
import org.testng.annotations.DataProvider;

public class BookingData {
    @DataProvider
    public static Object[][] bookingData(){
   /*     return new Object[][]
                {
                        new Object[]{"Jaipur","chennai"},

                };*/
        return ExcelUtils.readExcel("BookingData.xlsx", "NoBusses");
    }


}
