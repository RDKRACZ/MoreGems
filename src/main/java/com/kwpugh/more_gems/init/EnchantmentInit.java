package com.kwpugh.more_gems.init;

import com.kwpugh.more_gems.MoreGems;
import com.kwpugh.more_gems.enchantments.*;

import net.minecraft.enchantment.DamageEnchantment;
import net.minecraft.enchantment.EfficiencyEnchantment;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.ThornsEnchantment;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class EnchantmentInit
{
	public static final DamageEnchantment RAZOR_SHARPNESS = new RazorSharpnessEnchantment(Enchantment.Rarity.VERY_RARE, 0, new EquipmentSlot[]{EquipmentSlot.MAINHAND});
	public static final DamageEnchantment SHULKER_BLADE = new ShulkerBladeEnchantment(Enchantment.Rarity.VERY_RARE, 0, new EquipmentSlot[]{EquipmentSlot.MAINHAND});
	public static final DamageEnchantment QUICKENING = new QuickeningEnchantment(Enchantment.Rarity.VERY_RARE, 0, new EquipmentSlot[]{EquipmentSlot.MAINHAND});
	public static final ThornsEnchantment UNTOUCHABLE = new UntouchableEnchantment(Enchantment.Rarity.VERY_RARE, new EquipmentSlot[]{EquipmentSlot.CHEST});
	public static final EfficiencyEnchantment FASTER_OBSIDIAN = new FasterObsidianEnchantment(Enchantment.Rarity.VERY_RARE, new EquipmentSlot[]{EquipmentSlot.MAINHAND});
	public static final Enchantment BLINKING = new BlinkingEnchantment(Enchantment.Rarity.VERY_RARE, new EquipmentSlot[]{EquipmentSlot.MAINHAND});
	public static final Enchantment WISDOM = new WisdomEnchantment(Enchantment.Rarity.VERY_RARE, new EquipmentSlot[]{EquipmentSlot.MAINHAND});

	static boolean enableRazor = MoreGems.CONFIG.GENERAL.enableRazorSharpness;			
	static boolean enableShulker = MoreGems.CONFIG.GENERAL.enableShulkerBlade;
	static boolean enableQuickening = MoreGems.CONFIG.GENERAL.enableQuickening;
	static boolean enableUntouchable = MoreGems.CONFIG.GENERAL.enableUntouchable;
	static boolean enableFasterObsidian = MoreGems.CONFIG.GENERAL.enableFasterObsidian;
	static boolean enableBlinking = MoreGems.CONFIG.GENERAL.enableBlinking;
	static boolean enableWisdom = MoreGems.CONFIG.GENERAL.enableWisdom;

	public static void registerEnchantments()
	{
		if(enableRazor)
		{
			Registry.register(Registry.ENCHANTMENT, new Identifier("more_gems", "razor_sharpness"), RAZOR_SHARPNESS);
		}

		if(enableShulker)
		{
			Registry.register(Registry.ENCHANTMENT, new Identifier("more_gems", "shulker_blade"), SHULKER_BLADE);
		}

		if(enableQuickening)
		{
			Registry.register(Registry.ENCHANTMENT, new Identifier("more_gems", "quickening"), QUICKENING);
		}

		if(enableUntouchable)
		{
			Registry.register(Registry.ENCHANTMENT, new Identifier("more_gems", "untouchable"), UNTOUCHABLE);
		}

		if(enableFasterObsidian)
		{
			Registry.register(Registry.ENCHANTMENT, new Identifier("more_gems", "faster_obsidian"), FASTER_OBSIDIAN);
		}

		if(enableBlinking)
		{
			Registry.register(Registry.ENCHANTMENT, new Identifier("more_gems", "blinking"), BLINKING);
		}

		if(enableWisdom)
		{
			Registry.register(Registry.ENCHANTMENT, new Identifier("more_gems", "wisdom"), WISDOM);
		}
	}
}