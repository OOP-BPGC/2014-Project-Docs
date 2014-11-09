import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;


public interface ProfileInter {
	public void setComponents();
	public void addComponents();
	public void actionPerformed(ActionEvent ae);
	public void setValues();
	public void itemStateChanged(ItemEvent ie) ;
}
