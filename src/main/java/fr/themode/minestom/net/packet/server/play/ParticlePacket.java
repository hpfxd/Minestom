package fr.themode.minestom.net.packet.server.play;

import fr.themode.minestom.net.packet.PacketWriter;
import fr.themode.minestom.net.packet.server.ServerPacket;
import fr.themode.minestom.net.packet.server.ServerPacketIdentifier;

import java.util.function.Consumer;

public class ParticlePacket implements ServerPacket {

    public int particleId;
    public boolean longDistance;
    public double x, y, z;
    public float offsetX, offsetY, offsetZ;
    public float particleData;
    public int particleCount;

    public Consumer<PacketWriter> dataConsumer;

    @Override
    public void write(PacketWriter writer) {
        writer.writeInt(particleId);
        writer.writeBoolean(longDistance);
        writer.writeDouble(x);
        writer.writeDouble(y);
        writer.writeDouble(z);
        writer.writeFloat(offsetX);
        writer.writeFloat(offsetY);
        writer.writeFloat(offsetZ);
        writer.writeFloat(particleData);
        writer.writeInt(particleCount);

        if (dataConsumer != null) {
            dataConsumer.accept(writer);
        }
    }

    @Override
    public int getId() {
        return ServerPacketIdentifier.PARTICLE;
    }
}
