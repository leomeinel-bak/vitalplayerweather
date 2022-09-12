/*
 * File: CmdSpec.java
 * Author: Leopold Meinel (leo@meinel.dev)
 * -----
 * Copyright (c) 2022 Leopold Meinel & contributors
 * SPDX ID: GPL-3.0-or-later
 * URL: https://www.gnu.org/licenses/gpl-3.0-standalone.html
 * -----
 */

package dev.meinel.leo.vitalplayerweather.utils.commands;

import dev.meinel.leo.vitalplayerweather.utils.Chat;
import org.bukkit.WeatherType;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CmdSpec {

    private CmdSpec() {
        throw new IllegalStateException("Utility class");
    }

    public static boolean isInvalidCmd(@NotNull CommandSender sender, @NotNull String arg, @NotNull String perm) {
        return Cmd.isInvalidSender(sender) || Cmd.isNotPermitted(sender, perm) || isInvalidWeatherType(sender, arg);
    }

    public static boolean isInvalidCmd(@NotNull CommandSender sender, @NotNull String perm) {
        return Cmd.isInvalidSender(sender) || Cmd.isNotPermitted(sender, perm);
    }

    public static WeatherType getWeatherType(@NotNull String arg) {
        return switch (arg) {
            case "sun", "clear" -> WeatherType.CLEAR;
            case "storm", "rain" -> WeatherType.DOWNFALL;
            default -> null;
        };
    }

    public static List<String> getNames() {
        return new ArrayList<>(Arrays.asList("sun", "clear", "storm", "rain"));
    }

    private static boolean isInvalidWeatherType(@NotNull CommandSender sender, @NotNull String arg) {
        if (getWeatherType(arg) == null) {
            Chat.sendMessage(sender, "invalid-weather");
            return true;
        }
        return false;
    }
}
