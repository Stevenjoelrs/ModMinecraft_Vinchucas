package com.scesi.vinchucamod.entity.client;

import com.scesi.vinchucamod.VinchucaMod;

import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.resources.ResourceLocation;

public class VinchucaModel extends EntityModel<VinchucaRenderState> {
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(VinchucaMod.MODID, "vinchuca"), "main");
	private final ModelPart vinchuca;
	private final ModelPart body;
	private final ModelPart wings;
	private final ModelPart wing_left;
	private final ModelPart wing_right;
	private final ModelPart legs;
	private final ModelPart leg_left;
	private final ModelPart leg_front_left;
	private final ModelPart leg_middle_left;
	private final ModelPart leg_back_left;
	private final ModelPart leg_right;
	private final ModelPart leg_front_left2;
	private final ModelPart leg_middle_left2;
	private final ModelPart leg_back_left2;
	private final ModelPart head;

	public VinchucaModel(ModelPart root) {
		super(root);
		this.vinchuca = root.getChild("vinchuca");
		this.body = this.vinchuca.getChild("body");
		this.wings = this.vinchuca.getChild("wings");
		this.wing_left = this.wings.getChild("wing_left");
		this.wing_right = this.wings.getChild("wing_right");
		this.legs = this.vinchuca.getChild("legs");
		this.leg_left = this.legs.getChild("leg_left");
		this.leg_front_left = this.leg_left.getChild("leg_front_left");
		this.leg_middle_left = this.leg_left.getChild("leg_middle_left");
		this.leg_back_left = this.leg_left.getChild("leg_back_left");
		this.leg_right = this.legs.getChild("leg_right");
		this.leg_front_left2 = this.leg_right.getChild("leg_front_left2");
		this.leg_middle_left2 = this.leg_right.getChild("leg_middle_left2");
		this.leg_back_left2 = this.leg_right.getChild("leg_back_left2");
		this.head = this.vinchuca.getChild("head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition vinchuca = partdefinition.addOrReplaceChild("vinchuca", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition body = vinchuca.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-9.0F, -11.5F, -6.0F, 18.0F, 4.0F, 15.0F, new CubeDeformation(0.0F))
		.texOffs(0, 19).addBox(-15.0F, -14.0F, -3.0F, 8.0F, 6.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(66, 0).addBox(9.0F, -11.5F, -3.0F, 3.0F, 3.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(26, 90).addBox(12.0F, -11.5F, 0.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(82, 33).addBox(-12.0F, -12.2F, -6.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(14, 86).addBox(-12.0F, -12.2F, 6.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(42, 87).addBox(-9.0F, -12.5F, 9.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(66, 87).addBox(6.0F, -12.5F, 9.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(78, 87).addBox(6.0F, -12.5F, -9.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(88, 73).addBox(9.0F, -12.3F, -6.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(90, 0).addBox(9.0F, -12.3F, 6.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(90, 6).addBox(12.0F, -12.1F, 3.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(90, 39).addBox(12.0F, -12.1F, -3.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(90, 49).addBox(15.0F, -12.1F, 0.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(54, 87).addBox(-9.0F, -12.5F, -9.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(60, 60).addBox(-6.0F, -13.0F, -9.0F, 12.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(64, 19).addBox(-6.0F, -13.0F, 9.0F, 12.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(64, 25).addBox(-8.0F, -12.0F, -6.0F, 16.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(64, 29).addBox(-5.0F, -14.0F, -10.0F, 10.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(66, 12).addBox(-5.0F, -14.0F, 10.0F, 10.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(66, 16).addBox(-5.0F, -13.0F, 12.0F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(20, 70).addBox(-5.0F, -13.0F, -10.0F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(64, 27).addBox(-8.0F, -12.0F, 8.0F, 16.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(14, 77).addBox(14.0F, -11.6F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(90, 60).addBox(11.0F, -11.8F, -3.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(90, 44).addBox(11.0F, -11.8F, 2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(34, 72).addBox(8.0F, -11.8F, 6.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(90, 86).addBox(-9.0F, -11.8F, -6.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(90, 90).addBox(-9.0F, -11.8F, 6.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(90, 82).addBox(8.0F, -11.8F, -6.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(52, 93).addBox(8.0F, -11.8F, 5.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(76, 93).addBox(8.0F, -11.8F, -3.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(60, 93).addBox(12.0F, -11.6F, 2.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(68, 93).addBox(12.0F, -11.6F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 0.0F, -1.5F));

		PartDefinition wings = vinchuca.addOrReplaceChild("wings", CubeListBuilder.create(), PartPose.offset(2.0F, 0.0F, 0.0F));

		PartDefinition wing_left = wings.addOrReplaceChild("wing_left", CubeListBuilder.create().texOffs(60, 54).addBox(-7.2F, -12.7F, -7.5F, 16.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(42, 70).addBox(8.8F, -12.7F, -4.5F, 3.0F, 0.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(42, 34).addBox(-6.2F, -12.7F, -4.5F, 15.0F, 0.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(48, 76).addBox(11.8F, -12.7F, -1.5F, 3.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.3F, 0.2F, 0.0F));

		PartDefinition cube_r1 = wing_left.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(90, 29).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.1F, -12.3F, -6.0F, 0.0F, 0.0F, -0.4363F));

		PartDefinition wing_right = wings.addOrReplaceChild("wing_right", CubeListBuilder.create().texOffs(60, 57).addBox(-7.2F, -12.7F, 4.5F, 16.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(60, 66).addBox(8.8F, -12.7F, -2.5F, 3.0F, 0.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(0, 34).addBox(-6.2F, -12.7F, -1.5F, 15.0F, 0.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(88, 16).addBox(11.8F, -12.7F, -1.5F, 3.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r2 = wing_right.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(90, 79).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.1F, -12.3F, 6.0F, 0.0F, 0.0F, -0.4363F));

		PartDefinition legs = vinchuca.addOrReplaceChild("legs", CubeListBuilder.create(), PartPose.offset(2.0F, 0.0F, 0.6683F));

		PartDefinition leg_left = legs.addOrReplaceChild("leg_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -16.1683F));

		PartDefinition leg_front_left = leg_left.addOrReplaceChild("leg_front_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r3 = leg_front_left.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 91).addBox(-2.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-21.403F, -0.633F, -4.7867F, 0.1893F, -0.538F, -0.3578F));

		PartDefinition cube_r4 = leg_front_left.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(14, 79).addBox(-0.5F, -0.5F, -5.5F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-19.4722F, -6.149F, -2.152F, 1.2217F, 0.3054F, 0.0F));

		PartDefinition cube_r5 = leg_front_left.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(30, 40).addBox(-1.0F, -2.0F, -12.0F, 2.0F, 2.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-13.4F, -7.8F, 7.9F, 0.3228F, 0.5179F, 0.1641F));

		PartDefinition cube_r6 = leg_front_left.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 77).addBox(-1.0F, -3.0F, -3.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-13.8F, -8.0F, 11.0F, 0.2182F, 0.0F, 0.0F));

		PartDefinition leg_middle_left = leg_left.addOrReplaceChild("leg_middle_left", CubeListBuilder.create(), PartPose.offset(-20.0F, 0.0F, -3.0F));

		PartDefinition cube_r7 = leg_middle_left.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(10, 92).addBox(-2.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(21.403F, -0.633F, -4.7867F, 0.1893F, 0.538F, 0.3578F));

		PartDefinition cube_r8 = leg_middle_left.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(62, 80).addBox(-0.5F, -0.5F, -5.5F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(19.4722F, -6.149F, -2.152F, 1.2217F, -0.3054F, 0.0F));

		PartDefinition cube_r9 = leg_middle_left.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 55).addBox(-1.0F, -2.0F, -12.0F, 2.0F, 2.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(13.4F, -7.8F, 7.9F, 0.3228F, -0.5179F, -0.1641F));

		PartDefinition cube_r10 = leg_middle_left.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(48, 80).addBox(-2.0F, -3.0F, -3.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(13.8F, -8.0F, 11.0F, 0.2182F, 0.0F, 0.0F));

		PartDefinition leg_back_left = leg_left.addOrReplaceChild("leg_back_left", CubeListBuilder.create(), PartPose.offsetAndRotation(6.6663F, -5.2857F, 2.5594F, 0.0F, -0.5672F, 0.0F));

		PartDefinition cube_r11 = leg_back_left.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(92, 11).addBox(-2.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.7367F, 4.6526F, -6.046F, 0.1893F, 0.538F, 0.3578F));

		PartDefinition cube_r12 = leg_back_left.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(76, 80).addBox(-0.5F, -0.5F, -5.5F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8059F, -0.8634F, -3.4113F, 1.2217F, -0.3054F, 0.0F));

		PartDefinition cube_r13 = leg_back_left.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(60, 39).addBox(-1.0F, -2.0F, -12.0F, 2.0F, 2.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.2663F, -2.5143F, 6.6406F, 0.3228F, -0.5179F, -0.1641F));

		PartDefinition cube_r14 = leg_back_left.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(74, 73).addBox(-2.0F, -3.0F, -3.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.8663F, -2.7143F, 9.7406F, 0.2182F, 0.0F, 0.0F));

		PartDefinition leg_right = legs.addOrReplaceChild("leg_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 14.7633F));

		PartDefinition leg_front_left2 = leg_right.addOrReplaceChild("leg_front_left2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r15 = leg_front_left2.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(92, 13).addBox(-2.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-21.403F, -0.633F, 4.7867F, -0.1893F, 0.538F, -0.3578F));

		PartDefinition cube_r16 = leg_front_left2.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(60, 73).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-19.4722F, -6.149F, 2.152F, -1.2217F, -0.3054F, 0.0F));

		PartDefinition cube_r17 = leg_front_left2.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(34, 19).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-13.4F, -7.8F, -7.9F, -0.3228F, -0.5179F, 0.1641F));

		PartDefinition cube_r18 = leg_front_left2.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(0, 84).addBox(-1.0F, -3.0F, -1.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-13.8F, -8.0F, -11.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition leg_middle_left2 = leg_right.addOrReplaceChild("leg_middle_left2", CubeListBuilder.create(), PartPose.offset(-20.0F, 0.0F, 3.0F));

		PartDefinition cube_r19 = leg_middle_left2.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(0, 93).addBox(-2.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(21.403F, -0.633F, 4.7867F, -0.1893F, -0.538F, 0.3578F));

		PartDefinition cube_r20 = leg_middle_left2.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(80, 66).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(19.4722F, -6.149F, 2.152F, -1.2217F, 0.3054F, 0.0F));

		PartDefinition cube_r21 = leg_middle_left2.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(0, 40).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(13.4F, -7.8F, -7.9F, -0.3228F, 0.5179F, -0.1641F));

		PartDefinition cube_r22 = leg_middle_left2.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(28, 83).addBox(-2.0F, -3.0F, -1.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(13.8F, -8.0F, -11.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition leg_back_left2 = leg_right.addOrReplaceChild("leg_back_left2", CubeListBuilder.create(), PartPose.offsetAndRotation(6.6663F, -5.2857F, -2.5594F, 0.0F, 0.5672F, 0.0F));

		PartDefinition cube_r23 = leg_back_left2.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(38, 93).addBox(-2.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.7367F, 4.6526F, 6.046F, -0.1893F, -0.538F, 0.3578F));

		PartDefinition cube_r24 = leg_back_left2.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(20, 72).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8059F, -0.8634F, 3.4113F, -1.2217F, 0.3054F, 0.0F));

		PartDefinition cube_r25 = leg_back_left2.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(30, 55).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.2663F, -2.5143F, -6.6406F, -0.3228F, 0.5179F, -0.1641F));

		PartDefinition cube_r26 = leg_back_left2.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(34, 76).addBox(-2.0F, -3.0F, -1.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.8663F, -2.7143F, -9.7406F, -0.2182F, 0.0F, 0.0F));

		PartDefinition head = vinchuca.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 70).addBox(-22.0F, -13.0F, 0.0F, 7.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(28, 79).addBox(-18.0F, -12.5F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(42, 83).addBox(-18.0F, -12.5F, 3.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 0.0F, -1.5F));

		PartDefinition cube_r27 = head.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(10, 94).addBox(0.1566F, -3.5294F, -0.1991F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-22.259F, -15.376F, 5.3406F, -0.3347F, -0.2754F, -0.6916F));

		PartDefinition cube_r28 = head.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(48, 93).addBox(-0.241F, -0.8674F, -0.3416F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-22.259F, -15.376F, 5.3406F, -0.6109F, 0.0F, -0.3491F));

		PartDefinition cube_r29 = head.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(84, 93).addBox(0.1566F, -3.5294F, -0.8009F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-22.259F, -15.376F, -2.3406F, 0.3347F, 0.2754F, -0.6916F));

		PartDefinition cube_r30 = head.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(20, 92).addBox(-0.241F, -0.8674F, -0.6584F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-22.259F, -15.376F, -2.3406F, 0.6109F, 0.0F, -0.3491F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}
	
	@Override
    public void setupAnim(VinchucaRenderState state) {
        super.setupAnim(state);
    }
}