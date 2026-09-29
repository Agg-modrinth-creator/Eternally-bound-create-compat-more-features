/*    */ package dev.enjarai.collared.mixin;
/*    */ import dev.enjarai.collared.item.component.CollarSettingsComponent;
/*    */ import dev.enjarai.collared.item.component.ModComponents;
/*    */ import io.wispforest.accessories.api.slot.SlotReference;
/*    */ import net.minecraft.class_1297;
/*    */ import net.minecraft.class_1309;
/*    */ import net.minecraft.class_1799;
/*    */ import net.minecraft.class_4184;
/*    */ import net.minecraft.class_761;
/*    */ import org.spongepowered.asm.mixin.Mixin;
/*    */ import org.spongepowered.asm.mixin.injection.At;
/*    */ import org.spongepowered.asm.mixin.injection.Inject;
/*    */ import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
/*    */ 
/*    */ @Mixin({class_761.class})
/*    */ public class WorldRendererMixin {
/*    */   @Inject(at = {@At("HEAD")}, method = {"method_43788"}, cancellable = true)
/*    */   void mightHaveBlindnessFromCollar(class_4184 camera, CallbackInfoReturnable<Boolean> cir) {
/* 19 */     class_1297 class_1297 = camera.method_19331(); if (class_1297 instanceof class_1309) { class_1309 l = (class_1309)class_1297;
/* 20 */       class_1799 c = SlotReference.of(l, "collar", 0).getStack();
/* 21 */       if (c != null) {
/* 22 */         CollarSettingsComponent s = (CollarSettingsComponent)c.method_57824(ModComponents.COLLAR_SETTINGS);
/* 23 */         if (s != null && s.blindness())
/* 24 */           cir.setReturnValue(Boolean.valueOf(true)); 
/*    */       }  }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Agg\Downloads\EternallyBoundPlus+1.21.1.jar!\dev\enjarai\collared\mixin\WorldRendererMixin.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */