package me.davamu.retina.chat;

import lombok.experimental.UtilityClass;

@UtilityClass
public class MiniMessageUtil {

    public String fromLegacy(String legacyText){
        return legacyText
                .replace("&1", "<dark_blue>")
                .replace("&2", "<dark_green>")
                .replace("&3", "<dark_aqua>")
                .replace("&4", "<dark_red>")
                .replace("&5", "<dark_purple>")
                .replace("&6", "<gold>")
                .replace("&7", "<gray>")
                .replace("&8", "<dark_gray>")
                .replace("&9", "<blue>")
                .replace("&a", "<green>")
                .replace("&b", "<aqua>")
                .replace("&c", "<red>")
                .replace("&d", "<light_purple>")
                .replace("&e", "<yellow>")
                .replace("&f", "<white>")
                .replace("&l", "<bold>")
                .replace("&k", "<obfuscated>")
                .replace("&m", "<strikethrough>")
                .replace("&n", "<underline>")
                .replace("§1", "<dark_blue>")
                .replace("§2", "<dark_green>")
                .replace("§3", "<dark_aqua>")
                .replace("§4", "<dark_red>")
                .replace("§5", "<dark_purple>")
                .replace("§6", "<gold>")
                .replace("§7", "<gray>")
                .replace("§8", "<dark_gray>")
                .replace("§9", "<blue>")
                .replace("§a", "<green>")
                .replace("§b", "<aqua>")
                .replace("§c", "<red>")
                .replace("§d", "<light_purple>")
                .replace("§e", "<yellow>")
                .replace("§f", "<white>")
                .replace("§l", "<bold>")
                .replace("§k", "<obfuscated>")
                .replace("§m", "<strikethrough>")
                .replace("§n", "<underline>");

    }

    public String toLegacy(String miniMessageText){
        return miniMessageText
                .replace("<dark_blue>", "&1")
                .replace("<dark_green>", "&2")
                .replace("<dark_aqua>", "&3")
                .replace("<dark_red>", "&4")
                .replace("<dark_purple>", "&5")
                .replace("<gold>", "&6")
                .replace("<gray>", "&7")
                .replace("<dark_gray>", "&8")
                .replace("<blue>", "&9")
                .replace("<green>", "&a")
                .replace("<aqua>", "&b")
                .replace("<red>", "&c")
                .replace("<light_purple>", "&d")
                .replace("<yellow>", "&e")
                .replace("<white>", "&f")
                .replace("<bold>", "&l")
                .replace("<b>", "&l")
                .replace("<obfuscated>", "&k")
                .replace("<strikethrough>", "&m")
                .replace("<st>", "&m")
                .replace("<reset>", "&r")
                .replace("<r>", "&r")
                .replace("<underline>", "&n")
                .replace("<u>", "&n");

    }

}
