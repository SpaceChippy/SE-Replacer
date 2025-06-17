Planet	"Jupiter"
{
	ParentBody     "Sun"
	Class          "Jupiter"
	Mass            317.832001
	Radius          71492
	InertiaMoment   0.215669304
	Oblateness      0.0648699999
	RotationPeriod  9.92491982
	RotationOffset  305.4
	RotationEpoch   0
	Obliquity       2.222461
	EqAscendNode    -22.203

	EndogenousHeating 159
	AlbedoBond      0.503
	AlbedoGeom      0.538
	Brightness      0.75
	BrightnessReal  0.9

	Surface
	{
		DiffMap        "Jupiter/Surface-BJ"
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.5
		Hapke           0
		SpotBright      0
		SpotWidth       0.05
		DayAmbient      0
		RingsWinter     0
	}

	NoOcean         true

	NoClouds        true

	NoLava          true

	Atmosphere
	{
		Model          "Earth"
		Height          300
		Density         0.00551800709
		Pressure        1
		Bright          2
		Opacity         0
		SkyLight        0
		Hue             0
		Saturation      1

		Composition
		{
			H2        	89.8
			He        	10.2
			CH4       	0.3
			NH3       	0.026
			C2H6      	0.0006
		}
	}

	Climate
	{
		GlobalWindSpeed  100
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
		NorthFlashFreq 64.3
		NorthMoveSpeed 0.774
		NorthParticles 10000
		SouthLat       -90
		SouthLon       0
		SouthRadius    1.6e+04
		SouthWidth     5e+03
		SouthRings     3
		SouthBright    1
		SouthFlashFreq 66.8
		SouthMoveSpeed 0.769
		SouthParticles 10000
		TopColor    (1.500 0.000 0.800)
		BottomColor (1.000 0.100 0.000)
	}

	Rings
	{
		Texture        "Jupiter-rings.*"
		InnerRadius     1.02e+05
		OuterRadius     2.27e+05
		EdgeRadius      1.11e+05
		MeanRadius      1.05e+05
		Thickness       10
		RocksMaxSize    0.01
		RocksSpacing    1e+03
		DustDrawDist    2e+04
		ChartRadius     1.11e+05
		RotationPeriod  5.39
		Brightness      1
		FrontBright     1
		BackBright      5
		Density         0.0001
		Opacity         0.0001
		SelfShadow      0.0001
		PlanetShadow    0.0001
		Hapke           1
		SpotBright      1
		SpotWidth       0.02
		SpotBrightCB    0
		SpotWidthCB     0.001
		frequency       7.18
		densityScale    1.55
		densityOffset   -0.405
		densityPower    1.01
		colorContrast   0.0976
		FrontColor      (0.700 0.700 0.700)
		BackThickColor  (0.800 0.600 0.400)
		BackIceColor    (0.300 0.700 1.000)
		BackDustColor   (1.000 0.980 0.880)
	}

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		AnalyticModel  "Jupiter-DE"
		Period          11.8622
		SemiMajorAxis   5.2034
		Eccentricity    0.0484
		Inclination     1.3053
		AscendingNode   100.556
		ArgOfPericenter -85.8021
		MeanAnomaly     19.6501
	}
}

