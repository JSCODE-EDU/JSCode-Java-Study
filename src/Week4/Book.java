package Week4;

public class Book {
    private String name;
    private boolean isRented;
    private int index;
    private static int indexNum = 0;


    public Book(String name) {
        this.name = name;
        this.isRented = false;
        index = ++indexNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isRented() {
        return isRented;
    }

    public void setRented() {
        isRented = !isRented;
    }

    public int getIndex() {
        return index;
    }
}
