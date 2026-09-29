/*     */ package dev.enjarai.collared.screen;
/*     */ import dev.enjarai.collared.LeashMode;
/*     */ import dev.enjarai.collared.item.ModItems;
/*     */ import dev.enjarai.collared.item.component.LeashModeComponent;
/*     */ import dev.enjarai.collared.item.component.ModComponents;
/*     */ import dev.enjarai.collared.net.ModNetworking;
/*     */ import dev.enjarai.collared.net.SelectLeashModePacket;
/*     */ import net.minecraft.class_124;
/*     */ import net.minecraft.class_1799;
/*     */ import net.minecraft.class_2561;
/*     */ import net.minecraft.class_2583;
/*     */ import net.minecraft.class_310;
/*     */ import net.minecraft.class_332;
/*     */ import net.minecraft.class_437;
/*     */ import net.minecraft.class_5250;
/*     */ import net.minecraft.class_5348;
/*     */ import org.joml.Vector2d;
/*     */ 
/*     */ public class ModeScreen extends class_437 {
/*     */   public ModeScreen() {
/*  21 */     super((class_2561)class_2561.method_43471("collared.screen.mode"));
/*     */   }
/*     */   private LeashMode closest;
/*     */   
/*     */   public void method_25394(class_332 context, int mouseX, int mouseY, float delta) {
/*  26 */     super.method_25394(context, mouseX, mouseY, delta);
/*     */     
/*  28 */     int middleX = context.method_51421() / 2;
/*  29 */     int middleY = context.method_51443() / 2;
/*     */     
/*  31 */     int radius = 48;
/*  32 */     for (int i = 0; i < (LeashMode.values()).length; i++) {
/*  33 */       LeashMode mode = LeashMode.values()[i];
/*  34 */       double angle = (i / (LeashMode.values()).length) * Math.PI * 2.0D;
/*     */       
/*  36 */       double x = Math.sin(angle) * radius;
/*  37 */       double y = -Math.cos(angle) * radius;
/*     */       
/*  39 */       class_5250 text = mode.getNameText().method_10862(class_2583.field_24360.method_10977(class_124.field_1063));
/*  40 */       if (mode == this.closest) {
/*  41 */         text = text.method_10862(class_2583.field_24360.method_10982(Boolean.valueOf(true)).method_10977(class_124.field_1080));
/*     */       }
/*  43 */       context.method_51439(this.field_22793, (class_2561)text, 
/*     */           
/*  45 */           (int)(middleX + x - (this.field_22793.method_27525((class_5348)text) / 2.0F)), (int)(middleY + y - 4.0D), -1, true);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void method_25420(class_332 context, int mouseX, int mouseY, float delta) {}
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean method_25406(double mouseX, double mouseY, int button) {
/*  57 */     method_25419();
/*  58 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void method_16014(double mouseX, double mouseY) {
/*  63 */     double closestDistance = Double.MAX_VALUE;
/*  64 */     LeashMode closest = null;
/*     */     
/*  66 */     int middleX = this.field_22789 / 2;
/*  67 */     int middleY = this.field_22790 / 2;
/*     */     
/*  69 */     for (int i = 0; i < (LeashMode.values()).length; i++) {
/*  70 */       double angle = (i / (LeashMode.values()).length) * Math.PI * 2.0D;
/*     */       
/*  72 */       double x = Math.sin(angle);
/*  73 */       double y = -Math.cos(angle);
/*     */       
/*  75 */       double distance = (new Vector2d(mouseX, mouseY)).distanceSquared(middleX + x, middleY + y);
/*     */       
/*  77 */       if (distance < closestDistance) {
/*  78 */         closestDistance = distance;
/*  79 */         closest = LeashMode.values()[i];
/*     */       } 
/*     */     } 
/*     */     
/*  83 */     this.closest = closest;
/*     */   }
/*     */ 
/*     */   
/*     */   public void method_25419() {
/*  88 */     if ((class_310.method_1551()).field_1724 != null && this.closest != null) {
/*  89 */       ModNetworking.CHANNEL.clientHandle().send((Record)new SelectLeashModePacket(this.closest));
/*     */       
/*  91 */       class_1799 stack = (class_310.method_1551()).field_1724.method_6047();
/*  92 */       if (!stack.method_31573(ModItems.LEASHES_TAG)) {
/*     */         return;
/*     */       }
/*     */       
/*  96 */       stack.method_57379(ModComponents.LEASH_MODE, new LeashModeComponent(this.closest));
/*     */     } 
/*     */     
/*  99 */     super.method_25419();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean method_25421() {
/* 104 */     return false;
/*     */   }
/*     */ }


/* Location:              C:\Users\Agg\Downloads\EternallyBoundPlus+1.21.1.jar!\dev\enjarai\collared\screen\ModeScreen.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */