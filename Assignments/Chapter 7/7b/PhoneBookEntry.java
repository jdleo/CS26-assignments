import javax.swing.JOptionPane;public class PhoneBookEntry{private String name;private long number;public PhoneBookEntry(String name,long number){this.name=name;this.number=number;}
public String getName(){return name;}
public long getNumber(){return number;}
public void setName(String name){this.name=name;}
public void setNumber(long number){this.number=number;}
public void display(){String msg=String.format("Name: %s\n Number: %s",this.name,this.number);JOptionPane.showMessageDialog(null,msg);}}
