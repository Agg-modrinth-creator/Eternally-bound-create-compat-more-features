/*    */ package dev.enjarai.collared.mixin;
/*    */ import dev.enjarai.collared.item.component.ModComponents;
/*    */ import dev.enjarai.collared.item.component.RestrainedComponent;
/*    */ import dev.ryanhcode.sable.companion.SableCompanion;
/*    */ import io.wispforest.accessories.api.slot.SlotReference;
/*    */ import net.minecraft.class_1309;
/*    */ import net.minecraft.class_1657;
/*    */ import net.minecraft.class_1799;
/*    */ import net.minecraft.class_1922;
/*    */ import net.minecraft.class_1937;
/*    */ import net.minecraft.class_2338;
/*    */ import net.minecraft.class_2350;
/*    */ import net.minecraft.class_2374;
/*    */ import net.minecraft.class_243;
/*    */ import net.minecraft.class_2680;
/*    */ import net.minecraft.class_3218;
/*    */ import net.minecraft.class_3222;
/*    */ import net.minecraft.class_5454;
/*    */ import org.spongepowered.asm.mixin.Mixin;
/*    */ import org.spongepowered.asm.mixin.Shadow;
/*    */ import org.spongepowered.asm.mixin.injection.At;
/*    */ import org.spongepowered.asm.mixin.injection.Inject;
/*    */ import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
/*    */ 
/*    */ @Mixin({class_3222.class})
/*    */ public abstract class ServerPlayerEntityMixin {
/*    */   @Inject(method = {"method_60590"}, at = {@At("HEAD")}, cancellable = true)
/*    */   private void redirectRespawn(boolean alive, class_5454.class_9823 postDimensionTransition, CallbackInfoReturnable<class_5454> cir) {
/* 29 */     class_1799 collarStack = SlotReference.of((class_1309)this, "collar", 0).getStack();
/* 30 */     if (collarStack == null || !collarStack.method_57826(ModComponents.RESTRAINED) || !collarStack.method_57826(ModComponents.LOCKED)) {
/*    */       return;
/*    */     }
/*    */     
/* 34 */     RestrainedComponent component = (RestrainedComponent)collarStack.method_57824(ModComponents.RESTRAINED);
/*    */     
/* 36 */     class_243 target = component.getTarget((class_1657)this);
/* 37 */     if (target == null) {
/*    */       return;
/*    */     }
/*    */     
/* 41 */     class_2338 blockTarget = class_2338.method_49638((class_2374)target);
/* 42 */     for (class_2338 pos : class_2338.method_25996(blockTarget, 8, 8, 8)) {
/* 43 */       class_2680 standingState = method_51469().method_8320(pos.method_10074());
/* 44 */       boolean standingValid = standingState.method_26206((class_1922)method_51469(), pos.method_10074(), class_2350.field_11036);
/* 45 */       class_2680 feetState = method_51469().method_8320(pos);
/* 46 */       boolean feetValid = feetState.method_26204().method_9538(feetState);
/* 47 */       class_2680 headState = method_51469().method_8320(pos.method_10084());
/* 48 */       boolean headValid = headState.method_26204().method_9538(headState);
/*    */       
/* 50 */       if (standingValid && feetValid && headValid) {
/* 51 */         cir.setReturnValue(new class_5454(method_51469(), SableCompanion.INSTANCE.projectOutOfSubLevel((class_1937)method_51469(), (class_2374)pos.method_61082()), class_243.field_1353, 0.0F, 0.0F, postDimensionTransition));
/*    */         return;
/*    */       } 
/*    */     } 
/*    */   }
/*    */   
/*    */   @Shadow
/*    */   public abstract class_3218 method_51469();
/*    */ }


/* Location:              C:\Users\Agg\Downloads\EternallyBoundPlus+1.21.1.jar!\dev\enjarai\collared\mixin\ServerPlayerEntityMixin.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */