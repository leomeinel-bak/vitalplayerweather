/*
 * File: VitalPlayerWeatherCmd.java
 * Author: Leopold Meinel (leo@meinel.dev)
 * -----
 * Copyright (c) 2022 Leopold Meinel & contributors
 * SPDX ID: GPL-3.0-or-later
 * URL: https://www.gnu.org/licenses/gpl-3.0-standalone.html
 * -----
 */

package dev.meinel.leo.vitalplayerweather.commands;

import dev.meinel.leo.vitalplayerweather.utils.Chat;
import dev.meinel.leo.vitalplayerweather.utils.commands.Cmd;
import dev.meinel.leo.vitalplayerweather.utils.commands.CmdSpec;
import org.bukkit.WeatherType;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Map;

public class VitalPlayerWeatherCmd
		implements TabExecutor {

	@Override
	public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label,
			@NotNull String[] args) {
		if (Cmd.isArgsLengthGreaterThan(sender, args, 1)) {
			return false;
		}
		if (args.length == 0) {
			doPlayerWeather(sender);
			return true;
		}
		doPlayerWeather(sender, args);
		return true;
	}

	private void doPlayerWeather(@NotNull CommandSender sender) {
		if (CmdSpec.isInvalidCmd(sender, "vitalplayerweather.set")) {
			return;
		}
		Player senderPlayer = (Player) sender;
		senderPlayer.resetPlayerWeather();
		Chat.sendMessage(sender, "reset-weather");
	}

	private void doPlayerWeather(@NotNull CommandSender sender, @NotNull String[] args) {
		if (CmdSpec.isInvalidCmd(sender, args[0].toLowerCase(), "vitalplayerweather.set")) {
			return;
		}
		Player senderPlayer = (Player) sender;
		WeatherType weatherType = CmdSpec.getWeatherType(args[0].toLowerCase());
		assert weatherType != null;
		senderPlayer.setPlayerWeather(weatherType);
		Chat.sendMessage(sender, Map.of("%weather%", args[0].toLowerCase()), "set-weather");
	}

	@Override
	public @Nullable List<String> onTabComplete(@NotNull CommandSender sender, @NotNull Command command,
			@NotNull String alias, @NotNull String[] args) {
		if (args.length == 1) {
			return CmdSpec.getNames();
		}
		return null;
	}
}