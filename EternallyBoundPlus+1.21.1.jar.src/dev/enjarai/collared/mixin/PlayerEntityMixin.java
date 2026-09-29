/*    */ package dev.enjarai.collared.mixin;
/*    */ 
/*    */ import dev.enjarai.collared.item.LeashItem;
/*    */ import dev.enjarai.collared.item.component.SeatedComponent;
/*    */ import net.minecraft.class_1268;
/*    */ import net.minecraft.class_1297;
/*    */ import net.minecraft.class_1299;
/*    */ import net.minecraft.class_1309;
/*    */ import net.minecraft.class_1657;
/*    */ import net.minecraft.class_1937;
/*    */ import net.minecraft.class_4050;
/*    */ import org.spongepowered.asm.mixin.Mixin;
/*    */ import org.spongepowered.asm.mixin.injection.At;
/*    */ import org.spongepowered.asm.mixin.injection.Inject;
/*    */ import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
/*    */ 
/*    */ @Mixin({class_1657.class})
/*    */ public abstract class PlayerEntityMixin extends class_1309 {
/*    */   protected PlayerEntityMixin(class_1299 entityType, class_1937 world) {
/* 20 */     super(entityType, world);
/*    */   }
/*    */ 
/*    */   
/*    */   @Inject(at = {@At("HEAD")}, method = {"method_7318"}, cancellable = true)
/*    */   void preUpdatePose(CallbackInfo ci) {
/* 26 */     if (SeatedComponent.is(this)) {
/* 27 */       method_18380(class_4050.field_18076);
/* 28 */       ci.cancel();
/*    */     } 
/*    */   }
/*    */   
/*    */   @Inject(method = {"method_7324"}, at = {@At("HEAD")}, cancellable = true)
/*    */   private void collared$handleDeployerLeashAttack(class_1297 target, CallbackInfo ci) {
/*    */     if (this instanceof net.minecraft.class_3222) {
/*    */       3 = this;
/*    */       4 = 3.method_5998(class_1268.field_5808);
/*    */       5 = 4.method_7909();
/*    */       if (5 instanceof LeashItem) {
/*    */         ((LeashItem)5).useLeash((class_1657)3, class_1268.field_5808, target.method_19538(), target);
/*    */         ci.cancel();
/*    */         return;
/*    */       } 
/*    */       4 = 3.method_5998(class_1268.field_5810);
/*    */       5 = 4.method_7909();
/*    */       if (5 instanceof LeashItem) {
/*    */         ((LeashItem)5).useLeash((class_1657)3, class_1268.field_5810, target.method_19538(), target);
/*    */         ci.cancel();
/*    */         return;
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Agg\Downloads\EternallyBoundPlus+1.21.1.jar!\dev\enjarai\collared\mixin\PlayerEntityMixin.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */