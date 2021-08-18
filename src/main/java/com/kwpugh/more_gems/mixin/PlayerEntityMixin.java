package com.kwpugh.more_gems.mixin;

import java.util.Map;

import com.kwpugh.more_gems.util.PlayerSpecialAbilities;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.damage.DamageSource;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(PlayerEntity.class)
public abstract class PlayerEntityMixin extends LivingEntity
{
    protected PlayerEntityMixin(EntityType<? extends LivingEntity> entityType_1, World world_1)
    {
        super(entityType_1, world_1);
    }

    @Inject(method = "attack", at = @At(value = "HEAD"))
    private void attackQuickening(Entity target_1, CallbackInfo ci)
    {
        PlayerEntity self = ((PlayerEntity) (Object) this);

        Map<Enchantment, Integer> enchantments = EnchantmentHelper.get(self.getMainHandStack());
    }
}
