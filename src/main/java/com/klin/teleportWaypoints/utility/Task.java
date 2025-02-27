package com.klin.teleportWaypoints.utility;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public abstract class Task implements Runnable{
    private final int taskId;

    public Task(JavaPlugin plugin, int arg1, int arg2) {
        taskId = Bukkit.getScheduler().scheduleSyncRepeatingTask(plugin, this, arg1, arg2);
    }

    public void cancel(){
        Bukkit.getScheduler().cancelTask(taskId);
    }
}
