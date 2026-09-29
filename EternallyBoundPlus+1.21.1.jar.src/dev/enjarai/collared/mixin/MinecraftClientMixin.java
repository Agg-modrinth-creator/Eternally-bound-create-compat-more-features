/*    */ package dev.enjarai.collared.mixin;
/*    */ 
/*    */ import dev.enjarai.collared.item.ModItems;
/*    */ import dev.enjarai.collared.net.LeftClickItemPacket;
/*    */ import dev.enjarai.collared.net.ModNetworking;
/*    */ import net.minecraft.class_1268;
/*    */ import net.minecraft.class_1934;
/*    */ import net.minecraft.class_239;
/*    */ import net.minecraft.class_243;
/*    */ import net.minecraft.class_310;
/*    */ import net.minecraft.class_636;
/*    */ import net.minecraft.class_638;
/*    */ import net.minecraft.class_746;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ import org.spongepowered.asm.mixin.Mixin;
/*    */ import org.spongepowered.asm.mixin.Shadow;
/*    */ import org.spongepowered.asm.mixin.Unique;
/*    */ import org.spongepowered.asm.mixin.injection.At;
/*    */ import org.spongepowered.asm.mixin.injection.Inject;
/*    */ import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
/*    */ import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Mixin({class_310.class})
/*    */ public class MinecraftClientMixin
/*    */ {
/*    */   @Shadow
/*    */   public class_746 field_1724;
/*    */   @Shadow
/*    */   private int field_1752;
/*    */   @Shadow
/*    */   @Nullable
/*    */   public class_636 field_1761;
/*    */   @Shadow
/*    */   @Nullable
/*    */   public class_638 field_1687;
/*    */   @Shadow
/*    */   @Nullable
/*    */   public class_239 field_1765;
/*    */   
/*    */   @Inject(method = {"method_1536"}, at = {@At("HEAD")}, cancellable = true)
/*    */   private void itemLeftClickDetection(CallbackInfoReturnable cir) {
/* 46 */     hand = getHand();
/* 47 */     if (this.field_1724.method_5998((class_1268)hand).method_31573(ModItems.LEASHES_TAG)) {
/* 48 */       if (this.field_1724.method_7357().method_7904(this.field_1724.method_5998((class_1268)hand).method_7909())) {
/* 49 */         cir.setReturnValue(Boolean.valueOf(false));
/*    */         
/*    */         return;
/*    */       } 
/* 53 */       cir.setReturnValue(Boolean.valueOf(true));
/* 54 */       useItem((class_1268)hand);
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   @Inject(method = {"method_1590"}, at = {@At("HEAD")}, cancellable = true)
/*    */   private void itemLeftClickHoldDetection(boolean breaking, CallbackInfo ci) {
/* 61 */     if (!breaking) {
/*    */       return;
/*    */     }
/*    */     
/* 65 */     hand = getHand();
/* 66 */     if (this.field_1724.method_5998((class_1268)hand).method_31573(ModItems.LEASHES_TAG)) {
/* 67 */       ci.cancel();
/*    */       
/* 69 */       if (this.field_1752 == 0) {
/* 70 */         useItem((class_1268)hand);
/*    */       }
/*    */     } 
/*    */   }
/*    */   
/*    */   @Unique
/*    */   private class_1268 getHand() {
/* 77 */     return this.field_1724.method_6047().method_7960() ? class_1268.field_5810 : class_1268.field_5808;
/*    */   }
/*    */   
/*    */   @Unique
/*    */   private void useItem(class_1268 hand) {
/* 82 */     if (this.field_1761.method_2920() != class_1934.field_9219) {
/* 83 */       pos = null;
/* 84 */       entity = null;
/* 85 */       if (this.field_1765 != null) {
/* 86 */         if (this.field_1765.method_17783() == class_239.class_240.field_1332) {
/* 87 */           hit = this.field_1765;
/* 88 */           if (!this.field_1687.method_8320(hit.method_17777()).method_26215()) {
/* 89 */             pos = hit.method_17784();
/*    */           }
/* 91 */         } else if (this.field_1765.method_17783() == class_239.class_240.field_1331) {
/* 92 */           hit = this.field_1765;
/* 93 */           entity = hit.method_17782();
/*    */         } 
/*    */       }
/*    */       
/* 97 */       if (this.field_1724.method_5715()) entity = this.field_1724;  this.field_1752 = 4;
/* 98 */       this.field_1724.method_6104(hand);
/* 99 */       ModNetworking.CHANNEL.clientHandle().send((Record)new LeftClickItemPacket(hand, (class_243)pos, (entity == null) ? null : Integer.valueOf(entity.method_5628())));
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Agg\Downloads\EternallyBoundPlus+1.21.1.jar!\dev\enjarai\collared\mixin\MinecraftClientMixin.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */