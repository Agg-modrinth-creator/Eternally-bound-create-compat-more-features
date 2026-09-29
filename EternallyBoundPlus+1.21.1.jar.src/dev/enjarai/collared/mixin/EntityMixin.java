/*     */ package dev.enjarai.collared.mixin;
/*     */ 
/*     */ import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
/*     */ import com.llamalad7.mixinextras.injector.ModifyReturnValue;
/*     */ import dev.enjarai.collared.item.CollarItem;
/*     */ import dev.enjarai.collared.item.component.ModComponents;
/*     */ import dev.enjarai.collared.item.component.RestrainedComponent;
/*     */ import dev.enjarai.collared.item.component.SeatedComponent;
/*     */ import io.wispforest.accessories.api.slot.SlotReference;
/*     */ import net.minecraft.class_1297;
/*     */ import net.minecraft.class_1309;
/*     */ import net.minecraft.class_1657;
/*     */ import net.minecraft.class_1799;
/*     */ import net.minecraft.class_1937;
/*     */ import net.minecraft.class_2338;
/*     */ import net.minecraft.class_243;
/*     */ import net.minecraft.class_2680;
/*     */ import net.minecraft.class_4050;
/*     */ import org.spongepowered.asm.mixin.Mixin;
/*     */ import org.spongepowered.asm.mixin.Shadow;
/*     */ import org.spongepowered.asm.mixin.injection.At;
/*     */ import org.spongepowered.asm.mixin.injection.Inject;
/*     */ import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
/*     */ import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
/*     */ 
/*     */ 
/*     */ @Mixin({class_1297.class})
/*     */ public abstract class EntityMixin
/*     */ {
/*     */   @Shadow
/*     */   public abstract boolean method_5715();
/*     */   
/*     */   @Inject(method = {"method_5712"}, at = {@At("TAIL")})
/*     */   private void playStepSound(class_2338 pos, class_2680 state, CallbackInfo ci) {
/*  35 */     if ((class_1297)this instanceof class_1309)
/*  36 */       CollarItem.playJingleQuestionMark((class_1309)this, false); 
/*     */   }
/*     */   
/*     */   @Shadow
/*     */   public abstract class_1937 method_37908();
/*     */   
/*     */   @Inject(method = {"method_5660"}, at = {@At("HEAD")})
/*     */   private void setSneaking(boolean sneaking, CallbackInfo ci) {
/*  44 */     if ((class_1297)this instanceof class_1309 && method_5715() != sneaking) {
/*  45 */       CollarItem.playJingleQuestionMark((class_1309)this, true);
/*     */     }
/*     */   }
/*     */   
/*     */   @ModifyReturnValue(at = {@At("RETURN")}, method = {"method_36454", "method_5705"})
/*     */   float clampSeatedYaw(float yaw) {
/*  51 */     return collared$inconspicuousHook(yaw);
/*     */   }
/*     */ 
/*     */   
/*     */   protected float collared$inconspicuousHook(float yaw) {
/*  56 */     return yaw;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ModifyExpressionValue(method = {"method_5724"}, at = {@At(value = "INVOKE", target = "Lnet/minecraft/class_1297;method_18795(Lnet/minecraft/class_243;FF)Lnet/minecraft/class_243;")})
/*     */   private class_243 restrictMovement(class_243 original) {
/*  67 */     if (!method_37908().method_8608() || !((class_1297)this instanceof class_1657)) {
/*  68 */       return original;
/*     */     }
/*  70 */     class_1657 player = (class_1657)this;
/*     */     
/*  72 */     class_1799 collarStack = SlotReference.of((class_1309)player, "collar", 0).getStack();
/*  73 */     if (collarStack == null) return original; 
/*  74 */     if (collarStack.method_57826(ModComponents.SEATED))
/*     */     {
/*  76 */       original = class_243.field_1353;
/*     */     }
/*     */     
/*  79 */     if (!collarStack.method_57826(ModComponents.RESTRAINED)) {
/*  80 */       return original;
/*     */     }
/*     */     
/*  83 */     RestrainedComponent component = (RestrainedComponent)collarStack.method_57824(ModComponents.RESTRAINED);
/*  84 */     class_243 target = component.getTarget(player);
/*  85 */     if (target == null) {
/*  86 */       return original;
/*     */     }
/*     */     
/*  89 */     return component.modifyMoveVector(player.method_37908(), player.method_19538(), target, original);
/*     */   }
/*     */   
/*     */   @ModifyReturnValue(method = {"method_18381", "method_5751"}, at = {@At("TAIL")})
/*     */   float modifyEyeHeight(float original) {
/*  94 */     EntityMixin entityMixin = this; if (entityMixin instanceof class_1309) { class_1309 entity = (class_1309)entityMixin; if (SeatedComponent.is(entity))
/*  95 */         original -= 0.6875F * entity.method_55693();  }
/*     */     
/*  97 */     return original;
/*     */   }
/*     */   @ModifyReturnValue(method = {"method_23320"}, at = {@At("TAIL")})
/*     */   double modifyEyeHeight(double original) {
/* 101 */     EntityMixin entityMixin = this; if (entityMixin instanceof class_1309) { class_1309 entity = (class_1309)entityMixin; if (SeatedComponent.is(entity))
/* 102 */         original -= (0.6875F * entity.method_55693());  }
/*     */     
/* 104 */     return original;
/*     */   }
/*     */ 
/*     */   
/*     */   @Inject(method = {"method_18376"}, at = {@At("HEAD")}, cancellable = true)
/*     */   private void preGetPose(CallbackInfoReturnable<class_4050> cir) {
/* 110 */     EntityMixin entityMixin = this; if (entityMixin instanceof class_1309) { class_1309 entity = (class_1309)entityMixin; if (SeatedComponent.is(entity))
/* 111 */         cir.setReturnValue(class_4050.field_18076);  }
/*     */   
/*     */   }
/*     */ }


/* Location:              C:\Users\Agg\Downloads\EternallyBoundPlus+1.21.1.jar!\dev\enjarai\collared\mixin\EntityMixin.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */