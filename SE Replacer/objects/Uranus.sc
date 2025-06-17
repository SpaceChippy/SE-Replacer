Planet	"Uranus"
{
	ParentBody     "Sun"
	Class          "Neptune"
	Mass            14.5360003
	Radius          25559
	InertiaMoment   0.274355143
	Oblateness      0.02293
	RotationPeriod  -17.24
	RotationEpoch   0
	Obliquity       -10.351808
	EqAscendNode    69.2887689

	EndogenousHeating 69
	AlbedoBond      0.3
	AlbedoGeom      0.51
	Brightness      0.45
	BrightnessReal  0.6
	Color          (0.730 0.910 1.000)

	Surface
	{
		DiffMap        "Uranus/Surface-SF"
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
		Density         0.0194361694
		Pressure        1
		Bright          10
		Opacity         0
		SkyLight        2
		Hue             -0.081
		Saturation      0.85

		Composition
		{
			H2        	82.5
			He        	15.2
			CH4       	2.3
		}
	}

	Climate
	{
		GlobalWindSpeed  200
	}

	Aurora
	{
		Height         600
		NorthLat       27
		NorthLon       0
		NorthRadius    8e+03
		NorthWidth     2.5e+03
		NorthRings     3
		NorthBright    0.2
		NorthFlashFreq 69.2
		NorthMoveSpeed 0.964
		NorthParticles 10000
		SouthLat       -50
		SouthLon       180
		SouthRadius    5e+03
		SouthWidth     1.5e+03
		SouthRings     3
		SouthBright    0.3
		SouthFlashFreq 69.8
		SouthMoveSpeed 0.852
		SouthParticles 10000
		TopColor    (1.500 0.000 0.800)
		BottomColor (1.000 0.100 0.000)
	}

	Rings
	{
		Texture        "Uranus-rings.*"
		InnerRadius     3.11e+04
		OuterRadius     1.23e+05
		EdgeRadius      8.86e+04
		MeanRadius      5.02e+04
		Thickness       0.1
		RocksMaxSize    0.01
		RocksSpacing    1
		DustDrawDist    300
		ChartRadius     8.86e+04
		RotationPeriod  10.6
		Brightness      1
		FrontBright     1
		BackBright      5
		Density         1
		Opacity         1
		SelfShadow      1
		PlanetShadow    1
		Hapke           1
		SpotBright      1
		SpotWidth       0.02
		SpotBrightCB    0
		SpotWidthCB     0.001
		frequency       754
		densityScale    2.48
		densityOffset   -1.84
		densityPower    1.02
		colorContrast   0.139
		FrontColor      (0.700 0.700 0.700)
		BackThickColor  (0.800 0.600 0.400)
		BackIceColor    (0.300 0.700 1.000)
		BackDustColor   (1.000 0.980 0.880)
	}

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		AnalyticModel  "Uranus-DE"
		Period          84.0139
		SemiMajorAxis   19.1913
		Eccentricity    0.0472
		Inclination     0.7699
		AscendingNode   74.23
		ArgOfPericenter 96.734
		MeanAnomaly     142.268
	}
}

