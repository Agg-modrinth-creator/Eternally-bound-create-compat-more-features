/*    */ package dev.enjarai.collared.mixin;
/*    */ 
/*    */ import com.llamalad7.mixinextras.injector.wrapmethod.WrapMethod;
/*    */ import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
/*    */ import dev.enjarai.collared.item.component.SeatedComponent;
/*    */ import net.minecraft.class_1309;
/*    */ import net.minecraft.class_4587;
/*    */ import net.minecraft.class_4597;
/*    */ import net.minecraft.class_5617;
/*    */ import net.minecraft.class_897;
/*    */ import net.minecraft.class_922;
/*    */ import org.spongepowered.asm.mixin.Mixin;
/*    */ 
/*    */ 
/*    */ @Mixin({class_922.class})
/*    */ public abstract class LivingEntityRendererMixin
/*    */   extends class_897
/*    */ {
/*    */   protected LivingEntityRendererMixin(class_5617.class_5618 ctx) {
/* 20 */     super(ctx);
/*    */   }
/*    */   
/*    */   @WrapMethod(method = {"method_4054"})
/*    */   void render(class_1309 livingEntity, float f, float g, class_4587 matrixStack, class_4597 vertexConsumerProvider, int i, Operation<Void> original) {
/* 25 */     if (SeatedComponent.is(livingEntity)) matrixStack.method_22904(0.0D, -0.6875D * livingEntity.method_55693(), 0.0D); 
/* 26 */     original.call(new Object[] { livingEntity, Float.valueOf(f), Float.valueOf(g), matrixStack, vertexConsumerProvider, Integer.valueOf(i) });
/*    */   }
/*    */ }


/* Location:              C:\Users\Agg\Downloads\EternallyBoundPlus+1.21.1.jar!\dev\enjarai\collared\mixin\LivingEntityRendererMixin.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */