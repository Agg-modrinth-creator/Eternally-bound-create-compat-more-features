/*    */ package dev.enjarai.collared.item.component;
/*    */ 
/*    */ import com.mojang.datafixers.util.Either;
/*    */ import dev.ryanhcode.sable.companion.SableCompanion;
/*    */ import io.wispforest.endec.Endec;
/*    */ import io.wispforest.endec.impl.StructEndecBuilder;
/*    */ import java.util.Optional;
/*    */ import java.util.UUID;
/*    */ import net.minecraft.class_1657;
/*    */ import net.minecraft.class_1937;
/*    */ import net.minecraft.class_2374;
/*    */ import net.minecraft.class_243;
/*    */ 
/*    */ public final class RestrainedComponent extends Record {
/*    */   private final Either<class_243, UUID> target;
/*    */   private final double range;
/*    */   private final int color;
/*    */   
/* 19 */   public RestrainedComponent(Either<class_243, UUID> target, double range, int color) { this.target = target; this.range = range; this.color = color; } public final String toString() { // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: <illegal opcode> toString : (Ldev/enjarai/collared/item/component/RestrainedComponent;)Ljava/lang/String;
/*    */     //   6: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #19	-> 0
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/* 19 */     //   0	7	0	this	Ldev/enjarai/collared/item/component/RestrainedComponent; } public Either<class_243, UUID> target() { return this.target; } public final int hashCode() { // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: <illegal opcode> hashCode : (Ldev/enjarai/collared/item/component/RestrainedComponent;)I
/*    */     //   6: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #19	-> 0
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	7	0	this	Ldev/enjarai/collared/item/component/RestrainedComponent; } public final boolean equals(Object o) { // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: aload_1
/*    */     //   2: <illegal opcode> equals : (Ldev/enjarai/collared/item/component/RestrainedComponent;Ljava/lang/Object;)Z
/*    */     //   7: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #19	-> 0
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	8	0	this	Ldev/enjarai/collared/item/component/RestrainedComponent;
/* 19 */     //   0	8	1	o	Ljava/lang/Object; } public double range() { return this.range; } public int color() { return this.color; }
/* 20 */    public static final Endec<RestrainedComponent> ENDEC = (Endec<RestrainedComponent>)StructEndecBuilder.of(
/* 21 */       CodecUtils.eitherEndec(MinecraftEndecs.VEC3D, BuiltInEndecs.UUID).fieldOf("target", RestrainedComponent::target), Endec.DOUBLE
/* 22 */       .fieldOf("range", RestrainedComponent::range), Endec.INT
/* 23 */       .fieldOf("color", RestrainedComponent::color), RestrainedComponent::new);
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public class_243 getTarget(class_1657 player) {
/* 28 */     Optional<class_243> left = target().left();
/* 29 */     if (left.isPresent()) {
/* 30 */       return ((class_243)left.get()).method_1023(0.0D, player.method_17682() * 0.7D, 0.0D);
/*    */     }
/*    */ 
/*    */     
/* 34 */     UUID uuid = target().right().get();
/* 35 */     class_1657 entity = player.method_37908().method_18470(uuid);
/*    */     
/* 37 */     if (entity != null) {
/* 38 */       return entity.method_19538();
/*    */     }
/*    */     
/* 41 */     return null;
/*    */   }
/*    */   
/*    */   public RestrainedComponent withRange(double range) {
/* 45 */     return new RestrainedComponent(target(), range, color());
/*    */   }
/*    */   
/*    */   public class_243 modifyMoveVector(class_1937 world, class_243 playerPos, class_243 targetPos, class_243 original) {
/* 49 */     playerPos = SableCompanion.INSTANCE.projectOutOfSubLevel(world, (class_2374)playerPos);
/* 50 */     targetPos = SableCompanion.INSTANCE.projectOutOfSubLevel(world, (class_2374)targetPos);
/* 51 */     if (SableCompanion.INSTANCE.isInPlotGrid(world, (class_2374)playerPos) || SableCompanion.INSTANCE.isInPlotGrid(world, (class_2374)targetPos))
/*    */     {
/* 53 */       return original;
/*    */     }
/* 55 */     class_243 direction = targetPos.method_1020(playerPos.method_1019(original));
/*    */     
/* 57 */     if (direction.method_1027() > range() * range()) {
/* 58 */       return original.method_1019(direction.method_1029().method_1021(Math.min(direction.method_1033() - range(), 8.0D)));
/*    */     }
/* 60 */     return original;
/*    */   }
/*    */ }


/* Location:              C:\Users\Agg\Downloads\EternallyBoundPlus+1.21.1.jar!\dev\enjarai\collared\item\component\RestrainedComponent.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */