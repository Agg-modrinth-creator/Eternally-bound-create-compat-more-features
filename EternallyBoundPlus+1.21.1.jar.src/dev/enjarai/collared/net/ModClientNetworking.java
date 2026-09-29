/*    */ package dev.enjarai.collared.net;
/*    */ import dev.enjarai.collared.screen.CollarScreen;
/*    */ import io.wispforest.owo.network.ClientAccess;
/*    */ import net.minecraft.class_243;
/*    */ import net.minecraft.class_437;
/*    */ import net.minecraft.class_746;
/*    */ 
/*    */ public class ModClientNetworking {
/*    */   public static void register() {
/* 10 */     ModNetworking.CHANNEL.registerClientbound(YankPacket.class, YankPacket.ENDEC, (packet, access) -> {
/*    */           class_746 player = access.player();
/*    */           
/*    */           class_243 difference = packet.to().method_1020(player.method_19538());
/*    */           double distance = difference.method_1033();
/*    */           class_243 velocity = (distance > 1.0D) ? difference.method_1029() : difference;
/*    */           player.method_60491(velocity);
/*    */         });
/* 18 */     ModNetworking.CHANNEL.registerClientbound(BeginEditingCollarClientboundPacket.class, (packet, access) -> access.runtime().method_1507((class_437)new CollarScreen(null, packet.collar(), true, packet.initialSettings())));
/*    */   }
/*    */ }


/* Location:              C:\Users\Agg\Downloads\EternallyBoundPlus+1.21.1.jar!\dev\enjarai\collared\net\ModClientNetworking.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */