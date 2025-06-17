Planet	"Earth"
{
	ParentBody     "Earth-Moon"
	Class          "Terra"
	Mass            1
	Radius          6378.14014
	InertiaMoment   0.328146249
	Oblateness      0.0033499999
	RotationPeriod  23.9344712
	RotationOffset  -23.9
	RotationEpoch   0
	Obliquity       23.4392911
	EqAscendNode    180
	Precession      25592

	AlbedoBond      0.306
	AlbedoGeom      0.367
	Brightness      1
	BrightnessReal  1
	Color          (0.850 0.850 1.000)

	Life
	{
		Class   "Organic"
		Type    "Multicellular"
		Biome   "Marine/Terrestrial"
	}

	Surface
	{
		DiffMap        "Earth/Surface-PBC"
		BumpMap        "Earth/Bump-PBC"
		GlowMap        "Earth/Lights-HD"
		BumpHeight      19.5
		BumpOffset      10.9
		DiffMapAlpha   "Water"
		SpecBrightWater 0.85
		SpecBrightIce   0.65
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.5
		Hapke           0.5
		SpotBright      1.56
		SpotWidth       0.05
		DayAmbient      0.07
	}

	Ocean
	{
		Depth           10.9
		Hapke           0
		SpotBright      2
		SpotWidth       0.05
		DayAmbient      0.07
		ModulateBright  1

		Composition
		{
			H2O       	96.5
			NaCl      	3.5
		}
	}

	Clouds
	{
		DiffMap        "Earth/Clouds-SE"
		BumpMap        "Earth/Clouds-SE"
		Height          9
		Velocity        0
		BumpHeight      0.5
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1.33
		Opacity         1.33
		mainFreq        0.752
		mainOctaves     10
		Coverage        0.208
		stripeZones     2.28
		stripeTwist     0.15
	}

	NoLava          true

	Atmosphere
	{
		Model          "Earth"
		Height          60
		Density         1.29289997
		Pressure        1
		Greenhouse      33
		Bright          10
		Opacity         1
		SkyLight        3
		Hue             0
		Saturation      1

		Composition
		{
			N2        	77.8
			O2        	20.9
			Ar        	0.93
			H2O       	0.4
			CO2       	0.042
			Ne        	0.00182
			He        	0.00046
			CH4       	0.00019
			Kr        	0.000114
			H2        	5e-05
			Xe        	8.7e-06
		}
	}

	Climate
	{
		GlobalWindSpeed  3.3
	}

	Aurora
	{
		Height         100
		NorthLat       82
		NorthLon       -113
		NorthRadius    2.5e+03
		NorthWidth     600
		NorthRings     3
		NorthBright    0.3
		NorthFlashFreq 68.5
		NorthMoveSpeed 1.01
		NorthParticles 50000
		SouthLat       -63
		SouthLon       138
		SouthRadius    2e+03
		SouthWidth     600
		SouthRings     3
		SouthBright    0.3
		SouthFlashFreq 77.6
		SouthMoveSpeed 1.54
		SouthParticles 50000
		TopColor    (0.500 0.500 0.500)
		BottomColor (0.000 1.000 0.000)
	}

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		AnalyticModel  "Earth-EMB-DE"
		Period          0.0748042285
		SemiMajorAxis   3.16102192e-05
		Eccentricity    0.0549
		Inclination     5.15
		AscendingNode   125.08
		ArgOfPericenter 138.15
		MeanAnomaly     135.27
	}
}

