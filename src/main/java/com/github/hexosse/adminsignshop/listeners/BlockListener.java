package com.github.hexosse.adminsignshop.listeners;

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
import com.github.hexosse.adminsignshop.shop.Creator;
import com.github.hexosse.pluginframework.pluginapi.PluginListener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.block.BlockBreakEvent;

/**
 * This file is part AdminSignShop
 *
 * @author <b>hexosse</b> (<a href="https://github.comp/hexosse">hexosse on GitHub</a>)
 */
public class BlockListener extends PluginListener<AdminSignShop>
{
    /**
     * @param plugin The plugin that this listener belongs to.
     */
    public BlockListener(AdminSignShop plugin) {
        super(plugin);
    }

    /**
     * @param event BlockBreakEvent
     */
    @EventHandler(priority=EventPriority.HIGH)
    public void onBlockBreak(BlockBreakEvent event)
    {
        Creator creator = plugin.shops.creators.get(event.getPlayer());
        if(creator!=null && creator.enable)
            event.setCancelled(true);
    }
}
