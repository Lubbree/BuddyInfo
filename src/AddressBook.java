import java.util.ArrayList;
import java.util.Arrays;

public class AddressBook {
    private ArrayList<BuddyInfo> buddyList;

    public AddressBook (BuddyInfo[] buddyInfos) {
        this.buddyList = new ArrayList<>(Arrays.asList(buddyInfos));
    }
    public AddressBook () {
        this.buddyList = new ArrayList<>();
    }

    public void addBuddy (BuddyInfo buddy) {
        this.buddyList.add(buddy);
        System.out.println(buddy.getName() + " was added");
    }

    //Removes a item from buddylist
    public void removeBuddy (BuddyInfo buddyInfo) {
        if (this.buddyList.remove(buddyInfo)) {
            System.out.println(buddyInfo.getName() + " was removed");
            return;
        }
        System.out.println("no buddy of name: " + buddyInfo.getName() + " was found");
    }

    public void printAddressBook() {
        for (BuddyInfo buddy: this.buddyList) {
            System.out.println("-------------------------------------");
            System.out.println("Name        : " + buddy.getName());
            System.out.println("Address     : " + buddy.getAddress());
            System.out.println("Phone Number: " + buddy.getPhoneNumber());
        }
    }

    public static void main(String[] args) {
        BuddyInfo liam = new BuddyInfo("Liam", "1833 Wherever Way", "6136137894");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(liam);
        addressBook.removeBuddy(liam);
    }
}
