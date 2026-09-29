/*    */ package dev.enjarai.collared.mixin;
/*    */ 
/*    */ import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
/*    */ import com.llamalad7.mixinextras.injector.ModifyReturnValue;
/*    */ import dev.enjarai.collared.item.CollarItem;
/*    */ import dev.enjarai.collared.item.component.SeatedComponent;
/*    */ import net.minecraft.class_1297;
/*    */ import net.minecraft.class_1299;
/*    */ import net.minecraft.class_1309;
/*    */ import net.minecraft.class_1937;
/*    */ import net.minecraft.class_3532;
/*    */ import net.minecraft.class_4048;
/*    */ import org.spongepowered.asm.mixin.Mixin;
/*    */ import org.spongepowered.asm.mixin.Shadow;
/*    */ import org.spongepowered.asm.mixin.injection.At;
/*    */ import org.spongepowered.asm.mixin.injection.Inject;
/*    */ import org.spongepowered.asm.mixin.injection.ModifyVariable;
/*    */ import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Mixin({class_1309.class})
/*    */ public abstract class LivingEntityMixin
/*    */   extends class_1297
/*    */ {
/*    */   @Shadow
/*    */   public float field_6241;
/*    */   @Shadow
/*    */   public float field_6259;
/*    */   
/*    */   public LivingEntityMixin(class_1299<?> type, class_1937 world) {
/* 34 */     super(type, world);
/*    */   } @Shadow
/*    */   protected abstract double method_7490();
/*    */   @Shadow
/*    */   public abstract void method_5847(float paramFloat);
/*    */   @Shadow
/*    */   protected abstract float method_53964();
/*    */   @Inject(method = {"method_6043"}, at = {@At("HEAD")}, cancellable = true)
/*    */   private void jump(CallbackInfo ci) {
/* 43 */     class_1309 entity = (class_1309)this;
/* 44 */     if (SeatedComponent.is(entity)) { ci.cancel(); return; }
/* 45 */      CollarItem.playJingleQuestionMark(entity, false);
/*    */   }
/*    */   
/*    */   @ModifyReturnValue(at = {@At("TAIL")}, method = {"method_5810"})
/*    */   boolean makeSittingPlayersUnpushable(boolean original) {
/* 50 */     return (original && !SeatedComponent.is((class_1309)this));
/*    */   }
/*    */   
/*    */   @ModifyVariable(at = @At("HEAD"), method = {"method_6031"}, argsOnly = true, index = 1)
/*    */   float dontTurnBodyWhileSitting(float bodyRotation) {
/* 55 */     SeatedComponent c = SeatedComponent.of((class_1309)this);
/* 56 */     return (c != null) ? c.yaw() : bodyRotation;
/*    */   }
/*    */   
/*    */   @ModifyReturnValue(at = {@At("RETURN")}, method = {"method_5791"})
/*    */   float clampSeatedYaw(float yaw) {
/* 61 */     return collared$inconspicuousHook(yaw);
/*    */   }
/*    */   
/*    */   protected float collared$inconspicuousHook(float yaw) {
/* 65 */     SeatedComponent c = SeatedComponent.of((class_1309)this);
/* 66 */     if (c != null) yaw = class_3532.method_20306(yaw, c.yaw(), method_53964()); 
/* 67 */     return yaw;
/*    */   }
/*    */   
/*    */   @ModifyExpressionValue(at = {@At(value = "INVOKE", target = "Lnet/minecraft/class_1309;method_55694(Lnet/minecraft/class_4050;)Lnet/minecraft/class_4048;")}, method = {"method_18377"})
/*    */   class_4048 modifyDimension(class_4048 original) {
/* 72 */     if (SeatedComponent.is((class_1309)this)) {
/* 73 */       assert !original.comp_2189();
/* 74 */       float yScale = (original.comp_2186() - 0.6875F) / original.comp_2186();
/* 75 */       return original.method_19539(1.0F, yScale).method_55685(original.comp_2187());
/*    */     } 
/* 77 */     return original;
/*    */   }
/*    */ }


/* Location:              C:\Users\Agg\Downloads\EternallyBoundPlus+1.21.1.jar!\dev\enjarai\collared\mixin\LivingEntityMixin.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */