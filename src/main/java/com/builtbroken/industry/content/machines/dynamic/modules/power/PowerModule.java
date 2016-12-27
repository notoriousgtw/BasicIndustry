package com.builtbroken.industry.content.machines.dynamic.modules.power;

import com.builtbroken.industry.content.machines.dynamic.modules.inv.InventoryModule;
import com.builtbroken.mc.api.tile.node.IExternalInventory;
import net.minecraft.item.ItemStack;

/**
 * @see <a href="https://github.com/BuiltBrokenModding/VoltzEngine/blob/development/license.md">License</a> for what you can and can't do with the code.
 * Created by Dark(DarkGuardsman, Robert) on 12/26/2016.
 */
public abstract class PowerModule<I extends IExternalInventory> extends InventoryModule<I>
{
    /**
     * Default constructor
     *
     * @param stack
     * @param name
     */
    public PowerModule(ItemStack stack, String name)
    {
        super(stack, "power." + name);
    }
}
