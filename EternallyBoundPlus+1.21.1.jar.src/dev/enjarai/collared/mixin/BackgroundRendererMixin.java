/*    */ package dev.enjarai.collared.mixin;
/*    */ 
/*    */ import com.llamalad7.mixinextras.sugar.Local;
/*    */ import dev.enjarai.collared.item.component.CollarSettingsComponent;
/*    */ import dev.enjarai.collared.item.component.ModComponents;
/*    */ import io.wispforest.accessories.api.slot.SlotReference;
/*    */ import io.wispforest.owo.ui.core.Color;
/*    */ import net.minecraft.class_1297;
/*    */ import net.minecraft.class_1309;
/*    */ import net.minecraft.class_1799;
/*    */ import net.minecraft.class_4184;
/*    */ import net.minecraft.class_6854;
/*    */ import net.minecraft.class_758;
/*    */ import org.spongepowered.asm.mixin.Mixin;
/*    */ import org.spongepowered.asm.mixin.Shadow;
/*    */ import org.spongepowered.asm.mixin.injection.At;
/*    */ import org.spongepowered.asm.mixin.injection.ModifyArg;
/*    */ import org.spongepowered.asm.mixin.injection.ModifyArgs;
/*    */ import org.spongepowered.asm.mixin.injection.invoke.arg.Args;
/*    */ 
/*    */ @Mixin({class_758.class})
/*    */ public class BackgroundRendererMixin {
/*    */   @Shadow
/*    */   private static float field_4034;
/*    */   
/*    */   @ModifyArg(method = {"method_3211"}, at = @At(value = "INVOKE", target = "Lcom/mojang/blaze3d/systems/RenderSystem;setShaderFogStart(F)V"))
/*    */   private static float blindnessAlterFogStart(float shaderFogStart, @Local(argsOnly = true) class_4184 camera) {
/* 28 */     class_1297 class_1297 = camera.method_19331(); if (class_1297 instanceof class_1309) { class_1309 l = (class_1309)class_1297;
/* 29 */       class_1799 c = SlotReference.of(l, "collar", 0).getStack();
/* 30 */       if (c != null) {
/* 31 */         CollarSettingsComponent s = (CollarSettingsComponent)c.method_57824(ModComponents.COLLAR_SETTINGS);
/* 32 */         if (s != null && s.blindness()) {
/* 33 */           return 0.0F;
/*    */         }
/*    */       }  }
/*    */     
/* 37 */     return shaderFogStart; } @Shadow
/*    */   private static float field_4033; @Shadow
/*    */   private static float field_4032; @ModifyArg(method = {"method_3211"}, at = @At(value = "INVOKE", target = "Lcom/mojang/blaze3d/systems/RenderSystem;setShaderFogEnd(F)V"))
/*    */   private static float blindnessAlterFogEnd(float shaderFogEnd, @Local(argsOnly = true) class_4184 camera) {
/* 41 */     class_1297 class_1297 = camera.method_19331(); if (class_1297 instanceof class_1309) { class_1309 l = (class_1309)class_1297;
/* 42 */       class_1799 c = SlotReference.of(l, "collar", 0).getStack();
/* 43 */       if (c != null) {
/* 44 */         CollarSettingsComponent s = (CollarSettingsComponent)c.method_57824(ModComponents.COLLAR_SETTINGS);
/* 45 */         if (s != null && s.blindness()) {
/* 46 */           return s.blindnessDistance();
/*    */         }
/*    */       }  }
/*    */     
/* 50 */     return shaderFogEnd;
/*    */   }
/*    */   @ModifyArg(method = {"method_3211"}, at = @At(value = "INVOKE", target = "Lcom/mojang/blaze3d/systems/RenderSystem;setShaderFogShape(Lnet/minecraft/class_6854;)V"))
/*    */   private static class_6854 blindnessAlterFogShape(class_6854 shaderFogShape, @Local(argsOnly = true) class_4184 camera) {
/* 54 */     class_1297 class_1297 = camera.method_19331(); if (class_1297 instanceof class_1309) { class_1309 l = (class_1309)class_1297;
/* 55 */       class_1799 c = SlotReference.of(l, "collar", 0).getStack();
/* 56 */       if (c != null) {
/* 57 */         CollarSettingsComponent s = (CollarSettingsComponent)c.method_57824(ModComponents.COLLAR_SETTINGS);
/* 58 */         if (s != null && s.blindness()) {
/* 59 */           return class_6854.field_36350;
/*    */         }
/*    */       }  }
/*    */     
/* 63 */     return shaderFogShape;
/*    */   }
/*    */   @ModifyArgs(method = {"method_3210"}, at = @At(value = "INVOKE", target = "Lcom/mojang/blaze3d/systems/RenderSystem;clearColor(FFFF)V"))
/*    */   private static void modifyFogColour(Args args, @Local class_4184 camera) {
/* 67 */     class_1297 class_1297 = camera.method_19331(); if (class_1297 instanceof class_1309) { class_1309 l = (class_1309)class_1297;
/* 68 */       class_1799 c = SlotReference.of(l, "collar", 0).getStack();
/* 69 */       if (c != null) {
/* 70 */         CollarSettingsComponent s = (CollarSettingsComponent)c.method_57824(ModComponents.COLLAR_SETTINGS);
/* 71 */         if (s != null && s.blindness()) {
/* 72 */           Color colour = s.blindnessColor();
/* 73 */           args.setAll(new Object[] { Float.valueOf(field_4034 = colour.red()), Float.valueOf(field_4033 = colour.green()), Float.valueOf(field_4032 = colour.blue()), Float.valueOf(colour.alpha()) });
/*    */         } 
/*    */       }  }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Agg\Downloads\EternallyBoundPlus+1.21.1.jar!\dev\enjarai\collared\mixin\BackgroundRendererMixin.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */