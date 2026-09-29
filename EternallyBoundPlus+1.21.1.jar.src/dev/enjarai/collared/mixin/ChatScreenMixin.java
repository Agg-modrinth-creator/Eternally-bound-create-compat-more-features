/*    */ package dev.enjarai.collared.mixin;
/*    */ 
/*    */ import dev.enjarai.collared.item.component.CollarSettingsComponent;
/*    */ import dev.enjarai.collared.item.component.ModComponents;
/*    */ import io.wispforest.accessories.api.slot.SlotReference;
/*    */ import net.minecraft.class_1309;
/*    */ import net.minecraft.class_1799;
/*    */ import net.minecraft.class_310;
/*    */ import net.minecraft.class_342;
/*    */ import net.minecraft.class_408;
/*    */ import org.spongepowered.asm.mixin.Mixin;
/*    */ import org.spongepowered.asm.mixin.Shadow;
/*    */ import org.spongepowered.asm.mixin.injection.At;
/*    */ import org.spongepowered.asm.mixin.injection.Inject;
/*    */ import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
/*    */ 
/*    */ @Mixin({class_408.class})
/*    */ public class ChatScreenMixin
/*    */ {
/*    */   @Shadow
/*    */   protected class_342 field_2382;
/*    */   
/*    */   @Inject(method = {"method_23945"}, at = {@At("HEAD")}, cancellable = true)
/*    */   private void meow(String chatText, CallbackInfo ci) {
/* 25 */     if ((class_310.method_1551()).field_1724 == null) {
/*    */       return;
/*    */     }
/*    */     
/* 29 */     class_1799 collarStack = SlotReference.of((class_1309)(class_310.method_1551()).field_1724, "collar", 0).getStack();
/* 30 */     if (collarStack == null || !collarStack.method_57826(ModComponents.GAGGED)) {
/*    */       return;
/*    */     }
/*    */     
/* 34 */     CollarSettingsComponent component = (CollarSettingsComponent)collarStack.method_57824(ModComponents.COLLAR_SETTINGS);
/*    */     
/* 36 */     String meow = component.gagify(chatText);
/* 37 */     if (!meow.equals(chatText)) {
/* 38 */       this.field_2382.method_1852(meow);
/* 39 */       ci.cancel();
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Agg\Downloads\EternallyBoundPlus+1.21.1.jar!\dev\enjarai\collared\mixin\ChatScreenMixin.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */