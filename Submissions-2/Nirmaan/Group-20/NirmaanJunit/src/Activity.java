
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
class Activity {
    Date date;
    String name;
    Activity()
    {
        this.date=null;
        this.name=null;
    }
    public void setdate(Date d)
    {
        this.date=d;
    }
    public void setname(String name)
    {
        this.name=name;
    }
    public Date getdate()
    {
        return this.date;
    }
    public String setname()
    {
        return this.name;
    }
}

         
    
