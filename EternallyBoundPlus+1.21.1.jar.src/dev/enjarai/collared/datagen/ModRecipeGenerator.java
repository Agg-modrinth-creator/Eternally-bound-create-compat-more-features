/*     */ package dev.enjarai.collared.datagen;
/*     */ import dev.enjarai.collared.item.CollarItem;
/*     */ import dev.enjarai.collared.item.LeashItem;
/*     */ import dev.enjarai.collared.item.ModItems;
/*     */ import java.util.EnumMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.concurrent.CompletableFuture;
/*     */ import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
/*     */ import net.minecraft.class_1767;
/*     */ import net.minecraft.class_1792;
/*     */ import net.minecraft.class_1802;
/*     */ import net.minecraft.class_1935;
/*     */ import net.minecraft.class_2246;
/*     */ import net.minecraft.class_2248;
/*     */ import net.minecraft.class_2447;
/*     */ import net.minecraft.class_2450;
/*     */ import net.minecraft.class_7225;
/*     */ import net.minecraft.class_7800;
/*     */ import net.minecraft.class_8790;
/*     */ 
/*     */ public class ModRecipeGenerator extends FabricRecipeProvider {
/*     */   static {
/*  24 */     WOOLS = (Map<class_1767, class_1935>)class_156.method_654(Maps.newEnumMap(class_1767.class), map -> {
/*     */           map.put(class_1767.field_7952, class_2246.field_10446);
/*     */           map.put(class_1767.field_7946, class_2246.field_10095);
/*     */           map.put(class_1767.field_7958, class_2246.field_10215);
/*     */           map.put(class_1767.field_7951, class_2246.field_10294);
/*     */           map.put(class_1767.field_7947, class_2246.field_10490);
/*     */           map.put(class_1767.field_7961, class_2246.field_10028);
/*     */           map.put(class_1767.field_7954, class_2246.field_10459);
/*     */           map.put(class_1767.field_7944, class_2246.field_10423);
/*     */           map.put(class_1767.field_7967, class_2246.field_10222);
/*     */           map.put(class_1767.field_7955, class_2246.field_10619);
/*     */           map.put(class_1767.field_7945, class_2246.field_10259);
/*     */           map.put(class_1767.field_7966, class_2246.field_10514);
/*     */           map.put(class_1767.field_7957, class_2246.field_10113);
/*     */           map.put(class_1767.field_7942, class_2246.field_10170);
/*     */           map.put(class_1767.field_7964, class_2246.field_10314);
/*     */           map.put(class_1767.field_7963, class_2246.field_10146);
/*     */         });
/*     */   } private static final Map<class_1767, class_1935> WOOLS;
/*     */   public ModRecipeGenerator(FabricDataOutput output, CompletableFuture<class_7225.class_7874> registriesFuture) {
/*  44 */     super(output, registriesFuture);
/*     */   }
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
/*     */   
/*     */   public void method_10419(class_8790 recipeExporter) {
/*  72 */     class_1767[] values = class_1767.values();
/*  73 */     for (int i = 0; i < values.length; i++) {
/*  74 */       class_1767 color = values[i];
/*  75 */       class_1935 wool = WOOLS.get(color);
/*     */       
/*  77 */       CollarItem collar = ModItems.COLOR_COLLARS[i];
/*  78 */       class_2447.method_10437(class_7800.field_40638, (class_1935)collar)
/*  79 */         .method_10434(Character.valueOf('w'), wool)
/*  80 */         .method_10434(Character.valueOf('l'), (class_1935)class_1802.field_8745)
/*  81 */         .method_10439(" w ")
/*  82 */         .method_10439("wlw")
/*  83 */         .method_10439(" w ")
/*  84 */         .method_10435("collar")
/*  85 */         .method_10429("has_needed_wool", method_10426(wool))
/*  86 */         .method_10431(recipeExporter);
/*     */       
/*  88 */       CollarItem bell_collar = ModItems.COLOR_BELL_COLLARS[i];
/*  89 */       class_2450.method_10447(class_7800.field_40638, (class_1935)bell_collar)
/*  90 */         .method_10454((class_1935)class_1802.field_8695)
/*  91 */         .method_10454((class_1935)collar)
/*  92 */         .method_10452("bell_collar")
/*  93 */         .method_10442("has_needed_collar", method_10426((class_1935)collar))
/*  94 */         .method_10431(recipeExporter);
/*     */       
/*  96 */       LeashItem leash = ModItems.COLOR_LEASHES[i];
/*  97 */       class_2447.method_10437(class_7800.field_40638, (class_1935)leash)
/*  98 */         .method_10434(Character.valueOf('i'), (class_1935)class_1802.field_8620)
/*  99 */         .method_10434(Character.valueOf('w'), wool)
/* 100 */         .method_10434(Character.valueOf('s'), (class_1935)class_1802.field_8276)
/* 101 */         .method_10439("i")
/* 102 */         .method_10439("w")
/* 103 */         .method_10439("s")
/* 104 */         .method_10435("leash")
/* 105 */         .method_10429("has_needed_wool", method_10426(wool))
/* 106 */         .method_10431(recipeExporter);
/*     */     } 
/*     */   }
/*     */   
/*     */   public static void offerDyeableCollarRecipes(class_8790 exporter, List<class_1792> dyes, List<class_1792> dyedables, List<class_1792> allDyeables, String group) {
/* 111 */     for (int i = 0; i < dyes.size(); i++) {
/* 112 */       class_1792 item = dyes.get(i);
/* 113 */       class_1792 item2 = dyedables.get(i);
/* 114 */       class_2450.method_10447(class_7800.field_40638, (class_1935)item2)
/* 115 */         .method_10454((class_1935)item)
/* 116 */         .method_10451(class_1856.method_26964(allDyeables.stream().filter(dyeable -> !dyeable.equals(item2)).map(net.minecraft.class_1799::new)))
/* 117 */         .method_10452(group)
/* 118 */         .method_10442("has_needed_dye", method_10426((class_1935)item))
/* 119 */         .method_36443(exporter, "dye_" + method_33716((class_1935)item2));
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Agg\Downloads\EternallyBoundPlus+1.21.1.jar!\dev\enjarai\collared\datagen\ModRecipeGenerator.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */