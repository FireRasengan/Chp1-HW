package TextbookModel;

public class TextbookTester {
    public static void main(String[] args) {
        Textbook book1 = new Textbook("Algebra", 200, "High school");
        Textbook book2 = new Textbook("Physics", 500, "College");

        System.out.println("Textbook: " + book1.getTitle() + " NumOfPages: " + book1.getPages() + " Level: " + book1.getLevel());
        System.out.println("Textbook: " + book2.getTitle() + " NumOfPages: " + book2.getPages() + " Level: " + book2.getLevel());
    }
}
