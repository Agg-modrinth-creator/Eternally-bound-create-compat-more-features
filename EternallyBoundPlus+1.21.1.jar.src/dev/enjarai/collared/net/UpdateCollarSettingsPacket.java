/*    */ package dev.enjarai.collared.net;
/*    */ 
/*    */ import com.mojang.datafixers.util.Pair;
/*    */ import dev.enjarai.collared.item.component.CollarSettingsComponent;
/*    */ import dev.enjarai.collared.item.component.ModComponents;
/*    */ import io.wispforest.owo.network.ServerAccess;
/*    */ import java.util.Optional;
/*    */ import net.minecraft.class_1661;
/*    */ import net.minecraft.class_1799;
/*    */ import net.minecraft.class_3222;
/*    */ 
/*    */ public final class UpdateCollarSettingsPacket extends Record {
/*    */   private final Optional<UUID> collar;
/*    */   private final CollarSettingsComponent settings;
/*    */   
/* 16 */   public UpdateCollarSettingsPacket(Optional<UUID> collar, CollarSettingsComponent settings) { this.collar = collar; this.settings = settings; } public final String toString() { // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: <illegal opcode> toString : (Ldev/enjarai/collared/net/UpdateCollarSettingsPacket;)Ljava/lang/String;
/*    */     //   6: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #16	-> 0
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/* 16 */     //   0	7	0	this	Ldev/enjarai/collared/net/UpdateCollarSettingsPacket; } public Optional<UUID> collar() { return this.collar; } public final int hashCode() { // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: <illegal opcode> hashCode : (Ldev/enjarai/collared/net/UpdateCollarSettingsPacket;)I
/*    */     //   6: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #16	-> 0
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	7	0	this	Ldev/enjarai/collared/net/UpdateCollarSettingsPacket; } public final boolean equals(Object o) { // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: aload_1
/*    */     //   2: <illegal opcode> equals : (Ldev/enjarai/collared/net/UpdateCollarSettingsPacket;Ljava/lang/Object;)Z
/*    */     //   7: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #16	-> 0
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	8	0	this	Ldev/enjarai/collared/net/UpdateCollarSettingsPacket;
/* 16 */     //   0	8	1	o	Ljava/lang/Object; } public CollarSettingsComponent settings() { return this.settings; }
/*    */    public void handleServer(ServerAccess access) {
/* 18 */     if (this.settings.gagString().length() > 16) {
/*    */       return;
/*    */     }
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
/* 41 */     Optional<Pair<class_3222, class_1799>> collarStack = (this.collar.isEmpty() ? Stream.<T>of((T)access.player()) : access.runtime().method_3760().method_14571().stream().unordered()).<Pair<class_3222, class_1799>>map(p -> new Pair(p, SlotReference.of((class_1309)p, "collar", 0).getStack())).filter(s -> (s.getSecond() != null && (this.collar.isEmpty() || (((class_1799)s.getSecond()).method_57826(ModComponents.COLLAR_LINK) && ((CollarLinkComponent)((class_1799)s.getSecond()).method_57824(ModComponents.COLLAR_LINK)).uuid().equals(this.collar.get()))))).limit(1L).filter(this.collar.isEmpty() ? (s -> !((class_1799)s.getSecond()).method_57826(ModComponents.LOCKED)) : (s -> { class_1661 inventory = access.player().method_31548(); for (int i = 0; i < inventory.method_5439(); i++) { class_1799 l = inventory.method_5438(i); if (l.method_31573(ModItems.LEASHES_TAG) && l.method_57826(ModComponents.COLLAR_LINK) && ((CollarLinkComponent)l.method_57824(ModComponents.COLLAR_LINK)).uuid().equals(this.collar.get())) return true;  }  return false; })).findAny();
/* 42 */     collarStack.ifPresent(stack -> {
/*    */           ((class_1799)stack.getSecond()).method_57379(ModComponents.COLLAR_SETTINGS, this.settings);
/*    */           this.settings.applyAttributes((class_1657)stack.getFirst());
/*    */         });
/*    */   }
/*    */ }


/* Location:              C:\Users\Agg\Downloads\EternallyBoundPlus+1.21.1.jar!\dev\enjarai\collared\net\UpdateCollarSettingsPacket.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */