/*    */ package dev.enjarai.collared.mixin;
/*    */ 
/*    */ import dev.enjarai.collared.item.component.SeatedComponent;
/*    */ import java.util.function.Predicate;
/*    */ import net.minecraft.class_1263;
/*    */ import net.minecraft.class_1309;
/*    */ import net.minecraft.class_1657;
/*    */ import net.minecraft.class_1661;
/*    */ import net.minecraft.class_1799;
/*    */ import org.spongepowered.asm.mixin.Final;
/*    */ import org.spongepowered.asm.mixin.Mixin;
/*    */ import org.spongepowered.asm.mixin.Shadow;
/*    */ import org.spongepowered.asm.mixin.injection.At;
/*    */ import org.spongepowered.asm.mixin.injection.Inject;
/*    */ import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
/*    */ import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
/*    */ 
/*    */ 
/*    */ @Mixin({class_1661.class})
/*    */ public class PlayerInventoryMixin
/*    */ {
/*    */   @Inject(at = {@At("HEAD")}, method = {"method_7391"}, cancellable = true)
/*    */   void noMainPawStackWhileSeated(CallbackInfoReturnable<class_1799> cir) {
/* 24 */     if (SeatedComponent.is((class_1309)this.field_7546)) cir.setReturnValue(class_1799.field_8037); 
/*    */   } @Shadow
/*    */   @Final
/*    */   public class_1657 field_7546; @Inject(at = {@At("HEAD")}, method = {"method_32338"}, cancellable = true)
/*    */   void noOfferWhileSeated(class_1799 stack, boolean notifiesClient, CallbackInfo ci) {
/* 29 */     if (SeatedComponent.is((class_1309)this.field_7546)) ci.cancel(); 
/*    */   }
/*    */   
/*    */   @Inject(at = {@At("HEAD")}, method = {"method_29280"}, cancellable = true)
/*    */   void noRemoveWhileSeated(Predicate<class_1799> shouldRemove, int maxCount, class_1263 craftingInventory, CallbackInfoReturnable<Integer> cir) {
/* 34 */     if (SeatedComponent.is((class_1309)this.field_7546)) cir.cancel(); 
/*    */   }
/*    */   
/*    */   @Inject(at = {@At("HEAD")}, method = {"method_5441"}, cancellable = true)
/*    */   void noRemoveWhileSeated(int slot, CallbackInfoReturnable<class_1799> cir) {
/* 39 */     if (SeatedComponent.is((class_1309)this.field_7546)) cir.setReturnValue(class_1799.field_8037); 
/*    */   }
/*    */   
/*    */   @Inject(at = {@At("HEAD")}, method = {"method_5434"}, cancellable = true)
/*    */   void noRemoveWhileSeated(int slot, int amount, CallbackInfoReturnable<class_1799> cir) {
/* 44 */     if (SeatedComponent.is((class_1309)this.field_7546)) cir.setReturnValue(class_1799.field_8037); 
/*    */   }
/*    */   
/*    */   @Inject(at = {@At("HEAD")}, method = {"method_7367"}, cancellable = true)
/*    */   void noInsertWhileSeated(int slot, class_1799 stack, CallbackInfoReturnable<Boolean> cir) {
/* 49 */     if (SeatedComponent.is((class_1309)this.field_7546)) cir.setReturnValue(Boolean.valueOf(false)); 
/*    */   }
/*    */ }


/* Location:              C:\Users\Agg\Downloads\EternallyBoundPlus+1.21.1.jar!\dev\enjarai\collared\mixin\PlayerInventoryMixin.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */