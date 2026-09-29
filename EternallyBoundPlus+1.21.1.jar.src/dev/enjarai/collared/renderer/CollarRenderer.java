/*    */ package dev.enjarai.collared.renderer;
/*    */ import io.wispforest.accessories.api.slot.SlotReference;
/*    */ import java.util.function.Supplier;
/*    */ import net.minecraft.class_1309;
/*    */ import net.minecraft.class_1799;
/*    */ import net.minecraft.class_2960;
/*    */ import net.minecraft.class_4587;
/*    */ import net.minecraft.class_4588;
/*    */ import net.minecraft.class_4597;
/*    */ import net.minecraft.class_4608;
/*    */ import net.minecraft.class_5603;
/*    */ import net.minecraft.class_5605;
/*    */ import net.minecraft.class_5606;
/*    */ import net.minecraft.class_5607;
/*    */ import net.minecraft.class_5609;
/*    */ import net.minecraft.class_5610;
/*    */ import net.minecraft.class_572;
/*    */ import net.minecraft.class_583;
/*    */ import net.minecraft.class_630;
/*    */ import net.minecraft.class_7923;
/*    */ import net.minecraft.class_897;
/*    */ import net.minecraft.class_922;
/*    */ 
/*    */ public class CollarRenderer implements AccessoryRenderer {
/* 25 */   private static final Supplier<class_572<class_1309>> MODEL = (Supplier<class_572<class_1309>>)Suppliers.memoize(() -> new Model(Model.createTexturedModelData().method_32109()));
/*    */ 
/*    */ 
/*    */   
/*    */   public <M extends class_1309> void render(class_1799 itemStack, SlotReference slotReference, class_4587 matrixStack, class_583<M> entityModel, class_4597 vertexConsumerProvider, int light, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
/* 30 */     class_572<class_1309> model = MODEL.get();
/* 31 */     model.method_17087(slotReference.entity(), limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
/* 32 */     model.method_17086(slotReference.entity(), limbSwing, limbSwingAmount, ageInTicks);
/* 33 */     followBodyRotations(slotReference.entity(), model);
/*    */     
/* 35 */     class_2960 itemId = class_7923.field_41178.method_10221(itemStack.method_7909());
/* 36 */     class_2960 textureId = itemId.method_45138("textures/entity/").method_48331(".png");
/*    */     
/* 38 */     class_4588 consumer = vertexConsumerProvider.getBuffer(model.method_23500(textureId));
/* 39 */     model.method_60879(matrixStack, consumer, light, class_4608.field_21444);
/*    */   }
/*    */   
/*    */   private static void followBodyRotations(class_1309 entity, class_572<class_1309> model) {
/* 43 */     class_897<? super class_1309> render = class_310.method_1551().method_1561().method_3953((class_1297)entity);
/*    */     
/* 45 */     if (render instanceof class_922) { class_922<?, ?> renderer = (class_922)render; class_583 class_583 = renderer.method_4038(); if (class_583 instanceof class_572) { class_572<?> entityModel = (class_572)class_583;
/* 46 */         entityModel.method_2818(model); }
/*    */        }
/*    */   
/*    */   }
/*    */   
/*    */   public static class Model extends class_572<class_1309> { public Model(class_630 root) {
/* 52 */       super(root);
/* 53 */       method_2805(false);
/* 54 */       this.field_3391.field_3665 = true;
/*    */     }
/*    */     
/*    */     public static class_5607 createTexturedModelData() {
/* 58 */       class_5609 modelData = new class_5609();
/* 59 */       class_5610 root = modelData.method_32111();
/* 60 */       class_5610 body = root.method_32117("body", class_5606.method_32108(), class_5603.field_27701);
/* 61 */       body.method_32117("collar", class_5606.method_32108().method_32101(0, 0).method_32098(-3.0F, -24.0F, -2.0F, 6.0F, 3.0F, 4.0F, new class_5605(0.3F)), class_5603.method_32090(0.0F, 24.0F, 0.0F));
/* 62 */       body.method_32117("bell", class_5606.method_32108().method_32101(0, 7).method_32098(-0.5F, -23.0F, -2.75F, 1.0F, 1.0F, 1.0F, new class_5605(0.3F)), class_5603.method_32090(0.0F, 24.0F, 0.0F));
/*    */       
/* 64 */       root.method_32117("head", class_5606.method_32108(), class_5603.field_27701);
/* 65 */       root.method_32117("hat", class_5606.method_32108(), class_5603.field_27701);
/* 66 */       root.method_32117("right_arm", class_5606.method_32108(), class_5603.field_27701);
/* 67 */       root.method_32117("left_arm", class_5606.method_32108(), class_5603.field_27701);
/* 68 */       root.method_32117("right_leg", class_5606.method_32108(), class_5603.field_27701);
/* 69 */       root.method_32117("left_leg", class_5606.method_32108(), class_5603.field_27701);
/*    */       
/* 71 */       return class_5607.method_32110(modelData, 64, 64);
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\Agg\Downloads\EternallyBoundPlus+1.21.1.jar!\dev\enjarai\collared\renderer\CollarRenderer.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */