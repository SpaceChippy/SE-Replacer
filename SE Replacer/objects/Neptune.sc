Planet	"Neptune"
{
	ParentBody     "Sun"
	Class          "Neptune"
	Mass            17.1469994
	Radius          24766
	InertiaMoment   0.278768808
	Oblateness      0.0170799997
	RotationPeriod  16.11
	RotationOffset  228.65
	RotationEpoch   0
	Obliquity       28.03
	EqAscendNode    49.235

	EndogenousHeating 69
	AlbedoBond      0.29
	AlbedoGeom      0.41
	Brightness      0.5
	BrightnessReal  0.7
	Color          (0.500 0.650 1.000)

	Surface
	{
		DiffMap        "Neptune/Surface-SF"
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.5
		Hapke           0
		SpotBright      0
		SpotWidth       0.05
		DayAmbient      0.07
		RingsWinter     0
	}

	NoOcean         true

	NoClouds        true

	NoLava          true

	Atmosphere
	{
		Model          "Earth"
		Height          300
		Density         0.0175861567
		Pressure        1
		Bright          5.5
		Opacity         0
		SkyLight        0.2
		Hue             -0.053
		Saturation      0.825

		Composition
		{
			H2        	80
			He        	19
			CH4       	1.5
			C2H6      	0.00015
		}
	}

	Climate
	{
		GlobalWindSpeed  310
	}

	Aurora
	{
		Height         600
		NorthLat       45
		NorthLon       0
		NorthRadius    1.2e+04
		NorthWidth     3.5e+03
		NorthRings     3
		NorthBright    0.1
		NorthFlashFreq 62.7
		NorthMoveSpeed 1.06
		NorthParticles 10000
		SouthLat       -35
		SouthLon       180
		SouthRadius    4e+03
		SouthWidth     1.5e+03
		SouthRings     3
		SouthBright    0.4
		SouthFlashFreq 65.2
		SouthMoveSpeed 0.92
		SouthParticles 10000
		TopColor    (1.500 0.000 0.800)
		BottomColor (1.000 0.100 0.000)
	}

	Rings
	{
		Texture        "Neptune-rings.*"
		InnerRadius     4.05e+04
		OuterRadius     6.3e+04
		EdgeRadius      6.97e+04
		MeanRadius      5.02e+04
		Thickness       0.1
		RocksMaxSize    0.01
		RocksSpacing    1
		DustDrawDist    300
		ChartRadius     6.97e+04
		RotationPeriod  8.63
		Brightness      0.15
		FrontBright     1
		BackBright      0.15
		Density         0.15
		Opacity         0.15
		SelfShadow      0.15
		PlanetShadow    0.05
		Hapke           1
		SpotBright      1
		SpotWidth       0.02
		SpotBrightCB    0
		SpotWidthCB     0.001
		frequency       7.32
		densityScale    1.54
		densityOffset   -0.302
		densityPower    5.16
		colorContrast   0.0983
		FrontColor      (0.700 0.700 0.700)
		BackThickColor  (0.800 0.600 0.400)
		BackIceColor    (0.300 0.700 1.000)
		BackDustColor   (1.000 0.980 0.880)
	}

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		AnalyticModel  "Neptune-DE"
		Period          164.793
		SemiMajorAxis   30.069
		Eccentricity    0.0086
		Inclination     1.7692
		AscendingNode   131.722
		ArgOfPericenter -86.751
		MeanAnomaly     259.909
	}
}

