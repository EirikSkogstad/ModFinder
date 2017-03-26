package ModFinder;

import static ModFinder.Values.NEXUS_URL;

public class Mod
{
    private int id;
    private String installedName;
    private String game;
    private String nexusmodsURI;

    public Mod(int id, String installedName) {
        this.id = id;
        this.installedName = installedName;
        generateNexusURI();
    }

    public Mod(int id, String installedName, String game) {
        this.id = id;
        this.installedName = installedName;
        this.game = game;
        generateNexusURI();
    }

    private void generateNexusURI() {
        nexusmodsURI = NEXUS_URL + "/" + game + "/mods/" + id;
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
        generateNexusURI();
    }

    public String getNexusmodsURI() {
        return nexusmodsURI;
    }
}
