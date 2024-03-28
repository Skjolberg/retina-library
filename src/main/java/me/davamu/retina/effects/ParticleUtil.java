package me.davamu.retina.effects;

import lombok.Getter;
import lombok.Setter;
import org.bukkit.Color;
import org.bukkit.Location;

@Getter
@Setter
public class ParticleUtil {

    private String name;
    private float speed;
    private int count;
    private Color color;
    private Location location;

    public ParticleUtil() {
        this.name = "";
        this.speed = 0;
        this.count = 0;
        this.color = Color.WHITE;
    }

    public ParticleUtil(String name, float speed, int  count, Color color) {
        this.name = name;
        this.speed = speed;
        this.count = count;
        this.color = color;
    }

}
