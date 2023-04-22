package dandustry.recipe;

import gregtech.api.unification.material.MarkerMaterials.Tier;

import static dandustry.item.DDMaterials.*;
import static gregtech.api.recipes.RecipeMaps.ASSEMBLY_LINE_RECIPES;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gregtech.common.items.MetaItems.*;

public class HTComponentRecipes {
	
    public static void init() {
	
		// Motors
		
		ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(stickLong, SamariumMagnetic, 2)
                .input(stickLong, HighDurabilityCompoundSteel, 4)
                .input(ring, FluxedElectrum, 4)
                .input(round, FluxedElectrum, 8)
                .input(wireFine, EnrichedNaquadahAlloy, 64)
                .input(wireFine, EnrichedNaquadahAlloy, 64)
				.input(wireFine, Amogus, 64)
                .input(wireFine, Amogus, 64)
                .input(cableGtSingle, Pikyonium, 2)
                .fluidInputs(MutatedLivingSolder.getFluid(144))
                .fluidInputs(OmniversalLubricant.getPlasma(500))
                .fluidInputs(FluxedElectrum.getFluid(576))
                .output(ELECTRIC_MOTOR_UHV)
                .duration(800).EUt(300000).buildAndRegister();
				
		ASSEMBLY_LINE_RECIPES.recipeBuilder()
				.input(stickLong, SamariumMagnetic, 4)
                .input(stickLong, HastelloyK243, 4)
                .input(ring, Lafium, 4)
                .input(round, Lafium, 8)
                .input(wireFine, Aluminum, 64)
                .input(wireFine, Aluminum, 64)
				.input(wireFine, HastelloyK243, 64)
                .input(wireFine, HastelloyK243, 64)
                .input(cableGtSingle, Lafium, 2)
				.fluidInputs(MutatedLivingSolder.getFluid(288))
				.fluidInputs(OmniversalLubricant.getPlasma(1000))
                .fluidInputs(TastyNeutronium.getFluid(576))
                .output(ELECTRIC_MOTOR_UEV)
                .duration(1200).EUt(800000).buildAndRegister();

		ASSEMBLY_LINE_RECIPES.recipeBuilder()
				.input(stickLong, KerrBlackHole, 2)
				.input(stickLong, Enderiiium, 4)
				.input(ring, StellarAlloy, 4)
				.input(round, StellarAlloy, 8)
				.input(wireFine, Lumiium, 64)
				.input(wireFine, Lumiium, 64)
				.input(wireFine, VibrantAlloy, 64)
				.input(wireFine, VibrantAlloy, 64)
				.input(cableGtSingle, Signalium, 2)
				.fluidInputs(MutatedLivingSolder.getFluid(576))
				.fluidInputs(OmniversalLubricant.getPlasma(2000))
				.fluidInputs(Signalium.getFluid(576))
				.output(ELECTRIC_MOTOR_UIV)
				.duration(1600).EUt(2000000).buildAndRegister();

		ASSEMBLY_LINE_RECIPES.recipeBuilder()
				.input(stickLong, KerrBlackHole, 4)
				.input(stickLong, AwakenedDraconium, 4)
				.input(ring, ChargedDraconium, 4)
				.input(round, ChargedDraconium, 8)
				.input(wireFine, CrystalMatrix, 64)
				.input(wireFine, CrystalMatrix, 64)
				.input(wireFine, ChargedDraconium, 64)
				.input(wireFine, ChargedDraconium, 64)
				.input(cableGtSingle, Bedrockium, 2)
				.fluidInputs(MutatedLivingSolder.getFluid(1152))
				.fluidInputs(OmniversalLubricant.getPlasma(4000))
				.fluidInputs(Bedrockium.getFluid(576))
				.output(ELECTRIC_MOTOR_UXV)
				.duration(2400).EUt(6000000).buildAndRegister();

		ASSEMBLY_LINE_RECIPES.recipeBuilder()
				.input(stickLong, KerrBlackHole, 8)
				.input(stickLong, Quantum, 4)
				.input(ring, CallistoIce, 4)
				.input(round, CallistoIce, 8)
				.input(wireFine, Quantium, 64)
				.input(wireFine, Quantium, 64)
				.input(wireFine, Ledox, 64)
				.input(wireFine, Ledox, 64)
				.input(cableGtSingle, Quantium, 2)
				.fluidInputs(MutatedLivingSolder.getFluid(2304))
				.fluidInputs(OmniversalLubricant.getPlasma(8000))
				.fluidInputs(Quantium.getFluid(576))
				.fluidInputs(Infinity.getFluid(144))
				.output(ELECTRIC_MOTOR_OpV)
				.duration(3200).EUt(20000000).buildAndRegister();
				
		// Conveyors
		
		ASSEMBLY_LINE_RECIPES.recipeBuilder()
				.input(ELECTRIC_MOTOR_UHV, 2)
                .input(plate, HighDurabilityCompoundSteel, 2)
                .input(ring, HighDurabilityCompoundSteel, 4)
                .input(round, FluxedElectrum, 16)
				.input(screw, FluxedElectrum, 4)
                .input(cableGtSingle, Pikyonium, 2)
				.fluidInputs(MutatedLivingSolder.getFluid(144))
				.fluidInputs(OmniversalLubricant.getPlasma(500))
				.fluidInputs(RadoxPolymer.getFluid(144))
                .fluidInputs(FluxedElectrum.getFluid(576))
                .output(CONVEYOR_MODULE_UHV)
                .duration(800).EUt(300000).buildAndRegister();
				
		ASSEMBLY_LINE_RECIPES.recipeBuilder()
				.input(ELECTRIC_MOTOR_UEV, 2)
				.input(plate, HastelloyK243, 2)
                .input(ring, HastelloyK243, 4)
                .input(round, Lafium, 16)
				.input(screw, Lafium, 4)
                .input(cableGtSingle, Lafium, 2)
				.fluidInputs(MutatedLivingSolder.getFluid(288))
				.fluidInputs(OmniversalLubricant.getPlasma(1000))
				.fluidInputs(RadoxPolymer.getFluid(288))
                .fluidInputs(TastyNeutronium.getFluid(576))
                .output(CONVEYOR_MODULE_UEV)
                .duration(1200).EUt(800000).buildAndRegister();

		ASSEMBLY_LINE_RECIPES.recipeBuilder()
				.input(ELECTRIC_MOTOR_UIV, 2)
				.input(plate, Enderiiium, 2)
				.input(ring, Enderiiium, 4)
				.input(round, StellarAlloy, 16)
				.input(screw, StellarAlloy, 4)
				.input(cableGtSingle, Signalium, 2)
				.fluidInputs(MutatedLivingSolder.getFluid(576))
				.fluidInputs(OmniversalLubricant.getPlasma(2000))
				.fluidInputs(RadoxPolymer.getFluid(576))
				.fluidInputs(Signalium.getFluid(576))
				.output(CONVEYOR_MODULE_UIV)
				.duration(1600).EUt(2000000).buildAndRegister();

		ASSEMBLY_LINE_RECIPES.recipeBuilder()
				.input(ELECTRIC_MOTOR_UXV, 2)
				.input(plate, AwakenedDraconium, 2)
				.input(ring, AwakenedDraconium, 4)
				.input(round, ChargedDraconium, 16)
				.input(screw, ChargedDraconium, 4)
				.input(cableGtSingle, Bedrockium, 2)
				.fluidInputs(MutatedLivingSolder.getFluid(1152))
				.fluidInputs(OmniversalLubricant.getPlasma(4000))
				.fluidInputs(RadoxPolymer.getFluid(1152))
				.fluidInputs(Bedrockium.getFluid(576))
				.output(CONVEYOR_MODULE_UXV)
				.duration(2400).EUt(6000000).buildAndRegister();

		ASSEMBLY_LINE_RECIPES.recipeBuilder()
				.input(ELECTRIC_MOTOR_OpV, 2)
				.input(plate, Quantum, 2)
				.input(ring, Quantum, 4)
				.input(round, CallistoIce, 16)
				.input(screw, CallistoIce, 4)
				.input(cableGtSingle, Quantium, 2)
				.fluidInputs(MutatedLivingSolder.getFluid(2304))
				.fluidInputs(RadoxPolymer.getFluid(2304))
				.fluidInputs(Quantium.getFluid(576))
				.fluidInputs(Infinity.getFluid(144))
				.output(CONVEYOR_MODULE_OpV)
				.duration(3200).EUt(20000000).buildAndRegister();
				
		// Pumps
		
		ASSEMBLY_LINE_RECIPES.recipeBuilder()
				.input(ELECTRIC_MOTOR_UHV)
                .input(pipeLargeFluid, Cinobite)
                .input(plate, HighDurabilityCompoundSteel, 2)
                .input(screw, HighDurabilityCompoundSteel, 8)
                .input(ring, RadoxPolymer, 4)
                .input(rotor, EnrichedNaquadahAlloy, 1)
                .input(cableGtSingle, Pikyonium, 2)
				.fluidInputs(MutatedLivingSolder.getFluid(144))
				.fluidInputs(OmniversalLubricant.getPlasma(500))
                .fluidInputs(FluxedElectrum.getFluid(576))
                .output(ELECTRIC_PUMP_UHV)
                .duration(800).EUt(300000).buildAndRegister();
				
		ASSEMBLY_LINE_RECIPES.recipeBuilder()
				.input(ELECTRIC_MOTOR_UEV)
				.input(pipeLargeFluid, Lafium)
                .input(plate, HastelloyK243, 2)
                .input(screw, HastelloyK243, 8)
				.input(ring, RadoxPolymer, 8)
                .input(rotor, TastyNeutronium, 1)
                .input(cableGtSingle, Lafium, 2)
				.fluidInputs(MutatedLivingSolder.getFluid(288))
				.fluidInputs(OmniversalLubricant.getPlasma(1000))
                .fluidInputs(TastyNeutronium.getFluid(576))
                .output(ELECTRIC_PUMP_UEV)
                .duration(1200).EUt(800000).buildAndRegister();

		ASSEMBLY_LINE_RECIPES.recipeBuilder()
				.input(ELECTRIC_MOTOR_UIV)
				.input(pipeLargeFluid, StellarAlloy)
				.input(plate, Enderiiium, 2)
				.input(screw, Enderiiium, 8)
				.input(ring, RadoxPolymer, 16)
				.input(rotor, EnderiiumBase, 1)
				.input(cableGtSingle, Signalium, 2)
				.fluidInputs(MutatedLivingSolder.getFluid(576))
				.fluidInputs(OmniversalLubricant.getPlasma(2000))
				.fluidInputs(Signalium.getFluid(576))
				.output(ELECTRIC_PUMP_UIV)
				.duration(1600).EUt(2000000).buildAndRegister();

		ASSEMBLY_LINE_RECIPES.recipeBuilder()
				.input(ELECTRIC_MOTOR_UXV)
				.input(pipeLargeFluid, ChargedDraconium)
				.input(plate, AwakenedDraconium, 2)
				.input(screw, AwakenedDraconium, 8)
				.input(ring, RadoxPolymer, 32)
				.input(rotor, InfinityCatalyst, 1)
				.input(cableGtSingle, Bedrockium, 2)
				.fluidInputs(MutatedLivingSolder.getFluid(1152))
				.fluidInputs(OmniversalLubricant.getPlasma(4000))
				.fluidInputs(Bedrockium.getFluid(576))
				.output(ELECTRIC_PUMP_UXV)
				.duration(2400).EUt(6000000).buildAndRegister();

		ASSEMBLY_LINE_RECIPES.recipeBuilder()
				.input(ELECTRIC_MOTOR_OpV)
				.input(pipeLargeFluid, CallistoIce)
				.input(plate, Quantum, 2)
				.input(screw, Quantum, 8)
				.input(ring, RadoxPolymer, 64)
				.input(rotor, Quantium, 1)
				.input(cableGtSingle, Quantium, 2)
				.fluidInputs(MutatedLivingSolder.getFluid(2304))
				.fluidInputs(OmniversalLubricant.getPlasma(8000))
				.fluidInputs(Quantium.getFluid(576))
				.fluidInputs(Infinity.getFluid(144))
				.output(ELECTRIC_PUMP_OpV)
				.duration(3200).EUt(20000000).buildAndRegister();
				
		// Pistons
		
		ASSEMBLY_LINE_RECIPES.recipeBuilder()
				.input(ELECTRIC_MOTOR_UHV)
                .input(plate, HighDurabilityCompoundSteel, 4)
                .input(ring, HighDurabilityCompoundSteel, 4)
				.input(round, FluxedElectrum, 16)
				.input(stick, HighDurabilityCompoundSteel, 4)
                .input(gear, EnrichedNaquadahAlloy)
                .input(gearSmall, Pikyonium, 2)
				.input(cableGtSingle, Pikyonium, 2)
				.fluidInputs(MutatedLivingSolder.getFluid(144))
				.fluidInputs(OmniversalLubricant.getPlasma(500))
                .fluidInputs(FluxedElectrum.getFluid(576))
                .output(ELECTRIC_PISTON_UHV)
                .duration(800).EUt(300000).buildAndRegister();
				
		ASSEMBLY_LINE_RECIPES.recipeBuilder()
				.input(ELECTRIC_MOTOR_UEV)
				.input(plate, HastelloyK243, 4)
                .input(ring, HastelloyK243, 4)
				.input(round, Lafium, 16)
				.input(stick, HastelloyK243, 4)
                .input(gear, Aluminum)
                .input(gearSmall, Lafium, 2)
				.input(cableGtSingle, Lafium, 2)
				.fluidInputs(MutatedLivingSolder.getFluid(288))
				.fluidInputs(OmniversalLubricant.getPlasma(1000))
                .fluidInputs(TastyNeutronium.getFluid(576))
                .output(ELECTRIC_PISTON_UEV)
                .duration(1200).EUt(800000).buildAndRegister();

		ASSEMBLY_LINE_RECIPES.recipeBuilder()
				.input(ELECTRIC_MOTOR_UIV)
				.input(plate, Enderiiium, 4)
				.input(ring, Enderiiium, 4)
				.input(round, StellarAlloy, 16)
				.input(stick, Enderiiium, 4)
				.input(gear, Lumiium)
				.input(gearSmall, VibrantAlloy, 2)
				.input(cableGtSingle, Signalium, 2)
				.fluidInputs(MutatedLivingSolder.getFluid(576))
				.fluidInputs(OmniversalLubricant.getPlasma(2000))
				.fluidInputs(Signalium.getFluid(576))
				.output(ELECTRIC_PISTON_UIV)
				.duration(1600).EUt(2000000).buildAndRegister();

		ASSEMBLY_LINE_RECIPES.recipeBuilder()
				.input(ELECTRIC_MOTOR_UXV)
				.input(plate, AwakenedDraconium, 4)
				.input(ring, AwakenedDraconium, 4)
				.input(round, ChargedDraconium, 16)
				.input(stick, AwakenedDraconium, 4)
				.input(gear, CrystalMatrix)
				.input(gearSmall, Draconium, 2)
				.input(cableGtSingle, Bedrockium, 2)
				.fluidInputs(MutatedLivingSolder.getFluid(1152))
				.fluidInputs(OmniversalLubricant.getPlasma(4000))
				.fluidInputs(Bedrockium.getFluid(576))
				.output(ELECTRIC_PISTON_UXV)
				.duration(2400).EUt(6000000).buildAndRegister();

		ASSEMBLY_LINE_RECIPES.recipeBuilder()
				.input(ELECTRIC_MOTOR_OpV)
				.input(plate, Quantum, 4)
				.input(ring, Quantum, 4)
				.input(round, CallistoIce, 16)
				.input(stick, Quantum, 4)
				.input(gear, Quantium)
				.input(gearSmall, Ledox, 2)
				.input(cableGtSingle, Quantium, 2)
				.fluidInputs(MutatedLivingSolder.getFluid(2304))
				.fluidInputs(OmniversalLubricant.getPlasma(8000))
				.fluidInputs(Quantium.getFluid(576))
				.fluidInputs(Infinity.getFluid(144))
				.output(ELECTRIC_PISTON_OpV)
				.duration(2400).EUt(6000000).buildAndRegister();
				
		// Robot Arms
		
		ASSEMBLY_LINE_RECIPES.recipeBuilder() // Doesn't work
                .input(stickLong, HighDurabilityCompoundSteel, 4)
				.input(gear, EnrichedNaquadahAlloy, 1)
				.input(gearSmall, Pikyonium, 3)
				.input(ELECTRIC_MOTOR_UHV, 2)
                .input(ELECTRIC_PISTON_UHV, 1)
				.input(circuit, Tier.UHV, 1)
				.input(circuit, Tier.UV, 2)
				.input(circuit, Tier.ZPM, 4)
                .input(cableGtSingle, Pikyonium, 4)
				.fluidInputs(MutatedLivingSolder.getFluid(144))
				.fluidInputs(OmniversalLubricant.getPlasma(500))
                .fluidInputs(FluxedElectrum.getFluid(576))
                .output(ROBOT_ARM_UHV)
                .duration(800).EUt(300000).buildAndRegister();
				
		ASSEMBLY_LINE_RECIPES.recipeBuilder()
				.input(stickLong, HastelloyK243, 4)
				.input(gear, Aluminum, 1)
				.input(gearSmall, Lafium, 3)
				.input(ELECTRIC_MOTOR_UEV, 2)
                .input(ELECTRIC_PISTON_UEV, 1)
				.input(circuit, Tier.UEV, 1)
				.input(circuit, Tier.UHV, 2)
				.input(circuit, Tier.UV, 4)
                .input(cableGtSingle, Lafium, 4)
				.fluidInputs(MutatedLivingSolder.getFluid(288))
				.fluidInputs(OmniversalLubricant.getPlasma(1000))
                .fluidInputs(TastyNeutronium.getFluid(576))
                .output(ROBOT_ARM_UEV)
                .duration(1200).EUt(800000).buildAndRegister();

		ASSEMBLY_LINE_RECIPES.recipeBuilder()
				.input(stickLong, Enderiiium, 4)
				.input(gear, Lumiium, 1)
				.input(gearSmall, VibrantAlloy, 3)
				.input(ELECTRIC_MOTOR_UIV, 2)
				.input(ELECTRIC_PISTON_UIV, 1)
				.input(circuit, Tier.UIV, 1)
				.input(circuit, Tier.UEV, 2)
				.input(circuit, Tier.UHV, 4)
				.input(cableGtSingle, Signalium, 4)
				.fluidInputs(MutatedLivingSolder.getFluid(576))
				.fluidInputs(OmniversalLubricant.getPlasma(2000))
				.fluidInputs(Signalium.getFluid(576))
				.output(ROBOT_ARM_UIV)
				.duration(1600).EUt(2000000).buildAndRegister();

		ASSEMBLY_LINE_RECIPES.recipeBuilder()
				.input(stickLong, AwakenedDraconium, 4)
				.input(gear, CrystalMatrix, 1)
				.input(gearSmall, Draconium, 3)
				.input(ELECTRIC_MOTOR_UXV, 2)
				.input(ELECTRIC_PISTON_UXV, 1)
				.input(circuit, Tier.UXV, 1)
				.input(circuit, Tier.UIV, 2)
				.input(circuit, Tier.UEV, 4)
				.input(cableGtSingle, Bedrockium, 4)
				.fluidInputs(MutatedLivingSolder.getFluid(1152))
				.fluidInputs(OmniversalLubricant.getPlasma(4000))
				.fluidInputs(Bedrockium.getFluid(576))
				.output(ROBOT_ARM_UXV)
				.duration(2400).EUt(6000000).buildAndRegister();

		ASSEMBLY_LINE_RECIPES.recipeBuilder()
				.input(stickLong, Quantum, 4)
				.input(gear, Quantium, 1)
				.input(gearSmall, Ledox, 3)
				.input(ELECTRIC_MOTOR_OpV, 2)
				.input(ELECTRIC_PISTON_OpV, 1)
				.input(circuit, Tier.OpV, 1)
				.input(circuit, Tier.UXV, 2)
				.input(circuit, Tier.UIV, 4)
				.input(cableGtSingle, Quantium, 4)
				.fluidInputs(MutatedLivingSolder.getFluid(2304))
				.fluidInputs(OmniversalLubricant.getPlasma(8000))
				.fluidInputs(Quantium.getFluid(576))
				.fluidInputs(Infinity.getFluid(144))
				.output(ROBOT_ARM_OpV)
				.duration(3600).EUt(20000000).buildAndRegister();
				
		// Field Generators
		
		ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(frameGt, HighDurabilityCompoundSteel)
				.input(plate, EnrichedNaquadahAlloy, 6)
				.input(GRAVI_STAR, 2)
				.input(EMITTER_UHV, 2)
				.input(circuit, Tier.UHV, 2)
                .input(wireFine, RutheniumTriniumAmericiumNeutronate, 64)
				.input(wireFine, RutheniumTriniumAmericiumNeutronate, 64)
				.input(wireFine, Amogus, 64)
				.input(wireFine, Amogus, 64)
				.input(cableGtSingle, Pikyonium, 4)
				.fluidInputs(MutatedLivingSolder.getFluid(144))
                .fluidInputs(FluxedElectrum.getFluid(576))
                .output(FIELD_GENERATOR_UHV)
                .duration(800).EUt(300000).buildAndRegister();
				
			ASSEMBLY_LINE_RECIPES.recipeBuilder()
				.input(frameGt, HastelloyK243)
				.input(plate, TastyNeutronium, 6)
				.input(GRAVI_STAR, 2)
				.input(EMITTER_UEV, 2)
				.input(circuit, Tier.UEV, 2)
                .input(wireFine, MagnetoResonaticCinobitePikyoniumAluminum, 64)
				.input(wireFine, MagnetoResonaticCinobitePikyoniumAluminum, 64)
				.input(wireFine, TastyNeutronium, 64)
				.input(wireFine, TastyNeutronium, 64)
				.input(cableGtSingle, Lafium, 4)
				.fluidInputs(MutatedLivingSolder.getFluid(288))
                .fluidInputs(TastyNeutronium.getFluid(576))
                .output(FIELD_GENERATOR_UEV)
                .duration(1200).EUt(800000).buildAndRegister();

		ASSEMBLY_LINE_RECIPES.recipeBuilder()
				.input(frameGt, Enderiiium)
				.input(plate, Signalium, 6)
				.input(GRAVI_STAR, 4)
				.input(EMITTER_UIV, 2)
				.input(circuit, Tier.UIV, 2)
				.input(wireFine, VibrantAlloyNaquadriaFluxedElectrumEnderiiumBase, 64)
				.input(wireFine, VibrantAlloyNaquadriaFluxedElectrumEnderiiumBase, 64)
				.input(wireFine, Signalium, 64)
				.input(wireFine, Signalium, 64)
				.input(cableGtSingle, Signalium, 4)
				.fluidInputs(MutatedLivingSolder.getFluid(576))
				.fluidInputs(Signalium.getFluid(576))
				.output(FIELD_GENERATOR_UIV)
				.duration(1600).EUt(2000000).buildAndRegister();

		ASSEMBLY_LINE_RECIPES.recipeBuilder()
				.input(frameGt, InfinityCatalyst)
				.input(plate, Bedrockium, 6)
				.input(GRAVI_STAR, 8)
				.input(EMITTER_UXV, 2)
				.input(circuit, Tier.UXV, 2)
				.input(wireFine, ChargedDraconiumStellarAlloyLuminessenceInfinityCatalyst, 64)
				.input(wireFine, ChargedDraconiumStellarAlloyLuminessenceInfinityCatalyst, 64)
				.input(wireFine, Bedrockium, 64)
				.input(wireFine, Bedrockium, 64)
				.input(cableGtSingle, Bedrockium, 4)
				.fluidInputs(MutatedLivingSolder.getFluid(1152))
				.fluidInputs(Bedrockium.getFluid(576))
				.output(FIELD_GENERATOR_UXV)
				.duration(2400).EUt(6000000).buildAndRegister();

		ASSEMBLY_LINE_RECIPES.recipeBuilder()
				.input(frameGt, Infinity)
				.input(plate, Quantium, 6)
				.input(GRAVI_STAR, 16)
				.input(EMITTER_OpV, 2)
				.input(circuit, Tier.OpV, 2)
				.input(wireFine, QuantumAwakenedDraconiumLedoxEnderiiiumInfinityNaquadriaticTaraniumAmogus, 64)
				.input(wireFine, QuantumAwakenedDraconiumLedoxEnderiiiumInfinityNaquadriaticTaraniumAmogus, 64)
				.input(wireFine, Infinity, 64)
				.input(wireFine, Infinity, 64)
				.input(cableGtSingle, Quantium, 4)
				.fluidInputs(MutatedLivingSolder.getFluid(2304))
				.fluidInputs(Quantium.getFluid(576))
				.fluidInputs(Infinity.getFluid(144))
				.output(FIELD_GENERATOR_OpV)
				.duration(3600).EUt(20000000).buildAndRegister();
				
		// Sensors
		
		ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(frameGt, HighDurabilityCompoundSteel)
				.input(ELECTRIC_MOTOR_UHV)
				.input(plate, EnrichedNaquadahAlloy, 4)
				.input(GRAVI_STAR, 2)
				.input(circuit, Tier.UHV, 2)
                .input(foil, Cinobite, 64)
				.input(foil, Cinobite, 32)
				.input(cableGtSingle, Pikyonium, 4)
				.fluidInputs(MutatedLivingSolder.getFluid(144))
                .fluidInputs(FluxedElectrum.getFluid(576))
                .output(SENSOR_UHV)
                .duration(800).EUt(300000).buildAndRegister();
		
		ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(frameGt, HastelloyK243)
				.input(ELECTRIC_MOTOR_UEV)
				.input(plate, Aluminum, 4)
				.input(GRAVI_STAR, 4)
				.input(circuit, Tier.UEV, 2)
                .input(foil, TastyNeutronium, 64)
				.input(foil, TastyNeutronium, 32)
				.input(cableGtSingle, Lafium, 4)
				.fluidInputs(MutatedLivingSolder.getFluid(288))
                .fluidInputs(TastyNeutronium.getFluid(576))
                .output(SENSOR_UEV)
                .duration(1200).EUt(800000).buildAndRegister();

		ASSEMBLY_LINE_RECIPES.recipeBuilder()
				.input(frameGt, Enderiiium)
				.input(ELECTRIC_MOTOR_UIV)
				.input(plate, Lumiium, 4)
				.input(GRAVI_STAR, 8)
				.input(circuit, Tier.UIV, 2)
				.input(foil, Signalium, 64)
				.input(foil, Signalium, 32)
				.input(cableGtSingle, Signalium, 4)
				.fluidInputs(MutatedLivingSolder.getFluid(576))
				.fluidInputs(Signalium.getFluid(576))
				.output(SENSOR_UIV)
				.duration(1600).EUt(2000000).buildAndRegister();

		ASSEMBLY_LINE_RECIPES.recipeBuilder()
				.input(frameGt, InfinityCatalyst)
				.input(ELECTRIC_MOTOR_UXV)
				.input(plate, CrystalMatrix, 4)
				.input(GRAVI_STAR, 16)
				.input(circuit, Tier.UXV, 2)
				.input(foil, Bedrockium, 64)
				.input(foil, Bedrockium, 32)
				.input(cableGtSingle, Bedrockium, 4)
				.fluidInputs(MutatedLivingSolder.getFluid(1152))
				.fluidInputs(Bedrockium.getFluid(576))
				.output(SENSOR_UXV)
				.duration(2400).EUt(6000000).buildAndRegister();

		ASSEMBLY_LINE_RECIPES.recipeBuilder()
				.input(frameGt, Infinity)
				.input(ELECTRIC_MOTOR_OpV)
				.input(plate, Ledox, 4)
				.input(GRAVI_STAR, 32)
				.input(circuit, Tier.OpV, 2)
				.input(foil, Infinity, 64)
				.input(foil, Infinity, 32)
				.input(cableGtSingle, Quantium, 4)
				.fluidInputs(MutatedLivingSolder.getFluid(2304))
				.fluidInputs(Quantium.getFluid(576))
				.fluidInputs(Infinity.getFluid(144))
				.output(SENSOR_OpV)
				.duration(3600).EUt(20000000).buildAndRegister();
				
		// Emitters

		ASSEMBLY_LINE_RECIPES.recipeBuilder()
				.input(frameGt, HighDurabilityCompoundSteel)
				.input(ELECTRIC_MOTOR_UHV)
				.input(stickLong, EnrichedNaquadahAlloy, 4)
				.input(GRAVI_STAR, 2)
				.input(circuit, Tier.UHV, 2)
				.input(foil, Cinobite, 64)
				.input(foil, Cinobite, 32)
				.input(cableGtSingle, Pikyonium, 4)
				.fluidInputs(MutatedLivingSolder.getFluid(144))
				.fluidInputs(FluxedElectrum.getFluid(576))
				.output(EMITTER_UHV)
				.duration(800).EUt(300000).buildAndRegister();

		ASSEMBLY_LINE_RECIPES.recipeBuilder()
				.input(frameGt, HastelloyK243)
				.input(ELECTRIC_MOTOR_UEV)
				.input(stickLong, Aluminum, 4)
				.input(GRAVI_STAR, 4)
				.input(circuit, Tier.UEV, 2)
				.input(foil, TastyNeutronium, 64)
				.input(foil, TastyNeutronium, 32)
				.input(cableGtSingle, Lafium, 4)
				.fluidInputs(MutatedLivingSolder.getFluid(288))
				.fluidInputs(TastyNeutronium.getFluid(576))
				.output(EMITTER_UEV)
				.duration(1200).EUt(800000).buildAndRegister();

		ASSEMBLY_LINE_RECIPES.recipeBuilder()
				.input(frameGt, Enderiiium)
				.input(ELECTRIC_MOTOR_UIV)
				.input(stickLong, Lumiium, 4)
				.input(GRAVI_STAR, 8)
				.input(circuit, Tier.UIV, 2)
				.input(foil, Signalium, 64)
				.input(foil, Signalium, 32)
				.input(cableGtSingle, Signalium, 4)
				.fluidInputs(MutatedLivingSolder.getFluid(576))
				.fluidInputs(Signalium.getFluid(576))
				.output(EMITTER_UIV)
				.duration(1600).EUt(2000000).buildAndRegister();

		ASSEMBLY_LINE_RECIPES.recipeBuilder()
				.input(frameGt, InfinityCatalyst)
				.input(ELECTRIC_MOTOR_UXV)
				.input(stickLong, CrystalMatrix, 4)
				.input(GRAVI_STAR, 16)
				.input(circuit, Tier.UXV, 2)
				.input(foil, Bedrockium, 64)
				.input(foil, Bedrockium, 32)
				.input(cableGtSingle, Bedrockium, 4)
				.fluidInputs(MutatedLivingSolder.getFluid(1152))
				.fluidInputs(Bedrockium.getFluid(576))
				.output(EMITTER_UXV)
				.duration(2400).EUt(6000000).buildAndRegister();

		ASSEMBLY_LINE_RECIPES.recipeBuilder()
				.input(frameGt, Infinity)
				.input(ELECTRIC_MOTOR_OpV)
				.input(stickLong, Ledox, 4)
				.input(GRAVI_STAR, 32)
				.input(circuit, Tier.OpV, 2)
				.input(foil, Infinity, 64)
				.input(foil, Infinity, 32)
				.input(cableGtSingle, Quantium, 4)
				.fluidInputs(MutatedLivingSolder.getFluid(2304))
				.fluidInputs(Quantium.getFluid(576))
				.fluidInputs(Infinity.getFluid(144))
				.output(EMITTER_OpV)
				.duration(3600).EUt(20000000).buildAndRegister();
    }
}
