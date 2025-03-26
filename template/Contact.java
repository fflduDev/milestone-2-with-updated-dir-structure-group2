package template;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

//James Haimoff Push Test
/**
 * model a Contact 
 * Contact has a name & list of phonebook entries
 * 
 * Support adding phonebookEntry to a contact
 * 
 * @Override hashCode and equals
 * 
 */



class Contact {
    // private String phoneNumber;
    // private String phoneType;
    private String name;
    private List<PhonebookEntry> phonebookEntries;
	public Contact(String name){
        System.out.println("Intiialized Contact at these points");
        this.name = name;
        this.phonebookEntries = new ArrayList<>(); 

    }
    // public list<PhonebookEntry> getPhonebookEntries(){

    // }
    public void addPhonebookEntry(String phoneNumber, String phoneType){
        this.phonebookEntries.add(new PhonebookEntry(phoneNumber, phoneType));
        System.out.println("ADDED phonebook entry");
    }
    public List<PhonebookEntry> getPhonebookEntries(){
        return phonebookEntries;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Contact)) return false; //had to look up
        Contact other = (Contact) obj;

        return this.name.equals(other.name) &&
               this.phonebookEntries.equals(other.phonebookEntries);
    }

    public int hashCode() {
        if (name.isEmpty()) {
            return 0;
        } else {
            return name.charAt(0);
            //retun the int value for the char at accidentally works
            //apparently this represnts the chars numerical value in the system
            //in the output you see for collision you see numerical values thats what it represents
        }
        
        //
    }

    public String toString() {
        return "name: " + name + "] phone number:" + phonebookEntries;
    }
}
