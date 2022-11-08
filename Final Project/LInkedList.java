import javax.swing.*;  
import java.awt.event.*;  
public class LInkedList  
{  
	    LInkedList() {  
        JFrame f= new JFrame();    // for frame
        final JLabel label = new JLabel();          
        label.setSize(500,100);  
        JButton b=new JButton("Throw!");
        b.setBounds(260,70,80,30);  
        final DefaultListModel<String> l1 = new DefaultListModel<>();  
          l1.addElement("Paper");  
          l1.addElement("Food waste");  
          l1.addElement("Human waste");  
          l1.addElement("Manure");     // Biodegredabke part
          l1.addElement("Sewage sludge");  
          l1.addElement("Slaugtherhouse waste");  
          l1.addElement("Dead Animal and Plants");  
          l1.addElement("Hospital waste");  
          
          final JList<String> list1 = new JList<>(l1);  
          list1.setBounds(100,100, 150, 150);  
          DefaultListModel<String> l2 = new DefaultListModel<>();  
          l2.addElement("Glass");  
          l2.addElement("Plastic");  
          l2.addElement("Metals");  
          l2.addElement("Hazardous Substance");   //non biodegredable part
          l2.addElement("Pesticides");  
          l2.addElement("Fibers");  
          l2.addElement("E-Waste");
          l2.addElement("artificial polymers");
          final JList<String> list2 = new JList<>(l2);  
          list2.setBounds(100,250,150, 150);  
          f.add(list1); f.add(list2); f.add(b); f.add(label);  
          f.setSize(450,450);  
          f.setLayout(null);  
          f.setVisible(true);  
          b.addActionListener(new ActionListener() {  
              public void actionPerformed(ActionEvent e) {   
                 String data = "";  
                 if (list1.getSelectedIndex() != -1) {                       
                    data =  list1.getSelectedValue() + " is a Biodegradable waste, ";   //to see where the biodegradable located
                    label.setText(data);  
                 }  
                 if(list2.getSelectedIndex() != -1){  
                    data +=list2.getSelectedValue()  +  " is a Non-biodegradable waste ";    ////to see where the non-biodegradable located
                    for(Object frame :list2.getSelectedValues()){  
                       data += frame + " ";  
                    }  
                 }  
                 label.setText(data);  
              }  
           });   
     }  
public static void main(String args[])  
    {  
   new LInkedList();  
    }
}
