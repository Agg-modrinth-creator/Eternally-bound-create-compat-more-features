/*    */ package dev.enjarai.collared.net;public final class BeginEditingCollarClientboundPacket extends Record { private final UUID collar;
/*    */   private final CollarSettingsComponent initialSettings;
/*    */   
/*    */   public final String toString() {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: <illegal opcode> toString : (Ldev/enjarai/collared/net/BeginEditingCollarClientboundPacket;)Ljava/lang/String;
/*    */     //   6: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #12	-> 0
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	7	0	this	Ldev/enjarai/collared/net/BeginEditingCollarClientboundPacket;
/*    */   }
/*    */   
/*    */   public final int hashCode() {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: <illegal opcode> hashCode : (Ldev/enjarai/collared/net/BeginEditingCollarClientboundPacket;)I
/*    */     //   6: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #12	-> 0
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	7	0	this	Ldev/enjarai/collared/net/BeginEditingCollarClientboundPacket;
/*    */   }
/*    */   
/* 12 */   public BeginEditingCollarClientboundPacket(UUID collar, CollarSettingsComponent initialSettings) { this.collar = collar; this.initialSettings = initialSettings; } public UUID collar() { return this.collar; } public final boolean equals(Object o) { // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: aload_1
/*    */     //   2: <illegal opcode> equals : (Ldev/enjarai/collared/net/BeginEditingCollarClientboundPacket;Ljava/lang/Object;)Z
/*    */     //   7: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #12	-> 0
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	8	0	this	Ldev/enjarai/collared/net/BeginEditingCollarClientboundPacket;
/* 12 */     //   0	8	1	o	Ljava/lang/Object; } public CollarSettingsComponent initialSettings() { return this.initialSettings; }
/*    */    }


/* Location:              C:\Users\Agg\Downloads\EternallyBoundPlus+1.21.1.jar!\dev\enjarai\collared\net\BeginEditingCollarClientboundPacket.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */