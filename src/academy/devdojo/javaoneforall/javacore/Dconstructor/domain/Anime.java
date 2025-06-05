package academy.devdojo.javaoneforall.javacore.Dconstructor.domain;

public class Anime {
    private String name;
    private String type;
    private int episodes;
    private boolean isFinished;
    private String studio;

    public Anime() {
        System.out.println("Inside no args constructor");
    }

    public Anime(String name, String type, int episodes, boolean finished) {
        this(); // Call to 'this()' must be first statement in constructor body, and only allowed in the constructor body
        this.name = name;
        this.type = type;
        this.episodes = episodes;
        this.isFinished = finished;
    }

    public Anime(String name, String type, int episodes, boolean finished, String studio) {
        this(name, type, episodes, finished);
        this.studio = studio;
    }

    public void init(String name, String type, int episodes) {
        this.name = name;
        this.type = type;
        this.episodes = episodes;
    }

    public void init(String name, String type, int episodes, boolean finished) {
        this.init(name, type, episodes);
        this.isFinished = finished;
    }

    public void sayHello() {
        System.out.println("Hello");
    }

    @Override
    public String toString() {
        return "Anime{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", episodes=" + episodes +
                ", isFinished=" + isFinished +
                ", studio='" + studio + '\'' +
                '}';
    }

    public boolean getFinished() {
        return isFinished;
    }

    public void setFinished(boolean finished) {
        this.isFinished = finished;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }
}
