/*    */ package dev.enjarai.collared;
/*    */ 
/*    */ import dev.enjarai.collared.item.CollarItem;
/*    */ import dev.enjarai.collared.item.LeashItem;
/*    */ import dev.enjarai.collared.item.ModItems;
/*    */ import dev.enjarai.collared.item.component.CollarSettingsComponent;
/*    */ import dev.enjarai.collared.net.ModClientNetworking;
/*    */ import dev.enjarai.collared.renderer.HudRenderer;
/*    */ import dev.enjarai.collared.renderer.LeashRenderer;
/*    */ import dev.enjarai.collared.screen.CollarScreen;
/*    */ import dev.enjarai.collared.screen.ModeScreen;
/*    */ import io.wispforest.accessories.api.client.AccessoriesRendererRegistry;
/*    */ import java.util.function.Supplier;
/*    */ import net.fabricmc.api.ClientModInitializer;
/*    */ import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
/*    */ import net.fabricmc.fabric.api.client.rendering.v1.WorldRenderEvents;
/*    */ import net.minecraft.class_1792;
/*    */ import net.minecraft.class_310;
/*    */ import net.minecraft.class_437;
/*    */ 
/*    */ public class CollaredClient
/*    */   implements ClientModInitializer
/*    */ {
/*    */   public void onInitializeClient() {
/* 25 */     ModClientNetworking.register();
/*    */     
/* 27 */     ModItems.COLLARS.forEach(item -> AccessoriesRendererRegistry.registerRenderer((class_1792)item, dev.enjarai.collared.renderer.CollarRenderer::new));
/*    */ 
/*    */ 
/*    */     
/* 31 */     WorldRenderEvents.AFTER_ENTITIES.register(LeashRenderer::renderWorldLeashes);
/* 32 */     HudRenderCallback.EVENT.register(HudRenderer::renderLeashHud);
/*    */     
/* 34 */     CollarItem.collarScreenOpener = CollaredClient::openCollarScreen;
/* 35 */     LeashItem.modeScreenOpener = CollaredClient::openModeScreen;
/*    */   }
/*    */   
/*    */   public static void openCollarScreen(CollarSettingsComponent settings, boolean hasOwner) {
/* 39 */     class_310 client = class_310.method_1551();
/* 40 */     client.method_1507((class_437)new CollarScreen(client.field_1755, null, hasOwner, settings));
/*    */   }
/*    */   
/*    */   public static void openModeScreen() {
/* 44 */     class_310.method_1551().method_1507((class_437)new ModeScreen());
/*    */   }
/*    */ }


/* Location:              C:\Users\Agg\Downloads\EternallyBoundPlus+1.21.1.jar!\dev\enjarai\collared\CollaredClient.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */