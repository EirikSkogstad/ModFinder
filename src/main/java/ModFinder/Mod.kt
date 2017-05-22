package ModFinder

class Mod(val id: Int, val game: String, val installedName: String = "Mod for $game with $id") {
    fun getNexusUrl() = Values.NEXUS_URL + "/$game/mods/$id"
}