package com.github.hexosse.adminsignshop.configuration;

/*
 * Copyright 2016 hexosse
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

import com.github.hexosse.adminsignshop.AdminSignShop;
import com.github.hexosse.pluginframework.pluginapi.config.ConfigFile;
import org.bukkit.ChatColor;

import java.io.File;


/**
 * This file is part AdminSignShop
 *
 * @author <b>hexosse</b> (<a href="https://github.comp/hexosse">hexosse on GitHub</a>))
 */

/**
 * This file is part of ChestPreview
 *
 * @author <b>hexosse</b> (<a href="https://github.com/hexosse">hexosse on GitHub</a>).
 */

@ConfigFile.ConfigHeader(comment = {
		"############################################################",
		"# | AdminSignShop by hexosse                             | #",
		"############################################################"
})
@ConfigFile.ConfigFooter(comment = {
		" ",
		" ",
		"############################################################"
})

public class Messages extends ConfigFile<AdminSignShop>
{
	/* Chat */
	@ConfigComment(path = "chat")
	@ConfigOptions(path = "chat.prefix")
	public String chatPrefix;

	/* Help */
	@ConfigComment(path = "help")
	@ConfigOptions(path = "help.helpEnable")
	public String helpEnable;
	@ConfigOptions(path = "help.helpDisable")
	public String helpDisable;
	@ConfigOptions(path = "help.helpBuy")
	public String helpBuy;
	@ConfigOptions(path = "help.helpSell")
	public String helpSell;
	@ConfigOptions(path = "help.helpGroundItemEnable")
	public String helpGroundItemEnable;
	@ConfigOptions(path = "help.helpGroundItemDisable")
	public String helpGroundItemDisable;

	/* Errors */
	@ConfigComment(path = "errors")
	@ConfigOptions(path = "errors.accesDenied")
	public String accesDenied;

	/* Messages */
	@ConfigComment(path = "messages")
	@ConfigOptions(path = "messages.enable")
	public String enable;
	@ConfigOptions(path = "messages.disable")
	public String disable;
	@ConfigOptions(path = "messages.not_enabled")
	public String not_enabled;
	@ConfigOptions(path = "messages.groundItemEnable")
	public String groundItemEnable;
	@ConfigOptions(path = "messages.groundItemDisable")
	public String groundItemDisable;
	@ConfigOptions(path = "messages.reloaded")
	public String reloaded;
	@ConfigOptions(path = "messages.worth_syntax")
	public String worth_syntax;


	/**
	 * @param plugin The plugin that this object belong to.
	 * @param dataFolder Folder that contains the config file
	 * @param filename   Name of the config file
	 */
	public Messages(AdminSignShop plugin, File dataFolder, String filename)
	{
		super(plugin, new File(dataFolder, filename), filename);
	}

	public void reloadConfig() {
		load();
	}

	public String prefix()
	{
		return ChatColor.AQUA + plugin.messages.chatPrefix + ChatColor.WHITE;
	}
}
