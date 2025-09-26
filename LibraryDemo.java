class LibraryItem {
    public void displayInfo() {
        System.out.println("This is a library item.");
    }
}

class Book extends LibraryItem {
    @Override
    public void displayInfo() {
        System.out.println("This is a Book.");
    }
}

class Magazine extends LibraryItem {
    @Override
    public void displayInfo() {
        System.out.println("This is a Magazine.");
    }
}

public class LibraryDemo {
    public static void main(String[] args) {
        LibraryItem item;

        item = new Book();     
        item.displayInfo();    

        item = new Magazine(); 
        item.displayInfo();   
    }
}
