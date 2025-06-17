Planet	"Mars"
{
	ParentBody     "Sun"
	Class          "Terra"
	Mass            0.107469998
	Radius          3396.18994
	InertiaMoment   0.330541581
	Oblateness      0.00589000015
	RotationPeriod  24.6229622
	RotationOffset  -28.7
	RotationEpoch   0
	Obliquity       26.72
	EqAscendNode    82.91

	AlbedoBond      0.25
	AlbedoGeom      0.17
	Brightness      1
	BrightnessReal  0.7
	Color          (1.000 0.750 0.700)

	Surface
	{
		DiffMap        "Mars/Surface-PBC"
		BumpMap        "Mars/Bump-SE"
		BumpHeight      29.8
		BumpOffset      8.53
		SpecBrightWater 0.5
		SpecBrightIce   0.5
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.5
		Hapke           1
		SpotBright      1
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	Clouds
	{
		DiffMap        "Mars/Clouds-water-HD"
		Height          22
		Velocity        0
		BumpHeight      2.06
		Hapke           0.2
		SpotBright      0
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		Opacity         0.2
		mainFreq        0.412
		mainOctaves     6
		Coverage        0.08
		stripeZones     0
		stripeTwist     0
	}

	Clouds
	{
		DiffMap        "Mars/Clouds-dust-HD"
		Height          15
		Velocity        0
		BumpHeight      2.06
		Hapke           0.2
		SpotBright      0
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateColor  (0.500 0.380 0.270)
		ModulateBright  1
		mainFreq        0.412
		mainOctaves     6
		Coverage        0.08
		stripeZones     0
		stripeTwist     0
	}

	Clouds
	{
		Height          80
		Velocity        50
		BumpHeight      2.06
		Hapke           0.2
		SpotBright      0
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		Opacity         0.15
		mainFreq        0.412
		mainOctaves     6
		Coverage        0.08
		stripeZones     0
		stripeTwist     0
	}

	NoLava          true

	Atmosphere
	{
		Model          "Mars"
		Height          132
		Density         0.0199999996
		Pressure        0.00638000015
		Greenhouse      5
		Bright          4
		Opacity         1
		SkyLight        2
		Hue             0
		Saturation      1

		Composition
		{
			CO2       	96
			Ar        	1.93
			N2        	1.89
			O2        	0.146
			CO        	0.0557
		}
	}

	Climate
	{
		GlobalWindSpeed  4
		MinSurfaceTemp   98
		MaxSurfaceTemp   308
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		AnalyticModel  "Mars-DE"
		Period          1.8809
		SemiMajorAxis   1.5237
		Eccentricity    0.0934
		Inclination     1.8506
		AscendingNode   49.479
		ArgOfPericenter 286.562
		MeanAnomaly     19.412
	}
}

