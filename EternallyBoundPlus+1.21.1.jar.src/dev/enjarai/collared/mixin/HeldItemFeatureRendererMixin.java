/*    */ package dev.enjarai.collared.mixin;
/*    */ 
/*    */ import dev.enjarai.collared.item.component.SeatedComponent;
/*    */ import net.minecraft.class_1309;
/*    */ import net.minecraft.class_4587;
/*    */ import net.minecraft.class_4597;
/*    */ import net.minecraft.class_989;
/*    */ import org.spongepowered.asm.mixin.Mixin;
/*    */ import org.spongepowered.asm.mixin.injection.At;
/*    */ import org.spongepowered.asm.mixin.injection.Inject;
/*    */ import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Mixin({class_989.class})
/*    */ public class HeldItemFeatureRendererMixin
/*    */ {
/*    */   @Inject(at = {@At("HEAD")}, method = {"method_17162"}, cancellable = true)
/*    */   void maybeDontRender(class_4587 matrixStack, class_4597 vertexConsumerProvider, int i, class_1309 livingEntity, float f, float g, float h, float j, float k, float l, CallbackInfo ci) {
/* 21 */     if (SeatedComponent.is(livingEntity))
/*    */     {
/* 23 */       ci.cancel();
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Agg\Downloads\EternallyBoundPlus+1.21.1.jar!\dev\enjarai\collared\mixin\HeldItemFeatureRendererMixin.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */