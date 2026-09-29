/*    */ package dev.enjarai.collared.net;
/*    */ 
/*    */ import dev.enjarai.collared.Collared;
/*    */ import io.wispforest.owo.network.OwoNetChannel;
/*    */ 
/*    */ public class ModNetworking {
/*  7 */   public static final OwoNetChannel CHANNEL = OwoNetChannel.create(Collared.id("main"));
/*    */   
/*    */   public static void register() {
/* 10 */     CHANNEL.registerServerbound(ScrollLeashPacket.class, ScrollLeashPacket::handleServer);
/* 11 */     CHANNEL.registerServerbound(LeftClickItemPacket.class, LeftClickItemPacket.ENDEC, LeftClickItemPacket::handleServer);
/* 12 */     CHANNEL.registerServerbound(SelectLeashModePacket.class, SelectLeashModePacket::handleServer);
/* 13 */     CHANNEL.registerServerbound(UpdateCollarSettingsPacket.class, UpdateCollarSettingsPacket::handleServer);
/*    */     
/* 15 */     CHANNEL.registerClientboundDeferred(YankPacket.class, YankPacket.ENDEC);
/* 16 */     CHANNEL.registerClientboundDeferred(BeginEditingCollarClientboundPacket.class);
/*    */   }
/*    */ }


/* Location:              C:\Users\Agg\Downloads\EternallyBoundPlus+1.21.1.jar!\dev\enjarai\collared\net\ModNetworking.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */