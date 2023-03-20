package bai1;

public class CD {
    private int id;// ma cd
    private String name;// ten cd
    private String singer;// ca si
    private int numberOfSong; // so bai hat
    private float price;// giá

    public CD() {

    }

    public CD(int id, String name, String singer, int numberOfSong, float price) {
        this.id = id;
        this.name = name;
        this.singer = singer;
        this.numberOfSong = numberOfSong;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public int getNumberOfSong() {
        return numberOfSong;
    }

    public void setNumberOfSong(int numberOfSong) {
        this.numberOfSong = numberOfSong;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "CD{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", singer='" + singer + '\'' +
                ", numberOfSong=" + numberOfSong +
                ", price=" + price +
                '}';
    }

}
