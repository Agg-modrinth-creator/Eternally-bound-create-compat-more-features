/*    */ package dev.enjarai.collared.mixin;
/*    */ 
/*    */ import com.llamalad7.mixinextras.injector.v2.WrapWithCondition;
/*    */ import dev.enjarai.collared.ModKeyBindings;
/*    */ import net.minecraft.class_1661;
/*    */ import net.minecraft.class_312;
/*    */ import org.spongepowered.asm.mixin.Mixin;
/*    */ import org.spongepowered.asm.mixin.injection.At;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Mixin({class_312.class})
/*    */ public class MouseMixin
/*    */ {
/*    */   @WrapWithCondition(method = {"method_1598"}, at = {@At(value = "INVOKE", target = "Lnet/minecraft/class_1661;method_7373(D)V")})
/*    */   private boolean interceptMouseScroll(class_1661 instance, double scrollAmount) {
/* 20 */     return !ModKeyBindings.interceptScroll((float)scrollAmount);
/*    */   }
/*    */ }


/* Location:              C:\Users\Agg\Downloads\EternallyBoundPlus+1.21.1.jar!\dev\enjarai\collared\mixin\MouseMixin.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */