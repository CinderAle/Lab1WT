package by.bsuir.classes;

public class ProgrammerBook extends Book {
    private String language;
    private int level;

    public ProgrammerBook(String title, String author, int price, String language, int level) {
        super(title, author, price);
        this.language = language;
        this.level = level;
    }
    public String getLanguage() {
        return language;
    }
    public void setLanguage(String language) {
        this.language = language;
    }
    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }
    public String toString() {
        return super.toString() + "[language = \"" + this.language + "\", level = " + this.level + "]";
    }
    @Override
    public ProgrammerBook clone() {
        return new ProgrammerBook(this.getTitle(), this.getAuthor(), this.getPrice(), this.language, this.level);
    }
    @Override
    public int compareTo(Object object) {
        return super.compareTo(object);
    }
}
