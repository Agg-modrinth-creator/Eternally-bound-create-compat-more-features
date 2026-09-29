/*    */ package dev.enjarai.collared.mixin;
/*    */ 
/*    */ import dev.enjarai.collared.item.component.SeatedComponent;
/*    */ import java.util.function.Supplier;
/*    */ import net.minecraft.class_1309;
/*    */ import net.minecraft.class_572;
/*    */ import net.minecraft.class_591;
/*    */ import net.minecraft.class_630;
/*    */ import org.spongepowered.asm.mixin.Mixin;
/*    */ import org.spongepowered.asm.mixin.Unique;
/*    */ import org.spongepowered.asm.mixin.injection.At;
/*    */ import org.spongepowered.asm.mixin.injection.Inject;
/*    */ import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Mixin({class_591.class})
/*    */ public abstract class PlayerEntityModelMixin
/*    */   extends class_572
/*    */ {
/*    */   @Unique
/*    */   Runnable updateJacket;
/*    */   
/*    */   public PlayerEntityModelMixin(class_630 root) {
/* 28 */     super(root);
/*    */   }
/*    */   
/*    */   @Inject(at = {@At(value = "INVOKE", target = "Lnet/minecraft/class_572;method_17087(Lnet/minecraft/class_1309;FFFFF)V", shift = At.Shift.AFTER)}, method = {"method_17087"})
/*    */   void modifyAngles(class_1309 livingEntity, float f, float g, float h, float i, float j, CallbackInfo ci) {
/* 33 */     if (SeatedComponent.is(livingEntity)) {
/* 34 */       Supplier s = () -> this;
/* 35 */       this.updateJacket = SeatedComponent.setSittingAnglesHotswappable(s);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Agg\Downloads\EternallyBoundPlus+1.21.1.jar!\dev\enjarai\collared\mixin\PlayerEntityModelMixin.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */