/*    */ package dev.enjarai.collared.mixin;
/*    */ 
/*    */ import dev.enjarai.collared.item.component.SeatedComponent;
/*    */ import net.minecraft.class_1299;
/*    */ import net.minecraft.class_1309;
/*    */ import net.minecraft.class_1937;
/*    */ import net.minecraft.class_744;
/*    */ import net.minecraft.class_746;
/*    */ import org.spongepowered.asm.mixin.Mixin;
/*    */ import org.spongepowered.asm.mixin.Shadow;
/*    */ import org.spongepowered.asm.mixin.injection.At;
/*    */ import org.spongepowered.asm.mixin.injection.Inject;
/*    */ import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
/*    */ 
/*    */ @Mixin({class_746.class})
/*    */ public abstract class ClientPlayerEntityMixin
/*    */   extends class_1309
/*    */ {
/*    */   protected ClientPlayerEntityMixin(class_1299<? extends class_1309> entityType, class_1937 world) {
/* 20 */     super(entityType, world);
/*    */   } @Shadow
/*    */   public class_744 field_3913;
/*    */   @Inject(at = {@At(value = "INVOKE", target = "Lnet/minecraft/class_744;method_3129(ZF)V", shift = At.Shift.AFTER)}, method = {"method_6007"})
/*    */   void clearInputs(CallbackInfo ci) {
/* 25 */     if (SeatedComponent.is(this)) {
/* 26 */       this.field_3913.field_3905 = 0.0F;
/* 27 */       this.field_3913.field_3907 = 0.0F;
/* 28 */       this.field_3913.field_3909 = false;
/* 29 */       this.field_3913.field_3910 = false;
/* 30 */       this.field_3913.field_3908 = false;
/* 31 */       this.field_3913.field_3906 = false;
/* 32 */       this.field_3913.field_3904 = false;
/* 33 */       this.field_3913.field_3903 = false;
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Agg\Downloads\EternallyBoundPlus+1.21.1.jar!\dev\enjarai\collared\mixin\ClientPlayerEntityMixin.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */