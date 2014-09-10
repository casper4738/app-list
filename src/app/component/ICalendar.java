/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package app.component;

import com.toedter.calendar.JDateChooser;
import java.util.Locale;

/**
 *
 * @author Casper
 */
public class ICalendar extends JDateChooser{
    
     public ICalendar() {
        setLocale(new Locale("IN", "ID"));
        setDateFormatString("dd MMMM yyyy");
    }
     
}
