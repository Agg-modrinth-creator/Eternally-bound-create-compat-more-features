/*    */ package dev.enjarai.collared;
/*    */ import dev.enjarai.collared.item.component.ModComponents;
/*    */ import dev.enjarai.collared.net.ModNetworking;
/*    */ import dev.enjarai.collared.net.ScrollLeashPacket;
/*    */ import net.minecraft.class_1657;
/*    */ import net.minecraft.class_746;
/*    */ 
/*    */ public class ModKeyBindings {
/*    */   public static boolean interceptScroll(float amount) {
/* 10 */     class_746 player = (class_310.method_1551()).field_1724;
/* 11 */     if (player != null && player
/* 12 */       .method_5715() && (player
/* 13 */       .method_6047().method_57826(ModComponents.LEASH_MODE) || player.method_6079().method_57826(ModComponents.LEASH_MODE))) {
/*    */       
/* 15 */       ScrollLeashPacket packet = new ScrollLeashPacket(-amount);
/* 16 */       packet.handleCommon((class_1657)player);
/* 17 */       ModNetworking.CHANNEL.clientHandle().send((Record)packet);
/* 18 */       return true;
/*    */     } 
/* 20 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\Agg\Downloads\EternallyBoundPlus+1.21.1.jar!\dev\enjarai\collared\ModKeyBindings.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */