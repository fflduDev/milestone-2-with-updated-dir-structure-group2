package template;

import java.util.HashMap;
import java.util.Map;

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
    private String phoneNumber;
    private String phoneType;
    private String name;
	public Contact(String name){
        System.out.println("Intiialized Contact at these points");
        this.name = name;
    }
    // public list<PhonebookEntry> getPhonebookEntries(){

    // }
    public void addPhonebookEntry(String phoneNumber, String phoneType){
                // Map<String, Integer> ageMap = new HashMap<>();
        this.phoneNumber = phoneNumber;
        this.phoneType = phoneType;
        System.out.println("Added PhoneBook Entry");
    }

}
