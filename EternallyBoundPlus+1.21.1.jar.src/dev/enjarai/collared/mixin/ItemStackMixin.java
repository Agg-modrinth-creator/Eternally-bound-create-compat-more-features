/*    */ package dev.enjarai.collared.mixin;
/*    */ 
/*    */ import com.llamalad7.mixinextras.sugar.Local;
/*    */ import dev.enjarai.collared.item.component.ModComponents;
/*    */ import io.wispforest.accessories.api.slot.SlotReference;
/*    */ import java.util.List;
/*    */ import net.minecraft.class_124;
/*    */ import net.minecraft.class_1309;
/*    */ import net.minecraft.class_1657;
/*    */ import net.minecraft.class_1792;
/*    */ import net.minecraft.class_1799;
/*    */ import net.minecraft.class_1836;
/*    */ import net.minecraft.class_2561;
/*    */ import net.minecraft.class_2583;
/*    */ import net.minecraft.class_9322;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ import org.spongepowered.asm.mixin.Mixin;
/*    */ import org.spongepowered.asm.mixin.Shadow;
/*    */ import org.spongepowered.asm.mixin.injection.At;
/*    */ import org.spongepowered.asm.mixin.injection.Inject;
/*    */ import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Mixin({class_1799.class})
/*    */ public abstract class ItemStackMixin
/*    */   implements class_9322
/*    */ {
/*    */   @Shadow
/*    */   public abstract class_1792 method_7909();
/*    */   
/*    */   @Inject(method = {"method_7950"}, at = {@At(value = "RETURN", ordinal = 1)})
/*    */   private void getTooltip(class_1792.class_9635 context, @Nullable class_1657 player, class_1836 type, CallbackInfoReturnable<List<class_2561>> cir, @Local List<class_2561> tooltip) {
/* 36 */     if (player != null && method_7909() instanceof dev.enjarai.collared.item.CollarItem && !method_57826(ModComponents.LOCKED)) {
/* 37 */       class_1799 collarStack = SlotReference.of((class_1309)player, "collar", 0).getStack();
/*    */       
/* 39 */       if (this == collarStack) {
/* 40 */         tooltip.add(class_2561.method_43473());
/* 41 */         tooltip.add(class_2561.method_43471("collared.tooltip.collar_settings").method_10862(class_2583.field_24360.method_10977(class_124.field_1080)));
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Agg\Downloads\EternallyBoundPlus+1.21.1.jar!\dev\enjarai\collared\mixin\ItemStackMixin.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */