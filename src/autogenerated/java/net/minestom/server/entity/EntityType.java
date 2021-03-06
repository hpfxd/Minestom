package net.minestom.server.entity;

import net.minestom.server.registry.Registries;
import net.minestom.server.utils.NamespaceID;

/**
 * //==============================
 * //  AUTOGENERATED BY EnumGenerator
 * //==============================
 */
@SuppressWarnings({"deprecation"})
public enum EntityType {
    AREA_EFFECT_CLOUD("minecraft:area_effect_cloud"),

    ARMOR_STAND("minecraft:armor_stand"),

    ARROW("minecraft:arrow"),

    BAT("minecraft:bat"),

    BEE("minecraft:bee"),

    BLAZE("minecraft:blaze"),

    BOAT("minecraft:boat"),

    CAT("minecraft:cat"),

    CAVE_SPIDER("minecraft:cave_spider"),

    CHICKEN("minecraft:chicken"),

    COD("minecraft:cod"),

    COW("minecraft:cow"),

    CREEPER("minecraft:creeper"),

    DOLPHIN("minecraft:dolphin"),

    DONKEY("minecraft:donkey"),

    DRAGON_FIREBALL("minecraft:dragon_fireball"),

    DROWNED("minecraft:drowned"),

    ELDER_GUARDIAN("minecraft:elder_guardian"),

    END_CRYSTAL("minecraft:end_crystal"),

    ENDER_DRAGON("minecraft:ender_dragon"),

    ENDERMAN("minecraft:enderman"),

    ENDERMITE("minecraft:endermite"),

    EVOKER("minecraft:evoker"),

    EVOKER_FANGS("minecraft:evoker_fangs"),

    EXPERIENCE_ORB("minecraft:experience_orb"),

    EYE_OF_ENDER("minecraft:eye_of_ender"),

    FALLING_BLOCK("minecraft:falling_block"),

    FIREWORK_ROCKET("minecraft:firework_rocket"),

    FOX("minecraft:fox"),

    GHAST("minecraft:ghast"),

    GIANT("minecraft:giant"),

    GUARDIAN("minecraft:guardian"),

    HOGLIN("minecraft:hoglin"),

    HORSE("minecraft:horse"),

    HUSK("minecraft:husk"),

    ILLUSIONER("minecraft:illusioner"),

    IRON_GOLEM("minecraft:iron_golem"),

    ITEM("minecraft:item"),

    ITEM_FRAME("minecraft:item_frame"),

    FIREBALL("minecraft:fireball"),

    LEASH_KNOT("minecraft:leash_knot"),

    LIGHTNING_BOLT("minecraft:lightning_bolt"),

    LLAMA("minecraft:llama"),

    LLAMA_SPIT("minecraft:llama_spit"),

    MAGMA_CUBE("minecraft:magma_cube"),

    MINECART("minecraft:minecart"),

    CHEST_MINECART("minecraft:chest_minecart"),

    COMMAND_BLOCK_MINECART("minecraft:command_block_minecart"),

    FURNACE_MINECART("minecraft:furnace_minecart"),

    HOPPER_MINECART("minecraft:hopper_minecart"),

    SPAWNER_MINECART("minecraft:spawner_minecart"),

    TNT_MINECART("minecraft:tnt_minecart"),

    MULE("minecraft:mule"),

    MOOSHROOM("minecraft:mooshroom"),

    OCELOT("minecraft:ocelot"),

    PAINTING("minecraft:painting"),

    PANDA("minecraft:panda"),

    PARROT("minecraft:parrot"),

    PHANTOM("minecraft:phantom"),

    PIG("minecraft:pig"),

    PIGLIN("minecraft:piglin"),

    PIGLIN_BRUTE("minecraft:piglin_brute"),

    PILLAGER("minecraft:pillager"),

    POLAR_BEAR("minecraft:polar_bear"),

    TNT("minecraft:tnt"),

    PUFFERFISH("minecraft:pufferfish"),

    RABBIT("minecraft:rabbit"),

    RAVAGER("minecraft:ravager"),

    SALMON("minecraft:salmon"),

    SHEEP("minecraft:sheep"),

    SHULKER("minecraft:shulker"),

    SHULKER_BULLET("minecraft:shulker_bullet"),

    SILVERFISH("minecraft:silverfish"),

    SKELETON("minecraft:skeleton"),

    SKELETON_HORSE("minecraft:skeleton_horse"),

    SLIME("minecraft:slime"),

    SMALL_FIREBALL("minecraft:small_fireball"),

    SNOW_GOLEM("minecraft:snow_golem"),

    SNOWBALL("minecraft:snowball"),

    SPECTRAL_ARROW("minecraft:spectral_arrow"),

    SPIDER("minecraft:spider"),

    SQUID("minecraft:squid"),

    STRAY("minecraft:stray"),

    STRIDER("minecraft:strider"),

    EGG("minecraft:egg"),

    ENDER_PEARL("minecraft:ender_pearl"),

    EXPERIENCE_BOTTLE("minecraft:experience_bottle"),

    POTION("minecraft:potion"),

    TRIDENT("minecraft:trident"),

    TRADER_LLAMA("minecraft:trader_llama"),

    TROPICAL_FISH("minecraft:tropical_fish"),

    TURTLE("minecraft:turtle"),

    VEX("minecraft:vex"),

    VILLAGER("minecraft:villager"),

    VINDICATOR("minecraft:vindicator"),

    WANDERING_TRADER("minecraft:wandering_trader"),

    WITCH("minecraft:witch"),

    WITHER("minecraft:wither"),

    WITHER_SKELETON("minecraft:wither_skeleton"),

    WITHER_SKULL("minecraft:wither_skull"),

    WOLF("minecraft:wolf"),

    ZOGLIN("minecraft:zoglin"),

    ZOMBIE("minecraft:zombie"),

    ZOMBIE_HORSE("minecraft:zombie_horse"),

    ZOMBIE_VILLAGER("minecraft:zombie_villager"),

    ZOMBIFIED_PIGLIN("minecraft:zombified_piglin"),

    PLAYER("minecraft:player"),

    FISHING_BOBBER("minecraft:fishing_bobber");

    private String namespaceID;

    EntityType(String namespaceID) {
        this.namespaceID = namespaceID;
        Registries.entityTypes.put(NamespaceID.from(namespaceID), this);
    }

    public int getId() {
        return ordinal();
    }

    public String getNamespaceID() {
        return namespaceID;
    }

    public static EntityType fromId(int id) {
        if(id >= 0 && id < values().length) {
            return values()[id];
        }
        return PIG;
    }
}
