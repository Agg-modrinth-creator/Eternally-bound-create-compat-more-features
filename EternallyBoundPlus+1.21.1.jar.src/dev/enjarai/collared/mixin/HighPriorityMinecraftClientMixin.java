/*    */ package dev.enjarai.collared.mixin;
/*    */ 
/*    */ import dev.enjarai.collared.item.component.SeatedComponent;
/*    */ import net.minecraft.class_1309;
/*    */ import net.minecraft.class_310;
/*    */ import net.minecraft.class_746;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ import org.spongepowered.asm.mixin.Mixin;
/*    */ import org.spongepowered.asm.mixin.Shadow;
/*    */ import org.spongepowered.asm.mixin.injection.At;
/*    */ import org.spongepowered.asm.mixin.injection.Inject;
/*    */ import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
/*    */ import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
/*    */ 
/*    */ @Mixin(value = {class_310.class}, priority = 5000000)
/*    */ public class HighPriorityMinecraftClientMixin {
/*    */   @Shadow
/*    */   @Nullable
/*    */   public class_746 field_1724;
/*    */   
/*    */   @Inject(method = {"method_1536"}, at = {@At("HEAD")}, cancellable = true)
/*    */   private void noAttack(CallbackInfoReturnable<Boolean> cir) {
/* 23 */     if (SeatedComponent.is((class_1309)this.field_1724)) cir.cancel(); 
/*    */   }
/*    */   
/*    */   @Inject(method = {"method_1590"}, at = {@At("HEAD")}, cancellable = true)
/*    */   private void noBreakBlocks(boolean breaking, CallbackInfo ci) {
/* 28 */     if (SeatedComponent.is((class_1309)this.field_1724)) ci.cancel(); 
/*    */   }
/*    */   
/*    */   @Inject(method = {"method_1583"}, at = {@At("HEAD")}, cancellable = true)
/*    */   private void noUseItems(CallbackInfo ci) {
/* 33 */     if (SeatedComponent.is((class_1309)this.field_1724)) ci.cancel(); 
/*    */   }
/*    */   
/*    */   @Inject(method = {"method_1511"}, at = {@At("HEAD")}, cancellable = true)
/*    */   private void noMiddleClick(CallbackInfo ci) {
/* 38 */     if (SeatedComponent.is((class_1309)this.field_1724)) ci.cancel(); 
/*    */   }
/*    */ }


/* Location:              C:\Users\Agg\Downloads\EternallyBoundPlus+1.21.1.jar!\dev\enjarai\collared\mixin\HighPriorityMinecraftClientMixin.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */