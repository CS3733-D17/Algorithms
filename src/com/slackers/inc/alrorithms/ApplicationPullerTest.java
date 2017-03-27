/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.slackers.inc.alrorithms;

import com.slackers.inc.alrorithms.FormEntry.Type;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author John Stegeman <j.stegeman@labyrinth-tech.com>
 */
public class ApplicationPullerTest {
    
    public static void main(String args[])
    {
        
        List<FormEntry> forms = new LinkedList<>();
        forms.add(new FormEntry("Wine 7", "Joe", "Bob", Type.WINE, new Date(1,2,15)));
        forms.add(new FormEntry("Wine 6", "Joe", "Bob", Type.WINE, new Date(1,3,15)));
        forms.add(new FormEntry("Wine 5", "Joe", "Bob", Type.WINE, new Date(1,3,15)));
        forms.add(new FormEntry("Wine 4", "Joe", "Bob", Type.WINE, new Date(1,3,15)));
        forms.add(new FormEntry("Wine 3", "Joe", "Bob", Type.WINE, new Date(1,3,15)));
        forms.add(new FormEntry("Wine 2", "Joe", "Bob", Type.WINE, new Date(1,3,15)));
        forms.add(new FormEntry("Wine 1", "Joe", "Bob", Type.WINE, new Date(1,3,15)));
        forms.add(new FormEntry("Wine 9", "Joe", "Bob", Type.WINE, new Date(1,3,14)));
        forms.add(new FormEntry("Wine 8", "Joe", "Bob", Type.WINE, new Date(1,3,15)));
        forms.add(new FormEntry("Wine 10", "Joe", "Bob", Type.WINE, new Date(1,3,15)));
        forms.add(new FormEntry("Wine 6", "Joe", "Bob", Type.WINE, new Date(1,3,15)));
        
        
        ApplicationPuller puller = new ApplicationPuller();
        
        List<FormEntry> pullNew = ApplicationPuller.pullNew(forms, Type.WINE, "Bob");
        for (FormEntry e : pullNew)
        {
            System.out.println(e);
        }
    }
}
