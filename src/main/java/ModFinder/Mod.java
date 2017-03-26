package ModFinder;

import java.net.URI;
import java.net.URISyntaxException;

import static ModFinder.Values.*;

public class Mod
{
    private int id;
    private String installedName;
    private String game;
    private URI nexusmodsURI;

    public Mod(int id, String installedName) throws URISyntaxException {
        this.id = id;
        this.installedName = installedName;
        generateNexusURI();
    }

    public Mod(int id, String installedName, String game) throws URISyntaxException {
        this.id = id;
        this.installedName = installedName;
        this.game = game;
        generateNexusURI();
    }

    private void generateNexusURI() throws URISyntaxException {
        String URIString = NEXUS_URL + "/" + game + "/mods/" + id;
        nexusmodsURI = new URI(URIString);
    }

    public void setGame(String game) throws URISyntaxException {
        this.game = game;
        generateNexusURI();
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

    public URI getNexusmodsURI() {
        return nexusmodsURI;
    }
}
