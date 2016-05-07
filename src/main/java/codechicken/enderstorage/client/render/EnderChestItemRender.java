package codechicken.enderstorage.client.render;

import codechicken.enderstorage.api.Frequency;
import codechicken.lib.render.IItemRenderer;
import codechicken.lib.vec.Vector3;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.block.model.BakedQuad;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms;
import net.minecraft.client.renderer.block.model.ItemOverrideList;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;

import java.util.List;

/**
 * Created by covers1624 on 4/27/2016.
 */
public class EnderChestItemRender implements IItemRenderer {
    @Override
    public void renderItem(ItemStack item) {
        GlStateManager.pushMatrix();

        Vector3 d = new Vector3();

        Frequency frequency = Frequency.fromItemStack(item);
        int rotation = 3;

        RenderTileEnderChest.renderChest(rotation, frequency, d.x, d.y, d.z, 0, 0F);
        GlStateManager.popMatrix();
    }

    @Override
    public void setupItemRender(ItemCameraTransforms.TransformType transformType) {

    }

    @Override
    public List<BakedQuad> getQuads(IBlockState state, EnumFacing side, long rand) {
        return null;
    }

    @Override
    public boolean isAmbientOcclusion() {
        return false;
    }

    @Override
    public boolean isGui3d() {
        return false;
    }

    @Override
    public boolean isBuiltInRenderer() {
        return true;
    }

    @Override
    public TextureAtlasSprite getParticleTexture() {
        return null;
    }

    @Override
    public ItemCameraTransforms getItemCameraTransforms() {
        return ItemCameraTransforms.DEFAULT;
    }

    @Override
    public ItemOverrideList getOverrides() {
        return ItemOverrideList.NONE;
    }
}