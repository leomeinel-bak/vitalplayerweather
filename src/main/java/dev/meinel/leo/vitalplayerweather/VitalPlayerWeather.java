/*
 * File: VitalPlayerWeather.java
 * Author: Leopold Meinel (leo@meinel.dev)
 * -----
 * Copyright (c) 2023 Leopold Meinel & contributors
 * SPDX ID: GPL-3.0-or-later
 * URL: https://www.gnu.org/licenses/gpl-3.0-standalone.html
 * -----
 */

package dev.meinel.leo.vitalplayerweather;

import dev.meinel.leo.vitalplayerweather.commands.VitalPlayerWeatherCmd;
import dev.meinel.leo.vitalplayerweather.files.Messages;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class VitalPlayerWeather
        extends JavaPlugin {

    private Messages messages;

    @Override
    public void onEnable() {
        Objects.requireNonNull(getCommand("pweather"))
                .setExecutor(new VitalPlayerWeatherCmd());
        Objects.requireNonNull(getCommand("pweather"))
                .setTabCompleter(new VitalPlayerWeatherCmd());
        messages = new Messages();
        Bukkit.getLogger()
                .info("VitalPlayerWeather v" + this.getPluginMeta().getVersion() + " enabled");
        Bukkit.getLogger()
                .info("Copyright (C) 2022 Leopold Meinel");
        Bukkit.getLogger()
                .info("This program comes with ABSOLUTELY NO WARRANTY!");
        Bukkit.getLogger()
                .info("This is free software, and you are welcome to redistribute it under certain conditions.");
        Bukkit.getLogger()
                .info("See https://www.gnu.org/licenses/gpl-3.0-standalone.html for more details.");
    }

    @Override
    public void onDisable() {
        Bukkit.getLogger()
                .info("VitalPlayerWeather v" + this.getPluginMeta().getVersion() + " disabled");
    }

    public Messages getMessages() {
        return messages;
    }
}
