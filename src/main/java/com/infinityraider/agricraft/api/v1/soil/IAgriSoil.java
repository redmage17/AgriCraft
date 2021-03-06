/*
 */
package com.infinityraider.agricraft.api.v1.soil;

import com.infinityraider.agricraft.api.v1.misc.IAgriRegisterable;
import com.infinityraider.agricraft.api.v1.util.FuzzyStack;
import java.util.Collection;
import net.minecraft.item.ItemStack;

/**
 * Class for interacting with AgriCraft soil definitions.
 */
public interface IAgriSoil extends IAgriRegisterable {

    String getId();

    String getName();

    /**
     * Returns an ItemStack representative of this AgriSoil.
     *
     * @return an ItemStack representing this soil.
     */
    Collection<FuzzyStack> getVarients();

    default boolean isVarient(ItemStack stack) {
        return stack != null && isVarient(new FuzzyStack(stack));
    }

    default boolean isVarient(FuzzyStack stack) {
        return this.getVarients().contains(stack);
    }

}
