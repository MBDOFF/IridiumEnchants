package com.iridium.iridiumenchants.configs;

import com.google.common.collect.ImmutableMap;
import com.iridium.iridiumenchants.CustomEnchant;
import com.iridium.iridiumenchants.Level;
import com.iridium.iridiumenchants.Type;

import java.util.Collections;
import java.util.Map;

public class CustomEnchants {
    public Map<String, CustomEnchant> customEnchants = ImmutableMap.<String, CustomEnchant>builder()
            .put("Speed", new CustomEnchant("&7Speed", "Gives you an unlimited Speed effect", Type.BOOTS, "PASSIVE:20", ImmutableMap.<Integer, Level>builder()
                    .put(1, new Level(100, Collections.singletonList("Common"), Collections.singletonList("POTION:SPEED:1:5")))
                    .put(2, new Level(100, Collections.singletonList("Elite"), Collections.singletonList("POTION:SPEED:2:5")))
                    .put(3, new Level(100, Collections.singletonList("Legendary"), Collections.singletonList("POTION:SPEED:3:5")))
                    .build(), true))
            .put("Jump", new CustomEnchant("&7Jump", "Gives you an unlimited Jump Boost effect", Type.BOOTS, "PASSIVE:20", ImmutableMap.<Integer, Level>builder()
                    .put(1, new Level(100, Collections.singletonList("Common"), Collections.singletonList("POTION:JUMP:1:5")))
                    .put(2, new Level(100, Collections.singletonList("Elite"), Collections.singletonList("POTION:JUMP:2:5")))
                    .put(3, new Level(100, Collections.singletonList("Legendary"), Collections.singletonList("POTION:JUMP:3:5")))
                    .build(), true))
            .put("Visionary", new CustomEnchant("&7Visionary", "Gives you an unlimited Night Vision effect", Type.HELMET, "PASSIVE:20", ImmutableMap.<Integer, Level>builder()
                    .put(1, new Level(100, Collections.singletonList("Common"), Collections.singletonList("POTION:NIGHT_VISION:1:5")))
                    .build(), true))
            .put("Netherskin", new CustomEnchant("&7Netherskin", "Gives you an unlimited Fire Resistance effect", Type.CHESTPLATE, "PASSIVE:20", ImmutableMap.<Integer, Level>builder()
                    .put(1, new Level(100, Collections.singletonList("Common"), Collections.singletonList("POTION:FIRE_RESISTANCE:1:5")))
                    .build(), true))
            .put("Aquatic", new CustomEnchant("&7Aquatic", "Gives you an unlimited Water Breathing effect", Type.HELMET, "PASSIVE:20", ImmutableMap.<Integer, Level>builder()
                    .put(1, new Level(100, Collections.singletonList("Common"), Collections.singletonList("POTION:WATER_BREATHING:1:5")))
                    .build(), true))
            .put("Replenish", new CustomEnchant("&7Replenish", "Replenishes your hunger every 30 seconds", Type.HELMET, "PASSIVE:600", ImmutableMap.<Integer, Level>builder()
                    .put(1, new Level(100, Collections.singletonList("Common"), Collections.singletonList("FEED:1")))
                    .put(2, new Level(100, Collections.singletonList("Elite"), Collections.singletonList("FEED:2")))
                    .put(3, new Level(100, Collections.singletonList("Legendary"), Collections.singletonList("FEED:3")))
                    .build(), true))
            .put("Haste", new CustomEnchant("&7Haste", "Gives you an unlimited Haste effect", Type.PICKAXE, "PASSIVE:20", ImmutableMap.<Integer, Level>builder()
                    .put(1, new Level(100, Collections.singletonList("Common"), Collections.singletonList("POTION:FAST_DIGGING:1:5")))
                    .put(2, new Level(100, Collections.singletonList("Elite"), Collections.singletonList("POTION:FAST_DIGGING:2:5")))
                    .put(3, new Level(100, Collections.singletonList("Legendary"), Collections.singletonList("POTION:FAST_DIGGING:3:5")))
                    .build(), true))
            .put("Strength", new CustomEnchant("&7Strength", "Gives you an unlimited Strength effect", Type.SWORD, "PASSIVE:20", ImmutableMap.<Integer, Level>builder()
                    .put(1, new Level(100, Collections.singletonList("Common"), Collections.singletonList("POTION:INCREASE_DAMAGE:1:5")))
                    .put(2, new Level(100, Collections.singletonList("Elite"), Collections.singletonList("POTION:INCREASE_DAMAGE:2:5")))
                    .put(3, new Level(100, Collections.singletonList("Legendary"), Collections.singletonList("POTION:INCREASE_DAMAGE:3:5")))
                    .build(), true))
            .put("Poison", new CustomEnchant("&7Poison", "Gives your opponent poison effect", Type.SWORD, "PLAYER_DAMAGE", ImmutableMap.<Integer, Level>builder()
                    .put(1, new Level(10, Collections.singletonList("Common"), Collections.singletonList("POTION:POISON:1:5:TARGET")))
                    .put(2, new Level(10, Collections.singletonList("Elite"), Collections.singletonList("POTION:POISON:2:5:TARGET")))
                    .put(3, new Level(10, Collections.singletonList("Legendary"), Collections.singletonList("POTION:POISON:3:5:TARGET")))
                    .build(), true))
            .put("Confusion", new CustomEnchant("&7Confusion", "Gives your opponent nausea effect", Type.SWORD, "PLAYER_DAMAGE", ImmutableMap.<Integer, Level>builder()
                    .put(1, new Level(10, Collections.singletonList("Common"), Collections.singletonList("POTION:CONFUSION:1:5:TARGET")))
                    .put(2, new Level(10, Collections.singletonList("Elite"), Collections.singletonList("POTION:CONFUSION:2:5:TARGET")))
                    .put(3, new Level(10, Collections.singletonList("Legendary"), Collections.singletonList("POTION:CONFUSION:3:5:TARGET")))
                    .build(), true))
            .put("Wither", new CustomEnchant("&7Wither", "Gives your opponent wither effect", Type.AXE, "PLAYER_DAMAGE", ImmutableMap.<Integer, Level>builder()
                    .put(1, new Level(10, Collections.singletonList("Common"), Collections.singletonList("POTION:WITHER:1:5:TARGET")))
                    .put(2, new Level(10, Collections.singletonList("Elite"), Collections.singletonList("POTION:WITHER:2:5:TARGET")))
                    .put(3, new Level(10, Collections.singletonList("Legendary"), Collections.singletonList("POTION:WITHER:3:5:TARGET")))
                    .build(), true))
            .put("Ignition", new CustomEnchant("&7Ignition", "Sets your attacker on fire", Type.CHESTPLATE, "DEFENCE", ImmutableMap.<Integer, Level>builder()
                    .put(1, new Level(10, Collections.singletonList("Common"), Collections.singletonList("FIRE:40:TARGET")))
                    .put(2, new Level(10, Collections.singletonList("Elite"), Collections.singletonList("FIRE:80:TARGET")))
                    .put(3, new Level(10, Collections.singletonList("Legendary"), Collections.singletonList("FIRE:100:TARGET")))
                    .build(), true))
            .put("Slowness", new CustomEnchant("&7Slowness", "Gives your opponent a slowness effect", Type.BOW, "PLAYER_DAMAGE_PROJECTILE", ImmutableMap.<Integer, Level>builder()
                    .put(1, new Level(25, Collections.singletonList("Common"), Collections.singletonList("POTION:SLOW:1:5:TARGET")))
                    .put(2, new Level(25, Collections.singletonList("Elite"), Collections.singletonList("POTION:SLOW:2:5:TARGET")))
                    .put(3, new Level(25, Collections.singletonList("Legendary"), Collections.singletonList("POTION:SLOW:3:5:TARGET")))
                    .build(), true))
            .put("Blindness", new CustomEnchant("&7Blindness", "Gives your opponent a blindness effect", Type.BOW, "PLAYER_DAMAGE_PROJECTILE", ImmutableMap.<Integer, Level>builder()
                    .put(1, new Level(25, Collections.singletonList("Common"), Collections.singletonList("POTION:BLINDNESS:1:5:TARGET")))
                    .put(2, new Level(25, Collections.singletonList("Elite"), Collections.singletonList("POTION:BLINDNESS:2:5:TARGET")))
                    .put(3, new Level(25, Collections.singletonList("Legendary"), Collections.singletonList("POTION:BLINDNESS:3:5:TARGET")))
                    .build(), true))
            .put("Explosive", new CustomEnchant("&7Explosive", "Chance for your arrows to explode on impact", Type.BOW, "PLAYER_DAMAGE_PROJECTILE", ImmutableMap.<Integer, Level>builder()
                    .put(1, new Level(15, Collections.singletonList("Common"), Collections.singletonList("EXPLODE:1:FALSE:FALSE:TARGET")))
                    .put(2, new Level(15, Collections.singletonList("Elite"), Collections.singletonList("EXPLODE:2:FALSE:FALSE:TARGET")))
                    .put(3, new Level(15, Collections.singletonList("Legendary"), Collections.singletonList("EXPLODE:3:FALSE:FALSE:TARGET")))
                    .build(), true))
            .put("Multishot", new CustomEnchant("&7Multishot", "Shoots multiple arrows", Type.BOW, "BOW_FIRE", ImmutableMap.<Integer, Level>builder()
                    .put(1, new Level(100, Collections.singletonList("Common"), Collections.singletonList("MULTISHOT:1")))
                    .put(2, new Level(100, Collections.singletonList("Elite"), Collections.singletonList("MULTISHOT:2")))
                    .put(3, new Level(100, Collections.singletonList("Legendary"), Collections.singletonList("MULTISHOT:3")))
                    .build(), true))
            .put("Blazingtouch", new CustomEnchant("&7BlazingTouch", "Automatically smelts the ores you mine", Type.PICKAXE, "BLOCK_BREAK", ImmutableMap.<Integer, Level>builder()
                    .put(1, new Level(100, Collections.singletonList("Common"), Collections.singletonList("SMELT")))
                    .build(), true))
            .put("Infusion", new CustomEnchant("&7Infusion", "Breaks all blocks in the nearby area", Type.PICKAXE, "BLOCK_BREAK", ImmutableMap.<Integer, Level>builder()
                    .put(1, new Level(100, Collections.singletonList("Common"), Collections.singletonList("INFUSION:1:FALSE")))
                    .put(2, new Level(100, Collections.singletonList("Elite"), Collections.singletonList("INFUSION:2:FALSE")))
                    .put(3, new Level(100, Collections.singletonList("Legendary"), Collections.singletonList("INFUSION:3:FALSE")))
                    .build(), true))
            .put("Cursed", new CustomEnchant("&7Cursed", "Gives all enemies in a radius of 10 Slowness", Type.CHESTPLATE, "PASSIVE:20", ImmutableMap.<Integer, Level>builder()
                    .put(1, new Level(100, Collections.singletonList("Common"), Collections.singletonList("AURA:ENEMY:10:POTION:SLOW:1:5:TARGET")))
                    .put(2, new Level(100, Collections.singletonList("Elite"), Collections.singletonList("AURA:ENEMY:10:POTION:SLOW:2:5:TARGET")))
                    .put(3, new Level(100, Collections.singletonList("Legendary"), Collections.singletonList("AURA:ENEMY:10:POTION:SLOW:3:5:TARGET")))
                    .build(), true))
            .put("Leader", new CustomEnchant("&7Leader", "Gives all allies in a radius of 10 Strength", Type.CHESTPLATE, "PASSIVE:20", ImmutableMap.<Integer, Level>builder()
                    .put(1, new Level(100, Collections.singletonList("Common"), Collections.singletonList("AURA:ALLY:10:POTION:INCREASE_DAMAGE:1:5:TARGET")))
                    .put(2, new Level(100, Collections.singletonList("Elite"), Collections.singletonList("AURA:ALLY:10:POTION:INCREASE_DAMAGE:2:5:TARGET")))
                    .put(3, new Level(100, Collections.singletonList("Legendary"), Collections.singletonList("AURA:ALLY:10:POTION:INCREASE_DAMAGE:3:5:TARGET")))
                    .build(), true))
            .put("Commander", new CustomEnchant("&7Commander", "Gives all allies in a radius of 10 Haste", Type.CHESTPLATE, "PASSIVE:20", ImmutableMap.<Integer, Level>builder()
                    .put(1, new Level(100, Collections.singletonList("Common"), Collections.singletonList("AURA:ALLY:10:POTION:FAST_DIGGING:1:5:TARGET")))
                    .put(2, new Level(100, Collections.singletonList("Elite"), Collections.singletonList("AURA:ALLY:10:POTION:FAST_DIGGING:2:5:TARGET")))
                    .put(3, new Level(100, Collections.singletonList("Legendary"), Collections.singletonList("AURA:ALLY:10:POTION:FAST_DIGGING:3:5:TARGET")))
                    .build(), true))
            .put("Holy", new CustomEnchant("&7Holy", "Gives all allies in a radius of 10 Regeneration", Type.CHESTPLATE, "PASSIVE:20", ImmutableMap.<Integer, Level>builder()
                    .put(1, new Level(100, Collections.singletonList("Common"), Collections.singletonList("AURA:ALLY:10:POTION:REGENERATION:1:1:TARGET")))
                    .put(2, new Level(100, Collections.singletonList("Elite"), Collections.singletonList("AURA:ALLY:10:POTION:REGENERATION:1:3:TARGET")))
                    .put(3, new Level(100, Collections.singletonList("Legendary"), Collections.singletonList("AURA:ALLY:10:POTION:REGENERATION:1:5:TARGET")))
                    .build(), true))
            .put("Berserk", new CustomEnchant("&7Berserk", "Gives all enemies in a radius of 10 Wither", Type.AXE, "PLAYER_DAMAGE", ImmutableMap.<Integer, Level>builder()
                    .put(1, new Level(10, Collections.singletonList("Common"), Collections.singletonList("AURA:ENEMY:10:POTION:WITHER:1:5:TARGET")))
                    .put(2, new Level(10, Collections.singletonList("Elite"), Collections.singletonList("AURA:ENEMY:10:POTION:WITHER:2:5:TARGET")))
                    .put(3, new Level(10, Collections.singletonList("Legendary"), Collections.singletonList("AURA:ENEMY:10:POTION:WITHER:3:5:TARGET")))
                    .build(), true))
            .put("ThunderousBlow", new CustomEnchant("&7ThunderousBlow", "Chance to strike your opponent with lightning", Type.BOW, "PLAYER_DAMAGE_PROJECTILE", ImmutableMap.<Integer, Level>builder()
                    .put(1, new Level(10, Collections.singletonList("Common"), Collections.singletonList("LIGHTNING:TARGET")))
                    .build(), true))
            .put("Thunder", new CustomEnchant("&7Thunder", "Chance to strike your opponent with lightning", Type.AXE, "PLAYER_DAMAGE", ImmutableMap.<Integer, Level>builder()
                    .put(1, new Level(10, Collections.singletonList("Common"), Collections.singletonList("LIGHTNING:TARGET")))
                    .build(), true))
            .put("Blunder", new CustomEnchant("&7Blunder", "Gives your opponent weakness effect", Type.SWORD, "PLAYER_DAMAGE", ImmutableMap.<Integer, Level>builder()
                    .put(1, new Level(10, Collections.singletonList("Common"), Collections.singletonList("POTION:WEAKNESS:1:5:TARGET")))
                    .put(2, new Level(10, Collections.singletonList("Elite"), Collections.singletonList("POTION:WEAKNESS:2:5:TARGET")))
                    .put(3, new Level(10, Collections.singletonList("Legendary"), Collections.singletonList("POTION:WEAKNESS:3:5:TARGET")))
                    .build(), true))
            .put("Renewal", new CustomEnchant("&7Renewal", "Upon killing a player you receive regeneration for 5 seconds", Type.SWORD, "PLAYER_KILL", ImmutableMap.<Integer, Level>builder()
                    .put(1, new Level(100, Collections.singletonList("Common"), Collections.singletonList("POTION:REGENERATION:1:5")))
                    .put(2, new Level(100, Collections.singletonList("Elite"), Collections.singletonList("POTION:REGENERATION:2:5")))
                    .put(3, new Level(100, Collections.singletonList("Legendary"), Collections.singletonList("POTION:REGENERATION:3:5")))
                    .build(), true))
            .put("Inquisitive", new CustomEnchant("&7Inquisitive", "Gives you extra experience upon killing a mob", Type.AXE, "ENTITY_KILL", ImmutableMap.<Integer, Level>builder()
                    .put(1, new Level(10, Collections.singletonList("Common"), Collections.singletonList("EXPERIENCE:3")))
                    .put(2, new Level(10, Collections.singletonList("Elite"), Collections.singletonList("EXPERIENCE:6")))
                    .put(3, new Level(10, Collections.singletonList("Legendary"), Collections.singletonList("EXPERIENCE:10")))
                    .build(), true))
            .put("Grace", new CustomEnchant("&7Grace", "Gives your allies regeneration upon your death", Type.CHESTPLATE, "PLAYER_DEATH", ImmutableMap.<Integer, Level>builder()
                    .put(1, new Level(100, Collections.singletonList("Common"), Collections.singletonList("AURA:ALLY:10:POTION:REGENERATION:1:5:TARGET")))
                    .put(2, new Level(100, Collections.singletonList("Elite"), Collections.singletonList("AURA:ALLY:10:POTION:REGENERATION:2:5:TARGET")))
                    .put(3, new Level(100, Collections.singletonList("Legendary"), Collections.singletonList("AURA:ALLY:10:POTION:REGENERATION:3:5:TARGET")))
                    .build(), true))
            .put("Guardian", new CustomEnchant("&7Guardian", "Gives your allies resistance upon your death", Type.CHESTPLATE, "PLAYER_DEATH", ImmutableMap.<Integer, Level>builder()
                    .put(1, new Level(100, Collections.singletonList("Common"), Collections.singletonList("AURA:ALLY:10:POTION:DAMAGE_RESISTANCE:1:5:TARGET")))
                    .put(2, new Level(100, Collections.singletonList("Elite"), Collections.singletonList("AURA:ALLY:10:POTION:DAMAGE_RESISTANCE:2:5:TARGET")))
                    .put(3, new Level(100, Collections.singletonList("Legendary"), Collections.singletonList("AURA:ALLY:10:POTION:DAMAGE_RESISTANCE:3:5:TARGET")))
                    .build(), true))
            .put("WarCry", new CustomEnchant("&7WarCry", "Gives your allies strength upon your death", Type.CHESTPLATE, "PLAYER_DEATH", ImmutableMap.<Integer, Level>builder()
                    .put(1, new Level(100, Collections.singletonList("Common"), Collections.singletonList("AURA:ALLY:10:POTION:DAMAGE_INCREASE:1:5:TARGET")))
                    .put(2, new Level(100, Collections.singletonList("Elite"), Collections.singletonList("AURA:ALLY:10:POTION:DAMAGE_INCREASE:2:5:TARGET")))
                    .put(3, new Level(100, Collections.singletonList("Legendary"), Collections.singletonList("AURA:ALLY:10:POTION:DAMAGE_INCREASE:3:5:TARGET")))
                    .build(), true))
            .put("Lifesteal", new CustomEnchant("&7Lifesteal", "Chance to heal yourself when you attack an enemy", Type.SWORD, "PLAYER_DAMAGE", ImmutableMap.<Integer, Level>builder()
                    .put(1, new Level(10, Collections.singletonList("Common"), Collections.singletonList("HEAL:1")))
                    .put(2, new Level(10, Collections.singletonList("Elite"), Collections.singletonList("HEAL:2")))
                    .put(3, new Level(10, Collections.singletonList("Legendary"), Collections.singletonList("HEAL:3")))
                    .build(), true))
            .put("Impact", new CustomEnchant("&7Impact", "Chance to deal double damage", Type.SWORD, "PLAYER_DAMAGE", ImmutableMap.<Integer, Level>builder()
                    .put(1, new Level(5, Collections.singletonList("Common"), Collections.singletonList("DAMAGE_MODIFIER:2")))
                    .put(2, new Level(7, Collections.singletonList("Elite"), Collections.singletonList("DAMAGE_MODIFIER:2")))
                    .put(3, new Level(10, Collections.singletonList("Legendary"), Collections.singletonList("DAMAGE_MODIFIER:2")))
                    .build(), true))
            .put("Evade", new CustomEnchant("&7Evade", "Chance to evade an attack", Type.CHESTPLATE, "DEFENCE", ImmutableMap.<Integer, Level>builder()
                    .put(1, new Level(5, Collections.singletonList("Common"), Collections.singletonList("DAMAGE_MODIFIER:0")))
                    .put(2, new Level(7, Collections.singletonList("Elite"), Collections.singletonList("DAMAGE_MODIFIER:0")))
                    .put(3, new Level(10, Collections.singletonList("Legendary"), Collections.singletonList("DAMAGE_MODIFIER:0")))
                    .build(), true))
            .put("Decapitate", new CustomEnchant("&7Decapitate", "Chance to drop an enemies head upon killing them", Type.AXE, "PLAYER_KILL", ImmutableMap.<Integer, Level>builder()
                    .put(1, new Level(30, Collections.singletonList("Common"), Collections.singletonList("DROP_HEAD:TARGET")))
                    .put(2, new Level(50, Collections.singletonList("Elite"), Collections.singletonList("DROP_HEAD:TARGET")))
                    .put(3, new Level(100, Collections.singletonList("Legendary"), Collections.singletonList("DROP_HEAD:TARGET")))
                    .build(), true))
            .put("IceAspect", new CustomEnchant("&7IceAspect", "Chance to give your opponent slowness", Type.SWORD, "PLAYER_DAMAGE", ImmutableMap.<Integer, Level>builder()
                    .put(1, new Level(10, Collections.singletonList("Common"), Collections.singletonList("POTION:SLOW:1:5:TARGET")))
                    .put(2, new Level(10, Collections.singletonList("Elite"), Collections.singletonList("POTION:SLOW:1:5:TARGET")))
                    .put(3, new Level(10, Collections.singletonList("Legendary"), Collections.singletonList("POTION:SLOW:1:5:TARGET")))
                    .build(), true))
            .build();
}
