/*
 * VitalPlayerWeather is a Spigot Plugin that gives players the ability to change their weather.
 * Copyright © 2022 Leopold Meinel & contributors
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see https://github.com/TamrielNetwork/VitalPlayerWeather/blob/main/LICENSE
 */

package com.tamrielnetwork.vitalplayerweather.commands;

import com.tamrielnetwork.vitalplayerweather.utils.Chat;
import com.tamrielnetwork.vitalplayerweather.utils.commands.Cmd;
import com.tamrielnetwork.vitalplayerweather.utils.commands.CmdSpec;
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
	public @Nullable List<String> onTabComplete(@NotNull CommandSender sender, @NotNull Command command, @NotNull String alias,
	                                            @NotNull String[] args) {
		if (args.length == 1) {
			return CmdSpec.getNames();
		}
		return null;
	}
}