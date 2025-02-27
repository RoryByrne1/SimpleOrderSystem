public class Book extends Product
{
    private String title;
    private String author;
    private int year;

    public Book(int code, String title, String author, int year, int price)
    {
        super(code, price);
        this.title = title;
        this.author = author;
        this.year = year;
    }

    @Override
    public String getDescription() {
        return title + " by " + author + ", published in " + year;
    }
}
