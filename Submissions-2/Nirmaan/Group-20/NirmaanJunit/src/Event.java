
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author sreejith
 */
public class Event implements Serializable{
    
    private ArrayList<Activity> activities;
    private String name;
    private Date StartDate;
    private Date EndDate;
    private boolean approved;
    Event(String Name,Date sd,Date ed)
    {
        activities=new ArrayList<Activity>();
        this.name=Name;
        this.StartDate=sd;
        this.EndDate=ed;
    }
    public static void ApproveEvent(Event E)
    {
        E.approved=true;
        
    }
            
    public String getEvent()
    {
        return this.name;
    }
    public Date getStartDate()
    {
        return this.StartDate;
        
    }
    public Date getEndDate()
    {
        return this.EndDate;
        
    }
    public boolean checkapproval()
    {
        return this.approved;
    }
    
    public boolean registerEvent()
    {
        ArrayList<Event> event = new ArrayList<Event>();
        event = (ArrayList<Event>)Utility.deserialize("/home/sreejith/NetBeansProjects/NirmaanJunit/src/Events.ser");
        if(event==null)
        {
        event=new ArrayList<Event>();
        }
        boolean flag=true;
        try
        {
            for(Event e :event)
            {         
                if(!(this.StartDate.before(e.StartDate)&&this.EndDate.before(e.StartDate)||this.StartDate.after(e.EndDate)&&this.EndDate.after(e.EndDate)))
                flag=false;
            }
            if(flag)
                event.add(this);
        Utility.serialize(event, "/home/sreejith/NetBeansProjects/NirmaanJunit/src/Events.ser");
        return flag;
        }
        catch(Exception E)
        {
            return false;
                    }
        
        
        }
    public static ArrayList<Event> getPending()
    {
        ArrayList<Event> event = new ArrayList<Event>();
        event = (ArrayList<Event>)Utility.deserialize("/home/sreejith/NetBeansProjects/NirmaanJunit/src/Events.ser");
        ArrayList<Event> temp = new ArrayList<Event>();
       try
       {for(Event tr : event)
        {   if(!tr.checkapproval())
            {
                temp.add(tr);
            }
                
        }
       }
       catch ( NullPointerException e)
       {
           
       }
       
        return temp;
        
        
    }
    
}
