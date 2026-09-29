/*    */ package dev.enjarai.collared.renderer;
/*    */ 
/*    */ import net.minecraft.class_1309;
/*    */ import net.minecraft.class_5603;
/*    */ import net.minecraft.class_5605;
/*    */ import net.minecraft.class_5606;
/*    */ import net.minecraft.class_5607;
/*    */ import net.minecraft.class_5609;
/*    */ import net.minecraft.class_5610;
/*    */ import net.minecraft.class_572;
/*    */ import net.minecraft.class_630;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Model
/*    */   extends class_572<class_1309>
/*    */ {
/*    */   public Model(class_630 root) {
/* 52 */     super(root);
/* 53 */     method_2805(false);
/* 54 */     this.field_3391.field_3665 = true;
/*    */   }
/*    */   
/*    */   public static class_5607 createTexturedModelData() {
/* 58 */     class_5609 modelData = new class_5609();
/* 59 */     class_5610 root = modelData.method_32111();
/* 60 */     class_5610 body = root.method_32117("body", class_5606.method_32108(), class_5603.field_27701);
/* 61 */     body.method_32117("collar", class_5606.method_32108().method_32101(0, 0).method_32098(-3.0F, -24.0F, -2.0F, 6.0F, 3.0F, 4.0F, new class_5605(0.3F)), class_5603.method_32090(0.0F, 24.0F, 0.0F));
/* 62 */     body.method_32117("bell", class_5606.method_32108().method_32101(0, 7).method_32098(-0.5F, -23.0F, -2.75F, 1.0F, 1.0F, 1.0F, new class_5605(0.3F)), class_5603.method_32090(0.0F, 24.0F, 0.0F));
/*    */     
/* 64 */     root.method_32117("head", class_5606.method_32108(), class_5603.field_27701);
/* 65 */     root.method_32117("hat", class_5606.method_32108(), class_5603.field_27701);
/* 66 */     root.method_32117("right_arm", class_5606.method_32108(), class_5603.field_27701);
/* 67 */     root.method_32117("left_arm", class_5606.method_32108(), class_5603.field_27701);
/* 68 */     root.method_32117("right_leg", class_5606.method_32108(), class_5603.field_27701);
/* 69 */     root.method_32117("left_leg", class_5606.method_32108(), class_5603.field_27701);
/*    */     
/* 71 */     return class_5607.method_32110(modelData, 64, 64);
/*    */   }
/*    */ }


/* Location:              C:\Users\Agg\Downloads\EternallyBoundPlus+1.21.1.jar!\dev\enjarai\collared\renderer\CollarRenderer$Model.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */