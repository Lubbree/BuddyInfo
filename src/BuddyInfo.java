public class BuddyInfo {
    private String name;
    private String address;
    private String phoneNumber;

    public BuddyInfo(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public BuddyInfo() {
        this("","","0000000000");
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public static void main(String[] args) {
        BuddyInfo sam = new BuddyInfo("Sam", "1902 Wherever Way", "6136131122");
        BuddyInfo jenn = new BuddyInfo("Jenn", "1800 Wherever Way", "6136139021");
        BuddyInfo joey = new BuddyInfo("Joey", "1892 Wherever Way", "6136131523");
        BuddyInfo jim = new BuddyInfo("Jim", "1950 Wherever Way", "6136134833");
        BuddyInfo liam = new BuddyInfo("Liam", "1833 Wherever Way", "6136137894");
        System.out.println("Hello " + sam.getName());

        BuddyInfo[] buddyInfos = {sam, jenn, joey, jim};
        AddressBook addressBook = new AddressBook(buddyInfos);
        addressBook.printAddressBook();
        addressBook.addBuddy(liam);
        addressBook.printAddressBook();
        addressBook.removeBuddy(sam);
        addressBook.printAddressBook();
    }
}


