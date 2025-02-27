public class Album extends Product
{
    private String title;
    private String artist;
    private int year;

    public Album(int code, String title, String artist, int year, int price)
    {
        super(code, price);
        this.title = title;
        this.artist = artist;
        this.year = year;
    }

    @Override
    public String getDescription() {
        return title + " by " + artist + ", released in " + year;
    }
}
