Planet	"Mercury"
{
	ParentBody     "Sun"
	Class          "Ferria"
	Mass            0.05528
	Radius          2440
	InertiaMoment   0.342261553
	RotationPeriod  1407.5094
	RotationOffset  291.2
	RotationEpoch   0
	Obliquity       7.01
	EqAscendNode    48.42

	AlbedoBond      0.088
	AlbedoGeom      0.142
	Brightness      1
	BrightnessReal  0.45
	Color          (0.429 0.424 0.420)

	Surface
	{
		DiffMap        "Mercury/Surface-HD"
		BumpMap        "Mercury/Bump-HD"
		BumpHeight      10.3
		BumpOffset      5.89
		SpecBrightWater 0
		SpecBrightIce   0.03
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.09
		DayAmbient      0.07
	}

	NoOcean         true

	NoClouds        true

	NoLava          true

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		AnalyticModel  "Mercury-DE"
		Period          0.2408
		SemiMajorAxis   0.3871
		Eccentricity    0.2056
		Inclination     7.0049
		AscendingNode   48.33167
		ArgOfPericenter 29.12433
		MeanAnomaly     174.795
		ArgOfPeriPreces 1.303683e-09
	}
}

