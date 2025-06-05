package academy.devdojo.javaoneforall.javacore.Cmethodoverloading.domain;

public class Anime {
    private String name;
    private String type;
    private int episodes;
    private boolean finished;

    public void init(String name, String type, int episodes) {
        this.name = name;
        this.type = type;
        this.episodes = episodes;
    }

    public void init(String name, String type, int episodes, boolean finished) {
        this.init(name, type, episodes);
        this.finished = finished;
    }

    @Override
    public String toString() {
        return "Anime{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", episodes=" + episodes +
                ", finished=" + finished +
                '}';
    }

    public boolean getFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
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
