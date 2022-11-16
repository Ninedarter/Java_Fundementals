package day14_1113_homework;

public class Movie {
   private int placeIntList;
    private String name;
    private String genre;
    private String creator;
    private String country;
    private int budged;
    private int year;

    public Movie() {
    }

    public Movie(int placeIntList, String name, String genre, String creator, String country, int budged, int year) {
        this.placeIntList = placeIntList;
        this.name = name;
        this.genre = genre;
        this.creator = creator;
        this.country = country;
        this.budged = budged;
        this.year = year;
    }

    public int getPlaceIntList() {
        return placeIntList;
    }

    public void setPlaceIntList(int placeIntList) {
        this.placeIntList = placeIntList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getBudged() {
        return budged;
    }

    public void setBudged(int budged) {
        this.budged = budged;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "placeIntList=" + placeIntList +
                ", name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                ", creator='" + creator + '\'' +
                ", country='" + country + '\'' +
                ", budged=" + budged +
                ", year=" + year +
                '}';
    }
}
