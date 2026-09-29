/*    */ package dev.enjarai.collared.mixin;
/*    */ import dev.enjarai.collared.item.component.SeatedComponent;
/*    */ import net.minecraft.class_1268;
/*    */ import net.minecraft.class_1309;
/*    */ import net.minecraft.class_1799;
/*    */ import net.minecraft.class_310;
/*    */ import net.minecraft.class_4587;
/*    */ import net.minecraft.class_4597;
/*    */ import net.minecraft.class_742;
/*    */ import net.minecraft.class_759;
/*    */ import org.spongepowered.asm.mixin.Mixin;
/*    */ import org.spongepowered.asm.mixin.injection.At;
/*    */ import org.spongepowered.asm.mixin.injection.Inject;
/*    */ import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
/*    */ 
/*    */ @Mixin({class_759.class})
/*    */ public class HeldItemRendererMixin {
/*    */   @Inject(at = {@At("HEAD")}, method = {"method_3228"}, cancellable = true)
/*    */   void cancelRenderingHeldItemsWhileSitting(class_742 player, float tickDelta, float pitch, class_1268 hand, float swingProgress, class_1799 item, float equipProgress, class_4587 matrices, class_4597 vertexConsumers, int light, CallbackInfo ci) {
/* 20 */     if (SeatedComponent.is((class_1309)(class_310.method_1551()).field_1724)) ci.cancel(); 
/*    */   }
/*    */ }


/* Location:              C:\Users\Agg\Downloads\EternallyBoundPlus+1.21.1.jar!\dev\enjarai\collared\mixin\HeldItemRendererMixin.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */