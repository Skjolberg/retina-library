package me.davamu.retina.chat;

import lombok.experimental.UtilityClass;
import org.bukkit.ChatColor;

@UtilityClass
public class TextColorUtil {

    public String color(String text) {
        return ChatColor.translateAlternateColorCodes('&', text);
    }

}
