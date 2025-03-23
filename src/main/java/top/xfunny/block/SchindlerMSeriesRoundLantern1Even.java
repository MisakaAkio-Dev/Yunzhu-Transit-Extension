package top.xfunny.block;

import org.mtr.mapping.holder.*;
import org.mtr.mapping.mapper.BlockEntityExtension;
import org.mtr.mapping.tool.HolderBase;
import org.mtr.mod.block.IBlock;
import top.xfunny.BlockEntityTypes;
import top.xfunny.block.base.LiftButtonsBase;

import javax.annotation.Nonnull;
import java.util.List;

public class SchindlerMSeriesRoundLantern1Even extends LiftButtonsBase {
    public SchindlerMSeriesRoundLantern1Even() {
        super(false, false);
    }

    @Nonnull
    @Override
    public VoxelShape getOutlineShape2(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        switch (IBlock.getStatePropertySafe(state, SIDE)) {
            case LEFT -> {
                return IBlock.getVoxelShapeByDirection(7, 9, 0, 16, 12, 0.1, IBlock.getStatePropertySafe(state, FACING));
            }
            case RIGHT -> {
                return IBlock.getVoxelShapeByDirection(0, 9, 0, 9, 12, 0.1, IBlock.getStatePropertySafe(state, FACING));
            }
        }
        return VoxelShapes.empty();
    }

    @Nonnull
    @Override
    public BlockEntityExtension createBlockEntity(BlockPos blockPos, BlockState blockState) {
        return new SchindlerMSeriesRoundLantern1Even.BlockEntity(blockPos, blockState);
    }

    @Override
    public void addBlockProperties(List<HolderBase<?>> properties) {
        properties.add(FACING);
        properties.add(SIDE);
    }

    public static class BlockEntity extends BlockEntityBase {
        public BlockEntity(BlockPos pos, BlockState state) {
            super(BlockEntityTypes.SCHINDLER_M_SERIES_ROUND_LANTERN_1_EVEN.get(), pos, state);
        }
    }
}
