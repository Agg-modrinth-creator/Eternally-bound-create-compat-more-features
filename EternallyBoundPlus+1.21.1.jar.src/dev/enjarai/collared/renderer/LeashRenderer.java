/*     */ package dev.enjarai.collared.renderer;
/*     */ import dev.enjarai.collared.item.component.RestrainedComponent;
/*     */ import dev.ryanhcode.sable.companion.SableCompanion;
/*     */ import net.fabricmc.fabric.api.client.rendering.v1.WorldRenderContext;
/*     */ import net.minecraft.class_1297;
/*     */ import net.minecraft.class_1657;
/*     */ import net.minecraft.class_1799;
/*     */ import net.minecraft.class_1944;
/*     */ import net.minecraft.class_2338;
/*     */ import net.minecraft.class_2374;
/*     */ import net.minecraft.class_243;
/*     */ import net.minecraft.class_3532;
/*     */ import net.minecraft.class_4587;
/*     */ import net.minecraft.class_4588;
/*     */ import net.minecraft.class_4597;
/*     */ import net.minecraft.class_5253;
/*     */ import net.minecraft.class_742;
/*     */ import org.joml.Matrix4f;
/*     */ 
/*     */ public class LeashRenderer {
/*     */   private static int getBlockLight(class_1297 entity, class_2338 pos) {
/*  22 */     return entity.method_5809() ? 15 : entity.method_37908().method_8314(class_1944.field_9282, pos);
/*     */   }
/*     */   
/*     */   public static void renderWorldLeashes(WorldRenderContext ctx) {
/*  26 */     class_310 client = class_310.method_1551();
/*  27 */     class_4587 matrices = ctx.matrixStack();
/*  28 */     if (client.field_1724 != null && matrices != null) {
/*  29 */       matrices.method_22903();
/*  30 */       class_243 cameraPos = ctx.camera().method_19326();
/*  31 */       matrices.method_22904(-cameraPos.method_10216(), -cameraPos.method_10214(), -cameraPos.method_10215());
/*     */ 
/*     */       
/*  34 */       for (class_742 player : ctx.world().method_18456()) {
/*  35 */         matrices.method_22903();
/*     */         
/*  37 */         float tickDelta = ctx.tickCounter().method_60637(false);
/*  38 */         class_243 playerPos = player.method_30950(tickDelta);
/*  39 */         matrices.method_22904(playerPos.method_10216(), playerPos.method_10214(), playerPos.method_10215());
/*  40 */         doRender(player, tickDelta, matrices, ctx.consumers());
/*     */         
/*  42 */         matrices.method_22909();
/*     */       } 
/*     */       
/*  45 */       matrices.method_22909();
/*     */     } 
/*     */   }
/*     */   
/*     */   public static void doRender(class_742 player, float tickDelta, class_4587 matrices, class_4597 vertexConsumers) {
/*  50 */     class_1799 collarStack = SlotReference.of((class_1309)player, "collar", 0).getStack();
/*  51 */     if (collarStack == null) {
/*     */       return;
/*     */     }
/*     */     
/*  55 */     RestrainedComponent restrained = (RestrainedComponent)collarStack.method_57824(ModComponents.RESTRAINED);
/*  56 */     if (restrained == null) {
/*     */       return;
/*     */     }
/*     */     
/*  60 */     RestrainedComponent component = (RestrainedComponent)collarStack.method_57824(ModComponents.RESTRAINED);
/*     */     
/*  62 */     component.target().ifLeft(pos -> {
/*     */           pos = SableCompanion.INSTANCE.projectOutOfSubLevel(player.method_37908(), (class_2374)pos);
/*     */           if (!SableCompanion.INSTANCE.isInPlotGrid(player.method_37908(), (class_2374)pos))
/*     */             renderLeash((class_1297)player, tickDelta, matrices, vertexConsumers, pos, restrained.color()); 
/*  66 */         }).ifRight(uuid -> {
/*     */           class_1657 otherPlayer = player.method_37908().method_18470(uuid);
/*     */           if (otherPlayer == null) {
/*     */             return;
/*     */           }
/*     */           renderLeash((class_1297)player, tickDelta, matrices, vertexConsumers, (class_1297)otherPlayer, restrained.color());
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   public static void renderLeash(class_1297 collared, float tickDelta, class_4587 matrices, class_4597 vertexConsumers, class_1297 leashHolder, int color) {
/*  77 */     class_243 leashHolderPos = leashHolder.method_30951(tickDelta);
/*  78 */     class_2338 leashHolderLightPos = class_2338.method_49638((class_2374)leashHolder.method_5836(tickDelta));
/*  79 */     int leashHolderBlockLight = getBlockLight(leashHolder, leashHolderLightPos);
/*  80 */     int leashHolderSkyLight = collared.method_37908().method_8314(class_1944.field_9284, leashHolderLightPos);
/*  81 */     renderLeash(collared, tickDelta, matrices, vertexConsumers, color, leashHolderPos, leashHolderBlockLight, leashHolderSkyLight);
/*     */   }
/*     */   
/*     */   public static void renderLeash(class_1297 collared, float tickDelta, class_4587 matrices, class_4597 vertexConsumers, class_243 restrainedPos, int color) {
/*  85 */     class_2338 collaredLightPos = class_2338.method_49638((class_2374)collared.method_5836(tickDelta));
/*  86 */     int blockLight = getBlockLight(collared, collaredLightPos);
/*  87 */     int skyLight = collared.method_37908().method_8314(class_1944.field_9284, collaredLightPos);
/*  88 */     renderLeash(collared, tickDelta, matrices, vertexConsumers, color, restrainedPos, blockLight, skyLight);
/*     */   }
/*     */   
/*     */   private static void renderLeash(class_1297 collared, float tickDelta, class_4587 matrices, class_4597 vertexConsumers, int color, class_243 leashHolderPos, int leashHolderBlockLight, int leashHolderSkyLight) {
/*  92 */     matrices.method_22903();
/*  93 */     double d = (collared.method_60951(tickDelta) * 0.017453292F) + 1.5707963267948966D;
/*  94 */     class_243 vec3d2 = collared.method_45321(tickDelta).method_1023(0.0D, (collared.method_17682() / 7.0F), (collared.method_17681() * 0.2F));
/*  95 */     double e = Math.cos(d) * vec3d2.field_1350 + Math.sin(d) * vec3d2.field_1352;
/*  96 */     double f = Math.sin(d) * vec3d2.field_1350 - Math.cos(d) * vec3d2.field_1352;
/*  97 */     double g = class_3532.method_16436(tickDelta, collared.field_6014, collared.method_23317()) + e;
/*  98 */     double h = class_3532.method_16436(tickDelta, collared.field_6036, collared.method_23318()) + vec3d2.field_1351;
/*  99 */     double i = class_3532.method_16436(tickDelta, collared.field_5969, collared.method_23321()) + f;
/* 100 */     matrices.method_22904(e, vec3d2.field_1351, f);
/* 101 */     float j = (float)(leashHolderPos.field_1352 - g);
/* 102 */     float k = (float)(leashHolderPos.field_1351 - h);
/* 103 */     float l = (float)(leashHolderPos.field_1350 - i);
/* 104 */     float m = 0.025F;
/* 105 */     class_4588 vertexConsumer = vertexConsumers.getBuffer(class_1921.method_23587());
/* 106 */     Matrix4f matrix4f = matrices.method_23760().method_23761();
/* 107 */     float n = class_3532.method_48119(j * j + l * l) * 0.025F / 2.0F;
/* 108 */     float o = l * n;
/* 109 */     float p = j * n;
/* 110 */     class_2338 blockPos = class_2338.method_49638((class_2374)collared.method_5836(tickDelta));
/* 111 */     int q = getBlockLight(collared, blockPos);
/* 112 */     int s = collared.method_37908().method_8314(class_1944.field_9284, blockPos);
/*     */     int u;
/* 114 */     for (u = 0; u <= 24; u++) {
/* 115 */       renderLeashSegment(vertexConsumer, matrix4f, j, k, l, q, leashHolderBlockLight, s, leashHolderSkyLight, 0.025F, 0.025F, o, p, color, u, false);
/*     */     }
/*     */     
/* 118 */     for (u = 24; u >= 0; u--) {
/* 119 */       renderLeashSegment(vertexConsumer, matrix4f, j, k, l, q, leashHolderBlockLight, s, leashHolderSkyLight, 0.025F, 0.0F, o, p, color, u, true);
/*     */     }
/*     */     
/* 122 */     matrices.method_22909();
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
/*     */   private static void renderLeashSegment(class_4588 vertexConsumer, Matrix4f matrix, float leashedEntityX, float leashedEntityY, float leashedEntityZ, int leashedEntityBlockLight, int leashHolderBlockLight, int leashedEntitySkyLight, int leashHolderSkyLight, float f, float g, float h, float i, int color, int segmentIndex, boolean isLeashKnot) {
/* 143 */     float j = segmentIndex / 24.0F;
/* 144 */     int k = (int)class_3532.method_16439(j, leashedEntityBlockLight, leashHolderBlockLight);
/* 145 */     int l = (int)class_3532.method_16439(j, leashedEntitySkyLight, leashHolderSkyLight);
/* 146 */     int m = class_765.method_23687(k, l);
/* 147 */     float n = (segmentIndex % 2 == (isLeashKnot ? 1 : 0)) ? 0.8F : 1.0F;
/* 148 */     float o = class_5253.class_5254.method_27765(color) / 255.0F * n;
/* 149 */     float p = class_5253.class_5254.method_27766(color) / 255.0F * n;
/* 150 */     float q = class_5253.class_5254.method_27767(color) / 255.0F * n;
/* 151 */     float r = leashedEntityX * j;
/* 152 */     float s = (leashedEntityY > 0.0F) ? (leashedEntityY * j * j) : (leashedEntityY - leashedEntityY * (1.0F - j) * (1.0F - j));
/* 153 */     float t = leashedEntityZ * j;
/* 154 */     vertexConsumer.method_22918(matrix, r - h, s + g, t + i).method_22915(o, p, q, 1.0F).method_60803(m);
/* 155 */     vertexConsumer.method_22918(matrix, r + h, s + f - g, t - i).method_22915(o, p, q, 1.0F).method_60803(m);
/*     */   }
/*     */ }


/* Location:              C:\Users\Agg\Downloads\EternallyBoundPlus+1.21.1.jar!\dev\enjarai\collared\renderer\LeashRenderer.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */