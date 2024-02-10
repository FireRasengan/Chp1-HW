package TextbookModel;

public class Textbook {
    private String title;
    private int pages;
    private String level;

    public Textbook(String title, int pages, String level) {
        this.title = title;
        this.pages = pages;
        this.level = level;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Textbook{" +
                "title='" + title + '\'' +
                ", pages=" + pages +
                ", genre='" + level + '\'' +
                '}';
    }
}
