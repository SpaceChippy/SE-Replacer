Moon	"Ganymede/Jupiter III"
{
	ParentBody     "Jupiter"
	Class          "Aquaria"
	Mass            0.0248000007
	Radius          2631.19995
	InertiaMoment   0.354188204
	RotationPeriod  171.709275
	RotationEpoch   0
	Obliquity       0.195
	EqAscendNode    119.841

	Albedo          0.42
	Brightness      1
	BrightnessReal  0.94

	Surface
	{
		DiffMap        "Ganymede/Surface-PBC"
		BumpMap        "Ganymede/Bump-PBC-SE"
		BumpHeight      4
		BumpOffset      2
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.2
		Hapke           0.75
		SpotBright      1.12
		SpotWidth       0.074
		DayAmbient      0.07
	}

	NoOcean         true

	NoClouds        true

	NoLava          true

	Atmosphere
	{
		Model          "Sun"
		Height          200
		Density         3.56674343e-11
		Pressure        9.99999972e-10
		Bright          0.00025
		Opacity         0
		SkyLight        0
		Hue             0
		Saturation      1

		Composition
		{
			O2        	100
		}
	}

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
		AnalyticModel  "Ganymede-L1"
		Epoch           2443000
		PeriodDays      7.1545528
		SemiMajorAxisKm 1069984.77
		Eccentricity    0.0015
		Inclination     0.195
		AscendingNode   119.841
		ArgOfPericenter 68.99
		MeanAnomaly     -67.625
	}
}

