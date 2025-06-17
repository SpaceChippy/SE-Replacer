Moon	"Moon/Earth I"
{
	ParentBody     "Earth-Moon"
	Class          "Terra"
	Mass            0.0123020001
	Radius          1737.40002
	InertiaMoment   0.368602097
	Oblateness      0.00200000009
	RotationPeriod  611.377781
	RotationEpoch   0
	Obliquity       5.15
	EqAscendNode    125.08

	AlbedoBond      0.11
	AlbedoGeom      0.12
	Brightness      0.8
	BrightnessReal  0.33

	Surface
	{
		DiffMap        "Moon/Surface-KL"
		BumpMap        "Moon/Bump-KL"
		BumpHeight      19.9
		BumpOffset      9.13
		SpecBrightWater 0
		SpecBrightIce   0.03
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      1.75
		SpotWidth       0.06
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
		AnalyticModel  "Moon-EMB-DE"
		PeriodDays      27.3216602
		SemiMajorAxisKm 379665.707
		Eccentricity    0.0549
		Inclination     5.15
		AscendingNode   125.08
		ArgOfPericenter 318.15
		MeanAnomaly     135.27
	}
}

