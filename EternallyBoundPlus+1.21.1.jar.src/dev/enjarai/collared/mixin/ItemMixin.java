/*    */ package dev.enjarai.collared.mixin;
/*    */ 
/*    */ import dev.enjarai.collared.item.ModItems;
/*    */ import dev.enjarai.collared.item.component.CollarLinkComponent;
/*    */ import dev.enjarai.collared.item.component.ModComponents;
/*    */ import io.wispforest.accessories.api.slot.SlotReference;
/*    */ import net.minecraft.class_1268;
/*    */ import net.minecraft.class_1269;
/*    */ import net.minecraft.class_1309;
/*    */ import net.minecraft.class_1657;
/*    */ import net.minecraft.class_1792;
/*    */ import net.minecraft.class_1799;
/*    */ import net.minecraft.class_1839;
/*    */ import net.minecraft.class_1937;
/*    */ import org.spongepowered.asm.mixin.Mixin;
/*    */ import org.spongepowered.asm.mixin.Shadow;
/*    */ import org.spongepowered.asm.mixin.injection.At;
/*    */ import org.spongepowered.asm.mixin.injection.Inject;
/*    */ import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
/*    */ 
/*    */ @Mixin({class_1792.class})
/*    */ public abstract class ItemMixin {
/*    */   @Shadow
/*    */   public abstract class_1799 method_7861(class_1799 paramclass_1799, class_1937 paramclass_1937, class_1309 paramclass_1309);
/*    */   
/*    */   @Inject(at = {@At("HEAD")}, method = {"method_7847"}, cancellable = true)
/*    */   void useFoodOnPets(class_1799 stack, class_1657 user, class_1309 entity, class_1268 hand, CallbackInfoReturnable<class_1269> cir) {
/*    */     class_1657 pet;
/* 29 */     if (hand != class_1268.field_5808)
/* 30 */       return;  class_1799 offhand = user.method_6079();
/* 31 */     if (!offhand.method_31573(ModItems.LEASHES_TAG))
/* 32 */       return;  CollarLinkComponent leashLink = (CollarLinkComponent)offhand.method_57824(ModComponents.COLLAR_LINK);
/* 33 */     if (leashLink == null)
/* 34 */       return;  class_1839 use = method_7853(stack);
/* 35 */     if (use != class_1839.field_8950 && use != class_1839.field_8946)
/* 36 */       return;  if (entity instanceof class_1657) { pet = (class_1657)entity; } else { return; }
/* 37 */      class_1799 collarStack = SlotReference.of((class_1309)pet, "collar", 0).getStack();
/* 38 */     if (collarStack == null)
/* 39 */       return;  CollarLinkComponent collarLink = (CollarLinkComponent)offhand.method_57824(ModComponents.COLLAR_LINK);
/* 40 */     if (collarLink == null)
/* 41 */       return;  if (!collarLink.uuid().equals(leashLink.uuid()))
/* 42 */       return;  if (!(pet.method_37908()).field_9236) method_7861(stack, pet.method_37908(), (class_1309)pet); 
/* 43 */     cir.setReturnValue(class_1269.field_21466);
/*    */   }
/*    */   
/*    */   @Shadow
/*    */   public abstract class_1839 method_7853(class_1799 paramclass_1799);
/*    */ }


/* Location:              C:\Users\Agg\Downloads\EternallyBoundPlus+1.21.1.jar!\dev\enjarai\collared\mixin\ItemMixin.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */