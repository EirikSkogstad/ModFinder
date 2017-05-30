package ModFinder.Java

class Mod(val id: Int, val game: String, val installedName: String = "Mod for $game with $id") {
    fun getNexusUrl() = ModFinder.Values.NEXUS_URL + "/$game/mods/$id"
}