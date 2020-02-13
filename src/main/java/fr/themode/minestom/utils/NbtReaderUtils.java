package fr.themode.minestom.utils;

import club.thectm.minecraft.text.LegacyText;
import club.thectm.minecraft.text.TextObject;
import com.google.gson.JsonParser;
import fr.themode.minestom.item.ItemStack;
import fr.themode.minestom.net.packet.PacketReader;

import java.util.ArrayList;

public class NbtReaderUtils {

    public static void readItemStackNBT(PacketReader reader, ItemStack item) {
        reader.readByte(typeId -> {
            switch (typeId) {
                case 0x00: // TAG_End
                    // End of item NBT
                    break;
                case 0x01: // TAG_Byte

                    break;
                case 0x02: // TAG_Short
                    reader.readShortSizedString((name, l) -> {

                        // Damage NBT
                        if (name.equals("Damage")) {
                            reader.readShort(damage -> {
                                item.setDamage(damage);
                                readItemStackNBT(reader, item);
                            });
                        }

                    });
                    break;
                case 0x03: // TAG_Int
                    reader.readShortSizedString((name, length) -> {

                        // Unbreakable
                        if (name.equals("Unbreakable")) {
                            reader.readInteger(value -> {
                                item.setUnbreakable(value == 1);
                                readItemStackNBT(reader, item);
                            });
                        }

                    });
                    break;
                case 0x04: // TAG_Long

                    break;
                case 0x05: // TAG_Float

                    break;
                case 0x06: // TAG_Double

                    break;
                case 0x07: // TAG_Byte_Array

                    break;
                case 0x08: // TAG_String

                    break;
                case 0x09: // TAG_List

                    break;
                case 0x0A: // TAG_Compound

                    reader.readShortSizedString((compoundName, length) -> {

                        // Display Compound
                        if (compoundName.equals("display")) {
                            readItemStackDisplayNBT(reader, item);
                        }

                    });

                    break;
            }
        });
    }

    public static void readItemStackDisplayNBT(PacketReader reader, ItemStack item) {

        reader.readByte(typeId -> {
            switch (typeId) {
                case 0x00: // TAG_End
                    // End of the display compound
                    readItemStackNBT(reader, item);
                    break;
                case 0x08: // TAG_String

                    reader.readShortSizedString((name, length) -> {

                        if (name.equals("Name")) {
                            reader.readShortSizedString((jsonDisplayName, length1) -> {
                                TextObject textObject = TextObject.fromJson(new JsonParser().parse(jsonDisplayName).getAsJsonObject());
                                String displayName = LegacyText.toLegacy(textObject);
                                item.setDisplayName(displayName);
                                readItemStackDisplayNBT(reader, item);
                            });
                        }


                    });
                    break;
                case 0x09: // TAG_List

                    reader.readShortSizedString((name, length) -> {

                        if (name.equals("Lore")) {
                            reader.readByte(loreType -> { // Should always be 0x08 (TAG_String)

                                reader.readInteger(size -> {
                                    ArrayList<String> lore = new ArrayList<>(size);
                                    for (int i = 0; i < size; i++) {
                                        reader.readShortSizedString((string, length1) -> {
                                            TextObject textObject = TextObject.fromJson(new JsonParser().parse(string).getAsJsonObject());
                                            String line = LegacyText.toLegacy(textObject);
                                            lore.add(line);
                                        });
                                        if (i == size - 1) { // Last iteration
                                            readItemStackDisplayNBT(reader, item);
                                        }
                                    }

                                });

                            });
                        }

                    });

                    break;
            }

        });
    }

}