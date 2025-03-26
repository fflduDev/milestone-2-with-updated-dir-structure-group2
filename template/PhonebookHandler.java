package template;

import java.util.*;

/**
 * PhonebookHandler - supports 
 * Phonebook operations
 * 
 * Use a map to build the Phonebook
 * key: Contact
 * value: List<phonebookEntries>
 */

public class PhonebookHandler implements iPhonebookHander{
	private Map<Contact, List<PhonebookEntry>> phonebook;
	
	
	public PhonebookHandler(Map<Contact, List<PhonebookEntry>> phonebook) {
		this.phonebook = phonebook;
	}
	@Override
	public List<Contact> sortByName() {
		// TODO Auto-generated method stub
		List<Contact> contactList = new ArrayList<>(phonebook.keySet());

		for (int i = 0; i < contactList.size() - 1; i++) {
			for (int j = 0; j < contactList.size() - i - 1; j++) {
				if (contactList.get(j).getName().compareTo(contactList.get(j + 1).getName()) > 0) {
					Contact temp = contactList.get(j);
					contactList.set(j, contactList.get(j + 1));
					contactList.set(j + 1, temp);
				}
			}
		}

		return contactList;
	}

	@Override
	public List<PhonebookEntry> binarySearch(List<Contact> sortedContacts, String name) {
		int left = 0; //getting first
		int right = sortedContacts.size() - 1; //gettin last

		while (left <=right){
			int mid = left + (right- left)/ 2;
			Contact midContact = sortedContacts.get(mid);
			int comparison = midContact.getName().compareTo(name);
			// System.out.println()
			if (comparison == 0) {
				return midContact.getPhonebookEntries();
			} else if (comparison < 0) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}

		System.out.println("contact " + name + " not found in phone book");
		return new ArrayList<>();
	}

	@Override
	public void display(List<Contact> sortedContacts) {
		// TODO Auto-generated method stub
		System.out.println("sorted book using bubble sort:");
		for (Contact contact : sortedContacts) {
			System.out.println(contact.getName());
		}
	}

 
}
