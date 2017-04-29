package ModFinder;

import static ModFinder.Values.NEXUS_URL;

public class Mod
{
    private int id;
    private String installedName;
    private String game;

    public Mod(int id, String installedName, String game) {
        this.id = id;
        this.installedName = installedName;
        this.game = game;
    }

    public int getId() {
        return id;
    }

    public String getInstalledName() {
        return installedName;
    }

    public String getGame() {
        return game;
    }

    public void setGame(String game) {
        this.game = game;
    }

    public String getNexusmodsURI() {
        return NEXUS_URL + "/" + game + "/mods/" + id;
    }
}
