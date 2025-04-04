package top.xfunny;

import org.mtr.core.data.Position;
import org.mtr.mapping.holder.BlockPos;
import org.mtr.mapping.holder.MathHelper;
import org.mtr.mapping.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class Init {
    public static final String MOD_ID = "yte";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    public static final Registry REGISTRY = new Registry();


    public static void init() {
        Blocks.init();
        BlockEntityTypes.init();
        Items.init();
        CreativeModeTabs.init();
        REGISTRY.init();
    }

    public static Position blockPosToPosition(BlockPos blockPos) {
        return new Position(blockPos.getX(), blockPos.getY(), blockPos.getZ());
    }

    public static BlockPos positionToBlockPos(Position position) {
        return new BlockPos((int) position.getX(), (int) position.getY(), (int) position.getZ());
    }

    public static BlockPos newBlockPos(double x, double y, double z) {
        return new BlockPos(MathHelper.floor(x), MathHelper.floor(y), MathHelper.floor(z));
    }
}

