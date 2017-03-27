/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.slackers.inc.alrorithms;

import com.slackers.inc.alrorithms.FormEntry.Type;
import java.util.Comparator;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author John Stegeman <j.stegeman@labyrinth-tech.com>
 */
public class ApplicationPuller {
    
    
    public static List<FormEntry> pullNew(List<FormEntry> entries, Type bevType, String receiver)
    {
        List<FormEntry> out = new LinkedList<>();
        
        // filter out invalid candidates.  Wrong type or not for the correct person
        entries = entries.stream().filter((e) -> {return e.getBeverageType()==bevType && e.getReceiver().equals(receiver);}).collect(Collectors.toList());
        
        // sort by date older is first
        entries.sort((FormEntry o1, FormEntry o2) -> o1.getSubmissionDate().compareTo(o2.getSubmissionDate()));
        
        // collect by oldest -> all from same person until no submissions left or the collected list contains 10 or more elements
        while (!entries.isEmpty() && out.size()<10)
        {
            FormEntry entry = entries.get(0);
            // collect all entries from the oldest submitter
            List<FormEntry> temp = entries.stream().filter((e) -> {return e.getSubmitter().equals(entry.getSubmitter());}).collect(Collectors.toList());
            out.addAll(temp);
            entries.removeAll(temp);
        }        
        return out;
    }
    
}
