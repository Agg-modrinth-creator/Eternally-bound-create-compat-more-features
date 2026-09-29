/*     */ package dev.enjarai.collared.item.component;
/*     */ 
/*     */ import dev.enjarai.collared.Collared;
/*     */ import io.wispforest.endec.Endec;
/*     */ import io.wispforest.owo.ui.core.Color;
/*     */ import java.util.Set;
/*     */ import net.minecraft.class_1322;
/*     */ import net.minecraft.class_1324;
/*     */ import net.minecraft.class_1657;
/*     */ import net.minecraft.class_3532;
/*     */ import net.minecraft.class_5134;
/*     */ 
/*     */ public final class CollarSettingsComponent extends Record {
/*     */   private final String gagString;
/*     */   private final boolean gagRtl;
/*     */   private final String gagAllowlist;
/*     */   private final float attackDamage;
/*     */   private final float miningSpeed;
/*     */   private final float entityScale;
/*     */   private final float maxHealth;
/*     */   
/*  22 */   public String gagString() { return this.gagString; } private final float movementSpeed; private final float jumpStrength; private final boolean blindness; private final float blindnessDistance; private final Color blindnessColor; public final String toString() { // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: <illegal opcode> toString : (Ldev/enjarai/collared/item/component/CollarSettingsComponent;)Ljava/lang/String;
/*     */     //   6: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #22	-> 0
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	7	0	this	Ldev/enjarai/collared/item/component/CollarSettingsComponent; } public final int hashCode() { // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: <illegal opcode> hashCode : (Ldev/enjarai/collared/item/component/CollarSettingsComponent;)I
/*     */     //   6: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #22	-> 0
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	7	0	this	Ldev/enjarai/collared/item/component/CollarSettingsComponent; } public final boolean equals(Object o) { // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: aload_1
/*     */     //   2: <illegal opcode> equals : (Ldev/enjarai/collared/item/component/CollarSettingsComponent;Ljava/lang/Object;)Z
/*     */     //   7: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #22	-> 0
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	8	0	this	Ldev/enjarai/collared/item/component/CollarSettingsComponent;
/*  22 */     //   0	8	1	o	Ljava/lang/Object; } public boolean gagRtl() { return this.gagRtl; } public String gagAllowlist() { return this.gagAllowlist; } public float attackDamage() { return this.attackDamage; } public float miningSpeed() { return this.miningSpeed; } public float entityScale() { return this.entityScale; } public float maxHealth() { return this.maxHealth; } public float movementSpeed() { return this.movementSpeed; } public float jumpStrength() { return this.jumpStrength; } public boolean blindness() { return this.blindness; } public float blindnessDistance() { return this.blindnessDistance; } public Color blindnessColor() { return this.blindnessColor; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public CollarSettingsComponent(String gagString, boolean gagRtl, String gagAllowlist, float attackDamage, float miningSpeed, float entityScale, float maxHealth, float movementSpeed, float jumpStrength, boolean blindness, float blindnessDistance, Color blindnessColor)
/*     */   {
/*  37 */     attackDamage = class_3532.method_15363(attackDamage, -1.0F, 0.0F);
/*  38 */     miningSpeed = class_3532.method_15363(miningSpeed, -1.0F, 0.0F);
/*  39 */     entityScale = class_3532.method_15363(entityScale, -0.66F, 0.2F);
/*  40 */     maxHealth = class_3532.method_15363(maxHealth, -0.8F, 0.0F);
/*  41 */     movementSpeed = class_3532.method_15363(movementSpeed, -1.0F, 0.2F);
/*  42 */     jumpStrength = class_3532.method_15363(jumpStrength, -1.0F, 0.0F); this.gagString = gagString; this.gagRtl = gagRtl; this.gagAllowlist = gagAllowlist; this.attackDamage = attackDamage; this.miningSpeed = miningSpeed; this.entityScale = entityScale; this.maxHealth = maxHealth; this.movementSpeed = movementSpeed; this.jumpStrength = jumpStrength;
/*     */     this.blindness = blindness;
/*     */     this.blindnessDistance = blindnessDistance;
/*  45 */     this.blindnessColor = blindnessColor; } public static final StructEndec<CollarSettingsComponent> ENDEC = StructEndecBuilder.of(Endec.STRING
/*  46 */       .optionalFieldOf("gag_string", CollarSettingsComponent::gagString, "mmph"), Endec.BOOLEAN
/*  47 */       .optionalFieldOf("gag_rtl", CollarSettingsComponent::gagRtl, Boolean.valueOf(false)), Endec.STRING
/*  48 */       .optionalFieldOf("gag_allowlist", CollarSettingsComponent::gagAllowlist, " !?~.,"), Endec.FLOAT
/*  49 */       .optionalFieldOf("attack_damage", CollarSettingsComponent::attackDamage, Float.valueOf(1.0F)), Endec.FLOAT
/*  50 */       .optionalFieldOf("mining_speed", CollarSettingsComponent::miningSpeed, Float.valueOf(1.0F)), Endec.FLOAT
/*  51 */       .optionalFieldOf("scale", CollarSettingsComponent::entityScale, Float.valueOf(1.0F)), Endec.FLOAT
/*  52 */       .optionalFieldOf("max_health", CollarSettingsComponent::maxHealth, Float.valueOf(1.0F)), Endec.FLOAT
/*  53 */       .optionalFieldOf("movement_speed", CollarSettingsComponent::movementSpeed, Float.valueOf(1.0F)), Endec.FLOAT
/*  54 */       .optionalFieldOf("jump_strength", CollarSettingsComponent::jumpStrength, Float.valueOf(1.0F)), Endec.BOOLEAN
/*  55 */       .optionalFieldOf("has_blindness", CollarSettingsComponent::blindness, Boolean.valueOf(false)), Endec.FLOAT
/*  56 */       .optionalFieldOf("blindness_distance", CollarSettingsComponent::blindnessDistance, Float.valueOf(12.0F)), Endec.INT
/*  57 */       .xmap(Color::ofRgb, Color::rgb).optionalFieldOf("blindness_colour", CollarSettingsComponent::blindnessColor, Color.BLACK), CollarSettingsComponent::new);
/*     */ 
/*     */ 
/*     */   
/*     */   public void applyAttributes(class_1657 player) {
/*  62 */     class_1324 attackDamage = player.method_5996(class_5134.field_23721);
/*  63 */     if (attackDamage != null)
/*  64 */       attackDamage.method_61163(new class_1322(Collared.id("collar"), this.attackDamage, class_1322.class_1323.field_6331)); 
/*  65 */     class_1324 miningSpeed = player.method_5996(class_5134.field_49076);
/*  66 */     if (miningSpeed != null)
/*  67 */       miningSpeed.method_61163(new class_1322(Collared.id("collar"), this.miningSpeed, class_1322.class_1323.field_6331)); 
/*  68 */     class_1324 entityScale = player.method_5996(class_5134.field_47760);
/*  69 */     if (entityScale != null)
/*  70 */       entityScale.method_61163(new class_1322(Collared.id("collar"), this.entityScale, class_1322.class_1323.field_6331)); 
/*  71 */     class_1324 maxHealth = player.method_5996(class_5134.field_23716);
/*  72 */     if (maxHealth != null)
/*  73 */       maxHealth.method_61163(new class_1322(Collared.id("collar"), this.maxHealth, class_1322.class_1323.field_6331)); 
/*  74 */     class_1324 movementSpeed = player.method_5996(class_5134.field_23719);
/*  75 */     if (movementSpeed != null)
/*  76 */       movementSpeed.method_61163(new class_1322(Collared.id("collar"), this.movementSpeed, class_1322.class_1323.field_6331)); 
/*  77 */     class_1324 jumpStrength = player.method_5996(class_5134.field_23728);
/*  78 */     if (jumpStrength != null)
/*  79 */       jumpStrength.method_61163(new class_1322(Collared.id("collar"), this.jumpStrength, class_1322.class_1323.field_6331)); 
/*     */   }
/*     */   
/*     */   public static void removeAttributes(class_1657 player) {
/*  83 */     class_1324 attackDamage = player.method_5996(class_5134.field_23721);
/*  84 */     if (attackDamage != null)
/*  85 */       attackDamage.method_6200(Collared.id("collar")); 
/*  86 */     class_1324 miningSpeed = player.method_5996(class_5134.field_49076);
/*  87 */     if (miningSpeed != null)
/*  88 */       miningSpeed.method_6200(Collared.id("collar")); 
/*  89 */     class_1324 entityScale = player.method_5996(class_5134.field_47760);
/*  90 */     if (entityScale != null)
/*  91 */       entityScale.method_6200(Collared.id("collar")); 
/*  92 */     class_1324 maxHealth = player.method_5996(class_5134.field_23716);
/*  93 */     if (maxHealth != null)
/*  94 */       maxHealth.method_6200(Collared.id("collar")); 
/*  95 */     class_1324 movementSpeed = player.method_5996(class_5134.field_23719);
/*  96 */     if (movementSpeed != null)
/*  97 */       movementSpeed.method_6200(Collared.id("collar")); 
/*  98 */     class_1324 jumpStrength = player.method_5996(class_5134.field_23728);
/*  99 */     if (jumpStrength != null)
/* 100 */       jumpStrength.method_6200(Collared.id("collar")); 
/*     */   }
/*     */   public CollarSettingsComponent() {
/* 103 */     this("mmph", false, " !?~.,", 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, false, 12.0F, Color.BLACK);
/*     */   }
/*     */   
/*     */   public String gagify(String chatText) {
/* 107 */     if (chatText.isEmpty() || chatText.charAt(0) == '/') {
/* 108 */       return chatText;
/*     */     }
/*     */     
/* 111 */     StringBuilder result = new StringBuilder();
/* 112 */     char[] theSub = gagString().toCharArray();
/* 113 */     if (this.gagRtl) ArrayUtils.reverse(theSub); 
/* 114 */     Set<Character> allowable = new HashSet<>();
/* 115 */     for (char c : this.gagAllowlist.toCharArray()) allowable.add(Character.valueOf(c)); 
/* 116 */     for (int i = 0, gagi = 0; i < chatText.length(); i++, gagi++) {
/* 117 */       char current = chatText.charAt(this.gagRtl ? (chatText.length() - i - 1) : i);
/* 118 */       if (allowable.contains(Character.valueOf(current))) {
/* 119 */         result.append(current);
/* 120 */         gagi = theSub.length - 1;
/*     */       }
/* 122 */       else if (theSub.length != 0) {
/* 123 */         result.append(theSub[gagi % theSub.length]);
/*     */       } 
/*     */     } 
/*     */     
/* 127 */     if (this.gagRtl) result.reverse(); 
/* 128 */     return result.toString();
/*     */   }
/*     */ }


/* Location:              C:\Users\Agg\Downloads\EternallyBoundPlus+1.21.1.jar!\dev\enjarai\collared\item\component\CollarSettingsComponent.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */