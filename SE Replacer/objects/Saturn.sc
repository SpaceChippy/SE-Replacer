Planet	"Saturn"
{
	ParentBody     "Sun"
	Class          "Jupiter"
	Mass            95.1620026
	Radius          60268
	InertiaMoment   0.249029517
	Oblateness      0.0979600027
	RotationPeriod  10.6562222
	RotationOffset  358.922
	RotationEpoch   0
	Obliquity       28.049
	EqAscendNode    169.53

	EndogenousHeating 130
	AlbedoBond      0.342
	AlbedoGeom      0.47
	Brightness      0.7
	BrightnessReal  0.65

	Surface
	{
		DiffMap        "Saturn/Surface-SSS"
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.5
		Hapke           0
		SpotBright      0
		SpotWidth       0.05
		DayAmbient      0
		RingsWinter     1
	}

	NoOcean         true

	NoClouds        true

	NoLava          true

	Atmosphere
	{
		Model          "Earth"
		Height          250
		Density         0.0052298205
		Pressure        1
		Bright          5
		Opacity         0.2
		SkyLight        0.002
		Hue             0
		Saturation      1

		Composition
		{
			H2        	96.3
			He        	3.25
			CH4       	0.45
			NH3       	0.0125
			C2H6      	0.0007
		}
	}

	Climate
	{
		GlobalWindSpeed  1.1e+03
	}

	Aurora
	{
		Height         1e+03
		NorthLat       90
		NorthLon       0
		NorthRadius    1.5e+04
		NorthWidth     5e+03
		NorthRings     3
		NorthBright    1
		NorthFlashFreq 75.6
		NorthMoveSpeed 0.871
		NorthParticles 10000
		SouthLat       -90
		SouthLon       0
		SouthRadius    1.6e+04
		SouthWidth     5e+03
		SouthRings     3
		SouthBright    1
		SouthFlashFreq 74.1
		SouthMoveSpeed 1.55
		SouthParticles 10000
		TopColor    (1.500 0.000 0.800)
		BottomColor (1.000 0.100 0.000)
	}

	Rings
	{
		Texture        "Saturn-rings.*"
		InnerRadius     6.45e+04
		OuterRadius     3.18e+05
		EdgeRadius      1.37e+05
		MeanRadius      1.06e+05
		Thickness       0.15
		RocksMaxSize    0.008
		RocksSpacing    1
		DustDrawDist    450
		ChartRadius     1.37e+05
		RotationPeriod  9.06
		Brightness      1
		FrontBright     2
		BackBright      5
		Density         1
		Opacity         1
		SelfShadow      1
		PlanetShadow    1
		Hapke           1
		SpotBright      0.45
		SpotWidth       0.015
		SpotBrightCB    1.95
		SpotWidthCB     0.00245
		frequency       7.11
		densityScale    1.68
		densityOffset   -0.197
		densityPower    0.993
		colorContrast   0.053
		FrontColor      (0.700 0.700 0.700)
		BackThickColor  (0.800 0.600 0.400)
		BackIceColor    (0.300 0.700 1.000)
		BackDustColor   (1.000 0.980 0.880)
	}

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		AnalyticModel  "Saturn-DE"
		Period          29.4577
		SemiMajorAxis   9.5371
		Eccentricity    0.0542
		Inclination     2.4845
		AscendingNode   113.715
		ArgOfPericenter -21.283
		MeanAnomaly     -42.488
	}
}

