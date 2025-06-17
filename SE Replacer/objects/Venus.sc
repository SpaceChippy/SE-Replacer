Planet	"Venus"
{
	ParentBody     "Sun"
	Class          "Terra"
	Mass            0.814999998
	Radius          6052
	InertiaMoment   0.332192272
	RotationPeriod  -5832.44362
	RotationOffset  137.45
	RotationEpoch   0
	Obliquity       178.78
	EqAscendNode    300.22

	AlbedoBond      0.76
	AlbedoGeom      0.689
	Brightness      0.8
	BrightnessReal  0.8
	Color          (0.700 0.648 0.620)

	Surface
	{
		DiffMap        "Venus/Surface-JVV"
		BumpMap        "Venus/Bump-SE"
		BumpHeight      13.7
		BumpOffset      2.9
		SpecBrightWater 0.5
		SpecBrightIce   0.5
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.5
		Hapke           0.5
		SpotBright      1.52
		SpotWidth       0.05
		DayAmbient      0.07
		ModulateColor  (1.000 0.840 0.700)
	}

	NoOcean         true

	Clouds
	{
		DiffMap        "Venus/Clouds-SF"
		Height          50
		Velocity        264
		BumpHeight      5.35
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		mainFreq        0.798
		mainOctaves     10
		Coverage        1
		stripeZones     2.68
		stripeTwist     0.508
	}

	NoLava          true

	Atmosphere
	{
		Model          "Venus"
		Height          200
		Density         71.4000015
		Pressure        92
		Greenhouse      560
		Bright          10
		Opacity         1
		SkyLight        3
		Hue             0
		Saturation      1

		Composition
		{
			CO2       	96.5
			N2        	3.5
			SO2       	0.015
			Ar        	0.007
			H2O       	0.002
			CO        	0.0017
			He        	0.0012
			Ne        	0.0007
		}
	}

	Climate
	{
		GlobalWindSpeed  1.5
		MaxSurfaceTemp   741
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		AnalyticModel  "Venus-DE"
		Period          0.6152
		SemiMajorAxis   0.7233
		Eccentricity    0.0068
		Inclination     3.3947
		AscendingNode   76.681
		ArgOfPericenter 54.852
		MeanAnomaly     50.446
	}
}

