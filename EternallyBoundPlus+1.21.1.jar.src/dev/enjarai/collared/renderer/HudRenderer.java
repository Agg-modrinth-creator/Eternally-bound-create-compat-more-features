/*    */ package dev.enjarai.collared.renderer;
/*    */ import dev.enjarai.collared.item.component.LeashModeComponent;
/*    */ import dev.enjarai.collared.item.component.ModComponents;
/*    */ import net.minecraft.class_1657;
/*    */ import net.minecraft.class_1799;
/*    */ import net.minecraft.class_1921;
/*    */ import net.minecraft.class_2561;
/*    */ import net.minecraft.class_310;
/*    */ import net.minecraft.class_332;
/*    */ import net.minecraft.class_4587;
/*    */ import net.minecraft.class_4588;
/*    */ import net.minecraft.class_4597;
/*    */ import net.minecraft.class_4668;
/*    */ import net.minecraft.class_5250;
/*    */ import net.minecraft.class_5253;
/*    */ import org.joml.Matrix4f;
/*    */ 
/*    */ public class HudRenderer {
/* 19 */   public static final class_1921 SELECTOR_LAYER = (class_1921)class_1921.method_24048("collared:selector", class_290.field_1576, class_293.class_5596.field_27382, 786432, 
/*    */       
/* 21 */       class_1921.class_4688.method_23598()
/* 22 */       .method_34578(class_4668.field_44817)
/* 23 */       .method_23615(class_4668.field_21370)
/* 24 */       .method_23604(class_4668.field_21348)
/* 25 */       .method_23603(class_4668.field_21345)
/* 26 */       .method_23617(false));
/*    */ 
/*    */   
/*    */   public static void renderLeashHud(class_332 ctx, class_9779 tickCounter) {
/* 30 */     class_310 client = class_310.method_1551();
/* 31 */     if (client.field_1690.field_1842 || client.field_1755 != null || client.field_1724 == null || !client.field_1724.method_6047().method_31573(ModItems.LEASHES_TAG)) {
/*    */       return;
/*    */     }
/*    */     
/* 35 */     class_1799 stack = client.field_1724.method_6047();
/* 36 */     LeashModeComponent modeComponent = (LeashModeComponent)stack.method_57824(ModComponents.LEASH_MODE);
/*    */     
/* 38 */     if (stack.method_57826(ModComponents.COLLAR_LINK) && modeComponent != null) {
/* 39 */       class_5250 class_5250; int middleX = ctx.method_51421() / 2;
/* 40 */       int middleY = ctx.method_51443() / 2;
/*    */       
/* 42 */       class_1657 player = LeashItem.getCollaredPlayer((class_1937)client.field_1687, (class_1657)client.field_1724, stack);
/*    */ 
/*    */       
/* 45 */       if (player == null) {
/* 46 */         class_5250 = class_2561.method_43469("collared.hud.leash.mode", new Object[] { modeComponent.mode().getHudText() });
/*    */       } else {
/* 48 */         class_1799 collarStack = SlotReference.of((class_1309)player, "collar", 0).getStack();
/*    */         
/* 50 */         class_5250 = class_2561.method_43469("collared.hud.leash.mode", new Object[] { modeComponent.mode().getHudText(collarStack) });
/*    */       } 
/*    */       
/* 53 */       ctx.method_51439(client.field_1772, (class_2561)class_5250, middleX + 10, middleY + 5, -1, true);
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public static void renderQuadrant(class_4587 matrices, class_4597 vertexConsumers, float radius, float angleFrom, float angleTo, int color) {
/* 59 */     float r = class_5253.class_5254.method_27765(color);
/* 60 */     float g = class_5253.class_5254.method_27766(color);
/* 61 */     float b = class_5253.class_5254.method_27767(color);
/* 62 */     Matrix4f matrix4f = matrices.method_23760().method_23761();
/* 63 */     class_4588 vertexConsumer = vertexConsumers.getBuffer(SELECTOR_LAYER);
/* 64 */     vertexConsumer.method_22918(matrix4f, 0.0F, 0.0F, 0.0F).method_22915(r, g, b, 0.8F);
/* 65 */     vertexConsumer.method_22918(matrix4f, 0.0F, 0.0F, 0.0F).method_22915(r, g, b, 0.8F);
/* 66 */     vertexConsumer.method_22918(matrix4f, 
/* 67 */         (float)(Math.sin(angleFrom) * radius), (float)(Math.cos(angleFrom) * radius), 0.0F)
/* 68 */       .method_22915(r, g, b, 0.6F);
/* 69 */     vertexConsumer.method_22918(matrix4f, 
/* 70 */         (float)(Math.sin(angleTo) * radius), (float)(Math.cos(angleTo) * radius), 0.0F)
/* 71 */       .method_22915(r, g, b, 0.6F);
/*    */   }
/*    */ }


/* Location:              C:\Users\Agg\Downloads\EternallyBoundPlus+1.21.1.jar!\dev\enjarai\collared\renderer\HudRenderer.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */